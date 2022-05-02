package model;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	
    private String nome;
    private String cidade;
    private List<Cal�ados> cal�ados = new ArrayList<Cal�ados>();
    private List<Camisetas> camisetas = new ArrayList<Camisetas>();
    private List<JogosEletronicos> jogoseletr = 
    		new ArrayList<JogosEletronicos>();
    private List<EquipaArmaze> equipaarmaze = new ArrayList<EquipaArmaze>();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public List<Cal�ados> getCal�ados() {
		return cal�ados;
	}

	public void setCal�ados(List<Cal�ados> cal�ados) {
		this.cal�ados = cal�ados;
	}

	public List<Camisetas> getCamisetas() {
		return camisetas;
	}

	public void setCamisetas(List<Camisetas> camisetas) {
		this.camisetas = camisetas;
	}

	public List<JogosEletronicos> getJogoseletr() {
		return jogoseletr;
	}

	public void setJogoseletr(List<JogosEletronicos> jogoseletr) {
		this.jogoseletr = jogoseletr;
	}

	public List<EquipaArmaze> getEquipaarmaze() {
		return equipaarmaze;
	}

	public void setEquipaarmaze(List<EquipaArmaze> equipaarmaze) {
		this.equipaarmaze = equipaarmaze;
	}

	@Override
	public String toString() {
		return "Loja [nome=" + nome + ", cidade=" + cidade + ", cal�ados=" 
				+ cal�ados + ", camisetas=" + camisetas
				+ ", jogoseletr=" + jogoseletr + ", equipaarmaze=" 
				+ equipaarmaze + "]";
	}


    
}
