package app;

import entidades.Concessionaria;
import entidades.Customizacao;
import entidades.Veiculo;
import entidades.servicos.ItensParaCustomizacao;

import java.util.Scanner;

import static java.util.Locale.US;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(US);

        System.out.print("Concessionaria: ");
        String conc = sc.next();

        System.out.print("Veiculo: ");
        String modelo = sc.next();;

        System.out.print("Preço: R$ ");
        Double preco = sc.nextDouble();

        System.out.print("Motor (Ex: 1.0): ");
        Double motor = sc.nextDouble();

        System.out.print("Importado? (s/n): ");
        char importado = sc.next().toUpperCase().charAt(0);

        System.out.print("AR? (s/n): ");
        char ar = sc.next().toUpperCase().charAt(0);

        System.out.print("Cambio Auto? (s/n): ");
        char cambioAuto = sc.next().toUpperCase().charAt(0);

        System.out.print("Alarme? (s/n): ");
        char alarme = sc.next().toUpperCase().charAt(0);

        System.out.print("Pintura Especial? (s/n): ");
        char pintEpecial = sc.next().toUpperCase().charAt(0);

        System.out.print("Teto solar? (s/n): ");
        char teto = sc.next().toUpperCase().charAt(0);

        System.out.print("Kit Multimidia? (s/n): ");
        char kit = sc.next().toUpperCase().charAt(0);

        Concessionaria concessionaria = new Concessionaria(conc, new ItensParaCustomizacao());
        Customizacao customizacao = new Customizacao(ar, cambioAuto, alarme, pintEpecial, teto, kit);
        Veiculo veiculo = new Veiculo(modelo, preco, motor, importado, concessionaria, customizacao);

        concessionaria.addVeiculo(veiculo);
        concessionaria.imprimirNota();
    }
}
