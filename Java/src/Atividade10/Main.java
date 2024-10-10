package Atividade10;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância da calculadora
        Calculadora calculadora = new Calculadora();

        // Somando dois números
        int resultado1 = calculadora.somar(10, 20);
        System.out.println("Soma de dois números: " + resultado1);

        // Somando três números
        int resultado2 = calculadora.somar(5, 10, 15);
        System.out.println("Soma de três números: " + resultado2);
    }
}
