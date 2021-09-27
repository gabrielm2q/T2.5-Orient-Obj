package control;

import java.util.ArrayList;
import java.util.Date;

import model.Cliente;
import model.Endereco;

public class ControleCliente {
	private ArrayList<String> nomeClientes = new ArrayList<>();
	private ControleDados dados = new ControleDados();

	public ControleCliente(ControleDados d) {
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

	public void editarCliente(ControleDados d, int index, Endereco endereco, String nome, char genero, Date dataNasc,
			String cpf, String telefone, String email) {
		d.getCliente().get(index).setEndereco(endereco);
		d.getCliente().get(index).setNome(nome);
		d.getCliente().get(index).setGenero(genero);
		d.getCliente().get(index).setDataNasc(dataNasc);
		d.getCliente().get(index).setCpf(cpf);
		d.getCliente().get(index).setTelefone(telefone);
		d.getCliente().get(index).setEmail(email);
		d.getCliente().set(index, d.getCliente().get(index));
	}

	public void deletarCliente(ControleDados d, int index) {
		d.getCliente().remove(index);
		d.getEnderecoCliente().remove(index);
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

	public void setNomeAt(String name, int index) {
		this.nomeClientes.set(index, name);
	}

	public ControleDados getDados() {
		return dados;
	}

	public void setDados(ControleDados dadosCliente) {
		this.dados = dadosCliente;
	}

}
