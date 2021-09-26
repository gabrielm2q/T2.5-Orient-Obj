package control;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;

import view.TelaCliente;
import view.TelaDetalheCliente;

public class ControleTelaCliente {
	private TelaCliente cliente;
	private ControleDados dados = new ControleDados();

	public ControleTelaCliente(TelaCliente cliente, ControleDados d) {
		this.cliente = cliente;
		this.dados = d;
	}

	public void clicaBtn(ActionEvent e) {
		JButton clicado = (JButton) e.getSource();

		if (clicado == cliente.getBtnCadastrar()) {
			new TelaDetalheCliente(dados);
		} else if (clicado == cliente.getBtnOrdenar()) {
			JOptionPane.showMessageDialog(null, "SISTEMA EM CONSTRUÇÃO!", null, JOptionPane.INFORMATION_MESSAGE);
		} else if (clicado == cliente.getBtnAtualizar()) {
			cliente.preencherLista("Clientes", dados);
		} else {
			JOptionPane.showMessageDialog(null, "ERRO!", null, JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public void clicaLista(ListSelectionEvent e) {
		Object selecionado = e.getSource();

		if (e.getValueIsAdjusting()) {
			TelaDetalheCliente detalhe = new TelaDetalheCliente(dados);
			ControleTelaDetalheCliente ctrlDetalhe = new ControleTelaDetalheCliente(detalhe, dados);
			ctrlDetalhe.imprimirEditarDetalhe(detalhe, dados, cliente.getListaPessoas().getSelectedIndex());
		}
	}

}
