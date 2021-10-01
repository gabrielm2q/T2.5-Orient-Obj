package control;

import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import model.Dados;
import model.Produto;
import view.TelaFiltro;

public class ControleTelaFiltro {
	private TelaFiltro tela;

	public ControleTelaFiltro(TelaFiltro tela) {
		this.tela = tela;
	}

	public void clicaBtn(ActionEvent e) {
		JButton clicado = (JButton) e.getSource();
		if (tela.getTipoFiltro().equals("nomeproduto")) {
			DefaultListModel<String> nomes = new DefaultListModel<>();

			/*
			 * Abaixo estamos verificando se algum produto armazenado no sistema possui o
			 * mesmo valor que o inserido na caixa de texto pelo usuário
			 */
			for (Produto prod : Dados.getEstoque().getProduto()) {
				if (prod.getNome().trim().equals(tela.getValorNome().getText().trim())) {
					nomes.addElement(prod.getNome());
				}
			}

			if (nomes.size() > 0) {
				JOptionPane.showMessageDialog(null, "Foram encontrados " + nomes.size() + " produto(s)!", null,
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Nenhum produto com esse nome foi encontrado!", null,
						JOptionPane.INFORMATION_MESSAGE);
			}

			tela.setLista(nomes);
		} else if (tela.getTipoFiltro().equals("tamanhoproduto")) {
			DefaultListModel<String> nomes = new DefaultListModel<>();

			/*
			 * Abaixo estamos verificando se algum produto armazenado no sistema possui o
			 * mesmo valor que o inserido na caixa de texto pelo usuário
			 */
			for (Produto prod : Dados.getEstoque().getProduto()) {

				if (prod.getTamanho() == tela.getValorTamanho()) {
					nomes.addElement(prod.getNome());
				}
			}

			if (nomes.size() > 0) {
				JOptionPane.showMessageDialog(null,
						"Foram encontrados " + nomes.size() + " produto(s) com esse tamanho!", null,
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Nenhum produto com esse tamanho foi encontrado!", null,
						JOptionPane.INFORMATION_MESSAGE);
			}

			tela.setLista(nomes);
		}

	}

}
