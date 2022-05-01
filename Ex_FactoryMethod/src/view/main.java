package view;

import controller.FuncionarioController;
import controller.Contratacao1;
import controller.Contratacao2;
import controller.Contratacao3;
import model.Funcionario;



public class main {

	public static void main(String[] args) {
	
		Funcionario cntrFunc = null;
		FuncionarioController func1 = new Contratacao1();
		FuncionarioController func2 = new Contratacao2();
		FuncionarioController func3 = new Contratacao3();
		
		System.out.println(func1.contrataFunc());
		System.out.println(func2.contrataFunc());
		System.out.println(func3.contrataFunc());
	}
	
}
