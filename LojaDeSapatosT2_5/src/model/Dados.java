package model;

import java.util.ArrayList;
import java.util.List;

public class Dados {
	private final ArrayList<Cliente> cliente;
	private final ArrayList<Funcionario> funcionario;
	private final ArrayList<Venda> venda;
	private final ArrayList<Endereco> enderecoCliente;
	private final ArrayList<Endereco> enderecoFuncionario;
	private final Endereco enderecoLoja;
	private final List<Produto> produto;

	public Dados() {
		this.cliente = new ArrayList<>();
		this.funcionario = new ArrayList<>();
		this.venda = new ArrayList<>();
		this.enderecoCliente = new ArrayList<>();
		this.enderecoFuncionario = new ArrayList<>();
		this.enderecoLoja = new Endereco();
		this.produto = new ArrayList<>();
	}

	public ArrayList<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cli) {
		this.cliente.add(cli);
	}

	public ArrayList<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario func) {
		this.funcionario.add(func);
	}

	public ArrayList<Venda> getVenda() {
		return venda;
	}

	public void setVenda(Venda ven) {
		this.venda.add(ven);
	}

	public ArrayList<Endereco> getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(Endereco end) {
		this.enderecoCliente.add(end);
	}

	public ArrayList<Endereco> getEnderecoFuncionario() {
		return enderecoFuncionario;
	}

	public void setEnderecoFuncionario(Endereco end) {
		this.enderecoFuncionario.add(end);
	}

	public Endereco getEnderecoLoja() {
		return enderecoLoja;
	}

	public void setEnderecoLoja(int cep, String cidade, String uf, String nomeRua, int numero, int quadra,
			String bairro, int numApart, String complemento) {
		this.enderecoLoja.setCep(cep);
		this.enderecoLoja.setCidade(cidade);
		this.enderecoLoja.setUf(uf);
		this.enderecoLoja.setNomeRua(nomeRua);
		this.enderecoLoja.setNumero(numero);
		this.enderecoLoja.setQuadra(quadra);
		this.enderecoLoja.setBairro(bairro);
		this.enderecoLoja.setNumApart(numApart);
		this.enderecoLoja.setComplemento(complemento);
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(Produto prod) {
		this.produto.add(prod);
	}

	/*
	 * // CLIENTE public List<Cliente> getCliente() { return cliente; }
	 * 
	 * public void addCliente(Cliente cliente) { this.cliente.add(cliente); }
	 * 
	 * public void imprimirClientes() {
	 * System.out.println("\n~IMPRIMINDO TODOS OS CLIENTES~\n");
	 * 
	 * for (int i = 0; i < cliente.size(); i++) { System.out.println(i + 1 +
	 * "º Cliente: "); cliente.get(i).imprimir(); System.out.println(""); } }
	 * 
	 * public void deletarClientes() { System.out.
	 * println("\n~DELETAR CLIENTE~\n\nEscolha o cliente a ser deletado: ");
	 * 
	 * for (int i = 0; i < cliente.size(); i++) { System.out.println(i + 1 +
	 * "º Cliente: "); cliente.get(i).imprimir(); System.out.println(""); }
	 * 
	 * System.out.print("Opção escolhida: "); int opc = sc.nextInt(); sc.nextLine();
	 * // Limpando o Buffer
	 * 
	 * while (opc < 1 || opc > cliente.size()) { // Verificação de validade do valor
	 * inserido System.out.println("\nVALOR INCORRETO! ESCOLHA UMA OPÇÃO DO MENU!");
	 * System.out.print("Opção escolhida: "); opc = sc.nextInt(); } opc--;
	 * cliente.remove(opc); System.out.println("Cliente removido!"); }
	 * 
	 * // FUNCIONARIO public List<Funcionario> getFuncionario() { return
	 * funcionario; }
	 * 
	 * public void addFuncionario(Funcionario funcionario) {
	 * this.funcionario.add(funcionario); }
	 * 
	 * public void imprimirFuncionarios() {
	 * System.out.println("\n~IMPRIMINDO TODOS OS FUNCIONÁRIOS~\n");
	 * 
	 * for (int i = 0; i < funcionario.size(); i++) { System.out.println(i + 1 +
	 * "º Funcionário: "); funcionario.get(i).imprimir(); System.out.println(""); }
	 * }
	 * 
	 * public void deletarFuncionarios(Loja loja) { System.out.
	 * println("\n~DELETAR FUNCIONÁRIO~\n\nEscolha o funcionário a ser deletado: ");
	 * 
	 * for (int i = 0; i < funcionario.size(); i++) { System.out.println(i + 1 +
	 * "º Funcionário: "); funcionario.get(i).imprimir(); System.out.println(""); }
	 * 
	 * System.out.print("Opção escolhida: "); int opc = sc.nextInt(); sc.nextLine();
	 * // Limpando o Buffer
	 * 
	 * while (opc < 1 || opc > funcionario.size()) { // Verificação de validade do
	 * valor inserido
	 * System.out.println("\nVALOR INCORRETO! ESCOLHA UMA OPÇÃO DO MENU!");
	 * System.out.print("Opção escolhida: "); opc = sc.nextInt(); } opc--;
	 * loja.deletarFuncionario(funcionario.get(opc)); // Deletando o funcionário da
	 * instância da classe Loja através do // método loja.deletarFuncionario()
	 * funcionario.remove(opc); System.out.println("Funcionário removido!"); }
	 * 
	 * // VENDA public List<Venda> getVenda() { return venda; }
	 * 
	 * public void addVenda(Venda venda) { this.venda.add(venda); }
	 * 
	 * public void imprimirVendas() {
	 * System.out.println("\n~IMPRIMINDO TODAS AS VENDAS~\n");
	 * 
	 * for (int i = 0; i < venda.size(); i++) { System.out.println(i + 1 +
	 * "º Venda: "); venda.get(i).imprimir(); System.out.println(""); } }
	 * 
	 * // ENDERECO public ArrayList<Endereco> getEndereco() { return endereco; }
	 * 
	 * public void addEndereco(Endereco endereco) { this.endereco.add(endereco); }
	 * 
	 * public void imprimirEnderecos() {
	 * System.out.println("\n~IMPRIMINDO TODOS OS ENDERECOS~\n");
	 * 
	 * for (int i = 0; i < endereco.size(); i++) { System.out.println(i + 1 +
	 * "º Endereço: "); endereco.get(i).imprimir(); System.out.println(""); } }
	 * 
	 * // PRODUTO public List<Produto> getProduto() { return produto; }
	 * 
	 * public void addProduto(Produto produto) { this.produto.add(produto); }
	 * 
	 * public void imprimirProdutos() {
	 * System.out.println("\n~IMPRIMINDO TODOS OS PRODUTOS~\n");
	 * 
	 * for (int i = 0; i < produto.size(); i++) { System.out.print(i + 1 +
	 * "º Produto: "); produto.get(i).imprimir(); System.out.println(""); } }
	 * 
	 * public void deletarProdutos(Estoque estoque) { System.out.
	 * println("\n~DELETAR PRODUTO~\n\nEscolha o produto a ser deletado: ");
	 * 
	 * for (int i = 0; i < produto.size(); i++) { System.out.print(i + 1 +
	 * "º Produto: "); produto.get(i).imprimir(); System.out.println(""); }
	 * 
	 * System.out.print("Opção escolhida: "); int opc = sc.nextInt(); sc.nextLine();
	 * // Limpando o Buffer
	 * 
	 * while (opc < 1 || opc > produto.size()) { // Validando valor inserido
	 * System.out.println("\nVALOR INCORRETO! ESCOLHA UMA OPÇÃO DO MENU!");
	 * System.out.print("Opção escolhida: "); opc = sc.nextInt(); } opc--;
	 * estoque.deletarProduto(produto.get(opc)); // Enviando produto para que este
	 * também seja deletado em Estoque produto.remove(opc); // Deletando produto em
	 * Dados System.out.println("Produto removido!"); }
	 */

}