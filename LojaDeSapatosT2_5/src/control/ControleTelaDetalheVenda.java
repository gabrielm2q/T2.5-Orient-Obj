package control;

import java.text.SimpleDateFormat;
import java.util.Date;

import view.TelaDetalheVenda;

public class ControleTelaDetalheVenda {
	private TelaDetalheVenda detalheVenda;
	private ControleVenda venCtrl;
	private int indexVenda;
	private int opcEditarSalvar;
	Date data = new Date();
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	public ControleTelaDetalheVenda(TelaDetalheVenda detalheVenda, int opcaoEditarSalvar, int indexVenda) {
		this.detalheVenda = detalheVenda;
		this.opcEditarSalvar = opcaoEditarSalvar;
		this.indexVenda = indexVenda;
		venCtrl = new ControleVenda();
	}

}
