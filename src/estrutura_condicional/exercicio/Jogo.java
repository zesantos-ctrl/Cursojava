
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Algo");
        int horaInicial = teclado.nextInt();
        System.out.println("Algo");
        int horaFinal = teclado.nextInt();

        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaFinal + horaInicial;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}
