package Atividade15;

public class Main {
    public static void main(String[] args) {
        // Criando uma conta bancária com saldo inicial de 1000
        ContaBancaria conta = new ContaBancaria("João", 1000.00);

        // Tentando sacar um valor que excede o saldo disponível
        try {
            System.out.println("Saldo atual: R$" + conta.getSaldo());
            conta.sacar(1500.00);  // Tentativa de saque de valor maior que o saldo
        } catch (SaldoInsuficienteException e) {
            System.err.println(e.getMessage());  // Captura e exibe a mensagem da exceção
        }

        // Tentando sacar um valor dentro do limite
        try {
            conta.sacar(500.00);  // Saque de valor permitido
            System.out.println("Saque realizado com sucesso.");
            System.out.println("Saldo restante: R$" + conta.getSaldo());
        } catch (SaldoInsuficienteException e) {
            System.err.println(e.getMessage());
        }
    }
}
