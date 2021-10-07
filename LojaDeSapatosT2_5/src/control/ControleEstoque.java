package control;

import java.util.Date;

import model.Cliente;
import model.Dados;
import model.Estoque;
import model.Produto;

/**
 * Controle dos M�todos de Estoque. Realiza o cadastro, a edi��o e a dele��o de
 * Produtos no Estoque.
 * 
 * @see Cliente
 * @author Gabriel Mariano
 */
public class ControleEstoque {

	/**
	 * Construtor.
	 */
	public ControleEstoque() {

	}

	/**
	 * M�todo de Cadastro de Produto. Cadastra um Produto no Estoque, que por sua
	 * vez est� na classe Dados.
	 * 
	 * @see Estoque
	 * @see Produto
	 * 
	 * @param Quantidade   Quantidade do Produto no Estoque
	 * @param Categoria    Categoria do Produto cadastrado (Salto, Sapato, T�nis,
	 *                     Bota)
	 * @param dataCadastro Data de Cadastro do Produto
	 * @param Produto      Produto (Salto, Sapato, T�nis, Bota)
	 * @return void
	 */
	public void cadastrarProduto(int quant, String cat, Date dtCad, Produto prod) {
		Dados.getEstoque().setQuantidade(quant);
		Dados.getEstoque().setCategoria(cat);
		Dados.getEstoque().setDataCadastro(dtCad);
		Dados.getEstoque().setProduto(prod);
	}

	/**
	 * M�todo de Edi��o de Produto. Edita um Produto do Estoque, que por sua vez
	 * est� na classe Dados.
	 * 
	 * @see Estoque
	 * @see Produto
	 * 
	 * @param Index        Index do Produto a ser Editado
	 * @param Quantidade   Quantidade do Produto no Estoque
	 * @param Categoria    Categoria do Produto Editado (Salto, Sapato, T�nis, Bota)
	 * @param dataCadastro Data de Cadastro do Produto
	 * @param Produto      Produto (Salto, Sapato, T�nis, Bota)
	 * @return void
	 */
	public void editarProduto(int index, int quant, String cat, Date dtCad, Produto prod) {
		Dados.getEstoque().getQuantidade().set(index, quant);
		Dados.getEstoque().getCategoria().set(index, cat);
		Dados.getEstoque().getDataCadastro().set(index, dtCad);
		Dados.getEstoque().getProduto().set(index, prod);
	}

	/**
	 * M�todo de Dele��o de Produto. Deleta um Produto do Estoque, que por sua vez
	 * est� na classe Dados.
	 * 
	 * @see Estoque
	 * @see Produto
	 * 
	 * @param Index Index do Produto a ser Deletado no Estoque
	 * @return void
	 */
	public void deletarProduto(int index) {
		Dados.getEstoque().getQuantidade().remove(index);
		Dados.getEstoque().getCategoria().remove(index);
		Dados.getEstoque().getDataCadastro().remove(index);
		Dados.getEstoque().getProduto().remove(index);
	}

}
