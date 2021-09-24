package view;

import java.awt.event.ActionEvent;

import javax.swing.event.ListSelectionEvent;

import model.Dados;

public class TelaFuncionario extends TemplatePessoa {
	private Dados dadosPessoas = new Dados();

	public TelaFuncionario() {
		super("Funcionários");
	}

	public static void main(String[] args) {
		TelaFuncionario funcionario = new TelaFuncionario();
		funcionario.setVisible(true);
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
