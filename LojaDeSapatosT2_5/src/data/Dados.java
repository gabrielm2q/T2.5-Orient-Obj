package data;
import java.util.ArrayList;
import java.util.List;

import model.Bota;
import model.Cliente;
import model.Endereco;
import model.Funcionario;
import model.Pagamento;
import model.Salto;
import model.Sapato;
import model.Tenis;
import model.Venda;
import model.Loja;

public class Dados {
	private ArrayList<Cliente> cliente;
	private ArrayList<Funcionario> funcionario;
	private ArrayList<Venda> venda;
	private ArrayList<Endereco> endereco;
	private ArrayList<Loja> loja;
	

	public Dados() {
		cliente = new ArrayList<>();
		funcionario = new ArrayList<>();
		venda = new ArrayList<>();
		endereco = new ArrayList<>();
		loja = new ArrayList<>();
	}

}
