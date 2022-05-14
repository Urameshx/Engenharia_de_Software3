package model;

public class Motocicleta extends Veiculo {

	private int cilindradas;

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		return "Motocicleta [cilindradas=" + cilindradas + ", getPlaca()=" + getPlaca() + ", getMarca()="
				+ getMarca() + ", getModelo()=" + getModelo() + ", getCor()=" + getCor() 
				+ ", getVelocidadeMaxima()=" + getVelocidadeMaxima() + "]";
	}
}
