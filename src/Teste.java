import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Teste2 teste = new Teste2();

        System.out.println("Digite seu nome:  ");
        teste.nome = teclado.nextLine();

        System.out.println("Digite sua idade: ");
        teste.idade = teclado.nextInt();

        System.out.print(teste.toString());
        teclado.close();
    }
}
