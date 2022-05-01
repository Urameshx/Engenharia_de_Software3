package controller;

import model.Funcionario;
import model.FuncionarioTemporario;

public class Contratacao3 extends FuncionarioController {

	public Funcionario contrataFunc() {
		    FuncionarioTemporario fti = new FuncionarioTemporario();
			int id = (int)((Math.random() * 1001) + 1000);
			fti.setId(id);
			fti.setNome("Jose");
			fti.setSalario(2500);
			fti.setDia(9);
			fti.setMes(10);
			fti.setAno(2022);
			return fti;
		}
}
