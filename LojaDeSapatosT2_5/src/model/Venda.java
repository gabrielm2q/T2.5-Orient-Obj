package model;

import java.util.Date;

/**
 * Venda. Pode criar uma Venda com todos os atributos e métodos necessários para
 * detalhar este. Possui um pagamento! Armazena a venda de um produto por vez
 * apenas.
 * 
 * @see Produto
 * @see Pagamento
 * @author Gabriel Mariano
 */
public class Venda {

	private int idVenda;
	private Double valorVenda;
	private Double valorDesconto;
	private Date dataPedido;
	private Funcionario funcionario;
	private Cliente cliente;
	private Produto produto;
	private Pagamento pagamento;
	private int qtdVendida;

	/**
	 * Construtor.
	 */
	public Venda(int idVenda, Double valorVenda, Double valorDesconto, Date dataPedido, Funcionario funcionario,
			Cliente cliente, Produto produto, Pagamento pagamento, int qtdVendida) {
		this.setIdVenda(idVenda);
		this.setValorVenda(valorVenda);
		this.setValorDesconto(valorDesconto);
		this.setDataPedido(dataPedido);
		this.setFuncionario(funcionario);
		this.setCliente(cliente);
		this.setProduto(produto);
		this.setPagamento(pagamento);
		this.setQtdVendida(qtdVendida);
	}

	/**
	 * Construtor vazio.
	 */
	public Venda() {
		setIdVenda(0);
		setValorVenda(0.0);
		setValorDesconto(0.0);
		setDataPedido(null);
		setFuncionario(null);
		setCliente(null);
		setProduto(null);
		setPagamento(null);
		setQtdVendida(0);
	}

	/**
	 * Método toString(), retorna atributos relevantes da venda.
	 */
	@Override
	public String toString() {
		return "Venda [idVenda=" + idVenda + ", valorVenda=" + valorVenda + ", valorDesconto=" + valorDesconto
				+ ", dataPedido=" + dataPedido + ", funcionario=" + funcionario + ", cliente=" + cliente + ", produto="
				+ produto + ", pagamento=" + pagamento + ", qtdVendida=" + qtdVendida + "]";
	}

	public int getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}

	public Double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(Double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public Double getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(Double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public int getQtdVendida() {
		return qtdVendida;
	}

	public void setQtdVendida(int qtdVendida) {
		this.qtdVendida = qtdVendida;
	}

}
