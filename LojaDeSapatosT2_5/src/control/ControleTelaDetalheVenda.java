package control;

import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;

import model.Dados;
import model.Venda;
import view.TelaDetalheVenda;
import view.TelaPagamento;

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
					/*
					 * Se a quantidade vendida for igual a/menor que 0 ou maior que a quantidade em
					 * estoque, é exibida mensagem de erro!
					 */
					JOptionPane.showMessageDialog(null,
							"Erro!\nA quantidade vendida não pode ser nula\nou maior que a quantidade em estoque!",
							null, JOptionPane.ERROR_MESSAGE);
				} else if (((Double.parseDouble(detalheVenda.getValorPrecoUnit().getText())
						* Integer.parseInt(detalheVenda.getValorQuantidade().getText()))
						- Double.parseDouble(detalheVenda.getValorDesconto().getText())) <= 0) {
					/*
					 * Aqui estamos verificando se o valor do desconto não é maior que o valor total
					 * dos produtos vendidos
					 */
					JOptionPane.showMessageDialog(null,
							"Erro!\nO valor do descontom não pode ser maior que o preço total da venda!", null,
							JOptionPane.ERROR_MESSAGE);

				} else { // Salvando os dados ja cadastrados e passando-os para a tela de pagamento

					// Calculando o valor total da venda [(preco unitario x quantidade vendida) -
					// desconto]
					Double precoTotal = (Double.parseDouble(detalheVenda.getValorPrecoUnit().getText())
							* Integer.parseInt(detalheVenda.getValorQuantidade().getText()))
							- Double.parseDouble(detalheVenda.getValorDesconto().getText());

					// formatando data
					try {
						data = formato.parse(detalheVenda.getValorDataVenda().getText());
					} catch (ParseException excData) {
						excData.printStackTrace();
					}

					Venda ven = new Venda();
					ven.setIdVenda(Integer.parseInt(detalheVenda.getValorIdVenda().getText()));
					ven.setValorVenda(precoTotal);
					ven.setValorDesconto(Double.parseDouble(detalheVenda.getValorDesconto().getText()));
					ven.setDataPedido(data);
					ven.setProduto(Dados.getEstoque().getProduto().get(indexVenda));
					ven.setQtdVendida(Integer.parseInt(detalheVenda.getValorQuantidade().getText()));
					ven.setCliente(Dados.getCliente().get(detalheVenda.getValorCliente().getSelectedIndex()));
					ven.setFuncionario(
							Dados.getFuncionario().get(detalheVenda.getValorFuncionario().getSelectedIndex()));

					detalheVenda.setVisible(false);
					new TelaPagamento(ven, detalheVenda);
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

			this.setIndexVenda(detalheVenda.getListaProdutos().getSelectedIndex());
		}
	}

	public void mensagemErro() {
		JOptionPane.showMessageDialog(null, "Erro!\nVerifique se todos os campos estão preenchidos."
				+ "\nVerifique se os dados em formato numérico são números.", null, JOptionPane.ERROR_MESSAGE);
	}

	public int getIndexVenda() {
		return indexVenda;
	}

	public void setIndexVenda(int indexVenda) {
		this.indexVenda = indexVenda;
	}

}
