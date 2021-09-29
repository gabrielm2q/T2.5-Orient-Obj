package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import control.ControleCliente;
import control.ControleFuncionario;

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

	public static void fillWithSomeData() {
		Random aleatorio = new Random();
		Date d = Calendar.getInstance().getTime();
		Endereco ender = new Endereco();

		// Gerando Clientes Aleatórios
		ControleCliente cliCtrl = new ControleCliente();
		for (int i = 0; i < 5; i++) {
			ender.setCep(aleatorio.nextInt(99999));
			ender.setCidade("Cidade " + aleatorio.nextInt(99));
			ender.setUf("DF");
			ender.setNomeRua("Rua " + aleatorio.nextInt(999));
			ender.setNumero(aleatorio.nextInt(9999));
			ender.setQuadra(aleatorio.nextInt(999));
			ender.setBairro("Setor " + aleatorio.nextInt(9999));
			ender.setNumApart(aleatorio.nextInt(75));
			ender.setComplemento("Próximo a Casa Número " + aleatorio.nextInt(99));
			cliCtrl.cadastrarCliente(ender, "Cliente" + aleatorio.nextInt(200), 'O', d,
					aleatorio.nextInt(999) + "." + aleatorio.nextInt(999) + "." + aleatorio.nextInt(999) + "-"
							+ aleatorio.nextInt(99),
					"(" + aleatorio.nextInt(99) + ") 9" + aleatorio.nextInt(9999) + "-" + aleatorio.nextInt(9999),
					"Cliente" + aleatorio.nextInt(999) + "@bol.com.br");

		}

		// Gerando Funcionários Aleatórios
		ControleFuncionario funCtrl = new ControleFuncionario();
		for (int i = 0; i < 5; i++) {
			ender.setCep(aleatorio.nextInt(99999));
			ender.setCidade("Cidade " + aleatorio.nextInt(99));
			ender.setUf("DF");
			ender.setNomeRua("Rua " + aleatorio.nextInt(999));
			ender.setNumero(aleatorio.nextInt(9999));
			ender.setQuadra(aleatorio.nextInt(999));
			ender.setBairro("Setor " + aleatorio.nextInt(9999));
			ender.setNumApart(aleatorio.nextInt(75));
			ender.setComplemento("Próximo a Casa Número " + aleatorio.nextInt(99));
			funCtrl.cadastrarFuncionario(ender, "Funcionario" + aleatorio.nextInt(200), d,
					aleatorio.nextInt(999) + "." + aleatorio.nextInt(999) + "." + aleatorio.nextInt(999) + "-"
							+ aleatorio.nextInt(99),
					"(" + aleatorio.nextInt(99) + ") 9" + aleatorio.nextInt(9999) + "-" + aleatorio.nextInt(9999), d,
					"Outros", (aleatorio.nextInt(23) + 1), (aleatorio.nextInt(23) + 1));

		}

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