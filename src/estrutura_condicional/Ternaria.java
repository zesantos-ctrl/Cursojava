package estrutura_condicional;

import java.util.Scanner;

public class Ternaria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double x = teclado.nextDouble();
        

       double desconto = (x < 20.0) ? x * 0.1 : x * 0.05;
       System.out.println(desconto);
    }
}
