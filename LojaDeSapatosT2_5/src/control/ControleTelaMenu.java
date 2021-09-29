package control;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import view.TelaEstoque;
import view.TelaMenu;

public class ControleTelaMenu {
	private final TelaMenu menu;

	public ControleTelaMenu(TelaMenu menu) {
		this.menu = menu;
	}

	public void clicaBtn(ActionEvent e) {
		JButton clicado = (JButton) e.getSource();

		if (clicado == menu.getBtnCliente()) {
			// new TelaCliente();
		} else if (clicado == menu.getBtnFuncionario()) {
			// new TelaFuncionario();
		} else if (clicado == menu.getBtnEstoque()) {
			new TelaEstoque();
		} else {
			JOptionPane.showMessageDialog(null, "SISTEMA EM CONSTRUÇÃO!", null, JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
