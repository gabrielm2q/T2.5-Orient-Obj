package control;

import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import model.Dados;
import model.Pagamento;
import view.TelaMenu;
import view.TelaPagamento;
import view.TelaVenda;

/**
 * Controle da Tela de Pagamento. Realiza todas as a��es dos bot�es da tela de
 * pagamentos.
 * 
 * @see TelaMenu
 * @author Gabriel Mariano
 */
public class ControleTelaPagamento {
	private TelaPagamento tela;
	private int opcEditarSalvar;
	private int indexVenda;
	private ControleVenda venCtrl;

	Date data = new Date();
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	/**
	 * Construtor. Recebe e "seta" a tela de pagamento, recebe a op��o desejada (0:
	 * Salvar; 1: Editar) e o index da venda a ser editada, caso necess�rio.
	 * 
	 * @param TelaPagamento
	 * @param opcEditarSalvar Op��o desejada: Editar ou Salvar venda/pagamento
	 * @param indexVenda      Caso a venda seja editada, o index desta � usado
	 */
	public ControleTelaPagamento(TelaPagamento tela, int opcEditarSalvar, int indexVenda) {
		this.opcEditarSalvar = opcEditarSalvar;
		this.tela = tela;
		this.indexVenda = indexVenda;
		venCtrl = new ControleVenda();
	}

	/**
	 * Clique do Bot�o. Controla as a��es do bot�o da tela de pagamento. Realiza a
	 * fun��o especificada.
	 * 
	 * @see TelaPagamento
	 * @see TelaVenda
	 * @param ActionEvent
	 * @return void
	 */
	public void clicaBtn(ActionEvent e) {
		JButton clicado = (JButton) e.getSource();

		/*
		 * Mostrando mensagem de erro para informar que s� s�o aceitas 1 ou mais
		 * parcelas se o pagamento for parcelado!
		 */
		if (tela.getValorFormaPag().getSelectedItem() != "Parcelado"
				&& tela.getValorNumParcelas().getSelectedItem() != "0") {
			JOptionPane.showMessageDialog(null,
					"Como o pagamento n�o foi parcelado, o n�mero\n" + "de parcelas ser� considerado como '0'!", null,
					JOptionPane.ERROR_MESSAGE);
			tela.getValorNumParcelas().setSelectedIndex(0);
		}

		// Recebendo dados do pagamento
		Pagamento pag = new Pagamento();

		pag.setDataPag(tela.getVenda().getDataPedido());
		pag.setFormaPag((String) tela.getValorFormaPag().getSelectedItem());
		pag.setNumParcelas(Integer.parseInt((String) tela.getValorNumParcelas().getSelectedItem()));
		pag.setValorPago(tela.getVenda().getValorVenda());

		if (opcEditarSalvar == 0) { // Cadastrando venda
			venCtrl.cadastrarVenda(tela.getVenda().getIdVenda(), tela.getVenda().getValorVenda(),
					tela.getVenda().getValorDesconto(), tela.getVenda().getDataPedido(),
					tela.getVenda().getFuncionario(), tela.getVenda().getCliente(), tela.getVenda().getProduto(), pag,
					tela.getVenda().getQtdVendida());

			// Diminuindo a quantidade do produto vendido no estoque da quantidade comprada
			int indexProd = Dados.getEstoque().getProduto().indexOf(tela.getVenda().getProduto());
			int qtdFinal = Dados.getEstoque().getQuantidade().get(indexProd) - tela.getVenda().getQtdVendida();
			Dados.getEstoque().getQuantidade().set(indexProd, qtdFinal);

			JOptionPane.showMessageDialog(null, "Venda cadastrada com sucesso!", null, JOptionPane.INFORMATION_MESSAGE);
			tela.dispose();

		} else if (opcEditarSalvar == 1) { // Editando venda
			venCtrl.editarVenda(indexVenda, tela.getVenda().getIdVenda(), tela.getVenda().getValorVenda(),
					tela.getVenda().getValorDesconto(), tela.getVenda().getDataPedido(),
					tela.getVenda().getFuncionario(), tela.getVenda().getCliente(), tela.getVenda().getProduto(), pag,
					tela.getVenda().getQtdVendida());

			JOptionPane.showMessageDialog(null, "Venda editada com sucesso!", null, JOptionPane.INFORMATION_MESSAGE);
			tela.dispose();
		}
	}

	public TelaPagamento getTela() {
		return tela;
	}

	public void setTela(TelaPagamento tela) {
		this.tela = tela;
	}

	public int getOpcEditarSalvar() {
		return opcEditarSalvar;
	}

	public void setOpcEditarSalvar(int opcEditarSalvar) {
		this.opcEditarSalvar = opcEditarSalvar;
	}

	public ControleVenda getVenCtrl() {
		return venCtrl;
	}

	public void setVenCtrl(ControleVenda venCtrl) {
		this.venCtrl = venCtrl;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public SimpleDateFormat getFormato() {
		return formato;
	}

	public void setFormato(SimpleDateFormat formato) {
		this.formato = formato;
	}

}
