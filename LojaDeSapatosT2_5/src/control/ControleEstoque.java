package control;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Estoque;
import model.Produto;

public class ControleEstoque {
	private ControleDados dados = new ControleDados();
	private ArrayList<String> nomeProdutos = new ArrayList<>();

	public ControleEstoque(ControleDados d) {
		this.dados = d;
		this.setNomeProdutos(d.getProduto());
	}

	public void cadastrarProduto(int quant, String cat, Date dtCad, Produto prod) {
		Estoque estoq = new Estoque();
		estoq.setQuantidade(quant);
		estoq.setCategoria(cat);
		estoq.setDataCadastro(dtCad);
		estoq.setProduto(prod);
		dados.setProdEstoque(estoq);
		this.nomeProdutos.add(prod.getNome());
	}

	public void editarProduto(ControleDados d, int index, int quant, String cat, Date dtCad, Produto prod) {
		d.getProdEstoque().get(index).setQuantidade(quant);
		d.getProdEstoque().get(index).setCategoria(cat);
		d.getProdEstoque().get(index).setDataCadastro(dtCad);
		d.getProdEstoque().get(index).setProduto(prod);
		d.getProdEstoque().set(index, d.getProdEstoque().get(index));
	}

	public void deletarProduto(ControleDados d, int index, String tipoProd) {
		d.getProdEstoque().remove(index);
		d.getProduto().remove(index);
		if (tipoProd.equals("Salto")) {
			d.getSalto().remove(index);
			d.getSaltoPosicaoLista().remove(index);
		} else if (tipoProd.equals("Tênis")) {
			d.getTenis().remove(index);
			d.getTenisPosicaoLista().remove(index);
		} else if (tipoProd.equals("Bota")) {
			d.getBota().remove(index);
			d.getBotaPosicaoLista().remove(index);
		} else if (tipoProd.equals("Sapato")) {
			d.getSapato().remove(index);
			d.getSapatoPosicaoLista().remove(index);
		}
	}

	public String[] getNomeProdutos() {
		String[] listaNomes = new String[dados.getProduto().size()];

		for (int i = 0; i < dados.getProduto().size(); i++) {
			listaNomes[i] = dados.getProduto().get(i).getNome();
		}

		return listaNomes;
	}

	public void setNomeProdutos(List<Produto> produto) {
		for (int i = 0; i < produto.size(); i++) {
			this.nomeProdutos.add(produto.get(i).getNome());
		}
	}

	public void setNome(String name) {
		this.nomeProdutos.add(name);
	}

	public void setNomeAt(String name, int index) {
		this.nomeProdutos.set(index, name);
	}

	public ControleDados getDados() {
		return dados;
	}

	public void setDados(ControleDados dados) {
		this.dados = dados;
	}

}
