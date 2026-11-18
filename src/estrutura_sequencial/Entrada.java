package estrutura_sequencial;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        // Entrada de dados
        Scanner teclado = new Scanner(System.in);

        int x;
        x = teclado.nextInt();
        System.out.println("Você digitou: " + x);

        String y;
        y = teclado.next();
        System.out.println("Você digitou: " + y);

        double xy;
        xy = teclado.nextDouble();
        System.out.printf("Você digitou: %.2f%n", xy);

        char a;
        a = teclado.next().charAt(0);
        System.out.println("Você digitou: " + a);

        System.out.println("======//===============//==========");

        int s4;
        String s1,s2,s3;

        s4 = teclado.nextInt();
        teclado.nextLine();
        s1 = teclado.nextLine();
        s2 = teclado.nextLine();
        s3 = teclado.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println(s4);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("======//===============//==========");




        teclado.close();
    }
}
