package control;

import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.event.ListSelectionEvent;

import model.Cliente;
import model.Dados;
import view.TelaCliente;
import view.TelaDetalheCliente;
import view.TelaFiltro;

public class ControleTelaCliente {
	private TelaCliente tela;

	public ControleTelaCliente(TelaCliente tela) {
		this.tela = tela;
		this.tela.setListaPessoasProd(this.listaNomes());
	}

	public void clicaBtn(ActionEvent e) {
		JButton clicado = (JButton) e.getSource();

		if (clicado == tela.getBtnCadastrar()) {
			new TelaDetalheCliente(0, Dados.getCliente().size());
		} else if (clicado == tela.getBtnOrdenar()) {
			new TelaFiltro("nomecliente");
		} else if (clicado == tela.getBtnAtualizar()) {
			tela.setListaPessoasProd(this.listaNomes());
		}
	}

	public void clicaLista(ListSelectionEvent e) {
		Object selecionado = e.getSource();

		if (e.getValueIsAdjusting()) {
			TelaDetalheCliente detalhe = new TelaDetalheCliente(1, tela.getListaPessoasProd().getSelectedIndex());
			ControleTelaDetalheCliente ctrlDetalhe = new ControleTelaDetalheCliente(detalhe, 1,
					tela.getListaPessoasProd().getSelectedIndex());
			ctrlDetalhe.imprimirDetalhes(detalhe, tela.getListaPessoasProd().getSelectedIndex());
		}
	}

	public DefaultListModel<String> listaNomes() {
		DefaultListModel<String> nomes = new DefaultListModel<>();

		for (Cliente cli : Dados.getCliente()) {
			nomes.addElement(cli.getNome());
		}

		return nomes;
	}

	public TelaCliente getTela() {
		return tela;
	}

	public void setTela(TelaCliente tela) {
		this.tela = tela;
	}

}
