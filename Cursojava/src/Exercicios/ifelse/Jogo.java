
import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um horario: ");
        int horaInicial = teclado.nextInt();

        System.out.println("Digite um horario: ");
        int horaIFinal = teclado.nextInt();

        int duracao;
        if (horaInicial < horaIFinal) {
            duracao = horaIFinal - horaInicial;
        } else {
            duracao = 24 - horaIFinal + horaInicial;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
    }
}
