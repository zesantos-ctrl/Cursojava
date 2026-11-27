package intro_poo.exercicio.funcionario;

public class Funcionario {

    public String nome;
    public double salarioBruto;
    public double taxa;

    public double salarioLiquido() {
        return salarioBruto - taxa;
    }

    public void incrementoSalario(double porcentagem) {
        this.salarioBruto += this.salarioBruto * (porcentagem / 100.0);
    }

    @Override
    public String toString() {
        return "Nome: "
                + nome
                + ", $"
                + salarioLiquido();
    }
}
