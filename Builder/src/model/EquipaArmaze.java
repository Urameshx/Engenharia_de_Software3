package model;

public class EquipaArmaze {
	private TipoArmaze tipo;
	private String capacidade;
	private String fabricante;
	private double valor;
	
	public TipoArmaze getTipo() {
		return tipo;
	}
	public void setTipo(TipoArmaze tipo) {
		this.tipo = tipo;
	}
	public String getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "EquipaArmaze [tipo=" + tipo + ", capacidade=" + capacidade +
				", fabricante=" + fabricante + ", valor="
				+ valor + "]";
	}
		
}
