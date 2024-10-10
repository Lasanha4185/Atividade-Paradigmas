package Atividade07;
import java.util.ArrayList;
import java.util.List;


public class Professor {
    private String nome;
    private List<Escola> escolas;

    public Professor(String nome) {
        this.nome = nome;
        this.escolas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Escola> getEscolas() {
        return escolas;
    }

    public void adicionarEscola(Escola escola) {
        if (!escolas.contains(escola)) {
            escolas.add(escola);
            escola.adicionarProfessor(this); // Atualiza também na escola
        }
    }
}
