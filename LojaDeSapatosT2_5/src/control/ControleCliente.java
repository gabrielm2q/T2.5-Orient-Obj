package control;

import java.util.ArrayList;
import java.util.Date;

import model.Cliente;
import model.Endereco;

public class ControleCliente {
	private ArrayList<String> nomeClientes = new ArrayList<>();
	private ControleDados dados = new ControleDados();
	private Endereco end = new Endereco();

	public ControleCliente(ControleDados d) {
		Date dat = new Date();
		this.dados = d;

		this.setNomeClientes(dados.getCliente());

	}

	public void cadastrarCliente(Endereco endereco, String nome, char genero, Date dataNasc, String cpf,
			String telefone, String email) {
		Cliente cli = new Cliente();
		cli.setEndereco(endereco);
		cli.setNome(nome);
		cli.setGenero(genero);
		cli.setDataNasc(dataNasc);
		cli.setCpf(cpf);
		cli.setTelefone(telefone);
		cli.setEmail(email);
		dados.setCliente(cli);
		this.nomeClientes.add(cli.getNome());
	}

	public String[] getNomeClientes() {
		String[] listaNomes = new String[dados.getCliente().size()];

		for (int i = 0; i < dados.getCliente().size(); i++) {
			listaNomes[i] = dados.getCliente().get(i).getNome();
		}

		return listaNomes;
	}

	public void setNomeClientes(ArrayList<Cliente> cliente) {
		for (int i = 0; i < cliente.size(); i++) {
			this.nomeClientes.add(cliente.get(i).getNome());
		}
	}

	public void setNome(String name) {
		this.nomeClientes.add(name);
	}

	public ControleDados getDados() {
		return dados;
	}

	public void setDados(ControleDados dadosCliente) {
		this.dados = dadosCliente;
	}

}
