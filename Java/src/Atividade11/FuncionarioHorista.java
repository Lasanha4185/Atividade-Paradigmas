package Atividade11;

public class FuncionarioHorista extends Funcionario{
    private double horasTrabalhadas;
    private double valorPorHora;

    // Construtor
    public FuncionarioHorista(String nome, double horasTrabalhadas, double valorPorHora) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    // Implementação do método calcularSalario
    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorPorHora;
    }

}
