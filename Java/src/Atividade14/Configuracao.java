package Atividade14;

public class Configuracao {
    private static Configuracao instanciaUnica;

    // Outros atributos da classe
    private String urlBancoDados;
    private String usuarioBancoDados;
    private String senhaBancoDados;

    // Construtor privado para impedir que a classe seja instanciada externamente
    private Configuracao() {
        // Valores fictícios para configuração
        this.urlBancoDados = "jdbc:mysql://localhost:3306/meu_banco";
        this.usuarioBancoDados = "admin";
        this.senhaBancoDados = "senha123";
    }

    // Método estático para obter a única instância da classe
    public static Configuracao getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Configuracao();
        }
        return instanciaUnica;
    }

    // Métodos para obter as configurações
    public String getUrlBancoDados() {
        return urlBancoDados;
    }

    public String getUsuarioBancoDados() {
        return usuarioBancoDados;
    }

    public String getSenhaBancoDados() {
        return senhaBancoDados;
    }
}
