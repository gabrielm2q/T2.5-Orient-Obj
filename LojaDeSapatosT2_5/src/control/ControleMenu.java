package control;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import view.TelaMenu;

public class ControleMenu {
	private final TelaMenu menu;

	public ControleMenu(TelaMenu menu) {
		super();
		this.menu = menu;
	}

	public void clicaBtn(ActionEvent e) {
		JButton clicado = (JButton) e.getSource();

		if (clicado == menu.getBtnCliente()) {
			System.out.println("CLIENTEEEEE");
		}
	}

}
