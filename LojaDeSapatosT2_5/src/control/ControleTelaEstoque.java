package control;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;

import view.TelaDetalheEstoque;
import view.TelaEstoque;

public class ControleTelaEstoque {
	private TelaEstoque tela;
	private ControleDados dados = new ControleDados();

	public ControleTelaEstoque(TelaEstoque estoque, ControleDados d) {
		this.tela = estoque;
		this.dados = d;
	}

	public void clicaBtn(ActionEvent e) {
		JButton clicado = (JButton) e.getSource();

		if (clicado == tela.getBtnCadastrar()) {
			try {
				String[] produtos = { "Salto", "Tênis", "Bota", "Sapato" };
				Object prodEscolhido = JOptionPane.showInputDialog(null, "Deseja cadastrar qual produto?", "Produto",
						JOptionPane.INFORMATION_MESSAGE, null, produtos, produtos[0]);
				new TelaDetalheEstoque(dados, 0, 0, prodEscolhido.toString());
			} catch (NullPointerException exc1) {

			}
		} else if (clicado == tela.getBtnOrdenar()) {
			JOptionPane.showMessageDialog(null, "SISTEMA EM CONSTRUÇÃO!", null, JOptionPane.INFORMATION_MESSAGE);
		} else if (clicado == tela.getBtnAtualizar()) {
			tela.preencherLista("Clientes", dados);
		}
	}

	public void clicaLista(ListSelectionEvent e) {
		Object selecionado = e.getSource();

		if (e.getValueIsAdjusting()) {
			TelaDetalheEstoque detalhe = new TelaDetalheEstoque(dados, 1, tela.getListaPessoasProd().getSelectedIndex(),
					tela.getListaPessoasProd().getSelectedValue());
			ControleTelaDetalheEstoque ctrlDetalhe = new ControleTelaDetalheEstoque(detalhe, dados, 1,
					tela.getListaPessoasProd().getSelectedIndex());
			ctrlDetalhe.imprimirEditarDetalhe(detalhe, dados, tela.getListaPessoasProd().getSelectedIndex());
		}
	}

	public TelaEstoque getTela() {
		return tela;
	}

	public void setTela(TelaEstoque tela) {
		this.tela = tela;
	}

	public ControleDados getDados() {
		return dados;
	}

	public void setDados(ControleDados dados) {
		this.dados = dados;
	}

}
