package control;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import model.Dados;
import model.Endereco;
import view.TelaLoja;

public class ControleTelaLoja {
	private ControleLoja lojaCtrl;
	private TelaLoja tela;

	public ControleTelaLoja(TelaLoja tela) {
		this.tela = tela;
		lojaCtrl = new ControleLoja();
	}

	public void clicaBtn(ActionEvent e) {
		// Recebendo valores do endereco
		Endereco end = new Endereco(Integer.parseInt(tela.getValorCep().getText()), tela.getValorCidade().getText(),
				tela.getValorUf().getSelectedItem().toString(), tela.getValorRua().getText(),
				Integer.parseInt(tela.getValorNum().getText()), Integer.parseInt(tela.getValorQd().getText()),
				tela.getValorBairro().getText(), tela.getValorComp().getText());

		// Editando Loja
		lojaCtrl.editarLoja(tela.getValorNome().getText(), tela.getValorCnpj().getText(),
				Integer.parseInt((String) tela.getValorAbertura().getSelectedItem()),
				Integer.parseInt((String) tela.getValorFechamento().getSelectedItem()), tela.getValorSite().getText(),
				Dados.getLoja().getFuncionario(), Dados.getLoja().getEstoque(), end);

		JOptionPane.showMessageDialog(null, "Altera��o salva!", null, JOptionPane.INFORMATION_MESSAGE);

	}

	public void mensagemErro() {
		JOptionPane.showMessageDialog(null, "Erro!\nVerifique se todos os campos est�o preenchidos."
				+ "\nVerifique se os dados em formato num�rico s�o n�meros.", null, JOptionPane.ERROR_MESSAGE);
	}

}
