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
		this.setNome(nome);
		this.setDataNasc(dataNasc);
		this.setCpf(cpf);
		this.setTelefone(telefone);
		this.setDataContratacao(dataContratacao);
		this.setTurno(turno);
		this.setHoraEntrada(horaEntrada);
		this.setHoraSaida(horaSaida);
		this.setEndereco(endereco);
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

	@Override
	public String toString() { // Colocando o toString para retornar apenas o nome dos funcionarios
		return this.getNome();
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
