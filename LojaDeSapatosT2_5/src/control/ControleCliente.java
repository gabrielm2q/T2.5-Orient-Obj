package control;

import java.util.ArrayList;
import java.util.Date;

import model.Cliente;
import model.Endereco;

public class ControleCliente {
	private ArrayList<String> nomeClientes;
	private ControleDados dadosCliente;
	private Cliente cli;

	public ControleCliente() {
		cli = new Cliente();
		dadosCliente = new ControleDados();
		this.nomeClientes = new ArrayList<>();
		this.setNomeClientes(dadosCliente.getCliente());
		this.nomeClientes.add("João");
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
		this.nomeClientes.add(nome);
		this.nomeClientes.add("Maria");
	}

	public String[] getNomeClientes() {
		String[] listaNomes = new String[nomeClientes.size()];

		for (int i = 0; i < nomeClientes.size(); i++) {
			listaNomes[i] = nomeClientes.get(i);
		}

		return listaNomes;
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
