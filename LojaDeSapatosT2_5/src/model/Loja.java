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
		this.nome = nome;
		this.cnpj = cnpj;
		this.horaAbertura = horaAbertura;
		this.horaFechamento = horaFechamento;
		this.site = site;
		this.endereco = endereco;
		this.estoque = estoque;
		this.funcionario = new ArrayList<>();
	}
	
	public Loja() {
		this.nome = "";
		this.cnpj = 0;
		this.horaAbertura = 0;
		this.horaFechamento = 0;
		this.site = "";
		this.endereco = null;
		this.estoque = null;
		this.funcionario = new ArrayList<>();
	}

	public void cadastrar(String nome, int cnpj, int horaAbertura, int horaFechamento, String site, Endereco endereco,
			Estoque estoque, Funcionario funcionario) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.horaAbertura = horaAbertura;
		this.horaFechamento = horaFechamento;
		this.site = site;
		this.endereco = endereco;
		this.estoque = estoque;
		this.funcionario.add(funcionario);
	}

	public void ler() {
		System.out.println("\nDados da Loja: ");
		System.out.println("Nome: " + this.nome);
		System.out.println("CNPJ: " + this.cnpj);
		System.out.println("Hora de Abertura: " + this.horaAbertura + "h");
		System.out.println("Hora de Fechamento: " + this.horaFechamento + "h");
		System.out.println("Site: " + this.site);
		System.out.println("Endereço: " + this.endereco.getNomeRua() + ", Número " + this.endereco.getNumero() + ", Bairro " + this.endereco.getBairro() +
		", " + this.endereco.getCidade() + " - " + this.endereco.getUf());
		System.out.println("Quantidade de Funcionários: " + this.funcionario.size());
		
	}
	
	public void editar(String nome, int cnpj, int horaAbertura, int horaFechamento, String site, Endereco endereco,
			Estoque estoque, Funcionario funcionario) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.horaAbertura = horaAbertura;
		this.horaFechamento = horaFechamento;
		this.site = site;
		this.endereco = endereco;
		this.estoque = estoque;
		this.funcionario.add(funcionario);
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

	public void setFuncionario(ArrayList<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}	
}
