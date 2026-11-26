package memoria_arrays_listas;

public class BoxingUnboxing {
    public static void main(String[] args) {

        // Boxing, conversão de objeto para um tipo referencia compativel
        int x = 20;
        Object obj = x;
        System.out.println("Boxing:");
        System.out.println("x = " + obj);

        // Unboxing, conversão do objeto para um tipo referencia para um tipo valor
        // compativel
        int y = (int) obj;
        System.out.println("Unboxing:");
        System.out.println("y = " + y);

        /*
         * Wrapper
         * Integer class do int
         * Double class do double
         * As classes aceitam nulos
         */

    }
}
