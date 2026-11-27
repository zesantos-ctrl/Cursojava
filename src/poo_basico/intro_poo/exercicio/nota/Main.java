package intro_poo.exercicio.nota;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Aluno a = new Aluno();

        a.nome = teclado.nextLine();
        a.nota1 = teclado.nextDouble();
        a.nota2 = teclado.nextDouble();
        a.nota3 = teclado.nextDouble();

        System.out.printf("Pontos finais: %.2f%n", a.media());

        if (a.pontos() < 60.0) {
            System.out.println("Falhou");
            System.out.printf("Missing %.2f points %n", a.pontos());
        } else {
            System.out.println("passou");
        }

        teclado.close();
    }
}
