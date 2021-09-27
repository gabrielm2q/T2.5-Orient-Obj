package view;

import java.awt.event.ActionEvent;

import javax.swing.event.ListSelectionEvent;

import control.ControleDados;

public class TelaEstoque extends Template {
	private ControleDados dados = new ControleDados();

	public TelaEstoque(ControleDados d) {
		super("Estoque", d);
		this.dados = d;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub

	}

}
