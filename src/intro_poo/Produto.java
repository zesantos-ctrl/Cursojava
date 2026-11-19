package intro_poo;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    public double totalEmEstoque() {
        return preco * quantidade;
    }

    public void addProduto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }
}
