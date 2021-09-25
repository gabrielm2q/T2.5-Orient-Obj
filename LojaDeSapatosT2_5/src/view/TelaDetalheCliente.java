package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import control.ControleTelaDetalheCliente;

public class TelaDetalheCliente extends JFrame implements ActionListener {
	private JLabel titulo = new JLabel("Cliente", JLabel.CENTER);
	private JLabel lblNome = new JLabel("Nome: "); // Nome
	private JTextField valorNome;
	private JLabel lblGenero = new JLabel("Gênero: "); // Gênero
	private JTextField valorGenero;
	private JLabel lblDataNasc = new JLabel("Data de Nascimento: "); // Nascimento
	private JTextField valorDataNasc;
	private JLabel lblCpf = new JLabel("CPF: "); // CPF
	private JTextField valorCpf;
	private JLabel lblFone = new JLabel("Telefone: ");
	private JTextField valorFone;
	private JLabel lblEmail = new JLabel("Email: ");
	private JTextField valorNEmail;
	private JButton btnSalvar = new JButton("Salvar");
	private JButton btnDeletar = new JButton("Deletar");
	private ControleTelaDetalheCliente controlaDetalhe;

	public TelaDetalheCliente() {
		super("Cliente"); // JFrame com nome
		this.controlaDetalhe = new ControleTelaDetalheCliente(this);

		this.setSize(760, 520);
		this.setLayout(null);

		// Estilo do Título
		titulo.setFont(new Font("Montserrat", Font.BOLD, 44));
		titulo.setForeground(new Color(29, 53, 87));

		// Cor do Plano de Fundo
		getContentPane().setBackground(new Color(70, 123, 157));

		// Fontes dos Botões
		Font f = new Font("Montserrat", Font.PLAIN, 20);
		btnSalvar.setFont(f);
		btnDeletar.setFont(f);

		// Localização e Tamanho dos componentes da tela
		titulo.setBounds(110, 20, 340, 50);
		btnSalvar.setBounds(110, 120, 200, 75);
		btnDeletar.setBounds(50, 120, 200, 75);

		// Adicionando componentes a tela
		this.add(titulo);
		this.add(btnSalvar);
		this.add(btnDeletar);

		// Adicionando o ActionListener
		getBtnSalvar().addActionListener(this);
		getBtnDeletar().addActionListener(this);

		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.controlaDetalhe.clicaBtn(e);

	}

	public JLabel getTitulo() {
		return titulo;
	}

	public JButton getBtnSalvar() {
		return btnSalvar;
	}

	public JButton getBtnDeletar() {
		return btnDeletar;
	}

	public ControleTelaDetalheCliente getControlaDetalhe() {
		return controlaDetalhe;
	}

}
