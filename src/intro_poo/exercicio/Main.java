package intro_poo.exercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Retangulo r = new Retangulo();

        System.out.println("Digite a largura e altura do retangulo: ");
        r.width = teclado.nextDouble();
        r.height = teclado.nextDouble();

        System.out.printf("%.2f%n",r.area());
        System.out.printf("%.2f%n",r.perimetro());
        System.out.printf("%.2f%n",r.diagonal());


    }
}
