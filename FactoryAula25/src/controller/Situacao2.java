package controller;

import model.Situações;
import model.Caminhoes;
import model.Veiculo;

public class Situacao2 extends Controle {

	@Override
	public Veiculo movimentacaoVeiculo(Situações v) {
		if (v.getEscolha() == 2) {
			Caminhoes cam = new Caminhoes();
			cam.setCargaMax(1000);
			cam.setCor("Preto");
			cam.setMarca("Ford");
			cam.setModelo("Duplo");
			cam.setPlaca("JFK2018");
			cam.setQntEixos(5);
			cam.setVelocidadeMaxima(150);
			return cam;
		}
		return null;
	}

}
