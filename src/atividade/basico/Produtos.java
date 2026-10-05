package atividade.basico;

import java.util.Locale;

public class Produtos {
    public static void main(String[] args) {
        String produto1 = "Computador";
        String produto2 = "Office desk";

        int idade = 22;
        int codigo = 2342;
        char genero = 'M';

        double preco1 = 2100.0;
        double preco2 = 5650.50;
        double medir = 53.23567;

        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println("Produtos: ");
        System.out.printf("Cpmputador, wich price is $ %.2f%n", preco1);
        System.out.printf("Office desk, wich price is $ %.2f%n", preco2);

        System.out.println(idade + " anos, " + codigo + " e" + " genero " + genero);

        System.out.printf("Measue with eight decimal places: %.5f%n", medir);
        System.out.printf("(three decimal places): %.3f%n", medir);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", medir);
    }
}
