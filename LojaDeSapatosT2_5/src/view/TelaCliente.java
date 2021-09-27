package view;

import java.awt.event.ActionEvent;

import javax.swing.event.ListSelectionEvent;

import control.ControleDados;
import control.ControleTelaCliente;

public class TelaCliente extends Template {
	private ControleTelaCliente controlTela;
	private ControleDados dados = new ControleDados();

	public TelaCliente(ControleDados d) {
		super("Clientes", d);
		this.dados = d;
		this.controlTela = new ControleTelaCliente(this, dados);
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
