package control;

import java.util.ArrayList;

import model.Funcionario;

public class ControleFuncionario {
	private ArrayList<String> nomeFuncionarios;
	private ControleDados funcionario = new ControleDados();

	public ControleFuncionario() {
		this.nomeFuncionarios = new ArrayList<String>();
		this.setNomeFuncionarios(funcionario.getFuncionario());
		this.nomeFuncionarios.add("Roger");
	}

	public ArrayList<String> getNomeFuncionarios() {
		return nomeFuncionarios;
	}

	public void setNomeFuncionarios(ArrayList<Funcionario> funcionario) {
		for (int i = 0; i < funcionario.size(); i++) {
			this.nomeFuncionarios.add(funcionario.get(i).getNome());
		}
	}

}
