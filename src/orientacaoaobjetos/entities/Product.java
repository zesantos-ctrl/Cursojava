package orientacaoaobjetos.entities;

public class Product {
    // Private - so pode ser acessado na propria classe
    private String name; // sem private pode ser acessado pela class order
    private double price;
    private int quantity;

    // construtor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {
    }

    // Sobrecarga é disponibilizar mais de uma versão do mesmo método
    // na mesma classe. A diferença está na lista de parâmetros (tipo, quantidade ou
    // ordem).
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // metodos de encapsulamento
    public String getName() {
        return getName();
    }

    public void setName(String name) {
        this.setName(name);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // metodos
    public double totalValueInStock() {
        return price * quantity;
    }

    // parametro do metodo
    public void addProducts(int quantity) {
        this.quantity += quantity; // this palavra reservada
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", $"
                + String.format("%.2f", price) +
                ", " + quantity
                + " units, total: $"
                + String.format("%.2f", totalValueInStock());
    }
}
