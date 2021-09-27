package view;

import java.awt.event.ActionEvent;

import javax.swing.event.ListSelectionEvent;

import control.ControleDados;
import control.ControleTelaEstoque;

public class TelaEstoque extends Template {
	private ControleTelaEstoque controlTela;
	private ControleDados dados = new ControleDados();

	public TelaEstoque(ControleDados d) {
		super("Estoque", d);
		this.dados = d;
		this.controlTela = new ControleTelaEstoque(this, dados);
	}

	@Override
	public void actionPerformed(ActionEvent e) { // Botões controlados pela classe ControleTelaEstoque
		this.controlTela.clicaBtn(e);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) { // Lista controlada pela classe ControleTelaEstoque
		this.controlTela.clicaLista(e);

	}

}
