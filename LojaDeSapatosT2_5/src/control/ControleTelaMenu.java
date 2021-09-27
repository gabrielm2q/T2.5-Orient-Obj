package control;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import view.TelaCliente;
import view.TelaEstoque;
import view.TelaFuncionario;
import view.TelaMenu;

public class ControleTelaMenu {
	private final TelaMenu menu;
	private ControleDados dados = new ControleDados();

	public ControleTelaMenu(TelaMenu menu, ControleDados d) {
		this.menu = menu;
		this.dados = d;
	}

	public void clicaBtn(ActionEvent e) {
		JButton clicado = (JButton) e.getSource();

		if (clicado == menu.getBtnCliente()) {
			new TelaCliente(dados);
		} else if (clicado == menu.getBtnFuncionario()) {
			new TelaFuncionario(dados);
		} else if (clicado == menu.getBtnEstoque()) {
			new TelaEstoque(dados);
		} else {
			JOptionPane.showMessageDialog(null, "SISTEMA EM CONSTRUÇÃO!", null, JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
