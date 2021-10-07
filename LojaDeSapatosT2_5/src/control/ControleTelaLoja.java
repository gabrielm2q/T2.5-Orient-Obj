package control;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import model.Dados;
import model.Endereco;
import view.TelaLoja;

/**
 * Controle da Tela da Loja. Realiza todas as a��es dos bot�es da tela da loja.
 * 
 * @see TelaLoja
 * @author Gabriel Mariano
 * @author Pedro Victor Torre�o
 */
public class ControleTelaLoja {
	private ControleLoja lojaCtrl;
	private TelaLoja tela;

	/**
	 * Construtor. Recebe e "seta" a tela da Loja.
	 * 
	 * @param TelaLoja
	 */
	public ControleTelaLoja(TelaLoja tela) {
		this.tela = tela;
		lojaCtrl = new ControleLoja();
	}

	/**
	 * Clique do Bot�o. Controla as a��es dos bot�es da tela da loja. Realiza a
	 * edi��o dos dados da loja.
	 * 
	 * @see TelaLoja
	 * @param ActionEvent
	 * @return void
	 */
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

	/**
	 * Exibe a mensagem de erro quando chamada.
	 */
	public void mensagemErro() {
		JOptionPane.showMessageDialog(null, "Erro!\nVerifique se todos os campos est�o preenchidos."
				+ "\nVerifique se os dados em formato num�rico s�o n�meros.", null, JOptionPane.ERROR_MESSAGE);
	}

}
