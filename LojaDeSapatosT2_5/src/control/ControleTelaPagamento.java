package control;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import view.TelaPagamento;

public class ControleTelaPagamento {
	private int opcEditarSalvar;

	public ControleTelaPagamento(TelaPagamento tela, int opcEditarSalvar) {
		this.opcEditarSalvar = opcEditarSalvar;
	}

	public void clicaBtn(ActionEvent e) {
		JButton clicado = (JButton) e.getSource();
	}

}
