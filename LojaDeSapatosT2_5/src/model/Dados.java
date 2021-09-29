package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Dados {
	private static final Loja loja = new Loja();
	private static final List<Cliente> cliente = new ArrayList<>();
	private static final List<Funcionario> funcionario = new ArrayList<>();
	private static final List<Venda> venda = new ArrayList<>();
	private static final Estoque estoque = new Estoque();

	private Dados() {

	}

	public static Loja getLoja() {
		return loja;
	}

	public static List<Cliente> getCliente() {
		return cliente;
	}

	public static List<Funcionario> getFuncionario() {
		return funcionario;
	}

	public static List<Venda> getVenda() {
		return venda;
	}

	public static Estoque getEstoque() {
		return estoque;
	}

}