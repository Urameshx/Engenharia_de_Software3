package model;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

	@Entity
	@Table(name = "Endereco")
	public class Endereco{
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_end")
	@NotNull
	private int id_end;	
	
	@Column(name = "logradouro", length = 200)
	@NotNull
	private String logradouro;
	
	@Column(name = "CEP", length = 200)
	@NotNull
	private String cep;
	
	@ManyToOne(targetEntity = Doentes.class)
	@JoinColumn(name = "codigo_doente")
	@NotNull
	private Doentes doentes;

	public int getId_end() {
		return id_end;
	}

	public void setId_end(int id_end) {
		this.id_end = id_end;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(cep, doentes, id_end, logradouro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(cep, other.cep) && 
				Objects.equals(doentes, other.doentes) && id_end == other.id_end
				&& Objects.equals(logradouro, other.logradouro);
	}

	
	
	}
