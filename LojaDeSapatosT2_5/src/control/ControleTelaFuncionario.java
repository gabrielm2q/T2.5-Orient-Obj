package control;

import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.event.ListSelectionEvent;

import model.Dados;
import model.Funcionario;
import view.TelaDetalheFuncionario;
import view.TelaFuncionario;

/**
 * Controle da Tela de Funcion�rios. Realiza todas as a��es dos bot�es e da
 * lista da tela de funcion�rios.
 * 
 * @see TelaFuncionario
 * @author Gabriel Mariano
 */
public class ControleTelaFuncionario {
	private TelaFuncionario tela;

	/**
	 * Construtor. Recebe e "seta" a tela de funcion�rio e a lista de funcion�rios.
	 * 
	 * @param TelaFuncionario
	 */
	public ControleTelaFuncionario(TelaFuncionario tela) {
		this.tela = tela;
		this.tela.setListaPessoasProd(this.listaNomes());
	}

	/**
	 * Clique do Bot�o. Controla as a��es dos bot�es da tela de funcion�rios.
	 * Realiza a op��o escolhida
	 * 
	 * @see TelaFuncionario
	 * @param ActionEvent
	 * @return void
	 */
	public void clicaBtn(ActionEvent e) {
		JButton clicado = (JButton) e.getSource();

		if (clicado == tela.getBtnCadastrar()) {
			new TelaDetalheFuncionario(0, Dados.getFuncionario().size());
		} else if (clicado == tela.getBtnAtualizar()) {
			tela.setListaPessoasProd(this.listaNomes());
		}
	}

	/**
	 * A��o da Lista. Controla as a��es da lista de funcion�rios.
	 * 
	 * @see TelaFuncionario
	 * @param ListSelectionEvent
	 * @return void
	 */
	public void clicaLista(ListSelectionEvent e) {
		Object selecionado = e.getSource();

		if (e.getValueIsAdjusting()) {
			TelaDetalheFuncionario detalhe = new TelaDetalheFuncionario(1,
					tela.getListaPessoasProd().getSelectedIndex());
			ControleTelaDetalheFuncionario ctrlDetalhe = new ControleTelaDetalheFuncionario(detalhe, 1,
					tela.getListaPessoasProd().getSelectedIndex());
			ctrlDetalhe.imprimirDetalhes(detalhe, tela.getListaPessoasProd().getSelectedIndex());
		}
	}

	/**
	 * Listar Nomes de Funcion�rios.
	 * 
	 * @see Dados
	 * @see TelaFuncionario
	 * @return DefaultListModel<String>
	 */
	public DefaultListModel<String> listaNomes() {
		DefaultListModel<String> nomes = new DefaultListModel<>();

		for (Funcionario func : Dados.getFuncionario()) {
			nomes.addElement(func.getNome());
		}

		return nomes;
	}

	public TelaFuncionario getTela() {
		return tela;
	}

	public void setTela(TelaFuncionario tela) {
		this.tela = tela;
	}

}
