package Atividade0405;

public class Animal {
    private String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void emitirSom() {
        System.out.println("Som do animal: " + this.nome);
    }
    public Animal(String nome) {
        this.nome = nome;
    }
}
