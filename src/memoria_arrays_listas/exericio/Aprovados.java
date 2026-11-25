package memoria_arrays_listas.exericio;

import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = teclado.nextInt();

        double media;
        String[] nome = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %da aluno:\n ", i + 1);
            teclado.nextLine();
            nome[i] = teclado.nextLine();
            nota1[i] = teclado.nextDouble();
            nota2[i] = teclado.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            media = (nota1[i] + nota2[i]) / 2;

            if (media >= 6.0) {
                System.out.printf("%s\n", nome[i]);
            }
        }

    }
}
