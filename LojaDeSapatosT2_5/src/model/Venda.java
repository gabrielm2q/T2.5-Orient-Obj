package model;

import java.util.Date;

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

	public Venda(int idVenda, Double valorVenda, Double valorDesconto, Date dataPedido, Funcionario funcionario,
			Cliente cliente, Produto produto, Pagamento pagamento, int qtdVendida) {
		setIdVenda(idVenda);
		setValorVenda(valorVenda);
		setValorDesconto(valorDesconto);
		setDataPedido(dataPedido);
		setFuncionario(funcionario);
		setCliente(cliente);
		this.produto = produto;
		this.pagamento = pagamento;
		this.qtdVendida = qtdVendida;
	}

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

	@Override
	public String toString() {
		return "Venda [idVenda=" + idVenda + ", valorVenda=" + valorVenda + ", valorDesconto=" + valorDesconto
				+ ", dataPedido=" + dataPedido + ", funcionario=" + funcionario + "]";
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
