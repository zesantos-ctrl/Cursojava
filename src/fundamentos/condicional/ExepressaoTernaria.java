package fundamentos.condicional;

public class ExepressaoTernaria {
    public static void main(String[] args) {

        double preco = 34.5;

        double desconto;
        if (preco < 20.0) {
            desconto = preco * 0.1;
        } else {
            desconto = preco * 0.05;
        }
        System.out.println("Desconto: " + desconto);
        // operador ternario (mais simplificado)
        // double desconto = (preco < 20.0) ? preco * 1 : preco * 0.05;
    }
}
