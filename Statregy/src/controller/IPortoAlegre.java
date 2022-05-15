package controller;

import javax.swing.JOptionPane;

public class IPortoAlegre implements ImpostoStrategy {

	@Override
	public void calculaImposto() {
		double areaImovel= Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Digite a area do imóvel: "));
		int garagem = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Quantas garagens tem o imóvel: "));
		double imposto = 0;
		
		if (garagem == 0) {
			imposto = (areaImovel * 8);
		} else {	
			double areaGaragem = Double.parseDouble(JOptionPane.showInputDialog
					(null, "Digite a area da Garagem: "));
			imposto = (areaImovel * 7.5) + (areaGaragem * 2.5);	
		}
		
		System.out.println("O valor do imposto de Porto Alegre "
				+ "será de " + imposto);
	
	}	
}
