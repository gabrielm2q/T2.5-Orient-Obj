package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;

import control.ControleCliente;
import control.ControleFuncionario;

public abstract class TemplatePessoa extends JFrame implements ActionListener, ListSelectionListener {
	private final JLabel texto;
	private final JButton btnCadastrar = new JButton("Cadastrar");
	private final JButton btnEditar = new JButton("Editar");
	private final JButton btnDeletar = new JButton("Deletar");
	private final JButton btnAtualizar = new JButton("Atualizar");
	private final JList<String> listaPessoas;
	private final ControleCliente clientes = new ControleCliente();
	private final ControleFuncionario funcionarios = new ControleFuncionario();

	public TemplatePessoa(String texto) {
		super(texto); // JFrame com nome
		this.setSize(560, 520);
		this.setLayout(null);

		// Estilo do Título
		this.texto = new JLabel(texto, JLabel.CENTER);
		this.texto.setFont(new Font("Montserrat", Font.BOLD, 44));
		this.texto.setForeground(new Color(29, 53, 87));

		// Cor do Plano de Fundo
		getContentPane().setBackground(new Color(70, 123, 157));

		// Fontes dos Botões
		Font f = new Font("Montserrat", Font.PLAIN, 15);
		btnCadastrar.setFont(f);
		btnEditar.setFont(f);
		btnDeletar.setFont(f);
		btnAtualizar.setFont(f);

		// Localização e Tamanho dos componentes da tela
		this.texto.setBounds(120, 20, 300, 50);
		btnCadastrar.setBounds(32, 420, 105, 50);
		btnEditar.setBounds(157, 420, 105, 50);
		btnDeletar.setBounds(282, 420, 105, 50);
		btnAtualizar.setBounds(407, 420, 105, 50);

		// Configurando exclusivamente a lista de Funcionários/Clientes
		listaPessoas = new JList<String>(preencherLista(texto));
		this.listaPessoas.setBounds(32, 95, 480, 300);
		this.listaPessoas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		this.listaPessoas.setVisibleRowCount(10);

		// Adicionando componentes a tela
		this.add(this.texto);
		this.add(this.listaPessoas);
		this.add(btnCadastrar);
		this.add(btnEditar);
		this.add(btnDeletar);
		this.add(btnAtualizar);

		// Adicionando o ActionListener
		getBtnCadastrar().addActionListener(this);
		getBtnEditar().addActionListener(this);
		getBtnDeletar().addActionListener(this);
		getBtnAtualizar().addActionListener(this);

		this.setVisible(true);

	}

	public String[] preencherLista(String texto) {
		String[] listaNomes;

		if (texto == "Clientes") {
			listaNomes = new String[clientes.getNomeClientes().size()];

			for (int i = 0; i < clientes.getNomeClientes().size(); i++) {
				listaNomes[i] = clientes.getNomeClientes().get(i);
			}
		} else if (texto == "Funcionários") {
			listaNomes = new String[funcionarios.getNomeFuncionarios().size()];

			for (int i = 0; i < funcionarios.getNomeFuncionarios().size(); i++) {
				listaNomes[i] = funcionarios.getNomeFuncionarios().get(i);
			}
		} else {
			listaNomes = null;
		}

		return listaNomes;
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

	public JButton getBtnAtualizar() {
		return btnAtualizar;
	}

	public JList<String> getListaPessoas() {
		return listaPessoas;
	}

}
