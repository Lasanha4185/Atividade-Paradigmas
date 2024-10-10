package Atividade14;

public class Main {
    public static void main(String[] args) {
        // Tentando obter a única instância da classe Configuracao
        Configuracao config1 = Configuracao.getInstancia();
        Configuracao config2 = Configuracao.getInstancia();

        // Verificando se ambas as referências apontam para a mesma instância
        if (config1 == config2) {
            System.out.println("As instâncias são iguais (Singleton funcionando corretamente).");
        } else {
            System.out.println("As instâncias são diferentes (Singleton NÃO está funcionando corretamente).");
        }

        // Acessando as configurações através da instância Singleton
        System.out.println("URL do Banco de Dados: " + config1.getUrlBancoDados());
        System.out.println("Usuário do Banco de Dados: " + config1.getUsuarioBancoDados());
    }
}
