package estrututraCondicional;

public class EscopoInicializacao {
    public static void main(String[] args) {
        double price = 400.00;

        double discount;

        if (price < 200.00) {
            discount = price * 0.1;
        } else {
            discount = 0; // foi inicializada
        }
        System.out.println(discount); // pode ser imprimida dps e ser inicializada.
    }
}
