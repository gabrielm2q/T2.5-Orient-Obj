package view;

import java.awt.event.ActionEvent;

import javax.swing.event.ListSelectionEvent;

import control.ControleTelaCliente;

public class TelaCliente extends Template {
	private ControleTelaCliente controlTela;

	public TelaCliente() {
		super("Clientes");
		this.controlTela = new ControleTelaCliente(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) { // Botões controlados pela classe ControleTelaCliente
		this.controlTela.clicaBtn(e);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) { // Lista controlada pela classe ControleTelaCliente
		this.controlTela.clicaLista(e);
	}
}
