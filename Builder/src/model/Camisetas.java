package model;

public class Camisetas {
	private TipoTamanho tipo;
	private String cor;
	private String marca;
	private double valor;
	
	public TipoTamanho getTipo() {
		return tipo;
	}
	public void setTipo(TipoTamanho tipo) {
		this.tipo = tipo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Camisetas [tipo=" + tipo + ", cor=" + cor + ", marca=" + marca 
				+ ", valor=" + valor + "]";
	}
	
}
