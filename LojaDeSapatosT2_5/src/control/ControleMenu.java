package control;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import view.TelaMenu;

public class ControleMenu {
	private final TelaMenu menu;

	public ControleMenu(TelaMenu menu) {
		this.menu = menu;
	}

	public void clicaBtn(ActionEvent e) {
		JButton clicado = (JButton) e.getSource();

		if (clicado == menu.getBtnCliente()) {
			System.out.println("CLIENTE");
		} else {
			System.out.println("Não chegou EM CLIENTE");
		}
	}

}
