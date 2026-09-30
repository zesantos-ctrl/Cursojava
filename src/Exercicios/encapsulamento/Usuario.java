package Exercicios.encapsulamento;

public class Usuario {
    private int conta;
    private String cliente;
    private double saldo;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valorDepositado) {
        if (valorDepositado > 0) {
            saldo += valorDepositado;
            System.out.print("");
        } else {
            System.out.println("Valor invalido!");
        }
    }

    public void saque(double valorSaque) {
        if (valorSaque <= 0) {
            System.out.println("Valor do saque deve ser maior do que zero!");
            return;
        }

        if (saldo < valorSaque) {
   System.out.printf("" + "/nsaldo de %s atual: R$.2f", cliente, saldo);
        } else {
            saldo -= valorSaque;
            System.out.printf("transação realizada com sucesso!" + "/nsaldo de %s atual: R$.2f", cliente, saldo);
        }
    }
}
