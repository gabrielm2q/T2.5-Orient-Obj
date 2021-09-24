package control;

import java.util.ArrayList;

import model.Cliente;

public class ControleCliente {
	private ArrayList<String> nomeClientes;
	private ControleDados cliente = new ControleDados();

	public ControleCliente() {
		this.nomeClientes = new ArrayList<String>();
		this.setNomeClientes(cliente.getCliente());
		this.nomeClientes.add("Júlia");
	}

	public ArrayList<String> getNomeClientes() {
		return nomeClientes;
	}

	public void setNomeClientes(ArrayList<Cliente> cliente) {
		for (int i = 0; i < cliente.size(); i++) {
			this.nomeClientes.add(cliente.get(i).getNome());
		}

	}

}
