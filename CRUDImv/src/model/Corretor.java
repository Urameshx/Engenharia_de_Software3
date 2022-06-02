package model;

public class Corretor {
	private String creci;
	private String nome;
	private String regiao;
	
	public String getCreci() {
		return creci;
	}

	public void setCreci(String creci) {
		this.creci = creci;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	@Override
	public String toString() {
		return "Imovel [creci=" + creci + ", nome=" + nome + ", regiao=" + regiao + "]";
	}
	
}
