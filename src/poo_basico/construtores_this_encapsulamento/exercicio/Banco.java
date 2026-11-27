package poo_basico.construtores_this_encapsulamento.exercicio;

public class Banco {
    private String nome;
    private int conta;
    private double saldo;

    public Banco() {
    }

    public Banco(String nome, int conta) {
        this.nome = nome;
        this.conta = conta;
    }

    public Banco(String nome, int conta, double depositoInicial) {
        this.nome = nome;
        this.conta = conta;
        depositar(depositoInicial);
        //chamei o metodo deposito, significa que ele inicia um novo deposito e não preciso mudar futuramente
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor + 5.0;
    }

    @Override
    public String toString() {
        return "Conta: "
                + conta
                + ", Nome:"
                + nome
                + ", Saldo: $"
                + String.format("%.2f", saldo);
    }
}
