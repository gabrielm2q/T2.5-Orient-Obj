package control;

import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.event.ListSelectionEvent;

import model.Cliente;
import model.Dados;
import view.TelaCliente;
import view.TelaDetalheCliente;
import view.TelaFiltro;

/**
 * Controle das Ações da Tela de Cliente. Controla os cliques dos botões, as
 * ações da lista de clientes.
 * 
 * @see TelaCliente
 * @author Gabriel Mariano
 */
public class ControleTelaCliente {
	private TelaCliente tela;

	/**
	 * Construtor. Recebe a Tela de Cliente, "seta" a lista de clientes com os nomes
	 * dos clientes cadastrados no sistema.
	 * 
	 * @see TelaCliente
	 * @param TelaCliente Recebe a Tela de Cliente
	 */
	public ControleTelaCliente(TelaCliente tela) {
		this.tela = tela;
		this.tela.setListaPessoasProd(this.listaNomes());
	}

	/**
	 * Clique do Botão. Controla as ações dos botões da tela de cliente. Direciona o
	 * usuário para a opção escolhida.
	 * 
	 * @see TelaCliente
	 * @param ActionEvent
	 * @return void
	 */
	public void clicaBtn(ActionEvent e) {
		JButton clicado = (JButton) e.getSource();

		if (clicado == tela.getBtnCadastrar()) {
			new TelaDetalheCliente(0, Dados.getCliente().size());
		} else if (clicado == tela.getBtnOrdenar()) {
			new TelaFiltro("nomecliente");
		} else if (clicado == tela.getBtnAtualizar()) {
			tela.setListaPessoasProd(this.listaNomes());
		}
	}

	/**
	 * Clique na Lista. Controla as ações da lista de clientes da tela de cliente.
	 * Direciona o usuário para o cliente escolhido.
	 * 
	 * @see TelaCliente
	 * @param ListSelectionEvent
	 * @return void
	 */
	public void clicaLista(ListSelectionEvent e) {
		Object selecionado = e.getSource();

		if (e.getValueIsAdjusting()) {
			TelaDetalheCliente detalhe = new TelaDetalheCliente(1, tela.getListaPessoasProd().getSelectedIndex());
			ControleTelaDetalheCliente ctrlDetalhe = new ControleTelaDetalheCliente(detalhe, 1,
					tela.getListaPessoasProd().getSelectedIndex());
			ctrlDetalhe.imprimirDetalhes(detalhe, tela.getListaPessoasProd().getSelectedIndex());
		}
	}

	/**
	 * Listar Nomes. Lista todos os nomes de clientes cadastrados na classe Dados.
	 * 
	 * @see TelaCliente
	 * @see Dados
	 * @return DefaultListModel<String>
	 */
	public DefaultListModel<String> listaNomes() {
		DefaultListModel<String> nomes = new DefaultListModel<>();

		for (Cliente cli : Dados.getCliente()) {
			nomes.addElement(cli.getNome());
		}

		return nomes;
	}

	public TelaCliente getTela() {
		return tela;
	}

	public void setTela(TelaCliente tela) {
		this.tela = tela;
	}

}
