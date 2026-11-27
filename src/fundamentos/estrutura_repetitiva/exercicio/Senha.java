package estrutura_repetitiva.exercicio;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        int senha = teclado.nextInt();

        while (senha != 2002) {
            System.out.println("Senha invalida!");
            teclado.nextInt();
        }
        System.out.println("Acesso Permitido");
        teclado.close();
    }
}
