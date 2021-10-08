package control;

import java.util.Date;

import model.Cliente;
import model.Dados;
import model.Funcionario;
import model.Pagamento;
import model.Produto;
import model.Venda;

/**
 * Controle dos Métodos da Venda. Realiza o cadastro e a edição das Vendas.
 * Salva os dados recebidos na classe Dados.
 * 
 * @see Venda
 * @author Gabriel Mariano
 */
public class ControleVenda {

	/**
	 * Construtor Vazio.
	 */
	public ControleVenda() {

	}

	/**
	 * Método de Cadastro da Venda. Cria um objeto do tipo Venda, salva os dados
	 * recebidos nele e depois salva essa venda em Dados.
	 * 
	 * @see Venda
	 * @see Dados
	 * 
	 * @param ID          ID da Venda
	 * @param ValorVenda  Valor da Venda
	 * @param Desconto    Valor do Desconto dado na venda
	 * @param DataPedido  Data de realização da Venda
	 * @param Funcionário Funcionário que realizou a venda
	 * @param Cliente     Cliente que comprou o produto
	 * @param Produto     Produto vendido
	 * @param Pagamento   Dados do pagamento
	 * @param qtdVendida  Quantidade do Produto vendido
	 * @return void
	 */
	public void cadastrarVenda(int idVenda, Double valorVenda, Double valorDesconto, Date dataPedido,
			Funcionario funcionario, Cliente cliente, Produto produto, Pagamento pagamento, int qtdVendida) {
		Venda ven = new Venda();
		ven.setIdVenda(idVenda);
		ven.setValorVenda(valorVenda);
		ven.setValorDesconto(valorDesconto);
		ven.setDataPedido(dataPedido);
		ven.setFuncionario(funcionario);
		ven.setCliente(cliente);
		ven.setProduto(produto);
		ven.setPagamento(pagamento);
		ven.setQtdVendida(qtdVendida);
		Dados.getVenda().add(ven);
		Dados.incrementarIdVenda();
	}

	/**
	 * Método de Edição da Venda. Edita na classe Dados os dados da Venda em
	 * questão.
	 * 
	 * @see Venda
	 * @see Dados
	 * 
	 * @param index       Index da Venda a ser realizada
	 * @param ID          ID da Venda
	 * @param ValorVenda  Valor da Venda
	 * @param Desconto    Valor do Desconto dado na venda
	 * @param DataPedido  Data de realização da Venda
	 * @param Funcionário Funcionário que realizou a venda
	 * @param Cliente     Cliente que comprou o produto
	 * @param Produto     Produto vendido
	 * @param Pagamento   Dados do pagamento
	 * @param qtdVendida  Quantidade do Produto vendido
	 * @return void
	 */
	public void editarVenda(int index, int idVenda, Double valorVenda, Double valorDesconto, Date dataPedido,
			Funcionario funcionario, Cliente cliente, Produto produto, Pagamento pagamento, int qtdVendida) {
		Dados.getVenda().get(index).setIdVenda(idVenda);
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
