package model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

		@Entity
		@Table(name = "disciplina")
		public class Disciplina {
		
		@Id
		@Column(name = "cod_disciplina")
		@NotNull
		private int codDisciplina;

		@Column(name = "nome_disc", length = 50)
		@NotNull
		private String nomeDisci;

		@Column(name = "carga_horaria")
		@NotNull
		private int cargaHoraria;

		public int getCodDisciplina() {
			return codDisciplina;
		}

		public void setCodDisciplina(int codDisciplina) {
			this.codDisciplina = codDisciplina;
		}

		public String getNomeDisci() {
			return nomeDisci;
		}

		public void setNomeDisci(String nomeDisci) {
			this.nomeDisci = nomeDisci;
		}

		public int getCargaHoraria() {
			return cargaHoraria;
		}

		public void setCargaHoraria(int cargaHoraria) {
			this.cargaHoraria = cargaHoraria;
		}

		@Override
		public String toString() {
			return "Disciplina [codDisciplina=" + codDisciplina + ", nomeDisci=" + nomeDisci + ", cargaHoraria="
					+ cargaHoraria + "," + super.toString() +"]";
		}
	}

