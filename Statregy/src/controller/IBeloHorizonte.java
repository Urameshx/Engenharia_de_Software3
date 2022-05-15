package controller;

import javax.swing.JOptionPane;

public class IBeloHorizonte implements ImpostoStrategy {

	@Override
	public void calculaImposto() {
		double areaImovel= Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Digite a area do imóvel: "));
		double numQuartos = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Digite o numero de comodos: "));
		double imposto = (areaImovel * 7) + (numQuartos * 4);
		
		System.out.println("O valor do imposto de BH será de: " + imposto);
	}

}
