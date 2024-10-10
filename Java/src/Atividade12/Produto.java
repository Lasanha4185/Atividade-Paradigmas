package Atividade12;

public class Produto {
    private String nome;
    private double preco;

    // Construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Getter para o preço
    public double getPreco() {
        return preco;
    }

    // Método que permite "somar" dois produtos baseados no preço
    public Produto somar(Produto outroProduto) {
        double novoPreco = this.preco + outroProduto.getPreco();
        return new Produto("Combo de " + this.nome + " e " + outroProduto.nome, novoPreco);
    }

    @Override
    public String toString() {
        return nome + " - Preço: R$" + preco;
    }
}
