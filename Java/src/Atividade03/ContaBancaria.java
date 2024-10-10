package Atividade03;

public class ContaBancaria {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private String titular;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public ContaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(ContaBancaria conta, double deposito){
        conta.setSaldo((conta.getSaldo() + deposito));
    }

    public void sacar(ContaBancaria conta, double saque){
        if(conta.getSaldo() >= saque){
            conta.setSaldo((conta.getSaldo() - saque));
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
