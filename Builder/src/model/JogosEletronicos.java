package model;

public class JogosEletronicos {
	private String nome;
	private TipoVideogame tipo;
	private double valor;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoVideogame getTipo() {
		return tipo;
	}
	public void setTipo(TipoVideogame tipo) {
		this.tipo = tipo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "JogosEletronicos [nome=" + nome + ", tipo=" + tipo + ", valor=" 
				+ valor + "]";
	}
	
}
