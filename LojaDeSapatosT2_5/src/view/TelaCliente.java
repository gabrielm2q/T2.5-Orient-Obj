package view;

import java.awt.event.ActionEvent;

import javax.swing.event.ListSelectionEvent;

import model.Dados;

public class TelaCliente extends TemplatePessoa {
	private Dados dadosPessoas = new Dados();

	public TelaCliente() {
		super("Clientes");
	}

	public static void main(String[] args) {
		TelaCliente cliente = new TelaCliente();
		cliente.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub

	}

}
