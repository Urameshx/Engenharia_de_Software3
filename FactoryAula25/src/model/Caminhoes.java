package model;

public class Caminhoes extends Veiculo {

	private int qntEixos;
	private double cargaMax;
	public int getQntEixos() {
		return qntEixos;
	}
	public void setQntEixos(int qntEixos) {
		this.qntEixos = qntEixos;
	}
	public double getCargaMax() {
		return cargaMax;
	}
	public void setCargaMax(double cargaMax) {
		this.cargaMax = cargaMax;
	}
	@Override
	public String toString() {
		return "Caminhoes [qntEixos=" + qntEixos + ", cargaMax=" + cargaMax + ", getPlaca()=" + getPlaca()
				+ ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + ", getCor()=" + getCor()
				+ ", getVelocidadeMaxima()=" + getVelocidadeMaxima() + "]";
	}

		
}
