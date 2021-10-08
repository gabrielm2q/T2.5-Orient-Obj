package view;

import java.awt.event.ActionEvent;

import javax.swing.event.ListSelectionEvent;

import control.ControleTelaCliente;

/**
 * Tela do Cliente. Extende a superclasse Template para componentes da tela em
 * comum a outras telas.
 * 
 * @author Gabriel Mariano
 */
public class TelaCliente extends Template {
	private ControleTelaCliente controlTela;

	/**
	 * Construtor. Extende a superclasse Template. Instancia a classe
	 * ControleTelaCliente para que esta controle suas a��es (Lista e Bot�es).
	 * 
	 * @see ControleTelaCliente
	 */
	public TelaCliente() {
		super("Clientes");
		this.controlTela = new ControleTelaCliente(this);
	}

	/**
	 * ActionPerformed dos Bot�es da Tela. Neste caso, ela apenas recebe o evento
	 * ocorrido e direciona � classe ControleTelaCliente para que esta execute as
	 * a��es necess�rias.
	 * 
	 * @see ControleTelaCliente
	 * 
	 * @param ActionEvent
	 */
	@Override
	public void actionPerformed(ActionEvent e) { // Bot�es controlados pela classe ControleTelaCliente
		this.controlTela.clicaBtn(e);
	}

	/**
	 * ValueChanged da Lista da Tela. Neste caso, ela apenas recebe o evento
	 * ocorrido e direciona � classe ControleTelaCliente para que esta execute as
	 * a��es necess�rias.
	 * 
	 * @see ControleTelaCliente
	 * 
	 * @param ListSelectionEvent
	 */
	@Override
	public void valueChanged(ListSelectionEvent e) { // Lista controlada pela classe ControleTelaCliente
		this.controlTela.clicaLista(e);
	}
}
