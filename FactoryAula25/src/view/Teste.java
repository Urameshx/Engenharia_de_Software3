package view;

import controller.Controle;
import controller.Situacao1;
import controller.Situacao2;
import controller.Situacao3;
import model.Situações;
import model.Veiculo;

public class Teste {

	public static void main(String[] args) {
		
		Situações s = new Situações();
		s.setEscolha(2);
				
		Veiculo movVeiculo = null;
		Controle sit1 = new Situacao1();
		Controle sit2 = new Situacao2();
		Controle sit3 = new Situacao3();
		
		if (sit1.movimentacaoVeiculo(s) != null) {
			sit1.inicioMovimentacao(s);
			movVeiculo = sit1.movimentacaoVeiculo(s);
		}
		if (sit2.movimentacaoVeiculo(s) != null) {
			sit2.inicioMovimentacao(s);
			movVeiculo = sit2.movimentacaoVeiculo(s);
		}
		if (sit3.movimentacaoVeiculo(s) != null) {
			sit3.inicioMovimentacao(s);
			movVeiculo = sit3.movimentacaoVeiculo(s);
		}
		System.out.println(movVeiculo.toString());
	}
	
}
