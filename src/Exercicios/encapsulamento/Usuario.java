package Exercicios.encapsulamento;

public class Usuario {
    private double balance;
    private String holder;
    private int number;

    public Usuario(String holder, int number) {
        this.holder = holder;
        this.number = number;
    }

    public Usuario(double initialDeposit, String holder, int number) {
        this.holder = holder;
        this.number = number;
        deposit(initialDeposit);
    }

    //Mesma coisa, aqui é o saque e ele so poder ser alterado pelo deposito e saque
    public double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    // Numero da conta não pode ser alterado, então so criamos o get
    public int getNumber() {
        return number;
    }

    // Adicionando saldo
    public void deposit(double amount) {
        balance += amount;
    }

    // sacando o saldo
    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    public String toString() {
        return "Accoutn"
                + number
                + ", holder: "
                + holder
                + ", balance: $"
                + String.format("%.2f", balance);
    }

}
