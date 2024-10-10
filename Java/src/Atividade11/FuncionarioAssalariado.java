package Atividade11;

public class FuncionarioAssalariado {
    private double salarioMensal;

    // Construtor
    public FuncionarioAssalariado(String nome, double salarioMensal) {
        super(nome);
        this.salarioMensal = salarioMensal;
    }

    // Implementação do método calcularSalario
    @Override
    public double calcularSalario() {
        return salarioMensal;
    }
}
