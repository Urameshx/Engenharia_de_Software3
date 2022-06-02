package model;

public class Imovel {
	private int codigo;
	private String endereco;
	private int quartos;
	private int vagas;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getQuartos() {
		return quartos;
	}
	public void setQuartos(int quartos) {
		this.quartos = quartos;
	}
	public int getVagas() {
		return vagas;
	}
	public void setVagas(int vagas) {
		this.vagas = vagas;
	}
	@Override
	public String toString() {
		return "Imovel [codigo=" + codigo + ", endereco=" + endereco + ", quartos=" +
				quartos + ", vagas=" + vagas + "]";
	}
	
}
