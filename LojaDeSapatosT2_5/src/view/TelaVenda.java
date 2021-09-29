package view;

import java.awt.event.ActionEvent;

import javax.swing.event.ListSelectionEvent;

import control.ControleTelaVenda;

public class TelaVenda extends Template {
	ControleTelaVenda controlTela;

	public TelaVenda() {
		super("Venda");
		this.controlTela = new ControleTelaVenda(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.controlTela.clicaBtn(e);

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		this.controlTela.clicaLista(e);

	}

}
