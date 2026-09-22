package estrututraCondicional;

import java.util.Scanner;

public class SintaxeOpcional {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        int minutos = teclado.nextInt();

        double conta = 50.0;
        if(minutos > 100) {
            //Operadores cumulativa +=
            conta += (minutos - 100) * 2.0;
        }
    }
}
