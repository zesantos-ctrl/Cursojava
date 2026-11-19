package intro_poo;

public class Triangulo {

    // atributos
    public double a;
    public double b;
    public double c;

    // metodo/funcao

    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
