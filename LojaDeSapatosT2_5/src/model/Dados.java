package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import control.ControleCliente;
import control.ControleEstoque;
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
			ender.setCidade("Cidade " + aleatorio.nextInt(9));
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

		// Gerando produtos aleatórios
		ControleEstoque estCtrl = new ControleEstoque();
		Salto salto = new Salto();
		Sapato sapato = new Sapato();
		Tenis tenis = new Tenis();
		Bota bota = new Bota();
		for (int i = 0; i < 3; i++) {
			salto.setIdProd(getContadorIdProd());
			salto.setNome("Salto " + aleatorio.nextInt(50)); // Salto Aleatorio
			salto.setTamanho(aleatorio.nextInt(45) + 1);
			salto.setPreco(aleatorio.nextInt(500) + 100.1);
			salto.setMarca("Marca " + aleatorio.nextInt(50));
			salto.setPaisOrigem("Pais " + aleatorio.nextInt(9));
			salto.setTempoGarantia(aleatorio.nextInt(3) + " anos");
			salto.setGenero('U');
			salto.setCodBarras(Integer.toBinaryString(aleatorio.nextInt(30)));
			salto.setCor("Cor " + aleatorio.nextInt(9));
			salto.setMaterial("Material " + aleatorio.nextInt(9));
			salto.setTipoSalto("Scarpin");
			salto.setCorExterna("Cor " + aleatorio.nextInt(5));
			salto.setCorSolado("Cor " + aleatorio.nextInt());
			salto.setAlturaSalto(aleatorio.nextInt(10) + " cm");
			estCtrl.cadastrarProduto(aleatorio.nextInt(999), "Salto", d, salto);
			Dados.incrementarIdProd();

			sapato.setIdProd(getContadorIdProd());
			sapato.setNome("Sapato " + aleatorio.nextInt(50)); // Sapato Aleatorio
			sapato.setTamanho(aleatorio.nextInt(45) + 1);
			sapato.setPreco(aleatorio.nextInt(500) + 100.1);
			sapato.setMarca("Marca " + aleatorio.nextInt(50));
			sapato.setPaisOrigem("Pais " + aleatorio.nextInt(9));
			sapato.setTempoGarantia(aleatorio.nextInt(3) + " anos");
			sapato.setGenero('U');
			sapato.setCodBarras(Integer.toBinaryString(aleatorio.nextInt(30)));
			sapato.setCor("Cor " + aleatorio.nextInt(9));
			sapato.setMaterial("Material " + aleatorio.nextInt(9));
			sapato.setMaterialSolado("Couro Tipo " + aleatorio.nextInt(9));
			sapato.setMaterialInterno("Algodão " + aleatorio.nextInt(9));
			sapato.setTipoBico("Quadrado");
			sapato.setAlturaSalto("Baixo");
			sapato.setTipoPalmilha("Comum");
			estCtrl.cadastrarProduto(aleatorio.nextInt(999), "Sapato", d, sapato);
			Dados.incrementarIdProd();

			tenis.setIdProd(getContadorIdProd());
			tenis.setNome("Tenis " + aleatorio.nextInt(50)); // Tenis Aleatorio
			tenis.setTamanho(aleatorio.nextInt(45) + 1);
			tenis.setPreco(aleatorio.nextInt(500) + 100.1);
			tenis.setMarca("Marca " + aleatorio.nextInt(50));
			tenis.setPaisOrigem("Pais " + aleatorio.nextInt(9));
			tenis.setTempoGarantia(aleatorio.nextInt(3) + " anos");
			tenis.setGenero('U');
			tenis.setCodBarras(Integer.toBinaryString(aleatorio.nextInt(30)));
			tenis.setCor("Cor " + aleatorio.nextInt(9));
			tenis.setMaterial("Material " + aleatorio.nextInt(9));
			tenis.setAtvdIndicada("Corrida");
			tenis.setTecnoSolado("Tech0" + aleatorio.nextInt(9));
			tenis.setTipoPisada("Supinada");
			tenis.setTipoPalmilha("Gel0" + aleatorio.nextInt(5));
			tenis.setPeso(aleatorio.nextDouble() * 100);
			tenis.setTipoAmarracao("Cadarco");
			tenis.setCorCadarco("Azul0" + aleatorio.nextInt(8));
			estCtrl.cadastrarProduto(aleatorio.nextInt(999), "Tênis", d, tenis);
			Dados.incrementarIdProd();

			bota.setIdProd(getContadorIdProd());
			bota.setNome("Bota " + aleatorio.nextInt(50)); // Bota Aleatoria
			bota.setTamanho(aleatorio.nextInt(45) + 1);
			bota.setPreco(aleatorio.nextInt(500) + 100.1);
			bota.setMarca("Marca " + aleatorio.nextInt(50));
			bota.setPaisOrigem("Pais " + aleatorio.nextInt(9));
			bota.setTempoGarantia(aleatorio.nextInt(3) + " anos");
			bota.setGenero('U');
			bota.setCodBarras(Integer.toBinaryString(aleatorio.nextInt(30)));
			bota.setCor("Cor " + aleatorio.nextInt(9));
			bota.setMaterial("Material " + aleatorio.nextInt(9));
			bota.setModelo("Americana" + aleatorio.nextInt(8));
			bota.setAlturaCano("Alto");
			bota.setTipoSalto("Baixo");
			bota.setTipoPalmilha("EVA 0" + aleatorio.nextInt(9));
			bota.setMaterialSolado("Borracha" + aleatorio.nextInt(10));
			estCtrl.cadastrarProduto(aleatorio.nextInt(999), "Bota", d, bota);
			Dados.incrementarIdProd();
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