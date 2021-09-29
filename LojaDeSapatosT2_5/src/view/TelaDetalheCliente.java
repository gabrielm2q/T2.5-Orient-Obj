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
import javax.swing.JTextField;

import control.ControleTelaDetalheCliente;

public class TelaDetalheCliente extends JFrame implements ActionListener {
	private JLabel titulo = new JLabel("Cliente", JLabel.CENTER);
	private JButton btnSalvar = new JButton("Salvar");
	private JButton btnDeletar = new JButton("Deletar");

	private ControleTelaDetalheCliente controlaDetalhe;

	// Trabalhando com datas
	Date data = new Date();
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	// Declarando valores que irão compor as ComboBoxes
	private String[] estados = { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA",
			"PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" };
	private String[] gen = { "M", "F", "Outro" };

	// Declarando componentes da tela
	// CLIENTE
	private JLabel lblNome = new JLabel("Nome: "); // Nome
	private JTextField valorNome;
	private JLabel lblGenero = new JLabel("Gênero: "); // Gênero
	private JComboBox<String> valorGenero = new JComboBox<String>(gen);
	private JLabel lblData = new JLabel("Data de Nascimento: "); // Nascimento
	private JTextField valorData;
	private JLabel lblCpf = new JLabel("CPF: "); // CPF
	private JTextField valorCpf;
	private JLabel lblFone = new JLabel("Telefone: "); // Telefone
	private JTextField valorFone;
	private JLabel lblEmail = new JLabel("Email: "); // Email
	private JTextField valorEmail;

	// ENDEREÇO
	private JLabel endereco = new JLabel("Endereço", JLabel.CENTER); // Título da seção
	private JLabel lblCep = new JLabel("CEP: "); // CEP
	private JTextField valorCep;
	private JLabel lblCidade = new JLabel("Cidade (UF): "); // Cidade
	private JTextField valorCidade;
	private JComboBox<String> valorUf = new JComboBox<String>(estados); // UF
	private JLabel lblRua = new JLabel("Nome da Rua: "); // Rua
	private JTextField valorRua;
	private JLabel lblNum = new JLabel("Número: "); // Número
	private JTextField valorNum;
	private JLabel lblQd = new JLabel("Quadra: "); // Quadra
	private JTextField valorQd;
	private JLabel lblBairro = new JLabel("Bairro: "); // Bairro
	private JTextField valorBairro;
	private JLabel lblApart = new JLabel("Apartamento: "); // Apartamento
	private JTextField valorApart;
	private JLabel lblComp = new JLabel("Complemento: "); // Complemento
	private JTextField valorComp;

