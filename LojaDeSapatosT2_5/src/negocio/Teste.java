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
		end.setCep(73850000);
		end.setCidade("Cristalina");
		end.setUf("GO");
		end.setNomeRua("Rua dos Cristais");
		end.setNumero(17);
		end.setQuadra(01);
		end.setBairro("Setor Sul I");
		end.setNumApart(17);
		end.setComplemento("Próximo ao SESAL");
		
		
		cl = new Cliente(end, "John", 'M', dat, "000.000.000-00", "(99) 99999-9999", "john@gmail.com");
		
		System.out.println(cl.toString());
	}

}

