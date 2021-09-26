package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import control.ControleTelaDetalheCliente;

public class TelaDetalheCliente extends JFrame implements ActionListener {
	// Declarando valores que irão compor as ComboBoxes
	private String[] estados = { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA",
			"PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" };

	// Declarando componentes da tela
	// CLIENTE
	private JLabel titulo = new JLabel("Cliente", JLabel.CENTER);
	private JLabel lblNome = new JLabel("Nome: "); // Nome
	private JTextField valorNome;
	private JLabel lblGenero = new JLabel("Gênero: "); // Gênero
	private String[] gen = { "M", "F", "Outro" };
	private JComboBox valorGenero = new JComboBox(gen);
	private JLabel lblData = new JLabel("Data de Nascimento: "); // Nascimento
	private JTextField valorData;
	private JLabel lblCpf = new JLabel("CPF: "); // CPF
	private JTextField valorCpf;
	private JLabel lblFone = new JLabel("Telefone: "); // Telefone
	private JTextField valorFone;
	private JLabel lblEmail = new JLabel("Email: "); // Email
	private JTextField valorEmail;

	// ENDEREÇO
	private JLabel endereco = new JLabel("Endereço", JLabel.CENTER);
	private JLabel lblCep = new JLabel("CEP: "); // CEP
	private JTextField valorCep;
	private JLabel lblCidade = new JLabel("Cidade: "); // Cidade
	private JTextField valorCidade;
	private JLabel lblUf = new JLabel("UF: "); // UF
	private JComboBox valorUf = new JComboBox(estados);
	private JLabel lblNomeRua = new JLabel("Nome da Rua: "); // Rua
	private JTextField valorNomeRua;
	private JLabel lblNumero = new JLabel("Número: "); // Número
	private JTextField valorNumero;
	private JLabel lblQuadra = new JLabel("Quadra: "); // Quadra
	private JTextField valorQuadra;
	private JLabel lblBairro = new JLabel("Bairro: ");
	private JTextField valorBairro;
	private JLabel lblNumApart = new JLabel("NumApart: ");
	private JTextField valorNumApart;
	private JLabel lblComplemento = new JLabel("Complemento: ");
	private JTextField valorComplemento;
	private JButton btnSalvar = new JButton("Salvar");
	private JButton btnDeletar = new JButton("Deletar");
	private ControleTelaDetalheCliente controlaDetalhe;
	private JScrollPane painel = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

	// Trabalhando com datas
	Date data = new Date();
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	public TelaDetalheCliente() {
		super("Cliente"); // JFrame com nome
		this.controlaDetalhe = new ControleTelaDetalheCliente(this);

		this.setSize(560, 700);
		this.setLayout(null);
		this.setResizable(false);

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
		btnSalvar.setBounds(110, 600, 200, 75);
		btnDeletar.setBounds(50, 600, 200, 75);

		// Adicionando componentes a tela
		this.add(titulo);
		this.add(btnSalvar);
		this.add(btnDeletar);

		// Definindo posição dos JLabels e JTextFields e suas fontes
		Font labelFont = new Font("Montserrat", Font.BOLD, 16);
		Font textFont = new Font("Montserrat", Font.BOLD, 14);

		lblNome.setFont(labelFont); // CAMPO DE NOME
		lblNome.setForeground(new Color(29, 53, 87));
		lblNome.setBounds(20, 80, 60, 20);
		valorNome = new JTextField(100);
		valorNome.setFont(textFont);
		valorNome.setBounds(80, 80, 440, 20);
		this.add(valorNome);
		this.add(lblNome);

		lblGenero.setFont(labelFont); // CAMPO DE GÊNERO
		lblGenero.setForeground(new Color(29, 53, 87));
		lblGenero.setBounds(20, 109, 90, 20);
		valorGenero.setFont(textFont);
		valorGenero.setBounds(90, 109, 100, 20);
		this.add(valorGenero);
		this.add(lblGenero);

		lblData.setFont(labelFont); // CAMPO DE DATA DE NASCIMENTO
		lblData.setForeground(new Color(29, 53, 87));
		lblData.setBounds(210, 109, 180, 20);
		valorData = new JTextField(10);
		valorData.setText("dd/mm/aaaa");
		valorData.setFont(textFont);
		valorData.setBounds(375, 109, 145, 20);
		this.add(lblData);
		this.add(valorData);

		lblCpf.setFont(labelFont); // CAMPO DO CPF
		lblCpf.setForeground(new Color(29, 53, 87));
		lblCpf.setBounds(20, 138, 50, 20);
		valorCpf = new JTextField(15);
		valorCpf.setFont(textFont);
		valorCpf.setBounds(70, 138, 195, 20);
		this.add(lblCpf);
		this.add(valorCpf);

		lblFone.setFont(labelFont); // CAMPO DO TELEFONE
		lblFone.setForeground(new Color(29, 53, 87));
		lblFone.setBounds(280, 138, 100, 20);
		valorFone = new JTextField(15);
		valorFone.setFont(textFont);
		valorFone.setBounds(360, 138, 160, 20);
		this.add(lblFone);
		this.add(valorFone);

		lblEmail.setFont(labelFont); // CAMPO DO EMAIL
		lblEmail.setForeground(new Color(29, 53, 87));
		lblEmail.setBounds(20, 167, 75, 20);
		valorEmail = new JTextField(62);
		valorEmail.setFont(textFont);
		valorEmail.setBounds(77, 169, 443, 20);
		this.add(lblEmail);
		this.add(valorEmail);

		endereco.setFont(new Font("Montserrat", Font.BOLD, 44)); // TÍTULO DA SEÇÃO DE ENDEREÇO
		endereco.setForeground(new Color(29, 53, 87));
		endereco.setBounds(155, 202, 250, 65);
		this.add(endereco);

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
