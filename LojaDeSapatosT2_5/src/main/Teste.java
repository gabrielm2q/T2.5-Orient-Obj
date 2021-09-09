package main;
import java.util.*;

import model.*;
import data.Dados;

public class Teste {
	

	public static void main(String[] args){
		Cliente cl;
		Cliente cl2;
		Endereco end;
		Endereco end2;
		Funcionario fun;
		Funcionario fun2;
		Pagamento pag;
		Pagamento pag2;
		Tenis ten;
		Sapato sap;
		Bota bot;
		Salto sal;
		Estoque est;
		Loja loj;
		Venda ven;
		Dados dado;
		
		GregorianCalendar d = new GregorianCalendar();
		Date dat = d.getTime();
		
		dado = new Dados();
		
		
		
		
		end = new Endereco();
		end.cadastrar(70000000, "Ciudad", "PR", "Rua JK", 15, 04, "Centro", 00, "Casa Amarela");
		//end.ler();
		
		end2 = new Endereco();
		end2.cadastrar(73333000, "Cidade", "RS", "Rua GV", 16, 05, "Centro", 16, "Casa Verde");
		//end2.ler();
		
		dado.addEndereco(end);
		dado.addEndereco(end2);
		dado.imprimirEnderecos();
		
		
		
		
		cl = new Cliente();
		cl.cadastrar(end, "Felipe", 'M', dat, "111.111.111-11", "(61) 91111-1111", "felipe@gmail.com");
		//cl.ler();
		
		cl2 = new Cliente();
		cl2.cadastrar(end2, "Joana", 'F', dat, "222.222.222-22", "(61) 92222-2222", "joana@gmail.com");
		//cl2.ler();
		
		dado.addCliente(cl);
		dado.addCliente(cl2);
		dado.imprimirClientes();
		
		
		
		
		fun = new Funcionario();
		fun.cadastrar("João", dat, "333.333.333-33", "(61) 93333-3333", dat, "Integral", 8, 17, end2);
		
		fun2 = new Funcionario();
		fun2.cadastrar("Mário", dat, "444.444.444-44", "(61) 94444-4444", dat, "Matutino", 8, 12, end);
		//fun.ler();
		
		dado.addFuncionario(fun);
		dado.addFuncionario(fun2);
		dado.imprimirFuncionarios();		
		
		
		
		
		ArrayList<Integer> qtdVend = new ArrayList<>();
		final List<Produto> prod = new ArrayList<>();
		
		ten = new Tenis();
		ten.cadastrar(1, "Run 7", 41, 210.5, "Asics", "Taiwan", dat, 'M', "00010001", "Tecido Mash", 
					  "Vermelho", "Corrida", "Gel", "Pronada", "Gel", 250.1, "Cadarço", "Azul");
		prod.add(ten);
		qtdVend.add(1);
		//ten.ler();
		
		sap = new Sapato();
		sap.cadastrar(2, "Mocassim", 42, 200.99, "Democrata", "Brasil", dat, 'U', "11101110", "Nappa", "Preto", "Borracha", "Espuma", "Quadrado", "Baixo", "Comum");
		prod.add(sap);
		qtdVend.add(1);
		
		bot = new Bota();
		bot.cadastrar(3, "Botina", 43, 152.8, "Rio Branco", "Brasil", dat, 'U', "10101010", "Couro", "Marrom", "Trabalho", "Médio", "Pequeno", "Não possui", "Borracha");
		prod.add(bot);
		qtdVend.add(1);
		
		sal = new Salto();
		sal.cadastrar(4, "Salto Alto", 40, 500.0, "Schutz", "Brasil", dat, 'F', "01010101", "Couro Orgânico", "Bege", "Scarpin", "Bege", "Vermelho", "Alto");
		prod.add(sal);
		qtdVend.add(1);
		
		dado.addProduto(sal);
		dado.addProduto(bot);
		dado.addProduto(sap);
		dado.addProduto(ten);
		dado.imprimirProdutos();
		
		ArrayList<Pagamento> pagmt = new ArrayList<>();
		
		pag = new Pagamento();
		pag.cadastrar(500.0, "Débito", dat, 0);
		
		pag2 = new Pagamento();
		pag2.cadastrar(500.0, "Crédito", dat, 5);
		
		pagmt.add(pag);
		pagmt.add(pag2);
		
		
		
		
		ven = new Venda();
		ven.cadastrar(1064.29, 64.29, dat, fun, prod, pagmt, qtdVend);
		
		dado.addVenda(ven);
		dado.imprimirVendas();
		
		
		
		
		est = new Estoque();
		est.cadastrar(10, "Tênis", dat, ten);
		est.cadastrar(20, "Sapatos", dat, sap);
		est.cadastrar(30, "Bota", dat, bot);
		est.cadastrar(40, "Salto", dat, sal);
		est.ler();
		
		loj = new Loja();
		loj.cadastrar("Casas Americanas", 34684354, 8, 18, "www.google.com", end, est, fun);
		loj.ler();
		
				
	}

}

