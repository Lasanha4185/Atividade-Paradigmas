package Atividade11;

public class Funcionario {
    private String nome;

    // Construtor
    public Funcionario(String nome) {
        this.nome = nome;
    }

    // Método abstrato calcularSalario
    public abstract double calcularSalario();

    // Getter para o nome
    public String getNome() {
        return nome;
    }
}
