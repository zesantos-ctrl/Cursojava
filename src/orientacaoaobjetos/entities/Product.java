package orientacaoaobjetos.entities;
public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }
                                //parametro do metodo
    public void addProducts(int quantity) {
        this.quantity += quantity; // this palavra reservada, sendo mais 
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    pubic String toString() {
        return name;
    }
}
