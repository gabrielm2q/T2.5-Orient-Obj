package control;

import java.util.ArrayList;
import java.util.Date;

import model.Cliente;
import model.Endereco;

public class ControleCliente {
	private ArrayList<String> nomeClientes;
	private ControleDados dadosCliente = new ControleDados();
	private Cliente cli = new Cliente();

	public ControleCliente() {
		this.nomeClientes = new ArrayList<>();
		this.setNomeClientes(dadosCliente.getCliente());
		nomeClientes.add("Julia");
		nomeClientes.add("Pedro");
		nomeClientes.add("Fernanda");
	}

	public void cadastrarCliente(Endereco endereco, String nome, char genero, Date dataNasc, String cpf,
			String telefone, String email) {
		cli.setEndereco(endereco);
		cli.setNome(nome);
		cli.setGenero(genero);
		cli.setDataNasc(dataNasc);
		cli.setCpf(cpf);
		cli.setTelefone(telefone);
		cli.setEmail(email);
		dadosCliente.setCliente(cli);
	}

	public ArrayList<String> getNomeClientes() {
		return nomeClientes;
	}

	public void setNomeClientes(ArrayList<Cliente> cliente) {
		for (int i = 0; i < cliente.size(); i++) {
			this.nomeClientes.add(cliente.get(i).getNome());
		}
	}

	public ControleDados getDadosCliente() {
		return dadosCliente;
	}

	public void setDadosCliente(ControleDados dadosCliente) {
		this.dadosCliente = dadosCliente;
	}

	public Cliente getCli() {
		return cli;
	}

	public void setCli(Cliente cli) {
		this.cli = cli;
	}

}
