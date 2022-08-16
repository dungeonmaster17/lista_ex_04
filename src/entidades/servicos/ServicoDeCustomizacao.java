package entidades.servicos;

import entidades.Veiculo;

public interface ServicoDeCustomizacao {
    double ar(Veiculo veiculo);
    double cambioAuto(Veiculo veiculo);
    double alarme(Veiculo veiculo);
    double pinturaEspecial(Veiculo veiculo);
    double tetoSolar(Veiculo veiculo);
    double kitMultimidia(Veiculo veiculo);
}
