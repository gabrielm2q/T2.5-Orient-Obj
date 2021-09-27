package control;

import java.text.SimpleDateFormat;
import java.util.Date;

import view.TelaDetalheEstoque;

public class ControleTelaDetalheEstoque {
	private TelaDetalheEstoque detalheEstoque;
	private ControleEstoque estCtrl;
	private ControleDados dados = new ControleDados();
	private int indexCliente, opc;
	Date data = new Date();
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	public ControleTelaDetalheEstoque(TelaDetalheEstoque detalheEstoque, ControleDados d, int editarSalvar, int idx) {
		// TODO Auto-generated constructor stub
	}

	public void imprimirEditarDetalhe(TelaDetalheEstoque tela, ControleDados d, int index) {

	}

}
