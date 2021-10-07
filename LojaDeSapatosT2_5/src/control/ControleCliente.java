package control;

import java.util.Date;

import model.Cliente;
import model.Dados;
import model.Endereco;

/**
 * Controle dos Métodos do Cliente. Realiza o cadastro, a edição e a deleção de
 * Clientes. Salva os dados recebidos na classe Dados.
 * 
 * @see Cliente
 * @author Gabriel Mariano
 */
public class ControleCliente {

	/**
	 * Construtor.
	 */
	public ControleCliente() {

	}

	/**
	 * Método de Cadastro de Cliente. Cria um objeto do tipo Cliente, salva os dados
	 * recebidos nele e depois salva esse cliente em Dados.
	 * 
	 * @see Cliente
	 * @see Dados
	 * 
	 * @param Endereço recebe o endereço do cliente
	 * @param Nome     recebe o nome do cliente
	 * @param Gênero   recebe o gênero do cliente ('M', 'F' ou 'O')
	 * @param DataNasc Data de Nascimento
	 * @param CPF      Cadastro de Pessoa Física
	 * @param Telefone Celular
	 * @param Email    E-mail
	 * @return void
	 */
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

	/**
	 * Método de Edição de Cliente. Altera o cliente salvo em Dados através do index
	 * recebido.
	 * 
	 * @see Cliente
	 * @see Dados
	 * 
	 * @param index    Posição do Cliente a ser editado na classe Dados
	 * @param Endereço recebe o endereço do cliente
	 * @param Nome     recebe o nome do cliente
	 * @param Gênero   recebe o gênero do cliente ('M', 'F' ou 'O')
	 * @param DataNasc Data de Nascimento
	 * @param CPF      Cadastro de Pessoa Física
	 * @param Telefone Celular
	 * @param Email    E-mail
	 * @return void
	 */
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

	/**
	 * Método de Deleção de Cliente. Deleta o cliente na posição do index recebido.
	 * 
	 * @see Cliente
	 * @see Dados
	 * 
	 * @param index Posição do Cliente a ser deletado na classe Dados
	 * @return void
	 */
	public void deletarCliente(int index) {
		Dados.getCliente().remove(index);
	}

}
