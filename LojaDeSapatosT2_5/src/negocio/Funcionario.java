package negocio;
import java.util.*;

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

	public Funcionario(String nm, String pf, String fone, String tur, int he, int hs, Endereco end) {
		nome = nm;
		cpf = pf;
		telefone = fone;
		turno = tur;
		horaEntrada = he;
		horaSaida = hs;
		endereco = end;
	}
	
	public Funcionario() {
		
	}
	
	public void cadastrar(String nome, Date dataNasc, String cpf, String telefone, Date dataCont, String turno, int horaEnt, int horaSai, Endereco endereco) {
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.cpf = cpf;
		this.telefone = telefone;
		this.dataContratacao = dataCont;
		this.turno = turno;
		this.horaEntrada = horaEnt;
		this.horaSaida = horaSai;
		this.endereco = endereco;
	}

	public void ler() {
		String saida = "\nDados do Funcionario: ";
		saida = saida + "\nNome: " + this.getNome() + ".\nData de Nascimento: " + this.getDataNasc() + ".\nCPF: " 
		+ this.getCpf() + ".\nTelefone: " + this.getTelefone() + ".\nData de Contratação: " + this.getDataContratacao() + ".\nTurno: " + this.getTurno()
		+ ".\nHora de Entrada: " + this.getHoraEntrada() + "h.\nHora de Saída: " + this.getHoraSaida() + ".\nEndereco: " + this.getEndereco();
		System.out.println(saida);
	}
	
	public void editar(String nome, Date dataNasc, String cpf, String telefone, Date dataCont, String turno, int horaEnt, int horaSai, Endereco endereco) {
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.cpf = cpf;
		this.telefone = telefone;
		this.dataContratacao = dataCont;
		this.turno = turno;
		this.horaEntrada = horaEnt;
		this.horaSaida = horaSai;
		this.endereco = endereco;
	}
	
	public void deletar() {
		this.nome = null;
		this.dataNasc = null;
		this.cpf = null;
		this.telefone = null;
		this.dataContratacao = null;
		this.turno = null;
		this.horaEntrada = 0;
		this.horaSaida = 0;
		this.endereco = null;
	}

	@Override
	public String toString() {
		return "\nNome: " + this.getNome() + ".\nData de Nascimento: " + this.getDataNasc() + ".\nCPF: " 
				+ this.getCpf() + ".\nTelefone: " + this.getTelefone() + ".\nData de Contratação: " + this.getDataContratacao() + ".\nTurno: " + this.getTurno()
				+ ".\nHora de Entrada: " + this.getHoraEntrada() + "h.\nHora de Saída: " + this.getHoraSaida() + ".\nEndereco: " + this.getEndereco();
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
