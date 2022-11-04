package com.monvoyage.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
	
	public class MonModel implements Serializable {
	public static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	public long codigo;
		String CPF;
		String Nome;
		String Email;
		String Endereco;
		
		
public MonModel(String CPF, String Nome, String Email, String Endereco){
			this.CPF = CPF;
			this.Nome = Nome;
			this.Email = Email;
			this.Endereco = Endereco;

		}
		


		
		public long getCodigo() {
	return codigo;
}




public void setCodigo(long codigo) {
	this.codigo = codigo;
}




		public String getNome() {
			return Nome;
		}

		public void setNome(String Nome) {
			this.Nome = Nome;
		}

		public String getCpf() {
			return CPF;
		}

		public void setCpf(String CPF) {
			this.CPF = CPF;
		}

		public String getEmail() {
			return Email;
		}

		public void setEmail(String Email) {
			this.Email = Email;
		}

		public String getEndereco() {
			return Endereco;
		}

		public void setEndereco(String Endereco) {
			this.Endereco = Endereco;
		}


		}
