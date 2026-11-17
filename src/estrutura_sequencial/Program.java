public class Program {
    public static void main(String[] args) {

        String nome = "Ze";
        int idade = 22;
        double saldo = 10.3265;

        System.out.println("Idade: " + idade + " anos");
        System.out.printf("saldo: R$ %.2f REAIS%n", saldo);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, saldo);
    }
}
