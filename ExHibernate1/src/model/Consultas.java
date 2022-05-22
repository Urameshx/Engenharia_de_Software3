package model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

	@Entity
	@Table(name = "Consultas")
	public class Consultas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_consulta")
	@NotNull
	private int codigo_consulta;
	
	@Column(name = "data_consulta", length = 200)
	@NotNull
	private Date data_consulta;
	
	//@ManyToOne(targetEntity = Doentes.class)
	//@JoinColumn(name = "codigo_doente")
	//@NotNull
	//private Doentes doentes;
	
	//@ManyToOne(targetEntity = Medicos.class)
	//@JoinColumn(name = "medico_id")
	//@NotNull
	//private Medicos medicos;
	
	public int getCodigo_consulta() {
		return codigo_consulta;
	}

	public void setCodigo_consulta(int codigo_consulta) {
		this.codigo_consulta = codigo_consulta;
	}

	public Date getData_consulta() {
		return data_consulta;
	}

	public void setData_consulta(Date data_consulta) {
		this.data_consulta = data_consulta;
	}

	@Override
	public String toString() {
		return "Consultas [codigo_consulta=" + codigo_consulta 
				+ ", data_consulta=" + data_consulta + "]";
	}

	
	
	
	}	