	public TelaDetalheCliente(int opcaoEditarSalvar, int indexCliente) {
		super("Cliente"); // JFrame com nome
		this.controlaDetalhe = new ControleTelaDetalheCliente(this, opcaoEditarSalvar, indexCliente);

		this.setSize(560, 520);
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
		titulo.setBounds(90, 20, 340, 50);
		btnDeletar.setBounds(20, 400, 239, 75);
		btnSalvar.setBounds(279, 400, 239, 75);

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
		valorCpf.setText("000.000.000-00");
		valorCpf.setBounds(70, 138, 195, 20);
		this.add(lblCpf);
		this.add(valorCpf);

		lblFone.setFont(labelFont); // CAMPO DO TELEFONE
		lblFone.setForeground(new Color(29, 53, 87));
		lblFone.setBounds(280, 138, 100, 20);
		valorFone = new JTextField(15);
		valorFone.setFont(textFont);
		valorFone.setText("(00) 00000-0000");
		valorFone.setBounds(360, 138, 160, 20);
		this.add(lblFone);
		this.add(valorFone);

		lblEmail.setFont(labelFont); // CAMPO DO EMAIL
		lblEmail.setForeground(new Color(29, 53, 87));
		lblEmail.setBounds(20, 167, 75, 20);
		valorEmail = new JTextField(62);
		valorEmail.setFont(textFont);
		valorEmail.setBounds(77, 167, 443, 20);
		this.add(lblEmail);
		this.add(valorEmail);

		endereco.setFont(new Font("Montserrat", Font.BOLD, 44)); // TÍTULO DA SEÇÃO DE ENDEREÇO
		endereco.setForeground(new Color(29, 53, 87));
		endereco.setBounds(135, 202, 250, 65);
		this.add(endereco);

		lblCep.setFont(labelFont); // CAMPO DO CEP
		lblCep.setForeground(new Color(29, 53, 87));
		lblCep.setBounds(20, 276, 50, 20);
		valorCep = new JTextField(10);
		valorCep.setFont(textFont);
		valorCep.setText("00000000");
		valorCep.setBounds(67, 276, 90, 20);
		this.add(lblCep);
		this.add(valorCep);

		lblCidade.setFont(labelFont); // CAMPOS DA CIDADE e da UF
		lblCidade.setForeground(new Color(29, 53, 87));
		lblCidade.setBounds(170, 276, 100, 20);
		valorCidade = new JTextField(30);
		valorCidade.setFont(textFont);
		valorCidade.setBounds(270, 276, 175, 20);
		this.add(lblCidade);
		this.add(valorCidade);
		valorUf.setFont(textFont);
		valorUf.setBounds(455, 276, 62, 20);
		this.add(valorUf);

		lblRua.setFont(labelFont); // CAMPO DA RUA
		lblRua.setForeground(new Color(29, 53, 87));
		lblRua.setBounds(20, 305, 120, 20);
		valorRua = new JTextField(50);
		valorRua.setFont(textFont);
		valorRua.setBounds(137, 305, 200, 20);
		this.add(lblRua);
		this.add(valorRua);

		lblNum.setFont(labelFont); // CAMPO DO NÚMERO
		lblNum.setForeground(new Color(29, 53, 87));
		lblNum.setBounds(350, 305, 75, 20);
		valorNum = new JTextField(5);
		valorNum.setFont(textFont);
		valorNum.setText("00");
		valorNum.setBounds(420, 305, 97, 20);
		this.add(lblNum);
		this.add(valorNum);

		lblQd.setFont(labelFont); // CAMPO DA QUADRA
		lblQd.setForeground(new Color(29, 53, 87));
		lblQd.setBounds(20, 334, 75, 20);
		valorQd = new JTextField(5);
		valorQd.setFont(textFont);
		valorQd.setText("00");
		valorQd.setBounds(90, 334, 97, 20);
		this.add(lblQd);
		this.add(valorQd);

		lblBairro.setFont(labelFont); // CAMPO DO BAIRRO
		lblBairro.setForeground(new Color(29, 53, 87));
		lblBairro.setBounds(200, 334, 75, 20);
		valorBairro = new JTextField(30);
		valorBairro.setFont(textFont);
		valorBairro.setBounds(265, 334, 253, 20);
		this.add(lblBairro);
		this.add(valorBairro);

		lblApart.setFont(labelFont); // CAMPO DO APARTAMENTO
		lblApart.setForeground(new Color(29, 53, 87));
		lblApart.setBounds(20, 363, 110, 20);
		valorApart = new JTextField(5);
		valorApart.setFont(textFont);
		valorApart.setText("00");
		valorApart.setBounds(131, 363, 57, 20);
		this.add(lblApart);
		this.add(valorApart);

		lblComp.setFont(labelFont); // CAMPO DO COMPLEMENTO
		lblComp.setForeground(new Color(29, 53, 87));
		lblComp.setBounds(200, 363, 130, 20);
		valorComp = new JTextField(5);
		valorComp.setFont(textFont);
		valorComp.setBounds(317, 363, 201, 20);
		this.add(lblComp);
		this.add(valorComp);

		// Adicionando o ActionListener
		getBtnSalvar().addActionListener(this);
		getBtnDeletar().addActionListener(this);

		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.controlaDetalhe.clicaBtn(e);

	}

	public String[] getEstados() {
		return estados;
	}

