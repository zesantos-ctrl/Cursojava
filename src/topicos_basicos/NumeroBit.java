package topicos_basicos;

import java.util.Scanner;

public class NumeroBit {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int mask = 0b00100000;
        int n = teclado.nextInt();

        if ((n & mask)!= 0){
            System.out.println("6th bit is true");
        } else{
            System.out.println("6th bit is false");
        }
    }
}
