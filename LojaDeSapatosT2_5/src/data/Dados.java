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

}