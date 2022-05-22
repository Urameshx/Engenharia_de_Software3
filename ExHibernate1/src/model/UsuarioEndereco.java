package model;

import java.io.Serializable;

public class UsuarioEndereco implements Serializable{
	private int codigo_doente; 
	private String endereco_doente;
	
	public UsuarioEndereco() {}
	
	public UsuarioEndereco (int codigo_doente,String endereco_doente) {
		this.codigo_doente = codigo_doente;
		this.endereco_doente = endereco_doente;
	}

	public int getCodigo_doente() {
		return codigo_doente;
	}

	public void setCodigo_doente(int codigo_doente) {
		this.codigo_doente = codigo_doente;
	}

	public String getEndereco_doente() {
		return endereco_doente;
	}

	public void setEndereco_doente(String endereco_doente) {
		this.endereco_doente = endereco_doente;
	}

	@Override
	public String toString() {
		return "UsuarioEndereco [codigo_doente=" + codigo_doente 
				+ ", endereco_doente=" + endereco_doente + "]";
	}
	
	
	
}
