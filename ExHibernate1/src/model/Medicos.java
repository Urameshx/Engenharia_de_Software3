package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Medicos")
public class Medicos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "medico_id")
	@NotNull
	private int codigo;
	
	@Column(name = "nome_medico", length = 200)
	@NotNull
	private String nome_medico;
	
	@Column(name = "endereco_medico", length = 200)
	@NotNull
	private String endereco_medico;
	
	@Column(name = "contato_medico", length = 200)
	@NotNull
	private String contato_medico;
	
	@Column(name = "especialidade_medico", length = 200)
	@NotNull
	private String especialidade_medico;

	//@OneToOne(targetEntity = Doentes.class)
	//@JoinColumn(name = "codigo_doente")
	//@NotNull
	//private Doentes doentes;
	
	//@ManyToMany(targetEntity = Consultas.class)
	//@JoinColumn(name = "codigo_doente")
	//@NotNull
	//private Consultas consultas;
	
		
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome_medico() {
		return nome_medico;
	}

	public void setNome_medico(String nome_medico) {
		this.nome_medico = nome_medico;
	}

	public String getEndereco_medico() {
		return endereco_medico;
	}

	public void setEndereco_medico(String endereco_medico) {
		this.endereco_medico = endereco_medico;
	}

	public String getContato_medico() {
		return contato_medico;
	}

	public void setContato_medico(String contato_medico) {
		this.contato_medico = contato_medico;
	}

	public String getEspecialidade_medico() {
		return especialidade_medico;
	}

	public void setEspecialidade_medico(String especialidade_medico) {
		this.especialidade_medico = especialidade_medico;
	}

	@Override
	public String toString() {
		return "Medicos [codigo=" + codigo + ", nome_medico=" + nome_medico 
				+ ", endereco_medico=" + endereco_medico
				+ ", contato_medico=" + contato_medico 
				+ ", especialidade_medico=" + especialidade_medico + "]";
	}
	
	}
