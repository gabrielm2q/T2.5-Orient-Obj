package view;

import java.awt.event.ActionEvent;

import javax.swing.event.ListSelectionEvent;

import control.ControleTelaEstoque;

/**
 * Tela dos Detalhes do Estoque. Extende a superclasse Template por causa dos
 * componentes da tela em comum (botões...)
 * 
 * @author Gabriel Mariano
 */
public class TelaEstoque extends Template {
	private ControleTelaEstoque controlTela;

	/**
	 * Construtor. Extende a superclasse Template.
	 * 
	 * @see Template
	 * @see ControleTelaEstoque
	 * 
	 */
	public TelaEstoque() {
		super("Estoque");
		this.controlTela = new ControleTelaEstoque(this);
	}

	/**
	 * ActionPerformed da Lista da Tela. Envia o evento à classe ControleTelaEstoque
	 * para que esta execute as ações adequadas.
	 * 
	 * @see ControleTelaEstoque
	 * 
	 * @param ListSelectionEvent
	 * @return void
	 */
	@Override
	public void actionPerformed(ActionEvent e) { // Botões controlados pela classe ControleTelaEstoque
		this.controlTela.clicaBtn(e);
	}

	/**
	 * ActionPerformed dos Botões da Tela. Envia o evento à classe
	 * ControleTelaEstoque para que esta execute as ações adequadas.
	 * 
	 * @see ControleTelaEstoque
	 * 
	 * @param ActionEvent
	 * @return void
	 */
	@Override
	public void valueChanged(ListSelectionEvent e) { // Lista controlada pela classe ControleTelaEstoque
		this.controlTela.clicaLista(e);
	}
}
