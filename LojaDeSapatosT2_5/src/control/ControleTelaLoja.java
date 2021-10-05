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
		ControleValidacao control = new ControleValidacao();
		try {
			// Validando dados inseridos
			boolean yesNoEnd = control.validaEndereco(Integer.parseInt(tela.getValorCep().getText()),
					tela.getValorCidade().getText(), tela.getValorRua().getText(),
					Integer.parseInt(tela.getValorNum().getText()), Integer.parseInt(tela.getValorQd().getText()),
					tela.getValorBairro().getText(), 1, tela.getValorComp().getText());
			boolean yesNoLoja = control.validaLoja(tela.getValorNome().getText(), tela.getValorCnpj().getText(),
					tela.getValorSite().getText());

			if (yesNoEnd && yesNoLoja) {
				// Recebendo valores do endereco
				Endereco end = new Endereco(Integer.parseInt(tela.getValorCep().getText()),
						tela.getValorCidade().getText(), tela.getValorUf().getSelectedItem().toString(),
						tela.getValorRua().getText(), Integer.parseInt(tela.getValorNum().getText()),
						Integer.parseInt(tela.getValorQd().getText()), tela.getValorBairro().getText(),
						tela.getValorComp().getText());

				// Editando Loja
				lojaCtrl.editarLoja(tela.getValorNome().getText(), tela.getValorCnpj().getText(),
						Integer.parseInt((String) tela.getValorAbertura().getSelectedItem()),
						Integer.parseInt((String) tela.getValorFechamento().getSelectedItem()),
						tela.getValorSite().getText(), Dados.getLoja().getFuncionario(), Dados.getLoja().getEstoque(),
						end);

				JOptionPane.showMessageDialog(null, "Altera��o salva!", null, JOptionPane.INFORMATION_MESSAGE);
			}

		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null,
					"Erro!\nVerifique se os valores num�ricos foram preenchidos corretamente!", null,
					JOptionPane.ERROR_MESSAGE);
		} catch (NumberFormatException exc2) {
			JOptionPane.showMessageDialog(null,
					"Erro!\nVerifique se os valores num�ricos foram preenchidos corretamente!", null,
					JOptionPane.ERROR_MESSAGE);
		}

	}

	public void mensagemErro() {
		JOptionPane.showMessageDialog(null, "Erro!\nVerifique se todos os campos est�o preenchidos."
				+ "\nVerifique se os dados em formato num�rico s�o n�meros.", null, JOptionPane.ERROR_MESSAGE);
	}

}
