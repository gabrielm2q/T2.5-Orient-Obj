package control;

import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.event.ListSelectionEvent;

import model.Dados;
import model.Funcionario;
import view.TelaDetalheFuncionario;
import view.TelaFuncionario;

public class ControleTelaFuncionario {
	private TelaFuncionario tela;

	public ControleTelaFuncionario(TelaFuncionario tela) {
		this.tela = tela;
		this.tela.setListaPessoasProd(this.listaNomes());
	}

	public void clicaBtn(ActionEvent e) {
		JButton clicado = (JButton) e.getSource();

		if (clicado == tela.getBtnCadastrar()) {
			new TelaDetalheFuncionario(0, Dados.getFuncionario().size());
		} else if (clicado == tela.getBtnAtualizar()) {
			tela.setListaPessoasProd(this.listaNomes());
		}
	}

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
