package model;

import java.util.Objects;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Doentes")
@IdClass(UsuarioEndereco.class)
public class Doentes{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "numero_beneficiario")
	@NotNull
	private int codigo_doente;
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "endereco_doente", length = 200)
	@NotNull
	private String endereco_doente;
	
	@Column(name = "nome_doente", length = 200)
	@NotNull
	private String nome_doente;
	
	
	@Column(name = "contato_doente", length = 200)
	@NotNull
	private String contato_doente;
	
	//@OneToOne(targetEntity = Medicos.class)
	//@JoinColumn(name = "medico_id")
	//@NotNull
	//private Medicos medicos;
	
	//@ManyToMany(targetEntity = Consultas.class)
	//@JoinColumn(name = "codigo_doente")
	//@NotNull
	//private Consultas consultas;
	
	public int getCodigo_doente() {
		return codigo_doente;
	}

	public void setCodigo_doente(int codigo_doente) {
		this.codigo_doente = codigo_doente;
	}

	public String getNome_doente() {
		return nome_doente;
	}

	public void setNome_doente(String nome_doente) {
		this.nome_doente = nome_doente;
	}

	public String getEndereco_doente() {
		return endereco_doente;
	}

	public void setEndereco_doente(String endereco_doente) {
		this.endereco_doente = endereco_doente;
	}

	public String getContato_doente() {
		return contato_doente;
	}

	public void setContato_doente(String contato_doente) {
		this.contato_doente = contato_doente;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(codigo_doente, contato_doente, endereco_doente, nome_doente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doentes other = (Doentes) obj;
		return codigo_doente == other.codigo_doente && Objects.equals(contato_doente, other.contato_doente)
				&& Objects.equals(endereco_doente, other.endereco_doente)
				&& Objects.equals(nome_doente, other.nome_doente);
	}

	@Override
	public String toString() {
		return "Doentes [codigo_doente=" + codigo_doente + ", nome_doente=" 
				+ nome_doente + ", endereco_doente="
				+ endereco_doente + ", contato_doente=" + contato_doente + "]";
	}

	
	}
