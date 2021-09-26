package view;

import java.awt.event.ActionEvent;

import javax.swing.event.ListSelectionEvent;

import control.ControleDados;

public class TelaFuncionario extends TemplatePessoa {
	private ControleDados dados = new ControleDados();

	public TelaFuncionario(ControleDados d) {
		super("Funcionários");
		this.dados = d;
	}

	@Override
	public void actionPerformed(ActionEvent e) { // Botões controlados pela classe ControleTelaFuncionario
		// TODO Auto-generated method stub

	}

	@Override
	public void valueChanged(ListSelectionEvent e) { // Lista controlada pela classe ControleTelaFuncionario

		// TODO Auto-generated method stub

	}

}
