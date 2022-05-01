package controller;

import model.Funcionario;
import model.FuncionarioTempoParcial;

public class Contratacao2 extends FuncionarioController {

	public Funcionario contrataFunc() {
		    FuncionarioTempoParcial fti = new FuncionarioTempoParcial();
			int id = (int)((Math.random() * 1001) + 1000);
			fti.setId(id);
			fti.setNome("Lara");
			fti.setSalario(5000);
			fti.setHoraEntrada(9);
			fti.setHoraSaida(17);
			return fti;
		}
}
