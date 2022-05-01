package controller;

import model.Funcionario;


public abstract class FuncionarioController {

	public void inicializaFuncionario() {
		System.out.println("Inciamos o processo de contratacao");
	}
	public abstract Funcionario contrataFunc();
	
	}
