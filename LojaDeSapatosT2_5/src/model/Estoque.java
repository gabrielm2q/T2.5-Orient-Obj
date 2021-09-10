package model;
import java.util.*;

public class Estoque {
	
	private ArrayList<Integer> quantidade;
	private ArrayList<String> categoria;
	private ArrayList<Date> dataCadastro;
	private final List<Produto> produto;
	
	public Estoque() {
		this.quantidade = new ArrayList<>();
		this.categoria = new ArrayList<>();
		this.dataCadastro = new ArrayList<>();
		this.produto = new ArrayList<>();
	}

	public void cadastrar(int quantidade, String categoria, Date dataCadastro, Produto produto) {
		setQuantidade(quantidade);
		setCategoria(categoria);
		setDataCadastro(dataCadastro);
		setProduto(produto);
	}

	public void imprimir() {
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
		char sn;
		
		GregorianCalendar d = new GregorianCalendar();
		Date data = d.getTime();
		
		System.out.println("\nQual produto deseja editar?\n");
		for(i = 0; i < this.produto.size(); i++) {
			System.out.println("" + (i+1) + " - Nome do Produto: " + produto.get(i).getNome() + "; Quantidade: " + quantidade.get(i) + "; Categoria do Produto: " + categoria.get(i));
		}
		System.out.print("\nDigite o produto a ser editado:  "); editar = sc.nextInt();
		
		while(editar <= 0 || editar > this.produto.size()) { //Validando entrada
			System.out.print("\nValor Inválido!");
			System.out.print(" Digite o produto a ser editado:  "); editar = sc.nextInt();
		}
		sc.nextLine(); //Limpando o Buffer
		editar--; //Subtraindo em 1 para representar o index do dado que será alterado
		
		//Editando Quantidade
		System.out.print("Digite a nova quantidade:  "); qtd = sc.nextInt();
		while(qtd < 0) { //Validando entrada
			System.out.print("\nValor Inválido!");
			System.out.print(" Digite a nova quantidade:  "); qtd = sc.nextInt();
		}
		sc.nextLine(); //Limpando o Buffer
		this.quantidade.set(editar, qtd);
		
		//Editando Categoria
		System.out.print("Digite a nova categoria:  "); cat = sc.nextLine();
		this.categoria.set(editar, cat);
		
		//Editando produto
		System.out.print("(S/N) Deseja editar o produto?  "); sn = sc.nextLine().charAt(0);
		while(sn != 'S' & sn != 's' & sn != 'N' & sn != 'n') {
			System.out.print("\nValor inválido! Digite 'S' ou 'N'!");
			System.out.print("(S/N) Deseja editar o produto?  "); sn = sc.nextLine().charAt(0);
		}
		if(sn == 'S' || sn == 's') {
			if(produto.get(editar) instanceof Salto) { //Editando Salto
				System.out.println("");
				System.out.println("Digite o novo nome do salto: ");
				String nm = sc.nextLine();
				produto.get(editar).setNome(nm);
				
				System.out.println("Digite o novo tamanho do salto: ");
				int tam = sc.nextInt();
				produto.get(editar).setTamanho(tam);
				sc.nextLine(); //Limpando o buffer
				
				System.out.println("Digite o novo preço do salto: ");
				Double prc = sc.nextDouble();
				produto.get(editar).setPreco(prc);
				sc.nextLine(); //Limpando o buffer
				
				System.out.println("Digite a nova marca do salto: ");
				String mrc = sc.nextLine();
				produto.get(editar).setMarca(mrc);
				
				System.out.println("Digite a nova cor do salto: ");
				String cr = sc.nextLine();
				produto.get(editar).setCor(cr);
				
				System.out.println("Digite o novo material do salto: ");
				String mat = sc.nextLine();
				produto.get(editar).setMaterial(mat);
				
			} else if(produto.get(editar) instanceof Sapato) { //Editando Sapato
				System.out.println("");
				System.out.println("Digite o novo nome do sapato: ");
				String nm = sc.nextLine();
				produto.get(editar).setNome(nm);
				
				System.out.println("Digite o novo tamanho do sapato: ");
				int tam = sc.nextInt();
				produto.get(editar).setTamanho(tam);
				sc.nextLine(); //Limpando o buffer
				
				System.out.println("Digite o novo preço do sapato: ");
				Double prc = sc.nextDouble();
				produto.get(editar).setPreco(prc);
				sc.nextLine(); //Limpando o buffer
				
				System.out.println("Digite a nova marca do sapato: ");
				String mrc = sc.nextLine();
				produto.get(editar).setMarca(mrc);
				
				System.out.println("Digite a nova cor do sapato: ");
				String cr = sc.nextLine();
				produto.get(editar).setCor(cr);
				
				System.out.println("Digite o novo material do sapato: ");
				String mat = sc.nextLine();
				produto.get(editar).setMaterial(mat);
				
			} else if(produto.get(editar) instanceof Bota) { //Editando Bota
				System.out.println("");
				System.out.println("Digite o novo nome da bota: ");
				String nm = sc.nextLine();
				produto.get(editar).setNome(nm);
				
				System.out.println("Digite o novo tamanho da bota: ");
				int tam = sc.nextInt();
				produto.get(editar).setTamanho(tam);
				sc.nextLine(); //Limpando o buffer
				
				System.out.println("Digite o novo preço da bota: ");
				Double prc = sc.nextDouble();
				produto.get(editar).setPreco(prc);
				sc.nextLine(); //Limpando o buffer
				
				System.out.println("Digite a nova marca da bota: ");
				String mrc = sc.nextLine();
				produto.get(editar).setMarca(mrc);
				
				System.out.println("Digite a nova cor da bota: ");
				String cr = sc.nextLine();
				produto.get(editar).setCor(cr);
				
				System.out.println("Digite o novo material da bota: ");
				String mat = sc.nextLine();
				produto.get(editar).setMaterial(mat);
			
			} else if(produto.get(editar) instanceof Tenis) { //Editando Tênis
				System.out.println("");
				System.out.println("Digite o novo nome do tênis: ");
				String nm = sc.nextLine();
				produto.get(editar).setNome(nm);
				
				System.out.println("Digite o novo tamanho do tênis: ");
				int tam = sc.nextInt();
				produto.get(editar).setTamanho(tam);
				sc.nextLine(); //Limpando o buffer
				
				System.out.println("Digite o novo preço do tênis: ");
				Double prc = sc.nextDouble();
				produto.get(editar).setPreco(prc);
				sc.nextLine(); //Limpando o buffer
				
				System.out.println("Digite a nova marca do tênis: ");
				String mrc = sc.nextLine();
				produto.get(editar).setMarca(mrc);
				
				System.out.println("Digite a nova cor do tênis: ");
				String cr = sc.nextLine();
				produto.get(editar).setCor(cr);
				
				System.out.println("Digite o novo material do tênis: ");
				String mat = sc.nextLine();
				produto.get(editar).setMaterial(mat);
			
			} else {
				System.out.println("Erro!"); //Apenas por precaução, tendo em vista que todos as possibilidades possíveis foram contempladas
			}
		}
		
		//Editando automaticamente data de cadastro
		this.dataCadastro.set(editar, data);
		
		System.out.println("Produto editado!");
	}
	
	public void deletarProduto(Produto prod) { //Quando um produto for deletado de Dados, ele será deletado em Estoque através desse método (chamado em Dados)
		int i;
		int index = -1;
		for(i = 0; i < produto.size(); i++) { //Encontrando o index do produto a ser deletado
			if(prod.equals(produto.get(i))) {
				index = i;
			}
		}
		if(index != -1) { //Deletando todos os dados do produto das ArrayLists e Lists
			produto.remove(index);
			quantidade.remove(index);
			categoria.remove(index);
			dataCadastro.remove(index);
		}
	}

	@Override
	public String toString() {
		return "Estoque [quantidade=" + quantidade + ", categoria=" + categoria + ", dataCadastro=" + dataCadastro
				+ ", produto=" + produto + "]";
	}

	public ArrayList<Integer> getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade.add(quantidade);
	}

	public ArrayList<String> getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria.add(categoria);
	}

	public ArrayList<Date> getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro.add(dataCadastro);
	}

	public List<Produto> getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto.add(produto);
	}
}
