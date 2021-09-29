package control;

import java.util.Date;

import model.Dados;
import model.Endereco;
import model.Funcionario;

public class ControleFuncionario {

	public ControleFuncionario() {

	}

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

	public void deletarFuncionario(int index) {
		Dados.getFuncionario().remove(index);
	}

}
