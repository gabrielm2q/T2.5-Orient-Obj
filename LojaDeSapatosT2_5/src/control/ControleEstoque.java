package control;

import java.util.Date;

import model.Dados;
import model.Produto;

public class ControleEstoque {

	public ControleEstoque() {

	}

	public void cadastrarProduto(int quant, String cat, Date dtCad, Produto prod) {
		Dados.getEstoque().setQuantidade(quant);
		Dados.getEstoque().setCategoria(cat);
		Dados.getEstoque().setDataCadastro(dtCad);
		Dados.getEstoque().setProduto(prod);
	}

	public void editarProduto(int index, int quant, String cat, Date dtCad, Produto prod) {
		Dados.getEstoque().getQuantidade().set(index, quant);
		Dados.getEstoque().getCategoria().set(index, cat);
		Dados.getEstoque().getDataCadastro().set(index, dtCad);
		Dados.getEstoque().getProduto().set(index, prod);
	}

	public void deletarProduto(int index) {
		Dados.getEstoque().getQuantidade().remove(index);
		Dados.getEstoque().getCategoria().remove(index);
		Dados.getEstoque().getDataCadastro().remove(index);
		Dados.getEstoque().getProduto().remove(index);
	}

}
