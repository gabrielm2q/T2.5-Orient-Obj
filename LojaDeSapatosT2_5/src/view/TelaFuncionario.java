package view;

import java.awt.event.ActionEvent;

import javax.swing.event.ListSelectionEvent;

import control.ControleTelaFuncionario;

/**
 * Tela do Funcion�rio. Exibe os funcion�rios e as op��es do CRUD. Extende a
 * classe Template por causa dos componentes da tela em comum � outras telas.
 * 
 * @author Gabriel Mariano
 */
public class TelaFuncionario extends Template {
	private ControleTelaFuncionario controlTela;

	/**
	 * Construtor. Instancia a classe ControleTelaFuncionario para que esta execute
	 * as fun��es dessa tela.
	 * 
	 * @see ControleTelaFuncionario
	 */
	public TelaFuncionario() {
		super("Funcion�rios");
		this.controlTela = new ControleTelaFuncionario(this);

	}

	/**
	 * ActionPerformed dos Bot�es da Tela. Envia o evento � classe
	 * ControleTelaFuncionario para que esta execute as a��es adequadas.
	 * 
	 * @see ControleTelaFuncionario
	 * 
	 * @param ActionEvent
	 * @return void
	 */
	@Override
	public void actionPerformed(ActionEvent e) { // Bot�es controlados pela classe ControleTelaFuncionario
		this.controlTela.clicaBtn(e);

	}

	/**
	 * ListSelectionEvent da Lista da Tela. Envia o evento � classe
	 * ControleTelaFuncionario para que esta execute as a��es adequadas.
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
