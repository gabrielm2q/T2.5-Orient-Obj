package control;

import java.util.Date;

import model.Dados;
import model.Endereco;
import model.Funcionario;

/**
 * Controle dos M�todos de Funcion�rio. Realiza o cadastro, a edi��o e a dele��o
 * de Funcion�rios na classe Dados.
 * 
 * @see Funcionario
 * @author Gabriel Mariano
 */
public class ControleFuncionario {

	/**
	 * Construtor.
	 */
	public ControleFuncionario() {

	}

	/**
	 * M�todo de Cadastro de Funcion�rios. Cadastra um produto na classe Dados.
	 * 
	 * @see Funcionario
	 * 
	 * @param Endere�o        Endere�o do Funcion�rio
	 * @param Nome            Nome do Funcion�rio
	 * @param dataNasc        Data de Nascimento do Funcion�rio
	 * @param CPF             Cadastro de Pessoa F�sica
	 * @param Telefone        Celular
	 * @param dataContratacao Data de Contrata��o do Funcion�rio
	 * @param Turno           Turno de Trabalho do Funcion�rio
	 * @param horaEntrada     Hora de Entrada do Funcion�rio
	 * @param horaSaida       Hora de Sa�da do Funcion�rio
	 * @return void
	 */
	public void cadastrarFuncionario(Endereco endereco, String nome, Date dataNasc, String cpf, String telefone,
			Date dataContrat, String turno, int horaEntrada, int horaSaida) {
		Funcionario fun = new Funcionario();
		fun.setEndereco(endereco);
		fun.setNome(nome);
		fun.setDataNasc(dataNasc);
		fun.setCpf(cpf);
		fun.setTelefone(telefone);
		fun.setDataContratacao(dataContrat);
		fun.setTurno(turno);
		fun.setHoraEntrada(horaEntrada);
		fun.setHoraSaida(horaSaida);
		Dados.getFuncionario().add(fun);
	}

	/**
	 * M�todo de Edi��o de Funcion�rios. Edita um produto na classe Dados.
	 * 
	 * @see Funcionario
	 * 
	 * @param Index           Index do Funcion�rio na classe Dados
	 * @param Endere�o        Endere�o do Funcion�rio
	 * @param Nome            Nome do Funcion�rio
	 * @param dataNasc        Data de Nascimento do Funcion�rio
	 * @param CPF             Cadastro de Pessoa F�sica
	 * @param Telefone        Celular
	 * @param dataContratacao Data de Contrata��o do Funcion�rio
	 * @param Turno           Turno de Trabalho do Funcion�rio
	 * @param horaEntrada     Hora de Entrada do Funcion�rio
	 * @param horaSaida       Hora de Sa�da do Funcion�rio
	 * @return void
	 */
	public void editarFuncionario(int index, Endereco endereco, String nome, Date dataNasc, String cpf, String telefone,
			Date dataContrat, String turno, int horaEntrada, int horaSaida) {
		Dados.getFuncionario().get(index).setEndereco(endereco);
		Dados.getFuncionario().get(index).setNome(nome);
		Dados.getFuncionario().get(index).setDataNasc(dataNasc);
		Dados.getFuncionario().get(index).setCpf(cpf);
		Dados.getFuncionario().get(index).setTelefone(telefone);
		Dados.getFuncionario().get(index).setDataContratacao(dataContrat);
		Dados.getFuncionario().get(index).setTurno(turno);
		Dados.getFuncionario().get(index).setHoraEntrada(horaEntrada);
		Dados.getFuncionario().get(index).setHoraSaida(horaSaida);
	}

	/**
	 * M�todo de Dele��o de Funcion�rios. Deleta um produto na classe Dados.
	 * 
	 * @see Funcionario
	 * 
	 * @param Index Index do Funcion�rio a ser Deletado na classe Dados
	 * @return void
	 */
	public void deletarFuncionario(int index) {
		Dados.getFuncionario().remove(index);
	}

}
