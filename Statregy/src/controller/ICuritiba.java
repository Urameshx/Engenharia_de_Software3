package controller;

import javax.swing.JOptionPane;

public class ICuritiba implements ImpostoStrategy {

	@Override
	public void calculaImposto() {
		double areaImovel= Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Digite a area do im�vel: "));
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Qual a idade do im�vel em anos (Apenas numeros): "));
		double imposto = 0;
			if (idade >= 50) {
				imposto = (areaImovel * 5) + (idade * 3);	
			} else if (idade < 20){
				imposto = (areaImovel * 5) + (idade * 2);
			} else if (idade >= 20 && idade < 50){
				imposto = (areaImovel * 5) + (idade * 2.5);
			} else {
				JOptionPane.showInputDialog(null,"Digite um n�mero valido");
			}
		
		System.out.println("O valor do imposto de Curitiba ser� de " + imposto);
	
	}	
}
