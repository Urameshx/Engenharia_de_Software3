package controller;

import model.Situa��es;
import model.Motocicleta;
import model.Veiculo;

public class Situacao3 extends Controle {

	@Override
	public Veiculo movimentacaoVeiculo(Situa��es v) {
		if (v.getEscolha() == 3) {
			Motocicleta mt = new Motocicleta();
			mt.setCilindradas(1100);
			mt.setCor("Roxo");
			mt.setMarca("Kawasaki");
			mt.setModelo("Ninja");
			mt.setPlaca("LBX2019");
			mt.setVelocidadeMaxima(300);
			return mt;
		}
		return null;
	}

}