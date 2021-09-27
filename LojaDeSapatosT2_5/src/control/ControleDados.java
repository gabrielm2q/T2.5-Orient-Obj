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

	public void setCliente(Cliente clie) {
		data.setCliente(clie);
	}

	public ArrayList<Funcionario> getFuncionario() {
		return data.getFuncionario();
	}

	public void setFuncionario(Funcionario funci) {
		data.setFuncionario(funci);
	}

	public ArrayList<Venda> getVenda() {
		return data.getVenda();
	}

	public void setVenda(Venda ven) {
		data.setVenda(ven);
	}

	public ArrayList<Endereco> getEnderecoCliente() {
		return data.getEnderecoCliente();
	}

	public void setEnderecoCliente(Endereco ende) {
		data.setEnderecoCliente(ende);
	}

	public ArrayList<Endereco> getEnderecoFuncionario() {
		return data.getEnderecoFuncionario();
	}

	public void setEnderecoFuncionario(Endereco ende) {
		data.setEnderecoFuncionario(ende);
	}

	public Endereco getEnderecoLoja() {
		return data.getEnderecoLoja();
	}

	public void setEnderecoLoja(int cep, String cidade, String uf, String rua, int num, int qd, String bairro,
			int Apart, String comp) {
		data.setEnderecoLoja(cep, cidade, uf, rua, num, qd, bairro, Apart, comp);
	}

	public List<Produto> getProduto() {
		return data.getProduto();
	}

	public void setProduto(Produto prod) {
		data.setProduto(prod);
	}

}
