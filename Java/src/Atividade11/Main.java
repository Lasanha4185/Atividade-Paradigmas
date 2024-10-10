package Atividade11;

public class Main {
    public static void main(String[] args) {
        // Criando um funcionário horista
        Funcionario horista = new FuncionarioHorista("João", 160, 25.00); // 160 horas, R$25/hora
        System.out.println("Salário de " + horista.getNome() + ": " + horista.calcularSalario());

        // Criando um funcionário assalariado
        Funcionario assalariado = new FuncionarioAssalariado("Maria", 5000.00); // Salário fixo de R$5000
        System.out.println("Salário de " + assalariado.getNome() + ": " + assalariado.calcularSalario());
    }
}
