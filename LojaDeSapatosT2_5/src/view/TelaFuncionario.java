package view;

import java.awt.event.ActionEvent;

import javax.swing.event.ListSelectionEvent;

import control.ControleTelaFuncionario;

/**
 * Tela do Funcionário. Exibe os funcionários e as opções do CRUD. Extende a
 * classe Template por causa dos componentes da tela em comum à outras telas.
 * 
 * @author Gabriel Mariano
 */
public class TelaFuncionario extends Template {
	private ControleTelaFuncionario controlTela;

	/**
	 * Construtor. Instancia a classe ControleTelaFuncionario para que esta execute
	 * as funções dessa tela.
	 * 
	 * @see ControleTelaFuncionario
	 */
	public TelaFuncionario() {
		super("Funcionários");
		this.controlTela = new ControleTelaFuncionario(this);

	}

	/**
	 * ActionPerformed dos Botões da Tela. Envia o evento à classe
	 * ControleTelaFuncionario para que esta execute as ações adequadas.
	 * 
	 * @see ControleTelaFuncionario
	 * 
	 * @param ActionEvent
	 * @return void
	 */
	@Override
	public void actionPerformed(ActionEvent e) { // Botões controlados pela classe ControleTelaFuncionario
		this.controlTela.clicaBtn(e);

	}

	/**
	 * ListSelectionEvent da Lista da Tela. Envia o evento à classe
	 * ControleTelaFuncionario para que esta execute as ações adequadas.
	 * 
	 * @see ControleTelaFuncionario
	 * 
	 * @param ListSelectionEvent
	 * @return void
	 */
	@Override
	public void valueChanged(ListSelectionEvent e) { // Lista controlada pela classe ControleTelaFuncionario
		this.controlTela.clicaLista(e);
	}

}
