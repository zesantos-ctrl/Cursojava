package atividade.vetor;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        int n;
        double mediaNotas;

        System.out.println("Quantos alunos serao digitados? ");
        n = teclado.nextInt();

        String[] nome = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n ", i + 1);
            teclado.nextLine();
            nome[i] = teclado.nextLine();
            nota1[i] = teclado.nextDouble();
            nota2[i] = teclado.nextDouble();
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < n; i++) {
            mediaNotas = (nota1[i] + nota2[i]) / 2;

            if (mediaNotas >= 6.0) {
                System.out.printf("%s\n", nome[i]);
            }
        }

        System.out.println("Alunos reprovados: ");
        for (int i = 0; i < n; i++) {
            mediaNotas = (nota1[i] + nota2[i]) / 2;

            if (mediaNotas < 6.0) {
                System.out.printf("%s\n", nome[i]);
            }
        }
        teclado.close();
    }
}
