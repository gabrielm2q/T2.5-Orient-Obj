package control;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import view.TelaCliente;
import view.TelaFuncionario;
import view.TelaMenu;

public class ControleMenu {
	private final TelaMenu menu;

	public ControleMenu(TelaMenu menu) {
		this.menu = menu;
	}

	public void clicaBtn(ActionEvent e) {
		JButton clicado = (JButton) e.getSource();

		if (clicado == menu.getBtnCliente()) {
			new TelaCliente();
		} else if (clicado == menu.getBtnFuncionario()) {
			new TelaFuncionario();
		} else {
			JOptionPane.showMessageDialog(null, "SISTEMA EM CONSTRUÇÃO!", null, JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
