package atividade.arquivo.entities;

public class Product {

    private String name;
    private double preco;
    private Integer quantidade;

    public Product(double preco, String name, Integer quantidade) {
        this.preco = preco;
        this.name = name;
        this.quantidade = quantidade;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double total() {
        return preco * quantidade;
    }

}
