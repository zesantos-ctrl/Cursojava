package construtores_this_encapsulamento;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto() {
    }

    public Produto(String nome, double preco, int quantidade) {
        // this.nome aponta para o atributo | nome aponta pro parametro
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco) {
        // Sobrecarga disponibilizar outro construtor, o que muda é os parametros
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double totalEmEstoque() {
        return preco * quantidade;
    }

    public void addProduto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return getNome()
                + ", R$ " + String.format("%.2f", getPreco())
                + ", " + getQuantidade() + " unidade(s)"
                + ", Total: R$ " + String.format("%.2f", totalEmEstoque());
    }

}
