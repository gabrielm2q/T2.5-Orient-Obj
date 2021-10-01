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

public class ControleTelaVenda {
	private TelaVenda tela;

	public ControleTelaVenda(TelaVenda tela) {
		this.tela = tela;
		this.tela.setListaPessoasProd(this.listaNomes());
	}

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

	public void clicaLista(ListSelectionEvent e) {
		Object selecionado = e.getSource();

		if (e.getValueIsAdjusting()) {
			TelaDetalheVenda detalhe = new TelaDetalheVenda(1, tela.getListaPessoasProd().getSelectedIndex());
			ControleTelaDetalheVenda ctrlDetalheVenda = new ControleTelaDetalheVenda(detalhe, 1,
					tela.getListaPessoasProd().getSelectedIndex());
			ctrlDetalheVenda.imprimirDados(detalhe, tela.getListaPessoasProd().getSelectedIndex());
		}
	}

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
