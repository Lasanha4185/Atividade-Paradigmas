package Atividade08;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nomeEmpresa;
    private List<Empregado> empregados;

    // Construtor
    public Empresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.empregados = new ArrayList<>();
    }

    // Método para adicionar um empregado à lista
    public void adicionarEmpregado(Empregado empregado) {
        empregados.add(empregado);
    }

    // Método para remover um empregado da lista
    public void removerEmpregado(Empregado empregado) {
        empregados.remove(empregado);
    }

    // Método para listar todos os empregados
    public void listarEmpregados() {
        System.out.println("Lista de empregados da empresa " + nomeEmpresa + ":");
        for (Empregado empregado : empregados) {
            System.out.println(empregado);
        }
    }

    // Getters e Setters
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public List<Empregado> getEmpregados() {
        return empregados;
    }

    public void setEmpregados(List<Empregado> empregados) {
        this.empregados = empregados;
    }
}
