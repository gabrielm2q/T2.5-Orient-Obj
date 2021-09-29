package view;

import java.awt.event.ActionEvent;

import javax.swing.event.ListSelectionEvent;

import control.ControleTelaVenda;

public class TelaVenda extends Template {
	private ControleTelaVenda controlTela;

	public TelaVenda() {
		super("Venda");
		this.controlTela = new ControleTelaVenda(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) { // Botões controlados pela classe ControleTelaVenda
		this.controlTela.clicaBtn(e);

	}

	@Override
	public void valueChanged(ListSelectionEvent e) { // Lista controlada pela classe ControleTelaVenda
		this.controlTela.clicaLista(e);

	}

}
