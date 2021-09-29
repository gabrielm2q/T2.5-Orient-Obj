package control;

import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;

import model.Dados;
import model.Produto;
import view.TelaDetalheEstoque;
import view.TelaEstoque;

public class ControleTelaEstoque {
	private TelaEstoque tela;

	public ControleTelaEstoque(TelaEstoque estoque) {
		this.tela = estoque;
	}

	public void clicaBtn(ActionEvent e) {
		JButton clicado = (JButton) e.getSource();

		if (clicado == tela.getBtnCadastrar()) {
			String[] produtos = { "Salto", "Tênis", "Bota", "Sapato" };
			Object prodEscolhido = JOptionPane.showInputDialog(null, "Deseja cadastrar qual produto?", "Produto",
					JOptionPane.INFORMATION_MESSAGE, null, produtos, produtos[0]);
			new TelaDetalheEstoque(0, prodEscolhido.toString());
		} else if (clicado == tela.getBtnOrdenar()) {
			JOptionPane.showMessageDialog(null, "SISTEMA EM CONSTRUÇÃO!", null, JOptionPane.INFORMATION_MESSAGE);
		} else if (clicado == tela.getBtnAtualizar()) {
			tela.setListaPessoasProd(this.listaNomes());
		}
	}

	public void clicaLista(ListSelectionEvent e) {
		Object selecionado = e.getSource();

		if (e.getValueIsAdjusting()) {

			TelaDetalheEstoque detalhe = new TelaDetalheEstoque(1,
					Dados.getEstoque().getCategoria().get(tela.getListaPessoasProd().getSelectedIndex()));
			ControleTelaDetalheEstoque ctrlDetalhe = new ControleTelaDetalheEstoque(detalhe, 1,
					Dados.getEstoque().getCategoria().get(tela.getListaPessoasProd().getSelectedIndex()));
			ctrlDetalhe.imprimirDetalhes(detalhe, tela.getListaPessoasProd().getSelectedIndex());

		}
	}

	public DefaultListModel<String> listaNomes() {
		DefaultListModel<String> nomes = new DefaultListModel<>();

		for (Produto prod : Dados.getEstoque().getProduto()) {
			nomes.addElement(prod.getNome());
		}

		return nomes;
	}

	public TelaEstoque getTela() {
		return tela;
	}

	public void setTela(TelaEstoque tela) {
		this.tela = tela;
	}

}
