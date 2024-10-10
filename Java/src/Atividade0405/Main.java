package Atividade0405;

public class Main {
    public static void main(String[] args) {

        Animal macaco = new Macaco("Macaco-Prego");
        Animal gato = new Gato("Gato-Persa");
        Animal cachorro = new Cachorro("Cachorro-Doberman");

        macaco.emitirSom();
        gato.emitirSom();
        cachorro.emitirSom();
    }
}
