package estruturaSequencial;

import java.util.Scanner;

public class EntradaDeDados2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String s1,s2,s3;

        s1  = teclado.nextLine();
        s2  = teclado.nextLine();
        s3  = teclado.nextLine();

        System.out.println("Dados digitados:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        teclado.close();
    }
}
