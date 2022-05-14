package model;

public class Situações {
	
	private int valorAleatorio1;
	private int valorAleatorio2;
	private int valorAleatorio3;
	private double escolha;
	
	public double getEscolha() {
		return escolha;
	}
	public void setEscolha(double escolha) {
		this.escolha = escolha;
	}
	public int getValorAleatorio1() {
		return valorAleatorio1;
	}
	public void setValorAleatorio1(int valorAleatorio1) {
		this.valorAleatorio1 = valorAleatorio1;
	}
	public int getValorAleatorio2() {
		return valorAleatorio2;
	}
	public void setValorAleatorio2(int valorAleatorio2) {
		this.valorAleatorio2 = valorAleatorio2;
	}
	public int getValorAleatorio3() {
		return valorAleatorio3;
	}
	public void setValorAleatorio3(int valorAleatorio3) {
		this.valorAleatorio3 = valorAleatorio3;
	}
	@Override
	public String toString() {
		return "Situações [valorAleatorio1=" + valorAleatorio1 + ", valorAleatorio2=" + valorAleatorio2
				+ ", valorAleatorio3=" + valorAleatorio3 + ", escolha=" + escolha + "]";
	}
	
	
}
