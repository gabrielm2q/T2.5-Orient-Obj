package control;

import java.util.Date;

import model.Cliente;
import model.Dados;
import model.Endereco;

public class ControleCliente {

	public ControleCliente() {

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
		Dados.getCliente().add(cli);
	}

	public void editarCliente(int index, Endereco endereco, String nome, char genero, Date dataNasc, String cpf,
			String telefone, String email) {
		Dados.getCliente().get(index).setEndereco(endereco);
		Dados.getCliente().get(index).setEndereco(endereco);
		Dados.getCliente().get(index).setNome(nome);
		Dados.getCliente().get(index).setGenero(genero);
		Dados.getCliente().get(index).setDataNasc(dataNasc);
		Dados.getCliente().get(index).setCpf(cpf);
		Dados.getCliente().get(index).setTelefone(telefone);
		Dados.getCliente().get(index).setEmail(email);
	}

	public void deletarCliente(int index) {
		Dados.getCliente().remove(index);
	}

}
