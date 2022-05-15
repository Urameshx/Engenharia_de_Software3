package controller;

import javax.swing.JOptionPane;

public class ISâoPaulo implements ImpostoStrategy {

	@Override
	public void calculaImposto() {
		double areaImovel= Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Digite a area do imóvel: "));
		double numComodos = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Digite o numero de comodos: "));
		double imposto = (areaImovel * 10) + (numComodos * 2);
		
		System.out.println("O valor do imposto de São Paulo será de " 
		+ imposto);
	}

}
