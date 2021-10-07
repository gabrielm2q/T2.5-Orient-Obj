package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Loja. Pode criar uma Loja com todos os atributos e métodos necessários para
 * detalhar esta. Pode armazenar mais de um funcionário.
 * 
 * @author Gabriel Mariano
 */
public class Loja {
	private String nome;
	private String cnpj;
	private int horaAbertura;
	private int horaFechamento;
	private String site;
	private Endereco endereco;
	private Estoque estoque;
	private List<Funcionario> funcionario;

	/**
	 * Construtor.
	 */
	public Loja(String nome, String cnpj, int horaAbertura, int horaFechamento, String site, Endereco endereco,
			Estoque estoque, List<Funcionario> funcionario) {
		setNome(nome);
		setCnpj(cnpj);
		setHoraAbertura(horaAbertura);
		setHoraFechamento(horaFechamento);
		setSite(site);
		setEndereco(endereco);
		setEstoque(estoque);
		this.funcionario = new ArrayList<>();
	}

	/**
	 * Construtor vazio.
	 */
	public Loja() {
		setNome("");
		setCnpj("");
		setHoraAbertura(0);
		setHoraFechamento(0);
		setSite("");
		setEndereco(null);
		setEstoque(null);
		this.funcionario = new ArrayList<>();
	}

	/**
	 * Método toString(), retorna dados relevantes da Loja.
	 */
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

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
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

	public List<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}
}
