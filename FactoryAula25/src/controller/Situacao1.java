package controller;

import model.Situa��es;
import model.Automoveis;
import model.Veiculo;

public class Situacao1 extends Controle {

	@Override
	public Veiculo movimentacaoVeiculo(Situa��es v) {
		if (v.getEscolha() == 1) {
						
			Automoveis aut = new Automoveis();
			aut.setAno(1999);
			aut.setCor("Azul");
			aut.setMarca("Ford");
			aut.setModelo("Sedan");
			aut.setNumPortas(3);
			aut.setPlaca("LXD4345");
			aut.setVelocidadeMaxima(250);
			return aut;
		}
		return null;
	}

}