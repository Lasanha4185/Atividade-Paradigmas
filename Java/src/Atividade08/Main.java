package Atividade08;

public class Main {
    public static void main(String[] args) {
        // Criando a empresa
        Empresa empresa = new Empresa("Tech Solutions");

        // Criando empregados
        Empregado empregado1 = new Empregado("João Silva", "Desenvolvedor", 5000.00);
        Empregado empregado2 = new Empregado("Maria Oliveira", "Gerente de Projetos", 8000.00);
        Empregado empregado3 = new Empregado("Carlos Pereira", "Analista de Sistemas", 6000.00);

        // Adicionando empregados à empresa
        empresa.adicionarEmpregado(empregado1);
        empresa.adicionarEmpregado(empregado2);
        empresa.adicionarEmpregado(empregado3);

        // Listando todos os empregados
        empresa.listarEmpregados();
    }
}
