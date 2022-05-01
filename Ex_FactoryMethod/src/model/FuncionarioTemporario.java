package model;

public class FuncionarioTemporario extends Funcionario {

	private int mes;
	private int ano;
	private int dia;

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	
	@Override
	public String toString() {
		return "FuncionarioTemporario [dia=" + dia + " mes=" + mes + " ano=" 
				+ ano + ", Id=" + getId() + ", Nome=" + getNome()
				+ ", Salario=" + getSalario() + "]";
	}
	
	
}
