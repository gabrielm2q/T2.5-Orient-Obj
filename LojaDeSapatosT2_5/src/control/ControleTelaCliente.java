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
			new TelaDetalheCliente(dados, 0, 0);
		} else if (clicado == cliente.getBtnOrdenar()) {
			JOptionPane.showMessageDialog(null, "SISTEMA EM CONSTRUÇÃO!", null, JOptionPane.INFORMATION_MESSAGE);
		} else if (clicado == cliente.getBtnAtualizar()) {
			cliente.preencherLista("Clientes", dados);
		}
	}

	public void clicaLista(ListSelectionEvent e) {
		Object selecionado = e.getSource();

		if (e.getValueIsAdjusting()) {
			TelaDetalheCliente detalhe = new TelaDetalheCliente(dados, 1, cliente.getListaPessoas().getSelectedIndex());
			ControleTelaDetalheCliente ctrlDetalhe = new ControleTelaDetalheCliente(detalhe, dados, 1,
					cliente.getListaPessoas().getSelectedIndex());
			ctrlDetalhe.imprimirEditarDetalhe(detalhe, dados, cliente.getListaPessoas().getSelectedIndex());
		}
	}

	public TelaCliente getCliente() {
		return cliente;
	}

	public void setCliente(TelaCliente cliente) {
		this.cliente = cliente;
	}

	public ControleDados getDados() {
		return dados;
	}

	public void setDados(ControleDados dados) {
		this.dados = dados;
	}

}
