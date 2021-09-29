package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Dados {
	private static final Loja loja = new Loja();
	private static final List<Cliente> cliente = new ArrayList<>();
	private static final List<Funcionario> funcionario = new ArrayList<>();
	private static final List<Venda> venda = new ArrayList<>();
	private static final Estoque estoque = new Estoque();
	private static int contadorIdProd = 1;
	private static int contadorIdVenda = 1;

	private Dados() {

	}

	public static void incrementarIdProd() {
		contadorIdProd++;
	}

	public static void incrementarIdVenda() {
		contadorIdVenda++;
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

	public static int getContadorIdProd() {
		return contadorIdProd;
	}

	public static int getContadorIdVenda() {
		return contadorIdVenda;
	}

}