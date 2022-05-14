package controller;

import model.Veiculo;
import model.Situações;


public abstract class Controle {

	public void inicioMovimentacao(Situações v) {
		System.out.println("O veiculo iniciou movimentacao " +v.getEscolha());
	}
	
	public abstract Veiculo movimentacaoVeiculo(Situações v); 
}