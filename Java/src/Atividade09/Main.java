package Atividade09;

public class Main {
    public static void main(String[] args) {
        // Criando um relatório
        Relatorio relatorio = new Relatorio("Relatório Financeiro", "Este relatório detalha as finanças do último trimestre.");

        // Criando um contrato
        Contrato contrato = new Contrato("Empresa A e Empresa B", "Detalhes sobre a parceria entre as empresas.");

        // Imprimindo os objetos
        relatorio.imprimir();
        System.out.println();  // Apenas para separar a saída no console
        contrato.imprimir();
    }
}
