package orientacaoaobjetos.util;

public class Calculator {
    // Constante ela não muda, nome sempre em maiucula ou NET_SALARY
    // constante com statico
    public static final double PI = 3.14159;

    // não da para chamar um metodo não estatico numa classe que tenha estatico
    // se eu remover o estatico dentro da classe metodo da erro
    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
