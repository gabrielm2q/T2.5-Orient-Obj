package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import control.ControleCliente;
import control.ControleEstoque;
import control.ControleFuncionario;
import control.ControleLoja;
import control.ControleVenda;

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

		// Gerando Clientes Aleatórios
		ControleCliente cliCtrl = new ControleCliente();
		for (int i = 0; i < 5; i++) {
			Endereco ender = new Endereco();

			ender.setCep(aleatorio.nextInt(88888888) + 10000000);
			ender.setCidade("Cidade " + aleatorio.nextInt(99));
			ender.setUf("DF");
			ender.setNomeRua("Rua " + aleatorio.nextInt(999));
			ender.setNumero(aleatorio.nextInt(9999));
			ender.setQuadra(aleatorio.nextInt(999));
			ender.setBairro("Setor " + aleatorio.nextInt(9999));
			ender.setNumApart(aleatorio.nextInt(75));
			ender.setComplemento("Próximo a Casa Número " + aleatorio.nextInt(99));
			cliCtrl.cadastrarCliente(ender, "Cliente" + aleatorio.nextInt(200), 'O', d,
					(aleatorio.nextInt(899) + 100) + "." + (aleatorio.nextInt(899) + 100) + "."
							+ (aleatorio.nextInt(899) + 100) + "-" + (aleatorio.nextInt(89) + 10),
					(aleatorio.nextInt(89) + 10) + "9" + (aleatorio.nextInt(89999999) + 10000000),
					"Cliente" + aleatorio.nextInt(999) + "@bol.com.br");

		}

		// Gerando Funcionários Aleatórios
		ControleFuncionario funCtrl = new ControleFuncionario();
		for (int i = 0; i < 5; i++) {
			Endereco ender = new Endereco();

			ender.setCep(aleatorio.nextInt(88888888) + 10000000);
			ender.setCidade("Cidade " + aleatorio.nextInt(9));
			ender.setUf("DF");
			ender.setNomeRua("Rua " + aleatorio.nextInt(999));
			ender.setNumero(aleatorio.nextInt(9999));
			ender.setQuadra(aleatorio.nextInt(999));
			ender.setBairro("Setor " + aleatorio.nextInt(9999));
			ender.setNumApart(aleatorio.nextInt(75));
			ender.setComplemento("Próximo a Casa Número " + aleatorio.nextInt(99));
			funCtrl.cadastrarFuncionario(ender, "Funcionario" + aleatorio.nextInt(200), d,
					(aleatorio.nextInt(899) + 100) + "." + (aleatorio.nextInt(899) + 100) + "."
							+ (aleatorio.nextInt(899) + 100) + "-" + (aleatorio.nextInt(89) + 10),
					(aleatorio.nextInt(89) + 10) + "9" + (aleatorio.nextInt(89999999) + 10000000), d, "Outros",
					(aleatorio.nextInt(23) + 1), (aleatorio.nextInt(23) + 1));
		}

		// Gerando produtos aleatórios
		ControleEstoque estCtrl = new ControleEstoque();
		for (int i = 0; i < 4; i++) {
			Salto salto = new Salto();
			Sapato sapato = new Sapato();
			Tenis tenis = new Tenis();
			Bota bota = new Bota();

			salto.setIdProd(getContadorIdProd());
			salto.setNome("Salto " + aleatorio.nextInt(45)); // Salto Aleatorio
			salto.setTamanho(aleatorio.nextInt(45) + i);
			salto.setPreco(aleatorio.nextInt(500) + 100.1 + i);
			salto.setMarca("Marca " + aleatorio.nextInt(50) + i);
			salto.setPaisOrigem("Pais " + aleatorio.nextInt(9) + i);
			salto.setTempoGarantia(aleatorio.nextInt(3) + i + " anos");
			salto.setGenero('U');
			salto.setCodBarras(Integer.toBinaryString(aleatorio.nextInt(30) + i));
			salto.setCor("Cor " + aleatorio.nextInt(9) + i);
			salto.setMaterial("Material " + aleatorio.nextInt(9) + i);
			salto.setTipoSalto("Scarpin");
			salto.setCorExterna("Cor " + aleatorio.nextInt(5) + i);
			salto.setCorSolado("Cor " + aleatorio.nextInt() + i);
			salto.setAlturaSalto(aleatorio.nextInt(10) + i + " cm");
			estCtrl.cadastrarProduto(aleatorio.nextInt(999), "Salto", d, salto);
			Dados.incrementarIdProd();

			sapato.setIdProd(getContadorIdProd());
			sapato.setNome("Sapato " + aleatorio.nextInt(45)); // Sapato Aleatorio
			sapato.setTamanho(aleatorio.nextInt(45) + i);
			sapato.setPreco(aleatorio.nextInt(500) + 100.1 + i);
			sapato.setMarca("Marca " + aleatorio.nextInt(50) + i);
			sapato.setPaisOrigem("Pais " + aleatorio.nextInt(9) + i);
			sapato.setTempoGarantia(aleatorio.nextInt(3) + i + " anos");
			sapato.setGenero('U');
			sapato.setCodBarras(Integer.toBinaryString(aleatorio.nextInt(30) + i));
			sapato.setCor("Cor " + aleatorio.nextInt(9) + i);
			sapato.setMaterial("Material " + aleatorio.nextInt(9) + i);
			sapato.setMaterialSolado("Couro Tipo " + aleatorio.nextInt(9) + i);
			sapato.setMaterialInterno("Algodão " + aleatorio.nextInt(9) + i);
			sapato.setTipoBico("Quadrado");
			sapato.setAlturaSalto("Baixo");
			sapato.setTipoPalmilha("Comum");
			estCtrl.cadastrarProduto(aleatorio.nextInt(999), "Sapato", d, sapato);
			Dados.incrementarIdProd();

			tenis.setIdProd(getContadorIdProd());
			tenis.setNome("Tenis " + aleatorio.nextInt(45)); // Tenis Aleatorio
			tenis.setTamanho(aleatorio.nextInt(45) + i);
			tenis.setPreco(aleatorio.nextInt(500) + 100.1 + i);
			tenis.setMarca("Marca " + aleatorio.nextInt(50) + i);
			tenis.setPaisOrigem("Pais " + aleatorio.nextInt(9) + i);
			tenis.setTempoGarantia(aleatorio.nextInt(3) + i + " anos");
			tenis.setGenero('U');
			tenis.setCodBarras(Integer.toBinaryString(aleatorio.nextInt(30) + i));
			tenis.setCor("Cor " + aleatorio.nextInt(9) + i);
			tenis.setMaterial("Material " + aleatorio.nextInt(9) + i);
			tenis.setAtvdIndicada("Corrida");
			tenis.setTecnoSolado("Tech0" + aleatorio.nextInt(9) + i);
			tenis.setTipoPisada("Supinada");
			tenis.setTipoPalmilha("Gel0" + aleatorio.nextInt(5) + i);
			tenis.setPeso(aleatorio.nextDouble() * 100);
			tenis.setTipoAmarracao("Cadarco");
			tenis.setCorCadarco("Azul0" + aleatorio.nextInt(8) + i);
			estCtrl.cadastrarProduto(aleatorio.nextInt(999), "Tênis", d, tenis);
			Dados.incrementarIdProd();

			bota.setIdProd(getContadorIdProd());
			bota.setNome("Bota " + aleatorio.nextInt(45)); // Bota Aleatoria
			bota.setTamanho(aleatorio.nextInt(45) + i);
			bota.setPreco(aleatorio.nextInt(500) + 100.1 + i);
			bota.setMarca("Marca " + aleatorio.nextInt(50) + i);
			bota.setPaisOrigem("Pais " + aleatorio.nextInt(9) + i);
			bota.setTempoGarantia(aleatorio.nextInt(3) + i + " anos");
			bota.setGenero('U');
			bota.setCodBarras(Integer.toBinaryString(aleatorio.nextInt(30) + i));
			bota.setCor("Cor " + aleatorio.nextInt(9) + i);
			bota.setMaterial("Material " + aleatorio.nextInt(9) + i);
			bota.setModelo("Americana" + aleatorio.nextInt(8) + i);
			bota.setAlturaCano("Alto");
			bota.setTipoSalto("Baixo");
			bota.setTipoPalmilha("EVA 0" + aleatorio.nextInt(9) + i);
			bota.setMaterialSolado("Borracha" + aleatorio.nextInt(10) + i);
			estCtrl.cadastrarProduto(aleatorio.nextInt(999), "Bota", d, bota);
			Dados.incrementarIdProd();
		}

		// Gerando vendas aleatórias
		ControleVenda venCtrl = new ControleVenda();

		for (int i = 0; i < 5; i++) {
			Venda venda = new Venda();
			Pagamento pag = new Pagamento();

			venda.setCliente(Dados.getCliente().get(i));
			venda.setFuncionario(Dados.getFuncionario().get(i));
			venda.setDataPedido(d);
			venda.setProduto(Dados.getEstoque().getProduto().get(i));
			venda.setQtdVendida(1);
			venda.setValorDesconto(10.5);
			venda.setValorVenda(Dados.getEstoque().getProduto().get(i).getPreco() - 10.5);
			pag.setDataPag(venda.getDataPedido());
			pag.setFormaPag("A vista");
			pag.setNumParcelas(0);
			pag.setValorPago(venda.getValorVenda());
			venda.setIdVenda(Dados.contadorIdVenda);
			venCtrl.cadastrarVenda(venda.getIdVenda(), venda.getValorVenda(), venda.getValorDesconto(),
					venda.getDataPedido(), venda.getFuncionario(), venda.getCliente(), venda.getProduto(), pag,
					venda.getQtdVendida());

			// Diminuindo a quantidade do produto vendido no estoque da quantidade comprada
			int qtdFinal = Dados.getEstoque().getQuantidade().get(i) - venda.getQtdVendida();
			Dados.getEstoque().getQuantidade().set(i, qtdFinal);
		}

		// Inserindo dados aleatórios na loja
		ControleLoja ctrlLoja = new ControleLoja();
		Endereco ender = new Endereco();

		ender.setCep(aleatorio.nextInt(89999999) + 10000000); // Endereco aleatorio
		ender.setCidade("Cidade " + aleatorio.nextInt(9));
		ender.setUf("DF");
		ender.setNomeRua("Rua " + aleatorio.nextInt(999));
		ender.setNumero(aleatorio.nextInt(9999));
		ender.setQuadra(aleatorio.nextInt(999));
		ender.setBairro("Setor " + aleatorio.nextInt(9999));
		ender.setComplemento("Próximo a Casa Número " + aleatorio.nextInt(99));
		String cnpjAle = (aleatorio.nextInt(89) + 10) + "." + (aleatorio.nextInt(899) + 100) + "."
				+ (aleatorio.nextInt(899) + 100) + "/0001" + "-" + (aleatorio.nextInt(89) + 10);
		ctrlLoja.editarLoja("Lojas " + aleatorio.nextInt(9) + ".0", cnpjAle, 8, 20, "www.essesitenaoexiste.com",
				Dados.getFuncionario(), Dados.getEstoque(), ender);

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