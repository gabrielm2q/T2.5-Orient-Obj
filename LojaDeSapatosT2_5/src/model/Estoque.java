package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Estoque {

	private ArrayList<Integer> quantidade;
	private ArrayList<String> categoria;
	private ArrayList<Date> dataCadastro;
	private final List<Produto> produto;

	public Estoque() {
		this.quantidade = new ArrayList<>();
		this.categoria = new ArrayList<>();
		this.dataCadastro = new ArrayList<>();
		this.produto = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Estoque [quantidade=" + quantidade + ", categoria=" + categoria + ", dataCadastro=" + dataCadastro
				+ ", produto=" + produto + "]";
	}

	public ArrayList<Integer> getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade.add(quantidade);
	}

	public ArrayList<String> getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria.add(categoria);
	}

	public ArrayList<Date> getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro.add(dataCadastro);
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto.add(produto);
	}

	public void setQuantidade(ArrayList<Integer> quantidade) {
		this.quantidade = quantidade;
	}

	public void setCategoria(ArrayList<String> categoria) {
		this.categoria = categoria;
	}

	public void setDataCadastro(ArrayList<Date> dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
}
