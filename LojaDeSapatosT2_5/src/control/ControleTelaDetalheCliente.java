package control;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import view.TelaDetalheCliente;

public class ControleTelaDetalheCliente {
	private TelaDetalheCliente detalheCliente;

	public ControleTelaDetalheCliente(TelaDetalheCliente detalheCliente) {
		this.detalheCliente = detalheCliente;
	}

	public void clicaBtn(ActionEvent e) {
		JButton clicado = (JButton) e.getSource();

		if (clicado == detalheCliente.getBtnSalvar()) {
			JOptionPane.showMessageDialog(null, "SISTEMA EM CONSTRUÇÃO!", null, JOptionPane.INFORMATION_MESSAGE);
		} else if (clicado == detalheCliente.getBtnDeletar()) {
			JOptionPane.showMessageDialog(null, "SISTEMA EM CONSTRUÇÃO!", null, JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "ERRO!", null, JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
