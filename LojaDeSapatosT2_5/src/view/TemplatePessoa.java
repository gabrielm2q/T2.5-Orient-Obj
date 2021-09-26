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
	private JLabel texto;
	private JButton btnCadastrar = new JButton("Cadastrar");
	private JButton btnOrdenar = new JButton("Ordenar");
	private JButton btnAtualizar = new JButton("Atualizar");
	private JList<String> listaPessoas;
	private ControleCliente clientes = new ControleCliente();
	private ControleFuncionario funcionarios = new ControleFuncionario();

	public TemplatePessoa(String texto) {
		super(texto); // JFrame com nome
		this.setSize(560, 520);
		this.setLayout(null);
		this.setResizable(false);

		// Estilo do Título
		this.texto = new JLabel(texto, JLabel.CENTER);
		this.texto.setFont(new Font("Montserrat", Font.BOLD, 44));
		this.texto.setForeground(new Color(29, 53, 87));

		// Cor do Plano de Fundo
		getContentPane().setBackground(new Color(70, 123, 157));

		// Fontes dos Botões
		Font f = new Font("Montserrat", Font.PLAIN, 15);
		btnCadastrar.setFont(f);
		btnOrdenar.setFont(f);
		btnAtualizar.setFont(f);

		// Localização e Tamanho dos componentes da tela
		this.texto.setBounds(120, 20, 300, 50);
		btnCadastrar.setBounds(32, 420, 146, 50);
		btnOrdenar.setBounds(198, 420, 146, 50);
		btnAtualizar.setBounds(368, 420, 145, 50);

		// Configurando exclusivamente a lista de Funcionários/Clientes
		listaPessoas = new JList<>();
		preencherLista(texto);
		this.listaPessoas.setBounds(32, 95, 480, 300);
		this.listaPessoas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		this.listaPessoas.setVisibleRowCount(10);
		this.listaPessoas.addListSelectionListener(this);

		// Adicionando componentes a tela
		this.add(this.texto);
		this.add(this.listaPessoas);
		this.add(btnCadastrar);
		this.add(btnOrdenar);
		this.add(btnAtualizar);

		// Adicionando o ActionListener
		getBtnCadastrar().addActionListener(this);
		getBtnOrdenar().addActionListener(this);
		getBtnAtualizar().addActionListener(this);

		this.setVisible(true);

	}

	public void preencherLista(String texto) {
		String[] listaNomes;
		if (texto.equals("Clientes")) {
			listaPessoas.setListData(clientes.getNomeClientes());
			System.out.println("O programa recebeu");
		} else if (texto.equals("Funcionários")) {
			listaNomes = new String[funcionarios.getNomeFuncionarios().size()];

			for (int i = 0; i < funcionarios.getNomeFuncionarios().size(); i++) {
				listaNomes[i] = funcionarios.getNomeFuncionarios().get(i);
			}
		}

		listaPessoas.updateUI();

	}

	public JButton getBtnCadastrar() {
		return btnCadastrar;
	}

	public JButton getBtnOrdenar() {
		return btnOrdenar;
	}

	public JButton getBtnAtualizar() {
		return btnAtualizar;
	}

	public JList<String> getListaPessoas() {
		return listaPessoas;
	}

}
