package control;

import java.util.ArrayList;
import java.util.Date;

import model.Endereco;
import model.Funcionario;

public class ControleFuncionario {
	private ArrayList<String> nomeFuncionarios = new ArrayList<>();
	private ControleDados dados = new ControleDados();
	private Endereco end = new Endereco();

	public ControleFuncionario(ControleDados d) {
		this.dados = d;
		this.setNomeFuncionarios(dados.getFuncionario());
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
		dados.setFuncionario(fun);
		this.nomeFuncionarios.add(fun.getNome());
	}

	public void editarFuncionario(ControleDados d, int index, Endereco endereco, String nome, Date dataNasc, String cpf,
			String telefone, Date dataContrat, String turno, int horaEntrada, int horaSaida) {
		d.getFuncionario().get(index).setEndereco(endereco);
		d.getFuncionario().get(index).setNome(nome);
		d.getFuncionario().get(index).setDataNasc(dataNasc);
		d.getFuncionario().get(index).setCpf(cpf);
		d.getFuncionario().get(index).setTelefone(telefone);
		d.getFuncionario().get(index).setDataContratacao(dataContrat);
		d.getFuncionario().get(index).setTurno(turno);
		d.getFuncionario().get(index).setHoraEntrada(horaEntrada);
		d.getFuncionario().get(index).setHoraSaida(horaSaida);
		d.getFuncionario().set(index, d.getFuncionario().get(index));
	}

	public void deletarFuncionario(ControleDados d, int index) {
		d.getFuncionario().remove(index);
		d.getEnderecoFuncionario().remove(index);
	}

	public String[] getNomeFuncionarios() {
		String[] listaNomes = new String[dados.getFuncionario().size()];

		for (int i = 0; i < dados.getFuncionario().size(); i++) {
			listaNomes[i] = dados.getFuncionario().get(i).getNome();
		}

		return listaNomes;
	}

	public void setNomeFuncionarios(ArrayList<Funcionario> funcionario) {
		for (int i = 0; i < funcionario.size(); i++) {
			this.nomeFuncionarios.add(funcionario.get(i).getNome());
		}
	}

	public void setNome(String name) {
		this.nomeFuncionarios.add(name);
	}

	public void setNomeAt(String name, int index) {
		this.nomeFuncionarios.set(index, name);
	}

	public ControleDados getDados() {
		return dados;
	}

	public void setDados(ControleDados dados) {
		this.dados = dados;
	}

}
