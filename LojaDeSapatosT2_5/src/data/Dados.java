package data;
import java.util.ArrayList;
import java.util.List;

import model.*;

public class Dados {
	private ArrayList<Cliente> cliente;
	private ArrayList<Funcionario> funcionario;
	private ArrayList<Venda> venda;
	private ArrayList<Endereco> endereco;
	private final List<Produto> produto;
	

	public Dados() {
		cliente = new ArrayList<>();
		funcionario = new ArrayList<>();
		venda = new ArrayList<>();
		endereco = new ArrayList<>();
		produto = new ArrayList<>();
	}

	public List<Cliente> getCliente() {
		return cliente;
	}
	
	public void addCliente(Cliente cliente) {
		this.cliente.add(cliente);
	}
	
	public void imprimirClientes() {
		System.out.println("\n~IMPRIMINDO TODOS OS CLIENTES~\n");
		
		for(int i = 0; i < cliente.size(); i++) {
			System.out.println(i+1 + "º Cliente: ");
			cliente.get(i).imprimir();
			System.out.println("");
		}
	}
	
	public void deletarClientes() {
		
	}

	public List<Funcionario> getFuncionario() {
		return funcionario;
	}
	
	public void addFuncionario(Funcionario funcionario) {
		this.funcionario.add(funcionario);
	}
	
	public void imprimirFuncionarios() {
		System.out.println("\n~IMPRIMINDO TODOS OS FUNCIONÁRIOS~\n");
		
		for(int i = 0; i < funcionario.size(); i++) {
			System.out.println(i+1 + "º Funcionário: ");
			funcionario.get(i).imprimir();
			System.out.println("");
		}
	}
	
	public void deletarFuncionarios() {
		
	}

	public List<Venda> getVenda() {
		return venda;
	}
	
	public void addVenda(Venda venda) {
		this.venda.add(venda);
	}
	
	public void imprimirVendas() {
		System.out.println("\n~IMPRIMINDO TODAS AS VENDAS~\n");
		
		for(int i = 0; i < venda.size(); i++) {
			System.out.println(i+1 + "º Venda: ");
			venda.get(i).imprimir();
			System.out.println("");
		}
	}
	
	public void deletarVendas() {
		
	}

	public List<Endereco> getEndereco() {
		return endereco;
	}
	
	public void addEndereco(Endereco endereco) {
		this.endereco.add(endereco);
	}
	
	public void imprimirEnderecos() {
		System.out.println("\n~IMPRIMINDO TODOS OS ENDERECOS~\n");
		
		for(int i = 0; i < endereco.size(); i++) {
			System.out.println(i+1 + "º Endereço: ");
			endereco.get(i).imprimir();
			System.out.println("");
		}
	}
	
	public void deletarEnderecos() {
		
	}

	public List<Produto> getProduto() {
		return produto;
	}
	
	public void addProduto(Produto produto) {
		this.produto.add(produto);
	}
	
	public void imprimirProdutos() {
		System.out.println("\n~IMPRIMINDO TODOS OS PRODUTOS~\n");
		
		for(int i = 0; i < produto.size(); i++) {
			System.out.print(i+1 + "º Produto: ");
			produto.get(i).imprimir();
			System.out.println("");
		}
	}
	
	public void deletarProdutos() {
		
	}

}