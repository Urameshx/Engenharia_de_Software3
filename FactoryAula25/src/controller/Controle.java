package controller;

import model.Veiculo;
import model.Situa��es;


public abstract class Controle {

	public void inicioMovimentacao(Situa��es v) {
		System.out.println("O veiculo iniciou movimentacao " +v.getEscolha());
	}
	
	public abstract Veiculo movimentacaoVeiculo(Situa��es v); 
}