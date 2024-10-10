package Atividade13;

public class Main {
    public static void main(String[] args) {
        // Testando o método estático fatorial
        int numero = 5;
        long fatorial = Matematica.fatorial(numero);
        System.out.println("Fatorial de " + numero + " é: " + fatorial);
    }
}
