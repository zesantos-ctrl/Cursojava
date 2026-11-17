package exericicio;

import java.util.Locale;

public class Produto {
    public static void main(String[] args) {

        // Variaveis e tipo básicos em java
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 22;
        int code = 5290;
        char gender = 'M';

        double price1 = 2100.0;
        double price2 = 650.0;
        double measure = 53.234567;

        // Saída de dados
        System.out.println("Products: ");
        System.out.printf("%s, wich price is R$ %.2f%n", product1, price1);
        System.out.printf("%s, wich price is R$ %.2f%n", product2, price2);

        System.out.printf("Record: %d years old, code %d and gender: %s %n", age, code, gender);

        System.out.printf("Measue eight decimal places: %.6f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
    }
}
