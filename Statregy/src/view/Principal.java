package view;

import controller.ImpostoStrategy;
import controller.IBeloHorizonte;
import controller.ICuritiba;
import controller.IPortoAlegre;
import controller.ISâoPaulo;

public class Principal {

	public static void main(String[] args) {
		ImpostoStrategy imposto = new IBeloHorizonte();
		imposto.calculaImposto();
		
		imposto = new ISâoPaulo();
		imposto.calculaImposto();
		
		imposto = new ICuritiba();
		imposto.calculaImposto();
		
		imposto = new IPortoAlegre();
		imposto.calculaImposto();
		
	}
	
}
