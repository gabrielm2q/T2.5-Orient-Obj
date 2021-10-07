package control;

import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import model.Cliente;
import model.Dados;
import model.Produto;
import model.Venda;
import view.TelaFiltro;

/**
 * Controle da Tela de Filtros. Realiza todas as ações da tela de filtro de
 * acordo com o tipo de filtro escolhido. Há filtros e buscas.
 * 
 * @see TelaFiltro
 * @author Gabriel Mariano
 */
public class ControleTelaFiltro {
	private TelaFiltro tela;

	/**
	 * Construtor. Recebe e "seta" a tela de filtro.
	 * 
	 */
	public ControleTelaFiltro(TelaFiltro tela) {
		this.tela = tela;
	}

	/**
	 * Clique do Botão. Controla as ações dos botões das telas de filtro. Realiza a
	 * opção escolhida. De acordo com o tipo de filtro escolhido, realiza a função
	 * específica desse filtro/busca.
	 * 
	 * @see TelaFiltro
	 * @param ActionEvent
	 * @return void
	 */
	public void clicaBtn(ActionEvent e) {
		JButton clicado = (JButton) e.getSource();
		if (tela.getTipoFiltro().equals("nomeproduto")) {
			DefaultListModel<String> nomes = new DefaultListModel<>();

			/*
			 * Abaixo estamos verificando se algum produto cadastrado no sistema possui o
			 * mesmo nome que o inserido na caixa de texto pelo usuário
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
			 * Abaixo estamos verificando se algum produto cadastrado no sistema possui o
			 * mesmo tamanho que o selecionado pelo usuario na ComboBox
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

		} else if (tela.getTipoFiltro().equals("nomecliente")) {
			DefaultListModel<String> nomes = new DefaultListModel<>();

			/*
			 * Abaixo estamos verificando se algum cliente cadastrado no sistema possui o
			 * mesmo nome que o inserido na caixa de texto pelo usuário
			 */
			for (Cliente cli : Dados.getCliente()) {
				if (cli.getNome().trim().equals(tela.getValorNome().getText().trim())) {
					nomes.addElement(cli.getNome());
				}
			}

			if (nomes.size() > 0) {
				JOptionPane.showMessageDialog(null, "Foram encontrados " + nomes.size() + " cliente(s)!", null,
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Nenhum cliente com esse nome foi encontrado!", null,
						JOptionPane.INFORMATION_MESSAGE);
			}

			tela.setLista(nomes);

		} else if (tela.getTipoFiltro().equals("vendacliente")) {

			DefaultListModel<String> nomes = new DefaultListModel<>();

			/*
			 * Abaixo estamos verificando se alguma venda cadastrada no sistema possui
			 * comprador (cliente) com o mesmo nome que o inserido na caixa de texto pelo
			 * usuário
			 */
			for (Venda ven : Dados.getVenda()) {
				if (ven.getCliente().getNome().trim().equals(tela.getValorNome().getText().trim())) {
					nomes.addElement(ven.getProduto().getNome());
				}
			}

			if (nomes.size() > 0) {
				JOptionPane.showMessageDialog(null, "Foram encontrados " + nomes.size() + " produto(s) vendido(s)!",
						null, JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Nenhum produto vendido para esse cliente foi encontrado!", null,
						JOptionPane.INFORMATION_MESSAGE);
			}

			tela.setLista(nomes);
		}

	}

}
