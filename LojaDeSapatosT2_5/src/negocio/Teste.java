package negocio;
import java.util.*;
import java.text.*;

public class Teste {
	static Cliente cl;
	static Endereco end;

	public static void main(String[] args) {
		
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
		
		
		cl = new Cliente(end, "John", 'M', dat, "000.000.000-00", "(99) 99999-9999", "john@gmail.com");
		
		System.out.println(cl.toString());
	}

}

