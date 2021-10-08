package control;

import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.event.ListSelectionEvent;

import model.Dados;
import model.Venda;
import view.TelaDetalheVenda;
import view.TelaFiltro;
import view.TelaVenda;

/**
 * Controle da Tela de Venda. Realiza todas as ações dos botões da tela de
 * venda.
 * 
 * @see TelaVenda
 * @author Gabriel Mariano
 */
public class ControleTelaVenda {
	private TelaVenda tela;

	/**
	 * Construtor. Recebe e "seta" a tela de venda. Exibe a lista de vendas na tela
	 * de venda.
	 * 
	 * @param TelaVenda
	 */
	public ControleTelaVenda(TelaVenda tela) {
		this.tela = tela;
		this.tela.setListaPessoasProd(this.listaNomes());
	}

	/**
	 * Clique do Botão. Controla as ações do botão da tela de venda. Realiza a
	 * função especificada.
	 * 
	 * @see TelaVenda
	 * @see TelaDetalheVenda
	 * @param ActionEvent
	 * @return void
	 */
	public void clicaBtn(ActionEvent e) {
		JButton clicado = (JButton) e.getSource();

		if (clicado == tela.getBtnCadastrar()) {
			new TelaDetalheVenda(0, Dados.getVenda().size());
		} else if (clicado == tela.getBtnOrdenar()) {
			new TelaFiltro("vendacliente");
		} else if (clicado == tela.getBtnAtualizar()) {
			tela.setListaPessoasProd(this.listaNomes());
		}
	}

	/**
	 * Controle da Lista. Controla as ações da lista de vendas exibida na tela de
	 * vendas.
	 * 
	 * @see TelaVenda
	 * @param ListSelectionEvent
	 * @return void
	 */
	public void clicaLista(ListSelectionEvent e) {
		Object selecionado = e.getSource();

		if (e.getValueIsAdjusting()) {
			TelaDetalheVenda detalhe = new TelaDetalheVenda(1, tela.getListaPessoasProd().getSelectedIndex());
			ControleTelaDetalheVenda ctrlDetalheVenda = new ControleTelaDetalheVenda(detalhe, 1,
					tela.getListaPessoasProd().getSelectedIndex());
			ctrlDetalheVenda.imprimirDados(detalhe, tela.getListaPessoasProd().getSelectedIndex());
		}
	}

	/**
	 * Lista os nomes dos produtos vendidos (salvo na classe Dados)
	 * 
	 * @see Dados
	 * @return DefaultListModel<String>
	 */
	public DefaultListModel<String> listaNomes() {
		DefaultListModel<String> nomes = new DefaultListModel<>();

		for (Venda venda : Dados.getVenda()) {
			nomes.addElement(venda.getProduto().getNome());
		}

		return nomes;
	}

	public TelaVenda getTela() {
		return tela;
	}

	public void setTela(TelaVenda tela) {
		this.tela = tela;
	}

}
