package main;

import model.Dados;
import view.TelaMenu;

/**
 * Ela invoca o m�todo que preenche a classe Dados com dados aleat�rios e logo
 * ap�s cria a Tela de Menu.
 * 
 * @author Gabriel Mariano
 */
public class Main {

	public Main() {
	}

	/**
	 * Inicia o programa. Invoca o m�todo fillWithSomeData(), inserindo dados
	 * aleat�rios na classe Dados. Inicia uma tela de menu.
	 * 
	 * @see Dados
	 * @see TelaMenu
	 */
	public static void main(String[] args) {
		Dados.fillWithSomeData();
		TelaMenu menu = new TelaMenu();
		menu.setVisible(true);

	}

}
