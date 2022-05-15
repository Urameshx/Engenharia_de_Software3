package view;

import controller.ImpostoStrategy;
import controller.IBeloHorizonte;
import controller.ICuritiba;
import controller.IPortoAlegre;
import controller.IS�oPaulo;

public class Principal {

	public static void main(String[] args) {
		ImpostoStrategy imposto = new IBeloHorizonte();
		imposto.calculaImposto();
		
		imposto = new IS�oPaulo();
		imposto.calculaImposto();
		
		imposto = new ICuritiba();
		imposto.calculaImposto();
		
		imposto = new IPortoAlegre();
		imposto.calculaImposto();
		
	}
	
}
