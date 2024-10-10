package Atividade0405;

public class Macaco extends Animal{
    public Macaco(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Hihihi!");
    }
}
