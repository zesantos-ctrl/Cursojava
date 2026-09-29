package Exercicios.membroestatic.dolar;

public class Conversao {

    public static final double IOF = 0.06;

    public static double convertToReais(double dolar, double dollarAmount) {
        double baseValue = dollarAmount * dolar;
        double iof = baseValue * IOF;
        return baseValue + iof;
    }

}
