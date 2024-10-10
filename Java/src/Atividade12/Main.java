package Atividade12;

public class Main {
    public static void main(String[] args) {
        // Criando dois produtos
        Produto produto1 = new Produto("Notebook", 2500.00);
        Produto produto2 = new Produto("Smartphone", 1500.00);

        // Somando os dois produtos (baseado no preço)
        Produto combo = produto1.somar(produto2);

        // Exibindo o resultado
        System.out.println(combo);
    }
}
