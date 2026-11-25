package memoria_arrays_listas.exericio;

import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = teclado.nextInt();

        double[] altura = new double[n];
        char[] genero = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            altura[i] = teclado.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i + 1);
            genero[i] = teclado.next().charAt(0);
        }

        double maior = altura[0];
        double menor = altura[0];
        for (int i = 0; i < n; i++) {
            if (altura[i] > maior) {
                maior = altura[i];
            }
            if (altura[i] < menor) {
                menor = altura[i];
            }
        }

        int qtdhomens = 0;
        int qtdmulher = 0;
        double alturaTotal = 0;

        for(int i = 0; i < n; i++) {
            if (genero[i]=='M'){
                qtdhomens++;
            } else {
                qtdmulher++;
                alturaTotal += altura[i];
            }
        }

        double alturaMedia = alturaTotal / qtdmulher;

        System.out.printf("Menor altura = %.2f\n", menor);
	    System.out.printf("Maior altura = %.2f\n", maior);
	    System.out.printf("Media das alturas das mulheres = %.2f\n", alturaMedia);
	    System.out.printf("Numero de homens = %d\n", qtdhomens);

    }
}
