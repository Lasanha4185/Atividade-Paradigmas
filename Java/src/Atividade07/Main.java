package Atividade07;

public class Main {

    public static void main(String[] args) {

        Escola escola1 = new Escola("Escola A");
        Escola escola2 = new Escola("Escola B");

        Professor professor1 = new Professor("Professor João");
        Professor professor2 = new Professor("Professora Maria");

        // Adicionando os professores às escolas
        escola1.adicionarProfessor(professor1);
        escola1.adicionarProfessor(professor2);
        escola2.adicionarProfessor(professor1);

        // Exibindo os professores de cada escola
        System.out.println("Professores na " + escola1.getNome() + ":");
        for (Professor professor : escola1.getProfessores()) {
            System.out.println(professor.getNome());
        }

        System.out.println("\nProfessores na " + escola2.getNome() + ":");
        for (Professor professor : escola2.getProfessores()) {
            System.out.println(professor.getNome());
        }

        // Exibindo as escolas onde o Professor João leciona
        System.out.println("\n" + professor1.getNome() + " leciona nas escolas:");
        for (Escola escola : professor1.getEscolas()) {
            System.out.println(escola.getNome());
        }

    }
}
