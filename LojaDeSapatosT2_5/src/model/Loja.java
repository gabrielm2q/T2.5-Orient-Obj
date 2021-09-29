package model;

import java.util.ArrayList;

public class Loja {
	private String nome;
	private int cnpj;
	private int horaAbertura;
	private int horaFechamento;
	private String site;
	private Endereco endereco;
	private Estoque estoque;
	private ArrayList<Funcionario> funcionario;

	public Loja(String nome, int cnpj, int horaAbertura, int horaFechamento, String site, Endereco endereco,
			Estoque estoque, ArrayList<Funcionario> funcionario) {
		setNome(nome);
		setCnpj(cnpj);
		setHoraAbertura(horaAbertura);
		setHoraFechamento(horaFechamento);
		setSite(site);
		setEndereco(endereco);
		setEstoque(estoque);
		this.funcionario = new ArrayList<>();
	}

	public Loja() {
		setNome("");
		setCnpj(0);
		setHoraAbertura(0);
		setHoraFechamento(0);
		setSite("");
		setEndereco(null);
		setEstoque(null);
		this.funcionario = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Loja [nome=" + nome + ", cnpj=" + cnpj + ", horaAbertura=" + horaAbertura + ", horaFechamento="
				+ horaFechamento + ", site=" + site + ", endereco=" + endereco + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public int getHoraAbertura() {
		return horaAbertura;
	}

	public void setHoraAbertura(int horaAbertura) {
		this.horaAbertura = horaAbertura;
	}

	public int getHoraFechamento() {
		return horaFechamento;
	}

	public void setHoraFechamento(int horaFechamento) {
		this.horaFechamento = horaFechamento;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	public ArrayList<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario.add(funcionario);
	}
}
