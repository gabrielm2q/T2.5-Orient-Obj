package control;

import java.util.Date;

import model.Cliente;
import model.Dados;
import model.Funcionario;
import model.Pagamento;
import model.Produto;
import model.Venda;

public class ControleVenda {

	public ControleVenda() {

	}

	public void cadastrarVenda(Double valorVenda, Double valorDesconto, Date dataPedido, Funcionario funcionario,
			Cliente cliente, Produto produto, Pagamento pagamento, int qtdVendida) {
		Venda ven = new Venda();
		ven.setValorVenda(valorVenda);
		ven.setValorDesconto(valorDesconto);
		ven.setDataPedido(dataPedido);
		ven.setFuncionario(funcionario);
		ven.setCliente(cliente);
		ven.setProduto(produto);
		ven.setPagamento(pagamento);
		ven.setQtdVendida(qtdVendida);
		Dados.getVenda().add(ven);
	}

	public void editarVenda(int index, Double valorVenda, Double valorDesconto, Date dataPedido,
			Funcionario funcionario, Cliente cliente, Produto produto, Pagamento pagamento, int qtdVendida) {
		Dados.getVenda().get(index).setValorVenda(valorVenda);
		Dados.getVenda().get(index).setValorDesconto(valorDesconto);
		Dados.getVenda().get(index).setDataPedido(dataPedido);
		Dados.getVenda().get(index).setFuncionario(funcionario);
		Dados.getVenda().get(index).setCliente(cliente);
		Dados.getVenda().get(index).setProduto(produto);
		Dados.getVenda().get(index).setPagamento(pagamento);
		Dados.getVenda().get(index).setQtdVendida(qtdVendida);
	}

}
