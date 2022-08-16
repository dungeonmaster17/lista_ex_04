package entidades.servicos;

import entidades.Veiculo;

public class ItensParaCustomizacao implements ServicoDeCustomizacao{

    @Override
    public double ar(Veiculo veiculo) {
        if(veiculo.getCustomizacao().getAr() == 'S'){
            return 3000.0;
        }
        return 0;
    }

    @Override
    public double cambioAuto(Veiculo veiculo) {
        if(veiculo.getCustomizacao().getCambioAuto() == 'S'){
            return 5000.0;
        }
        return 0;
    }

    @Override
    public double alarme(Veiculo veiculo) {
        if(veiculo.getCustomizacao().getAlarme() == 'S'){
            return 800.0;
        }
        return 0;
    }

    @Override
    public double pinturaEspecial(Veiculo veiculo) {
        if(veiculo.getCustomizacao().getPinturaEspecial() == 'S'){
            return 2500.0;
        }
        return 0;
    }

    @Override
    public double tetoSolar(Veiculo veiculo) {
        if(veiculo.getCustomizacao().getTetoSolar() == 'S'){
            return 4000.0;
        }
        return 0;
    }

    @Override
    public double kitMultimidia(Veiculo veiculo) {
        if(veiculo.getCustomizacao().getKitMultimidia() == 'S'){
            return 1800.0;
        }
        return 0;
    }
}
