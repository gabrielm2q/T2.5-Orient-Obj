package view;

import java.awt.event.ActionEvent;

import javax.swing.event.ListSelectionEvent;

import control.ControleTelaEstoque;

public class TelaEstoque extends Template {
	private ControleTelaEstoque controlTela;

	public TelaEstoque() {
		super("Estoque");
		this.controlTela = new ControleTelaEstoque(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) { // Botões controlados pela classe ControleTelaEstoque
		this.controlTela.clicaBtn(e);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) { // Lista controlada pela classe ControleTelaEstoque
		this.controlTela.clicaLista(e);

	}

}
