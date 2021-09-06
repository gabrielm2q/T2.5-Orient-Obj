package negocio;
import java.util.*;
import java.text.*;

public class Teste {
	static Cliente cl;
	static Cliente cl2;
	static Endereco end;
	static Endereco end2;
	static Funcionario fun;
	static Pagamento pag;
	static Tenis ten;
	static Sapato sap;
	static Bota bot;
	static Salto sal;

	public static void main(String[] args){
		
		GregorianCalendar d = new GregorianCalendar();
		Date dat = d.getTime();
		
		end = new Endereco();
		end.cadastrar(70000000, "Ciudad", "PR", "Rua JK", 15, 04, "Centro", 00, "Casa Amarela");
		
		end2 = new Endereco();
		end2.cadastrar(73333000, "Cidade", "RS", "Rua GV", 16, 05, "Centro", 16, "Casa Verde");
		
		
		cl = new Cliente();
		cl.cadastrar(end, "Felipe", 'M', dat, "111.111.111-11", "(61) 91111-1111", "felipe@gmail.com");
		cl.ler();
		
		cl2 = new Cliente();
		cl2.cadastrar(end2, "Joana", 'F', dat, "222.222.222-22", "(61) 92222-2222", "joana@gmail.com");
		cl2.ler();
		
		fun = new Funcionario();
		fun.cadastrar("João", dat, "333.333.333-33", "(61) 93333-3333", dat, "Integral", 8, 17, end2);
		fun.ler();
		
		pag = new Pagamento();
		pag.cadastrar(200.5f, "Débito", dat, 0);
		pag.ler();
		
		ten = new Tenis();
		ten.cadastrar(1, "Run 7", 41, 210.5f, "Asics", "Taiwan", "1 ano", 'M', "00010001", "Tecido Mash", 
					  "Vermelho", "Corrida", "Gel", "Pronada", "Gel", 250.1f, "Cadarço", "Azul");
		ten.ler();
		
		sap = new Sapato();
		sap.cadastrar(2, "Mocassim", 42, 200.99f, "Democrata", "Brasil", "1 ano", 'U', "11101110", "Nappa", "Preto", "Borracha", "Espuma", "Quadrado", "Baixo", "Comum");
		sap.ler();
		
		bot = new Bota();
		bot.cadastrar(3, "Botina", 43, 152.8f, "Rio Branco", "Brasil", "2 anos", 'U', "10101010", "Couro", "Marrom", "Trabalho", "Médio", "Pequeno", "Não possui", "Borracha");
		bot.ler();
		
		sal = new Salto();
		sal.cadastrar(4, "Salto Alto", 40, 500.0f, "Schutz", "Brasil", "2 anos", 'F', "01010101", "Couro Orgânico", "Bege", "Scarpin", "Bege", "Vermelho", "Alto");
		sal.ler();
	}

}

