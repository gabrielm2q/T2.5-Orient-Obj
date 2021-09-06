package negocio;
import java.util.*;
import java.text.*;

public class Teste {
	static Cliente cl;
	static Cliente cl2;
	static Endereco end;

	public static void main(String[] args){
		
		GregorianCalendar d = new GregorianCalendar();
		Date dat = d.getTime();
		
		end = new Endereco();
		end.setCep(70000000);
		end.setCidade("Cidade");
		end.setUf("GO");
		end.setNomeRua("Rua");
		end.setNumero(11);
		end.setQuadra(04);
		end.setBairro("Centro");
		end.setNumApart(11);
		end.setComplemento("Casa Amarela");
		
		
		cl = new Cliente();
		cl.cadastrar(end, "Felipe", 'M', dat, "111.111.111-11", "(61) 91111-1111", "felipe@gmail.com");
		cl.ler();
		
		cl2 = new Cliente();
		cl2.cadastrar(end, "Joana", 'F', dat, "222.222.222-22", "(61) 92222-2222", "joana@gmail.com");
		cl2.ler();
		cl2.editar(end, "Joanna", 'F', dat, "222.222.222-11", "(61) 92222-2121", "joanna@gmail.com");
		cl2.ler();
		cl2.deletar();
		cl2.ler();
	}

}