	public void setEstados(String[] estados) {
		this.estados = estados;
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JLabel getLblNome() {
		return lblNome;
	}

	public void setLblNome(JLabel lblNome) {
		this.lblNome = lblNome;
	}

	public JTextField getValorNome() {
		return valorNome;
	}

	public void setValorNome(JTextField valorNome) {
		this.valorNome = valorNome;
	}

	public JLabel getLblGenero() {
		return lblGenero;
	}

	public void setLblGenero(JLabel lblGenero) {
		this.lblGenero = lblGenero;
	}

	public String[] getGen() {
		return gen;
	}

	public void setGen(String[] gen) {
		this.gen = gen;
	}

	public JComboBox<String> getValorGenero() {
		return valorGenero;
	}

	public void setValorGenero(JComboBox<String> valorGenero) {
		this.valorGenero = valorGenero;
	}

	public JLabel getLblData() {
		return lblData;
	}

	public void setLblData(JLabel lblData) {
		this.lblData = lblData;
	}

	public JTextField getValorData() {
		return valorData;
	}

	public void setValorData(JTextField valorData) {
		this.valorData = valorData;
	}

	public JLabel getLblCpf() {
		return lblCpf;
	}

	public void setLblCpf(JLabel lblCpf) {
		this.lblCpf = lblCpf;
	}

	public JTextField getValorCpf() {
		return valorCpf;
	}

	public void setValorCpf(JTextField valorCpf) {
		this.valorCpf = valorCpf;
	}

	public JLabel getLblFone() {
		return lblFone;
	}

	public void setLblFone(JLabel lblFone) {
		this.lblFone = lblFone;
	}

	public JTextField getValorFone() {
		return valorFone;
	}

	public void setValorFone(JTextField valorFone) {
		this.valorFone = valorFone;
	}

	public JLabel getLblEmail() {
		return lblEmail;
	}

	public void setLblEmail(JLabel lblEmail) {
		this.lblEmail = lblEmail;
	}

	public JTextField getValorEmail() {
		return valorEmail;
	}

	public void setValorEmail(JTextField valorEmail) {
		this.valorEmail = valorEmail;
	}

	public JLabel getEndereco() {
		return endereco;
	}

	public void setEndereco(JLabel endereco) {
		this.endereco = endereco;
	}

	public JLabel getLblCep() {
		return lblCep;
	}

	public void setLblCep(JLabel lblCep) {
		this.lblCep = lblCep;
	}

	public JTextField getValorCep() {
		return valorCep;
	}

	public void setValorCep(JTextField valorCep) {
		this.valorCep = valorCep;
	}

	public JLabel getLblCidade() {
		return lblCidade;
	}

	public void setLblCidade(JLabel lblCidade) {
		this.lblCidade = lblCidade;
	}

	public JTextField getValorCidade() {
		return valorCidade;
	}

	public void setValorCidade(JTextField valorCidade) {
		this.valorCidade = valorCidade;
	}

	public JComboBox<String> getValorUf() {
		return valorUf;
	}

	public void setValorUf(JComboBox<String> valorUf) {
		this.valorUf = valorUf;
	}

	public JLabel getLblRua() {
		return lblRua;
	}

	public void setLblRua(JLabel lblRua) {
		this.lblRua = lblRua;
	}

	public JTextField getValorRua() {
		return valorRua;
	}

	public void setValorRua(JTextField valorRua) {
		this.valorRua = valorRua;
	}

	public JLabel getLblNum() {
		return lblNum;
	}

	public void setLblNum(JLabel lblNum) {
		this.lblNum = lblNum;
	}

	public JTextField getValorNum() {
		return valorNum;
	}

	public void setValorNum(JTextField valorNum) {
		this.valorNum = valorNum;
	}

	public JLabel getLblQd() {
		return lblQd;
	}

	public void setLblQd(JLabel lblQd) {
		this.lblQd = lblQd;
	}

	public JTextField getValorQd() {
		return valorQd;
	}

	public void setValorQd(JTextField valorQd) {
		this.valorQd = valorQd;
	}

	public JLabel getLblBairro() {
		return lblBairro;
	}

	public void setLblBairro(JLabel lblBairro) {
		this.lblBairro = lblBairro;
	}

	public JTextField getValorBairro() {
		return valorBairro;
	}

	public void setValorBairro(JTextField valorBairro) {
		this.valorBairro = valorBairro;
	}

	public JLabel getLblApart() {
		return lblApart;
	}

	public void setLblApart(JLabel lblApart) {
		this.lblApart = lblApart;
	}

	public JTextField getValorApart() {
		return valorApart;
	}

	public void setValorApart(JTextField valorApart) {
		this.valorApart = valorApart;
	}

	public JLabel getLblComp() {
		return lblComp;
	}

	public void setLblComp(JLabel lblComp) {
		this.lblComp = lblComp;
	}

	public JTextField getValorComp() {
		return valorComp;
	}

	public void setValorComp(JTextField valorComp) {
		this.valorComp = valorComp;
	}

	public JButton getBtnSalvar() {
		return btnSalvar;
	}

	public void setBtnSalvar(JButton btnSalvar) {
		this.btnSalvar = btnSalvar;
	}

	public JButton getBtnDeletar() {
		return btnDeletar;
	}

	public void setBtnDeletar(JButton btnDeletar) {
		this.btnDeletar = btnDeletar;
	}

	public ControleTelaDetalheCliente getControlaDetalhe() {
		return controlaDetalhe;
	}

	public void setControlaDetalhe(ControleTelaDetalheCliente controlaDetalhe) {
		this.controlaDetalhe = controlaDetalhe;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public SimpleDateFormat getFormato() {
		return formato;
	}

	public void setFormato(SimpleDateFormat formato) {
		this.formato = formato;
	}

}
