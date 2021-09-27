package control;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;

import view.TelaDetalheFuncionario;
import view.TelaFuncionario;

public class ControleTelaFuncionario {
	private TelaFuncionario funcionario;
	private ControleDados dados = new ControleDados();

	public ControleTelaFuncionario(TelaFuncionario func, ControleDados d) {
		this.funcionario = func;
		this.dados = d;
	}

	public void clicaBtn(ActionEvent e) {
		JButton clicado = (JButton) e.getSource();

		if (clicado == funcionario.getBtnCadastrar()) {
			new TelaDetalheFuncionario(dados, 0, 0);
		} else if (clicado == funcionario.getBtnOrdenar()) {
			JOptionPane.showMessageDialog(null, "SISTEMA EM CONSTRUÇÃO!", null, JOptionPane.INFORMATION_MESSAGE);
		} else if (clicado == funcionario.getBtnAtualizar()) {
			funcionario.preencherLista("Funcionários", dados);
		}
	}

	public void clicaLista(ListSelectionEvent e) {
		Object selecionado = e.getSource();

		if (e.getValueIsAdjusting()) {
			TelaDetalheFuncionario detalhe = new TelaDetalheFuncionario(dados, 1,
					funcionario.getListaPessoas().getSelectedIndex());
			ControleTelaDetalheFuncionario ctrlDetalhe = new ControleTelaDetalheFuncionario(detalhe, dados, 1,
					funcionario.getListaPessoas().getSelectedIndex());
			ctrlDetalhe.imprimirEditarDetalhe(detalhe, dados, funcionario.getListaPessoas().getSelectedIndex());
		}
	}

	public TelaFuncionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(TelaFuncionario funcionario) {
		this.funcionario = funcionario;
	}

	public ControleDados getDados() {
		return dados;
	}

	public void setDados(ControleDados dados) {
		this.dados = dados;
	}

}
