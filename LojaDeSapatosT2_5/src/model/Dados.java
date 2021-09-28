package model;

import java.util.ArrayList;
import java.util.List;

public class Dados {
	private final ArrayList<Cliente> cliente;
	private final ArrayList<Funcionario> funcionario;
	private final ArrayList<Venda> venda;
	private final ArrayList<Endereco> enderecoCliente;
	private final ArrayList<Endereco> enderecoFuncionario;
	private final Endereco enderecoLoja;
	private final ArrayList<Estoque> prodEstoque;
	private final List<Produto> produto;
	private final ArrayList<Salto> salto;
	private final ArrayList<Integer> saltoPosicaoLista;
	private final ArrayList<Tenis> tenis;
	private final ArrayList<Integer> tenisPosicaoLista;
	private final ArrayList<Bota> bota;
	private final ArrayList<Integer> botaPosicaoLista;
	private final ArrayList<Sapato> sapato;
	private final ArrayList<Integer> sapatoPosicaoLista;

	public Dados() {
		this.cliente = new ArrayList<>();
		this.funcionario = new ArrayList<>();
		this.venda = new ArrayList<>();
		this.enderecoCliente = new ArrayList<>();
		this.enderecoFuncionario = new ArrayList<>();
		this.enderecoLoja = new Endereco();
		this.prodEstoque = new ArrayList<>();
		this.produto = new ArrayList<>();
		this.salto = new ArrayList<>();
		this.saltoPosicaoLista = new ArrayList<>();
		this.tenis = new ArrayList<>();
		this.tenisPosicaoLista = new ArrayList<>();
		this.bota = new ArrayList<>();
		this.botaPosicaoLista = new ArrayList<>();
		this.sapato = new ArrayList<>();
		this.sapatoPosicaoLista = new ArrayList<>();
	}

	public ArrayList<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cli) {
		this.cliente.add(cli);
	}

	public ArrayList<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario func) {
		this.funcionario.add(func);
	}

	public ArrayList<Venda> getVenda() {
		return venda;
	}

	public void setVenda(Venda ven) {
		this.venda.add(ven);
	}

	public ArrayList<Endereco> getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(Endereco end) {
		this.enderecoCliente.add(end);
	}

	public ArrayList<Endereco> getEnderecoFuncionario() {
		return enderecoFuncionario;
	}

	public void setEnderecoFuncionario(Endereco end) {
		this.enderecoFuncionario.add(end);
	}

	public Endereco getEnderecoLoja() {
		return enderecoLoja;
	}

	public void setEnderecoLoja(int cep, String cidade, String uf, String nomeRua, int numero, int quadra,
			String bairro, int numApart, String complemento) {
		this.enderecoLoja.setCep(cep);
		this.enderecoLoja.setCidade(cidade);
		this.enderecoLoja.setUf(uf);
		this.enderecoLoja.setNomeRua(nomeRua);
		this.enderecoLoja.setNumero(numero);
		this.enderecoLoja.setQuadra(quadra);
		this.enderecoLoja.setBairro(bairro);
		this.enderecoLoja.setNumApart(numApart);
		this.enderecoLoja.setComplemento(complemento);
	}

	public ArrayList<Estoque> getProdEstoque() {
		return prodEstoque;
	}

	public void setProdEstoque(Estoque est) {
		this.prodEstoque.add(est);
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(Produto prod) {
		this.produto.add(prod);
	}

	public ArrayList<Salto> getSalto() {
		return salto;
	}

	public void setSalto(Salto salto) {
		this.salto.add(salto);
	}

	public ArrayList<Tenis> getTenis() {
		return tenis;
	}

	public void setTenis(Tenis tenis) {
		this.tenis.add(tenis);
	}

	public ArrayList<Bota> getBota() {
		return bota;
	}

	public void setBota(Bota bota) {
		this.bota.add(bota);
	}

	public ArrayList<Sapato> getSapato() {
		return sapato;
	}

	public void setSapato(Sapato sapato) {
		this.sapato.add(sapato);
	}

	public ArrayList<Integer> getSaltoPosicaoLista() {
		return saltoPosicaoLista;
	}

	public void setSaltoPosicaoLista(int pos) {
		this.saltoPosicaoLista.add(pos);
	}

	public ArrayList<Integer> getTenisPosicaoLista() {
		return tenisPosicaoLista;
	}

	public void setTenisPosicaoLista(int pos) {
		this.tenisPosicaoLista.add(pos);
	}

	public ArrayList<Integer> getBotaPosicaoLista() {
		return botaPosicaoLista;
	}

	public void setBotaPosicaoLista(int pos) {
		this.botaPosicaoLista.add(pos);
	}

	public ArrayList<Integer> getSapatoPosicaoLista() {
		return sapatoPosicaoLista;
	}

	public void setSapatoPosicaoLista(int pos) {
		this.sapatoPosicaoLista.add(pos);
	}

}