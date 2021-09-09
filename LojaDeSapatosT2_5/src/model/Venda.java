package model;
import java.util.*;

public class Venda {
	
	private int idVenda = 0;
	private Double valorVenda;
	private Double valorDesconto;
	private Date dataPedido;
	private Funcionario funcionario;
	private final List<Produto> produto;
	private ArrayList<Pagamento> pagamento;
	private ArrayList<Integer> qtdVendida;
	
	public Venda(int idVenda, Double valorVenda, Double valorDesconto, Date dataPedido, Funcionario funcionario,
			List<Produto> produto, ArrayList<Pagamento> pagamento, ArrayList<Integer> qtdVendida) {
		this.idVenda = idVenda;
		this.valorVenda = valorVenda;
		this.valorDesconto = valorDesconto;
		this.dataPedido = dataPedido;
		this.funcionario = funcionario;
		this.produto = new ArrayList<>();
		this.pagamento = new ArrayList<>();
		this.qtdVendida = new ArrayList<>();
	}
	
	public Venda() {
		this.idVenda = 0;
		this.valorVenda = 0.0;
		this.valorDesconto =0.0;
		this.dataPedido = null;
		this.funcionario = null;
		this.produto = new ArrayList<>();
		this.pagamento = new ArrayList<>();
		this.qtdVendida = new ArrayList<>();
	}

	public void cadastrar(Double valorVenda, Double valorDesconto, Date dataPedido, Funcionario funcionario,
			List<Produto> produto, ArrayList<Pagamento> pagamento, ArrayList<Integer> qtdVendida) {
		this.idVenda++;
		setValorVenda(valorVenda);
		setValorDesconto(valorDesconto);
		setDataPedido(dataPedido);
		setFuncionario(funcionario);
		
		for(int i = 0; i < produto.size(); i++) {
			setProduto(produto.get(i));
		}
		
		for(int i = 0; i < pagamento.size(); i++) {
			setPagamento(pagamento.get(i));
		}
		
		for(int i = 0; i < qtdVendida.size(); i++) {
			setQtdVendida(qtdVendida.get(i));
		}
	}

	public void ler() {
		int i;
		System.out.println("ID da Venda: " + this.idVenda);
		System.out.println("Valor da Venda: R$" + this.valorVenda);
		System.out.println("Valor do Desconto: R$" + this.valorDesconto);
		System.out.println("Data do Pedido: " + this.dataPedido);
		System.out.println("Funcionário: " + this.funcionario.getNome());
		System.out.println("Produtos Vendidos: ");
		
		for(i = 0; i < this.produto.size(); i++) {
			System.out.println(" + Nome: " + produto.get(i).getNome() + "\n   Preço: R$" + produto.get(i).getPreco() +
			"\n   Marca: " + produto.get(i).getMarca() + "\n   Quantidade Vendida: " + qtdVendida.get(i));
		}
		
		System.out.println("Formas de Pagamento: ");
		for(i = 0; i < this.pagamento.size(); i++) {
			System.out.println("+ Forma: " + pagamento.get(i).getFormaPag() + "\n  Valor: R$" + pagamento.get(i).getValorPago());
		}
	}
	
	public void editar(int idVenda, Double valorVenda, Double valorDesconto, Date dataPedido, Funcionario funcionario,
			Produto produto, Pagamento pagamento) {
		this.idVenda = idVenda;
		this.valorVenda = valorVenda;
		this.valorDesconto = valorDesconto;
		this.dataPedido = dataPedido;
		this.funcionario = funcionario;
		this.produto.add(produto);
		this.pagamento.add(pagamento);
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

	public ArrayList<Pagamento> getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento.add(pagamento);
	}

	public List<Produto> getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto.add(produto);
	}

	public ArrayList<Integer> getQtdVendida() {
		return qtdVendida;
	}

	public void setQtdVendida(int qtdVendida) {
		this.qtdVendida.add(qtdVendida);
	}

}
