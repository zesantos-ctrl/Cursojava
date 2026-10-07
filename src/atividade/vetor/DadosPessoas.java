package atividade.vetor;

import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n, qtdhomens, qtdmulheres;

        double maiorAltura, menorAltura;
        double alturafemMedia, alturafemtotal;

        System.out.println("Quantas pessoas serao digitadas? ");
        n = teclado.nextInt();

        double[] altura = new double[n];
        char[] genero = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa:\n ", i + 1);
            altura[i] = teclado.nextDouble();
            System.out.printf("Genero da %da pessoa:\n ", i + 1);
            genero[i] = teclado.next().charAt(0);
        }

        maiorAltura = altura[0];
        menorAltura = altura[0];
        for (int i = 0; i < n; i++) {
            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }
            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
        }

        qtdhomens = 0;
        qtdmulheres = 0;
        alturafemtotal = 0;
        for (int i = 0; i < n; i++) {
            if (genero[i] == 'M') {
                qtdhomens++;
            } else {
                qtdmulheres++;
                alturafemtotal += altura[i];
            }
        }

        alturafemMedia = alturafemtotal / qtdmulheres;
        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", alturafemMedia);
        System.out.printf("Numero de homens = %d\n", qtdhomens);
        teclado.close();
    }
}
