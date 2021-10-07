package main;

import model.Dados;
import view.TelaMenu;

/**
 * Ela invoca o método que preenche a classe Dados com dados aleatórios e logo
 * após cria a Tela de Menu.
 * 
 * @author Gabriel Mariano
 */
public class Main {

	public Main() {
	}

	/**
	 * Inicia o programa. Invoca o método fillWithSomeData(), inserindo dados
	 * aleatórios na classe Dados. Inicia uma tela de menu.
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
