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
		Endereco end = new Endereco();
		// Recebendo valores do endereco
		end.setCep(Integer.parseInt(tela.getValorCep().getText()));
		end.setCidade(tela.getValorCidade().getText());
		end.setUf(tela.getValorUf().getSelectedItem().toString());
		end.setNomeRua(tela.getValorRua().getText());
		end.setNumero(Integer.parseInt(tela.getValorNum().getText()));
		end.setQuadra(Integer.parseInt(tela.getValorQd().getText()));
		end.setBairro(tela.getValorBairro().getText());
		end.setComplemento(tela.getValorComp().getText());

		// Editando Loja
		lojaCtrl.editarLoja(tela.getValorNome().getText(), tela.getValorCnpj().getText(),
				Integer.parseInt((String) tela.getValorAbertura().getSelectedItem()),
				Integer.parseInt((String) tela.getValorFechamento().getSelectedItem()), tela.getValorSite().getText(),
				Dados.getLoja().getFuncionario(), Dados.getLoja().getEstoque(), end);

		JOptionPane.showMessageDialog(null, "Alteração salva!", null, JOptionPane.INFORMATION_MESSAGE);

	}

	public void mensagemErro() {
		JOptionPane.showMessageDialog(null, "Erro!\nVerifique se todos os campos estão preenchidos."
				+ "\nVerifique se os dados em formato numérico são números.", null, JOptionPane.ERROR_MESSAGE);
	}

}
