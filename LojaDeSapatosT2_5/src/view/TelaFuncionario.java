package view;

import java.awt.event.ActionEvent;

import javax.swing.event.ListSelectionEvent;

import control.ControleDados;
import control.ControleTelaFuncionario;

public class TelaFuncionario extends Template {
	private ControleTelaFuncionario controlTela;
	private ControleDados dados = new ControleDados();

	public TelaFuncionario(ControleDados d) {
		super("Funcionários", d);
		this.dados = d;
		this.controlTela = new ControleTelaFuncionario(this, dados);

	}

	@Override
	public void actionPerformed(ActionEvent e) { // Botões controlados pela classe ControleTelaFuncionario
		this.controlTela.clicaBtn(e);

	}

	@Override
	public void valueChanged(ListSelectionEvent e) { // Lista controlada pela classe ControleTelaFuncionario
		this.controlTela.clicaLista(e);
	}

}
