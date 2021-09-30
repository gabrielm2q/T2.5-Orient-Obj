package control;

import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;

import model.Dados;
import view.TelaDetalheVenda;

public class ControleTelaDetalheVenda {
	private TelaDetalheVenda detalheVenda;
	private ControleVenda venCtrl = new ControleVenda();
	private int indexVenda;
	private int opcEditarSalvar;
	Date data = new Date();
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	public ControleTelaDetalheVenda(TelaDetalheVenda detalheVenda, int opcaoEditarSalvar, int indexVenda) {
		this.detalheVenda = detalheVenda;
		this.opcEditarSalvar = opcaoEditarSalvar;
		this.indexVenda = indexVenda;
	}

	public void clicaBtn(ActionEvent e) {
		JButton clicado = (JButton) e.getSource();
		if (opcEditarSalvar == 0) { // Salvando dados da venda
			try {
				if (Integer.parseInt(detalheVenda.getValorQuantidade().getText()) <= 0
						|| Integer.parseInt(detalheVenda.getValorQuantidade().getText()) > Integer
								.parseInt(detalheVenda.getValorQtdEstoque().getText())) {
					JOptionPane.showMessageDialog(null,
							"Erro!\nA quantidade vendida não pode ser nula\nou maior que a quantidade em estoque!",
							null, JOptionPane.ERROR_MESSAGE);
				}
			} catch (NullPointerException exc1) {
				mensagemErro();
			} catch (NumberFormatException exc2) {
				mensagemErro();
			}
		}

	}

	public void clicaLista(ListSelectionEvent e) {
		Object selecionado = e.getSource();

		if (e.getValueIsAdjusting()) {
			// Definindo os atributos do produto que serao mostrados quando clicarem no
			// produto da lista
			String quantNoEstoque = Integer.toString(
					Dados.getEstoque().getQuantidade().get(detalheVenda.getListaProdutos().getSelectedIndex()));
			String preco = Double.toString(
					Dados.getEstoque().getProduto().get(detalheVenda.getListaProdutos().getSelectedIndex()).getPreco());
			String nome = Dados.getEstoque().getProduto().get(detalheVenda.getListaProdutos().getSelectedIndex())
					.getNome();
			detalheVenda.getValorQtdEstoque().setText(quantNoEstoque);
			detalheVenda.getValorProdVendido().setText(nome);
			detalheVenda.getValorPrecoUnit().setText(preco);

		}
	}

	public void mensagemErro() {
		JOptionPane.showMessageDialog(null, "Erro!\nVerifique se todos os campos estão preenchidos."
				+ "\nVerifique se os dados em formato numérico são números.", null, JOptionPane.ERROR_MESSAGE);
	}

}
