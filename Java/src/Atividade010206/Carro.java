package Atividade010206;
import java.lang.*;

public class Carro {
    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private int ano;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void acelerar(Carro car){
        System.out.println("Acelerando o carro " + car.getMarca() + " " + car.getModelo() + "...");
    }

    public void frear(Carro car){
        System.out.println("Freando o carro " + car.getMarca() + " " + car.getModelo() + "...");
    }

}

