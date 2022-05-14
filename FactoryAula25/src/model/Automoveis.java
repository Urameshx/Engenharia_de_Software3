package model;

public class Automoveis extends Veiculo {

	private int numPortas;
	private int ano;
	public int getNumPortas() {
		return numPortas;
	}
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	@Override
	public String toString() {
		return "Automoveis [numPortas=" + numPortas + ", ano=" + ano + ", getPlaca()=" + getPlaca() + ", getMarca()="
				+ getMarca() + ", getModelo()=" + getModelo() + ", getCor()=" + getCor() + ", getVelocidadeMaxima()="
				+ getVelocidadeMaxima() + "]";
	}
	
	

}
