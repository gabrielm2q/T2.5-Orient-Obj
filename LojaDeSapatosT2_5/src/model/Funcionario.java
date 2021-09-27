package model;

import java.util.Date;

public class Funcionario {
	private String nome;
	private Date dataNasc;
	private String cpf;
	private String telefone;
	private Date dataContratacao;
	private String turno;
	private int horaEntrada;
	private int horaSaida;
	private Endereco endereco;

	public Funcionario(String nome, Date dataNasc, String cpf, String telefone, Date dataContratacao, String turno,
			int horaEntrada, int horaSaida, Endereco endereco) {
		setNome(nome);
		setDataNasc(dataNasc);
		setCpf(cpf);
		setTelefone(telefone);
		setDataContratacao(dataContratacao);
		setTurno(turno);
		setHoraEntrada(horaEntrada);
		setHoraSaida(horaSaida);
		setEndereco(endereco);
	}

	public Funcionario() {
		setNome("");
		setDataNasc(null);
		setCpf("");
		setTelefone("");
		setDataContratacao(null);
		setTurno("");
		setHoraEntrada(0);
		setHoraSaida(0);
		setEndereco(null);
	}

	/*
	 * public void cadastrar(String nome, Date dataNasc, String cpf, String
	 * telefone, Date dataContratacao, String turno, int horaEntrada, int horaSaida,
	 * Endereco endereco) { setNome(nome); setDataNasc(dataNasc); setCpf(cpf);
	 * setTelefone(telefone); setDataContratacao(dataContratacao); setTurno(turno);
	 * setHoraEntrada(horaEntrada); setHoraSaida(horaSaida); setEndereco(endereco);
	 * }
	 * 
	 * public void imprimir() { String saida = "Nome: " + this.getNome() +
	 * ".\nData de Nascimento: " + this.getDataNasc() + ".\nCPF: " + this.getCpf() +
	 * ".\nTelefone: " + this.getTelefone() + ".\nData de Contratação: " +
	 * this.getDataContratacao() + ".\nTurno: " + this.getTurno() +
	 * ".\nHora de Entrada: " + this.getHoraEntrada() + "h.\nHora de Saída: " +
	 * this.getHoraSaida() + ".\nEndereco: " + this.getEndereco();
	 * System.out.println(saida); }
	 * 
	 * public void editar(String nome, Date dataNasc, String cpf, String telefone,
	 * Date dataContratacao, String turno, int horaEntrada, int horaSaida, Endereco
	 * endereco) { setNome(nome); setDataNasc(dataNasc); setCpf(cpf);
	 * setTelefone(telefone); setDataContratacao(dataContratacao); setTurno(turno);
	 * setHoraEntrada(horaEntrada); setHoraSaida(horaSaida); setEndereco(endereco);
	 * }
	 */

	@Override
	public String toString() {
		return "\nNome: " + this.getNome() + ".\nData de Nascimento: " + this.getDataNasc() + ".\nCPF: " + this.getCpf()
				+ ".\nTelefone: " + this.getTelefone() + ".\nData de Contratação: " + this.getDataContratacao()
				+ ".\nTurno: " + this.getTurno() + ".\nHora de Entrada: " + this.getHoraEntrada()
				+ "h.\nHora de Saída: " + this.getHoraSaida() + ".\nEndereco: " + this.getEndereco();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public Date getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(Date dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public int getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(int horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public int getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(int horaSaida) {
		this.horaSaida = horaSaida;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
