package model;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;


		@Entity
		@Table(name = "aluno")
		public class Aluno {
		
		@Id
		@Column(name = "ra_aluno", length = 13)
		@NotNull
		private String raAluno;

		@Column(name = "nome_aluno", length = 60)
		@NotNull
		private String nomeAluno;

		@Column(name = "email_aluno", length = 40)
		@NotNull
		private String emailAluno;

		public String getRaAluno() {
			return raAluno;
		}

		public void setRaAluno(String raAluno) {
			this.raAluno = raAluno;
		}

		public String getNomeAluno() {
			return nomeAluno;
		}

		public void setNomeAluno(String nomeAluno) {
			this.nomeAluno = nomeAluno;
		}

		public String getEmailAluno() {
			return emailAluno;
		}

		public void setEmailAluno(String emailAluno) {
			this.emailAluno = emailAluno;
		}

		@Override
		public String toString() {
			return "Atendente [raAluno=" + raAluno + ", nomeAluno=" + nomeAluno + ", emailAluno=" + emailAluno + "," + super.toString() +"]";
		}
		
		
	}

