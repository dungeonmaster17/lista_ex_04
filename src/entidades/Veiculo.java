package entidades;

import java.util.Vector;

public class Veiculo {
    private String modelo;
    private Double preco;
    private Double motor;
    private char importado;
    private Concessionaria concessionaria;
    private Customizacao customizacao;

    public Veiculo(){}

    public Veiculo(String modelo, Double preco, Double motor, char importado, Concessionaria concessionaria, Customizacao customizacao) {
        this.modelo = modelo;
        this.preco = preco;
        this.motor = motor;
        this.importado = importado;
        this.concessionaria = concessionaria;
        this.customizacao = customizacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getMotor() {
        return motor;
    }

    public void setMotor(Double motor) {
        this.motor = motor;
    }

    public char getImportado() {
        return importado;
    }

    public void setImportado(char importado) {
        this.importado = importado;
    }

    public Concessionaria getConcessionaria() {
        return concessionaria;
    }

    public void setConcessionaria(Concessionaria concessionaria) {
        this.concessionaria = concessionaria;
    }

    public Customizacao getCustomizacao() {
        return customizacao;
    }

    public void setCustomizacao(Customizacao customizacao) {
        this.customizacao = customizacao;
    }
}
