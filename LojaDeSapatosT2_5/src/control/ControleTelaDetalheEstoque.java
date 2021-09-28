package control;

import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import view.TelaDetalheEstoque;

public class ControleTelaDetalheEstoque {
	private TelaDetalheEstoque detalheEstoque;
	private ControleEstoque estCtrl;
	private ControleDados dados = new ControleDados();
	private int indexCliente, opc;
	private String tipoProd;
	Date data = new Date();
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	public ControleTelaDetalheEstoque(TelaDetalheEstoque detalheEstoque, ControleDados d, int editarSalvar, int idx,
			String tipoProduto) {
		this.detalheEstoque = detalheEstoque;
		this.dados = d;
		this.opc = editarSalvar;
		this.indexCliente = idx;
		this.tipoProd = tipoProduto;
		estCtrl = new ControleEstoque(dados);
	}

	public void imprimirEditarDetalhe(TelaDetalheEstoque tela, ControleDados d, int index) {

	}

	public void clicaBtn(ActionEvent e) {
		JButton clicado = (JButton) e.getSource();

		if (clicado == detalheEstoque.getBtnSalvar() && opc == 0) { // SALVAR CLIENTE
			try {

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			} catch (ParseException excData) {
				excData.printStackTrace();
				mensagemErroCadastro();
			}
		}
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,
				"Erro!\nVerifique se todos os campos estão preenchidos."
						+ "\nVerifique se os dados em formato numérico são números."
						+ "\nVerifique se as datas foram inseridas corretamente.",
				null, JOptionPane.ERROR_MESSAGE);
	}

}
