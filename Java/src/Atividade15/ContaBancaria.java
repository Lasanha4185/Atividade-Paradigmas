package Atividade15;

public class ContaBancaria {

    private String titular;
    private double saldo;

    // Construtor
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para sacar dinheiro
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque. Saldo disponível: " + saldo);
        }
        saldo -= valor;
    }

    // Método para depositar dinheiro
    public void depositar(double valor) {
        saldo += valor;
    }

    // Método para verificar o saldo
    public double getSaldo() {
        return saldo;
    }
}
