package model;

public class Personagem {

	private int id;
	private String nome;
	private String arma;
	private int nivel;
	private int energia;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getArma() {
		return arma;
	}
	public void setArma(String arma) {
		this.arma = arma;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
	@Override
	public String toString() {
		return "Personagem [id=" + id + ", nome=" + nome + ", arma=" + arma + ", nivel=" + nivel + ", energia="
				+ energia + "]";
	}
	
	
}
