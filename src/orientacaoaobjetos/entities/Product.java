package orientacaoaobjetos.entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    // construtor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product() {
    }
    // sobrecarga é saber disponibizar mais de um versão da mesmo versão a diferença
    // é a lista de parametros
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    // parametro do metodo
    public void addProducts(int quantity) {
        this.quantity += quantity; // this palavra reservada, sendo mais
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $"
                + String.format("%.2f", price)
                + ", " + quantity + " units, total: $"
                + String.format("%.2f", totalValueInStock());
    }
}
