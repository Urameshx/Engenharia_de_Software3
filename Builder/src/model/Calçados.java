package model;

public class Cal�ados {
	private int tamanho;
	private String cor;
	private String marca;
	private double valor;
	private TipoTenis tipo;
	
	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
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

	public TipoTenis getTipo() {
		return tipo;
	}

	public void setTipo(TipoTenis tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Cal�ados [tamanho=" + tamanho + ", cor=" + cor + ", marca=" 
				+ marca + ", valor=" + valor + ", tipo="
				+ tipo + "]";
	}

	
}