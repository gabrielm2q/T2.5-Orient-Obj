package control;

import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;

import model.Dados;
import model.Venda;
import view.TelaDetalheVenda;
import view.TelaPagamento;

/**
 * Controle das Ações da Tela de Detalhe de Venda. Controla os cliques dos
 * botões e imprime os dados da Venda na tela.
 * 
 * @see TelaDetalheVenda
 * @author Gabriel Mariano
 */
public class ControleTelaDetalheVenda {
	private TelaDetalheVenda detalheVenda;
	private int indexVenda;
	private int opcEditarSalvar;
	Date data = new Date();
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	/**
	 * Construtor. Recebe a Tela de Detalhe da Venda, "seta" a opção escolhida
	 * (editar ou salvar), recebe o index da venda caso a opção editar seja
	 * escolhida.
	 * 
	 * @see TelaDetalheVenda
	 * @param TelaDetalheVenda  Recebe a Tela de Detalhe da Venda
	 * @param opcaoEditarSalvar Recebe a opção que será realizada (0: salvar; 1:
	 *                          editar)
	 * @param indexVenda        Index da venda a ser editada
	 */
	public ControleTelaDetalheVenda(TelaDetalheVenda detalheVenda, int opcaoEditarSalvar, int indexVenda) {
		this.detalheVenda = detalheVenda;
		this.opcEditarSalvar = opcaoEditarSalvar;
		this.indexVenda = indexVenda;
	}

	/**
	 * Clique do Botão. Controla as ações dos botões da tela de detalhe de venda.
	 * Realiza a opção escolhida.
	 * 
	 * @see TelaDetalheVenda
	 * @param ActionEvent
	 * @return void
	 */
	public void clicaBtn(ActionEvent e) {
		try {
			if (Integer.parseInt(detalheVenda.getValorQuantidade().getText()) <= 0
					|| Integer.parseInt(detalheVenda.getValorQuantidade().getText()) > Integer
							.parseInt(detalheVenda.getValorQtdEstoque().getText())) {
				/*
				 * Se a quantidade vendida for igual a/menor que 0 ou maior que a quantidade em
				 * estoque, é exibida mensagem de erro!
				 */
				JOptionPane.showMessageDialog(null,
						"Erro!\nA quantidade vendida não pode ser nula\nou maior que a quantidade em estoque!", null,
						JOptionPane.ERROR_MESSAGE);
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

				/*
				 * Calculando o valor total da venda: [(preco unitario x quantidade vendida) -
				 * desconto]
				 */
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
				ven.setFuncionario(Dados.getFuncionario().get(detalheVenda.getValorFuncionario().getSelectedIndex()));

				new TelaPagamento(ven, detalheVenda);
				detalheVenda.setVisible(false);
			}
		} catch (NullPointerException exc1) {
			mensagemErro();
		} catch (NumberFormatException exc2) {
			mensagemErro();
		}
	}

	/**
	 * Ação da Lista. Controla as ações da lista de vendas da tela de venda. Realiza
	 * a opção escolhida.
	 * 
	 * @see TelaDetalheVenda
	 * @param ListSelectionEvent
	 * @return void
	 */
	public void clicaLista(ListSelectionEvent e) {
		if (e.getValueIsAdjusting()) {
			/*
			 * Definindo os atributos do produto que serao mostrados quando clicarem no
			 * produto da lista
			 */
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

	/**
	 * Imprimir Detalhes. Imprime os detalhes da venda na tela de detalhe de venda.
	 * 
	 * @see TelaDetalheVenda
	 * @param TelaDetalheVenda
	 * @param Index            Index da venda cujos dados serão exibidos na tela
	 * @return void
	 */
	public void imprimirDados(TelaDetalheVenda tela, int indexVenda) {
		/*
		 * Imprimindo dados da venda selecionada na lista
		 */
		// Conseguindo o preco unitario do produto vendido
		String precoUnit = Double.toString(Dados.getEstoque().getProduto()
				.get(Dados.getEstoque().getProduto().indexOf(Dados.getVenda().get(indexVenda).getProduto()))
				.getPreco());

		tela.setValorFuncionario(Dados.getVenda().get(indexVenda).getFuncionario());
		tela.setValorCliente(Dados.getVenda().get(indexVenda).getCliente());
		tela.setValorIdVenda(Integer.toString(Dados.getVenda().get(indexVenda).getIdVenda()));
		tela.setValorDesconto(Double.toString(Dados.getVenda().get(indexVenda).getValorDesconto()));
		tela.setValorPrecoUnit(precoUnit);
		tela.setValorDataVenda(Dados.getVenda().get(indexVenda).getDataPedido());
		tela.setValorProdVendido(Dados.getVenda().get(indexVenda).getProduto().getNome());
		tela.setValorQuantidade(Integer.toString(Dados.getVenda().get(indexVenda).getQtdVendida()));
		tela.setValorQtdEstoque(Integer.toString(Dados.getVenda().get(indexVenda).getQtdVendida()));

	}

	/**
	 * Imprimir Mensagem de Erro.
	 * 
	 * @return void
	 */
	public void mensagemErro() {
		JOptionPane.showMessageDialog(null,
				"Erro!\nVerifique se todos os campos estão preenchidos."
						+ "\nVerifique se os dados em formato numérico são números.\nNão use vírgulas ','. Use pontos!",
				null, JOptionPane.ERROR_MESSAGE);
	}

	public TelaDetalheVenda getDetalheVenda() {
		return detalheVenda;
	}

	public void setDetalheVenda(TelaDetalheVenda detalheVenda) {
		this.detalheVenda = detalheVenda;
	}

	public int getIndexVenda() {
		return indexVenda;
	}

	public void setIndexVenda(int indexVenda) {
		this.indexVenda = indexVenda;
	}

	public int getOpcEditarSalvar() {
		return opcEditarSalvar;
	}

	public void setOpcEditarSalvar(int opcEditarSalvar) {
		this.opcEditarSalvar = opcEditarSalvar;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
