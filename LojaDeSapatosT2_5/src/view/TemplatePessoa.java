package view;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionListener;

public abstract class TemplatePessoa extends JFrame implements ActionListener, ListSelectionListener {
	private final JLabel texto;
	private final JButton btnCadastrar;
	private final JButton btnEditar;
	private final JButton btnDeletar;
	private final JButton btnAtualizar;
	private final JList<String> listaPessoas;

	public TemplatePessoa(String texto, ArrayList<String> listaPessoas) {
		super();

		this.setSize(560, 520);
		this.setLayout(null);

		this.texto = new JLabel(texto);
		this.btnCadastrar = new JButton("Cadastrar");
		this.btnEditar = new JButton("Editar");
		this.btnDeletar = new JButton("Deletar");
		this.btnAtualizar = new JButton("Atualizar");

		this.listaPessoas = new JList<String>();

	}

	public JButton getBtnCadastrar() {
		return btnCadastrar;
	}

	public JButton getBtnEditar() {
		return btnEditar;
	}

	public JButton getBtnDeletar() {
		return btnDeletar;
	}

	public JList<String> getListaPessoas() {
		return listaPessoas;
	}

}
