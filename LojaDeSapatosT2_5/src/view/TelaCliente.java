package view;

import java.awt.event.ActionEvent;

import javax.swing.event.ListSelectionEvent;

import control.ControleTelaCliente;
import model.Dados;

public class TelaCliente extends TemplatePessoa {
	private Dados dadosPessoas = new Dados();
	private ControleTelaCliente controlTela;

	public TelaCliente() {
		super("Clientes");
		this.controlTela = new ControleTelaCliente(this);
	}

	public static void main(String[] args) {
		TelaCliente cliente = new TelaCliente();
		cliente.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.controlTela.clicaBtn(e);

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		this.controlTela.clicaLista(e);

	}

	public Dados getDadosPessoas() {
		return dadosPessoas;
	}

	public void setDadosPessoas(Dados dadosPessoas) {
		this.dadosPessoas = dadosPessoas;
	}

	public ControleTelaCliente getControlTela() {
		return controlTela;
	}

}
