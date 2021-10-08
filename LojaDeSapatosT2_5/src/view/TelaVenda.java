package view;

import java.awt.event.ActionEvent;

import javax.swing.event.ListSelectionEvent;

import control.ControleTelaVenda;

/**
 * Tela do Pagamento. Exibe os atributos da venda e as op��es do CRUD. Extende a
 * superclasse Template por causa dos componentes da tela em comum com outras
 * tela (bot�es...)
 * 
 * @author Gabriel Mariano
 */
public class TelaVenda extends Template {
	private ControleTelaVenda controlTela;

	/**
	 * Construtor. Instancia a classe ControleTelaVenda para que esta execute as
	 * fun��es dessa tela.
	 * 
	 * @see ControleTelaVenda
	 */
	public TelaVenda() {
		super("Venda");
		this.controlTela = new ControleTelaVenda(this);
	}

	/**
	 * ActionPerformed dos Bot�es da Tela. Envia o evento � classe ControleTelaVenda
	 * para que esta execute as a��es adequadas.
	 * 
	 * @see ControleTelaVenda
	 * 
	 * @param ActionEvent
	 * @return void
	 */
	@Override
	public void actionPerformed(ActionEvent e) { // Bot�es controlados pela classe ControleTelaVenda
		this.controlTela.clicaBtn(e);

	}

	/**
	 * ListSelectionEvent da Lista da Tela. Envia o evento � classe
	 * ControleTelaVenda para que esta execute as a��es adequadas.
	 * 
	 * @see ControleTelaVenda
	 * 
	 * @param ListSelectionEvent
	 * @return void
	 */
	@Override
	public void valueChanged(ListSelectionEvent e) { // Lista controlada pela classe ControleTelaVenda
		this.controlTela.clicaLista(e);

	}

}
