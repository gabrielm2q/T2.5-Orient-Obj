package model;
import java.util.*;

public class Estoque {
	
	private ArrayList<Integer> quantidade;
	private ArrayList<String> categoria;
	private ArrayList<Date> dataCadastro;
	private final List<Produto> produto;
	
	public Estoque(ArrayList<Integer> quantidade, ArrayList<String> categoria,
			ArrayList<Date> dataCadastro, List<Produto> produto) {
		this.quantidade = new ArrayList<>();
		this.categoria = new ArrayList<>();
		this.dataCadastro = new ArrayList<>();
		this.produto = new ArrayList<>();
	}
	
	public Estoque() {
		this.quantidade = new ArrayList<>();
		this.categoria = new ArrayList<>();
		this.dataCadastro = new ArrayList<>();
		this.produto = new ArrayList<>();
	}

	public void cadastrar(int quantidade, String categoria,
			Date dataCadastro, Produto produto) {
		this.quantidade.add(quantidade);
		this.categoria.add(categoria);
		this.dataCadastro.add(dataCadastro);
		this.produto.add(produto);		
	}

	public void ler() {
		int i;
		System.out.println("\n~DADOS DO ESTOQUE~");
		for(i = 0; i < this.produto.size(); i++) {
			System.out.println("\n" + (i+1) + "º Produto: " + produto.get(i));
			System.out.println("Quantidade: " + quantidade.get(i));
			System.out.println("Categoria: " + categoria.get(i));
			System.out.println("Data de Cadastro: " + dataCadastro.get(i));
		}
		
	}
	
	public void editar() {
		Scanner sc = new Scanner(System.in);
		int i, editar, qtd;
		String cat;
		
		GregorianCalendar d = new GregorianCalendar();
		Date data = d.getTime();
		
		System.out.println("\nQual produto deseja editar?\n");
		for(i = 0; i < this.produto.size(); i++) {
			System.out.println("" + (i+1) + " - Nome do Produto: " + produto.get(i).getNome() + "; Categoria do Produto: " + categoria.get(i));
		}
		System.out.print("\nDigite o produto a ser editado: "); editar = sc.nextInt();
		
		if(editar <= 0 || editar > this.produto.size()) {
			System.out.print("\nValor Inválido! Digite novamente!");
			do {
				System.out.print("Digite o produto a ser editado: "); editar = sc.nextInt();
			} while(editar <= 0 || editar > this.produto.size());
		}
		sc.nextLine();
		editar--;
		
		System.out.println("Digite a nova quantidade: ");
		qtd = sc.nextInt();
		if(qtd < 0) {
			System.out.print("\nValor Inválido! Digite novamente!");
			do {
				System.out.print("Digite o produto a ser editado: "); editar = sc.nextInt();
			} while(qtd < 0);
		}
		this.quantidade.set(editar, qtd);
		sc.nextLine();
		
		System.out.println("Digite a nova categoria: ");
		cat = sc.nextLine();
		this.categoria.set(editar, cat);
		
		this.dataCadastro.set(editar, data);
	}

	public ArrayList<Integer> getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(ArrayList<Integer> quantidade) {
		this.quantidade = quantidade;
	}

	public ArrayList<String> getCategoria() {
		return categoria;
	}

	public void setCategoria(ArrayList<String> categoria) {
		this.categoria = categoria;
	}

	public ArrayList<Date> getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(ArrayList<Date> dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public List<Produto> getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto.add(produto);
	}
}
