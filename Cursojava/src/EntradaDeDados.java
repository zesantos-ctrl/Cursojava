import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.println(nome);

        int x;
        x = teclado.nextInt();
        System.out.println(x);

        double y;

        y = teclado.nextDouble();
        System.out.printf("Voce digitou %.2f %n" ,y);

        char z;

        z = teclado.next().charAt(0);
        System.out.println(z);
    }
}
