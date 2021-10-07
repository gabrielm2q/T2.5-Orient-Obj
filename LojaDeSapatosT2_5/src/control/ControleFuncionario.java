package control;

import java.util.Date;

import model.Dados;
import model.Endereco;
import model.Funcionario;

/**
 * Controle dos Métodos de Funcionário. Realiza o cadastro, a edição e a deleção
 * de Funcionários na classe Dados.
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
	 * Método de Cadastro de Funcionários. Cadastra um produto na classe Dados.
	 * 
	 * @see Funcionario
	 * 
	 * @param Endereço        Endereço do Funcionário
	 * @param Nome            Nome do Funcionário
	 * @param dataNasc        Data de Nascimento do Funcionário
	 * @param CPF             Cadastro de Pessoa Física
	 * @param Telefone        Celular
	 * @param dataContratacao Data de Contratação do Funcionário
	 * @param Turno           Turno de Trabalho do Funcionário
	 * @param horaEntrada     Hora de Entrada do Funcionário
	 * @param horaSaida       Hora de Saída do Funcionário
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
	 * Método de Edição de Funcionários. Edita um produto na classe Dados.
	 * 
	 * @see Funcionario
	 * 
	 * @param Index           Index do Funcionário na classe Dados
	 * @param Endereço        Endereço do Funcionário
	 * @param Nome            Nome do Funcionário
	 * @param dataNasc        Data de Nascimento do Funcionário
	 * @param CPF             Cadastro de Pessoa Física
	 * @param Telefone        Celular
	 * @param dataContratacao Data de Contratação do Funcionário
	 * @param Turno           Turno de Trabalho do Funcionário
	 * @param horaEntrada     Hora de Entrada do Funcionário
	 * @param horaSaida       Hora de Saída do Funcionário
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
	 * Método de Deleção de Funcionários. Deleta um produto na classe Dados.
	 * 
	 * @see Funcionario
	 * 
	 * @param Index Index do Funcionário a ser Deletado na classe Dados
	 * @return void
	 */
	public void deletarFuncionario(int index) {
		Dados.getFuncionario().remove(index);
	}

}
