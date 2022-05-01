package controller;

import model.Funcionario;
import model.FuncionarioTempoIntegral;

public class Contratacao1 extends FuncionarioController {

	public Funcionario contrataFunc() {
		    FuncionarioTempoIntegral fti = new FuncionarioTempoIntegral();
			int id = (int)((Math.random() * 1001) + 1000);
			fti.setId(id);
			fti.setNome("Carlos");
			fti.setSalario(1000);
			fti.setBancoHoras(10);
			return fti;
		}
}


