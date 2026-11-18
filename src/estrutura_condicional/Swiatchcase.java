package estrutura_condicional;

import java.util.Scanner;

public class Swiatchcase {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int x = teclado.nextInt();
        String dia;
        switch (x) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sediata";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Valro inválida";
        }
        System.out.println("Dia da semana: " + dia);
    }
}
