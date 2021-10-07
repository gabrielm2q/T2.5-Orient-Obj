package control;

import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;

import model.Dados;
import model.Produto;
import view.TelaDetalheEstoque;
import view.TelaEstoque;
import view.TelaFiltro;

/**
 * Controle da Tela de Estoque. Controla os cliques dos botões e as ações da
 * lista.
 * 
 * @see TelaDetalheEstoque
 * @author Gabriel Mariano
 */
public class ControleTelaEstoque {
	private TelaEstoque tela;

	/**
	 * Construtor. Recebe a Tela de Estoque.
	 * 
	 * @see TelaEstoque
	 * @param TelaEstoque Recebe a Tela de Estoque
	 */
	public ControleTelaEstoque(TelaEstoque estoque) {
		this.tela = estoque;
		this.tela.setListaPessoasProd(this.listaNomes());
	}

	/**
	 * Clique do Botão. Controla as ações dos botões da tela de estoque. Realiza a
	 * opção escolhida.
	 * 
	 * @see TelaEstoque
	 * @param ActionEvent
	 * @return void
	 */
	public void clicaBtn(ActionEvent e) {
		JButton clicado = (JButton) e.getSource();

		if (clicado == tela.getBtnCadastrar()) {
			try {
				String[] produtos = { "Salto", "Tênis", "Bota", "Sapato" };
				Object prodEscolhido = JOptionPane.showInputDialog(null, "Deseja cadastrar qual produto?", "Produto",
						JOptionPane.INFORMATION_MESSAGE, null, produtos, produtos[0]);
				new TelaDetalheEstoque(0, prodEscolhido.toString(), Dados.getEstoque().getProduto().size());
			} catch (Exception exc) {

			}
		} else if (clicado == tela.getBtnOrdenar()) {
			try { // Escolhendo por qual atributo o usuário deseja filtrar a lista de produtos
				String[] filtros = { "Nome", "Tamanho" };
				Object prodEscolhido = JOptionPane.showInputDialog(null, "Deseja buscar produtos por qual atributo?",
						"Buscar", JOptionPane.INFORMATION_MESSAGE, null, filtros, filtros[0]);
				if (prodEscolhido.toString().equals("Nome")) {
					new TelaFiltro("nomeproduto");
				} else {
					new TelaFiltro("tamanhoproduto");
				}

			} catch (Exception exc) {

			}
		} else if (clicado == tela.getBtnAtualizar()) {
			tela.setListaPessoasProd(this.listaNomes());
		}
	}

	/**
	 * Ação da Lista. Controla as ações da lista de produtos no estoque. Realiza a
	 * opção escolhida.
	 * 
	 * @see TelaEstoque
	 * @param ListSelectionEvent
	 * @return void
	 */
	public void clicaLista(ListSelectionEvent e) {
		Object selecionado = e.getSource();

		if (e.getValueIsAdjusting()) {

			TelaDetalheEstoque detalhe = new TelaDetalheEstoque(1,
					Dados.getEstoque().getCategoria().get(tela.getListaPessoasProd().getSelectedIndex()),
					tela.getListaPessoasProd().getSelectedIndex());

			ControleTelaDetalheEstoque ctrlDetalhe = new ControleTelaDetalheEstoque(detalhe, 1,
					Dados.getEstoque().getCategoria().get(tela.getListaPessoasProd().getSelectedIndex()),
					tela.getListaPessoasProd().getSelectedIndex());

			ctrlDetalhe.imprimirDetalhes(detalhe, tela.getListaPessoasProd().getSelectedIndex());

		}
	}

	/**
	 * Listar Nomes. Lista os nomes dos produtos no estoque.
	 * 
	 * @see Dados
	 * @see TelaEstoque
	 * @return DefaultListModel<String>
	 */
	public DefaultListModel<String> listaNomes() {
		DefaultListModel<String> nomes = new DefaultListModel<>();

		for (Produto prod : Dados.getEstoque().getProduto()) {
			nomes.addElement(prod.getNome());
		}

		return nomes;
	}

	public TelaEstoque getTela() {
		return tela;
	}

	public void setTela(TelaEstoque tela) {
		this.tela = tela;
	}

}
