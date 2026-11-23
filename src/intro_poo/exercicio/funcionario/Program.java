package intro_poo.exercicio.funcionario;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Funcionario f = new Funcionario();

        System.out.println("Infomações do funcionario: ");
        System.out.print("Digite nome do funcionario: ");
        f.nome = teclado.nextLine();System.out.print("Digite o salario: ");
        f.salarioBruto = teclado.nextDouble();
        System.out.print("Digite a taxa: ");
        f.taxa = teclado.nextDouble();

        System.out.println();
        System.out.println("Funcionario: " + f);

        System.out.println();
        System.out.println("Qual a porcentagem de incremento de salario? ");
       double incremento = teclado.nextDouble();
       f.incrementoSalario(incremento);

        System.out.println();
        System.out.println("Atualização: " + f);
    }
}
