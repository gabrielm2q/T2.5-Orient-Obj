package control;

import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import model.Pagamento;
import view.TelaPagamento;

public class ControleTelaPagamento {
	private TelaPagamento tela;
	private int opcEditarSalvar;
	private ControleVenda venCtrl;

	Date data = new Date();
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	public ControleTelaPagamento(TelaPagamento tela, int opcEditarSalvar) {
		this.opcEditarSalvar = opcEditarSalvar;
		this.tela = tela;
		venCtrl = new ControleVenda();
	}

	public void clicaBtn(ActionEvent e) {
		JButton clicado = (JButton) e.getSource();

		/*
		 * Mostrando mensagem de erro para informar que só são aceitas 1 ou mais
		 * parcelas se o pagamento for parcelado!
		 */
		if (tela.getValorFormaPag().getSelectedItem() != "Parcelado"
				&& tela.getValorNumParcelas().getSelectedItem() != "0") {
			JOptionPane.showMessageDialog(null,
					"Como o pagamento não foi parcelado, o número\n" + "de parcelas será considerado como '0'!", null,
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
			venCtrl.cadastrarVenda(tela.getVenda().getValorVenda(), tela.getVenda().getValorDesconto(),
					tela.getVenda().getDataPedido(), tela.getVenda().getFuncionario(), tela.getVenda().getCliente(),
					tela.getVenda().getProduto(), pag, tela.getVenda().getQtdVendida());

			JOptionPane.showMessageDialog(null, "Venda cadastrada com sucesso!", null, JOptionPane.INFORMATION_MESSAGE);
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
