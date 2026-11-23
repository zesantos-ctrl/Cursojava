package intro_poo.exercicio_estatico;

public class Conversao {

    public static final double IOF = 0.06;
    

    public static double dolarParaReal(double amount, double dolar) {
        return amount * dolar * (1.0 + IOF);
    }
}
