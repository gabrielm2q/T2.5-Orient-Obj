package model;

import java.util.Date;

public class Cliente {
	private Endereco endereco;
	private String nome;
	private char genero;
	private Date dataNasc;
	private String cpf;
	private String telefone;
	private String email;

	public Cliente(Endereco endereco, String nome, char genero, Date dataNasc, String cpf, String telefone,
			String email) {
		this.setEndereco(endereco);
		this.setNome(nome);
		this.setGenero(genero);
		this.setDataNasc(dataNasc);
		this.setCpf(cpf);
		this.setTelefone(telefone);
		this.setEmail(email);
	}

	public Cliente() {
		setEndereco(null);
		setNome("");
		setGenero('0');
		setDataNasc(null);
		setCpf("");
		setTelefone("");
		setEmail("");
	}

	@Override
	public String toString() {
		return "Cliente [endereco=" + endereco + ", nome=" + nome + ", genero=" + genero + ", dataNasc=" + dataNasc
				+ ", cpf=" + cpf + ", telefone=" + telefone + ", email=" + email + ", getEndereco()=" + getEndereco()
				+ "]";
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
