package entidades;

import entidades.servicos.ServicoDeCustomizacao;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
    private String nome;
    private List<Veiculo> veiculos = new ArrayList<>();
    private ServicoDeCustomizacao servicoDeCustomizacao;

    private static final double IPI = 0.20;
    private static final double IMPORTADO = 0.30;

    public Concessionaria(){}

    public Concessionaria(String nome, ServicoDeCustomizacao servicoDeCustomizacao) {
        this.nome = nome;
        this.servicoDeCustomizacao = servicoDeCustomizacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public ServicoDeCustomizacao getServicoDeCustomizacao() {
        return servicoDeCustomizacao;
    }

    public void setServicoDeCustomizacao(ServicoDeCustomizacao servicoDeCustomizacao) {
        this.servicoDeCustomizacao = servicoDeCustomizacao;
    }

    public void addVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
    }

    public void removeVeiculo(Veiculo veiculo){
        veiculos.remove(veiculo);
    }

    public double taxaIPI(Veiculo veiculo){
        if(veiculo.getMotor() == 1.0){
            return veiculo.getPreco() * ((IPI / 2));
        }
        return veiculo.getPreco() * IPI;
    }

    public double taxaImportado(Veiculo veiculo){
        if(veiculo.getImportado() == 'S'){
            return veiculo.getPreco() * IMPORTADO;
        }
        return 0;
    }

    public void imprimirNota(){
        System.out.println("Detalhe da nota:");
        for(Veiculo v : veiculos){
            System.out.print("Modelo: "
                    + v.getModelo()
                    + " - Preço: " + String.format("%.2f", v.getPreco() + (servicoDeCustomizacao.ar(v)
                    + servicoDeCustomizacao.alarme(v) + servicoDeCustomizacao.cambioAuto(v)
                    + servicoDeCustomizacao.pinturaEspecial(v)
                    + servicoDeCustomizacao.kitMultimidia(v)
                    + servicoDeCustomizacao.tetoSolar(v)
                    + taxaIPI(v)
                    + taxaImportado(v))));
        }
    }

}
