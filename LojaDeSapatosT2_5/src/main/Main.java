package main;

import model.Dados;
import view.TelaMenu;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		Dados.fillWithSomeData();
		TelaMenu menu = new TelaMenu();
		menu.setVisible(true);

	}

}
