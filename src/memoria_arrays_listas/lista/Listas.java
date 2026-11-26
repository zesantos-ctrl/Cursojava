package memoria_arrays_listas.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Ana");
        list.add("Jose");
        list.add("Bruno");
        list.add("Alex");

        // Adiciona na posição dois
        list.add(2, "Marco");

        System.out.println("Tamanho: " + list.size());

        for (String nome : list) {
            System.out.println("Nomes: " + nome);
        }

        System.out.println("--------------");
        // Remove a posição escolhida
        list.remove(4);

        // Remove da lista nomes que começa com M
        // e aplica a condição lambda
        list.removeIf(nome -> nome.charAt(0) == 'M');
        for (String nome : list) {
            System.out.println("Nomes: " + nome);
        }
        System.out.println("--------------");
        System.out.println("Ana: " + list.indexOf("Ana"));
        System.out.println("Marco: " + list.indexOf("Marco"));
        System.out.println("--------------");

        List<String> result = list.stream()
                .filter(nome -> nome.charAt(0) == 'A')
                .collect(Collectors.toList());
        for (String nome : result) {
            System.out.println("Nomes: " + nome);
        }
        System.out.println("--------------");
        String name = list.stream()
                .filter(nome -> nome.charAt(0) == 'J')
                .findFirst().orElse(null);
        System.out.println(name);
    }
}
