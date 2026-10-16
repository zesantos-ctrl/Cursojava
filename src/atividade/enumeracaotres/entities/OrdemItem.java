package atividade.enumeracaotres.entities;

public class OrdemItem {

    private Integer quantity;
    private double price;

    private Produto produto;

    public OrdemItem() {
    }

    public OrdemItem(Integer quantity, double price, Produto produto) {
        this.quantity = quantity;
        this.price = price;
        this.produto = produto;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double subTotal() {
        return price * quantity;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return produto.getName()
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity +
                ", Suntotal: $"
                + String.format("%.2f", subTotal());
    }

}
