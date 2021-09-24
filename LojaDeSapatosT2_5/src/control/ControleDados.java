package control;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;
import model.Dados;
import model.Endereco;
import model.Funcionario;
import model.Produto;
import model.Venda;

public class ControleDados {
	private Dados data = new Dados();

	public ControleDados() {

	}

	public Dados getData() {
		return data;
	}

	public void setData(Dados data) {
		this.data = data;
	}

	public ArrayList<Cliente> getCliente() {
		return data.getCliente();
	}

	public ArrayList<Funcionario> getFuncionario() {
		return data.getFuncionario();
	}

	public ArrayList<Venda> getVenda() {
		return data.getVenda();
	}

	public ArrayList<Endereco> getEndereco() {
		return data.getEndereco();
	}

	public List<Produto> getProduto() {
		return data.getProduto();
	}

	public boolean cadastrarCliente() {
		return true;
	}

}
