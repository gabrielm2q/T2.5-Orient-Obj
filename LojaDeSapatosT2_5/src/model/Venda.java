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
	
	public Venda(int idVenda, Double valorVenda, Double valorDesconto, Date dataPedido, Funcionario funcionario,
			List<Produto> produto, ArrayList<Pagamento> pagamento) {
		this.idVenda = idVenda;
		this.valorVenda = valorVenda;
		this.valorDesconto = valorDesconto;
		this.dataPedido = dataPedido;
		this.funcionario = funcionario;
		this.produto = new ArrayList<>();
		this.pagamento = new ArrayList<>();
	}
	
	public Venda() {
		this.idVenda = 0;
		this.valorVenda = 0.0;
		this.valorDesconto =0.0;
		this.dataPedido = null;
		this.funcionario = null;
		this.produto = new ArrayList<>();
		this.pagamento = new ArrayList<>();
	}

	public void cadastrar(Double valorVenda, Double valorDesconto, Date dataPedido, Funcionario funcionario,
			Produto produto, Pagamento pagamento) {
		this.idVenda++;
		this.valorVenda = valorVenda;
		this.valorDesconto = valorDesconto;
		this.dataPedido = dataPedido;
		this.funcionario = funcionario;
		this.produto.add(produto);
		this.pagamento.add(pagamento);
	}

	public void ler() {
		int i;
		System.out.println("\nDados da Venda: ");
		System.out.println("ID da Venda: " + this.idVenda);
		System.out.println("Valor da Venda: R$" + this.valorVenda);
		System.out.println("Valor do Desconto: R$" + this.valorDesconto);
		System.out.println("Data do Pedido: " + this.dataPedido);
		System.out.println("Funcionário: " + this.funcionario.getNome());
		System.out.print("Produtos Vendidos: ");
		for(i = 0; i < this.produto.size(); i++) {
			System.out.println(produto.get(i).getNome() + "; ");
		}
		System.out.println("Forma de Pagamento: " + this.pagamento.get(this.idVenda - 1).getFormaPag());
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

	public void setPagamento(ArrayList<Pagamento> pagamento) {
		this.pagamento = pagamento;
	}

	public List<Produto> getProduto() {
		return produto;
	}

}
