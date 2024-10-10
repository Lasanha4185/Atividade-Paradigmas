package Atividade09;

public class Contrato implements Imprimivel{
    private String partesEnvolvidas;
    private String detalhes;

    public Contrato(String partesEnvolvidas, String detalhes) {
        this.partesEnvolvidas = partesEnvolvidas;
        this.detalhes = detalhes;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo Contrato...");
        System.out.println("Partes Envolvidas: " + partesEnvolvidas);
        System.out.println("Detalhes do Contrato: " + detalhes);
        System.out.println("--------- Fim do Contrato ---------");
    }
}
