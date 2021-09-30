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
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class TelaLoja implements ActionListener {
	
	private JFrame janela = new JFrame("Loja");
	private JLabel titulo = new JLabel("Loja", JLabel.CENTER);
	private JButton btnSalvar = new JButton("Salvar");
	private JButton btnAtualizar = new JButton("Atualizar");
	private JLabel tituloEstoque = new JLabel("Estoque");
	private JLabel tituloFuncionarios = new JLabel("Funcionários");
	private JList<String> listaEstoque = new JList<>();
	private JList<String> listaFuncionarios = new JList<>();
	
	
	// Declarando valores que irão compor as ComboBoxes
	private String[] estados = { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA",
			"PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" };
	
	// Declarando componentes da tela
	//LOJA
	private JLabel lblNome = new JLabel("Nome: "); // Nome
	private JTextField valorNome;
	private JLabel lblCnpj = new JLabel("CNPJ: "); // CNPJ
	private JTextField valorCnpj;
	private JLabel lblSite = new JLabel("Site: "); // Site
	private JTextField valorSite;
	private JLabel lblAbertura = new JLabel("Abertura: "); // Hora de Abertura
	private JComboBox<String> valorAbertura = new JComboBox<>(hora);
	private JLabel lblFechamento = new JLabel("Fechamento: "); // Hora de Fechamento
	private JComboBox<String> valorFechamento = new JComboBox<>(hora);
	
	//ENDEREÇO
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


	public TelaLoja() {
	
		janela.setSize(560, 1560);
		janela.setLayout(null);
		janela.setResizable(false);
		
		// Estilo do Título
		titulo.setFont(new Font("Montserrat", Font.BOLD, 44));
		titulo.setForeground(new Color(29, 53, 87));
		
		// Cor do Plano de Fundo
		getContentPane().setBackground(new Color(70, 123, 157));
		
		// Fontes dos Botões
		Font f = new Font("Montserrat", Font.PLAIN, 20);
		btnSalvar.setFont(f);
		btnAtualizar.setFont(f);
		
		// Localização e Tamanho dos componentes da tela
		titulo.setBounds(90, 20, 340, 50);
		btnAtualizar.setBounds(x, y, 239, 75);
		btnSalvar.setBounds(x, y, 239, 75);
		
		// Adicionando componentes a tela
		titulo.add(titulo);
		janela.add(btnSalvar);
		janela.add(btnAtualizar);
		
		// Definindo posição dos JLabels e JTextFields e suas fontes
		Font labelFont = new Font("Montserrat", Font.BOLD, 16);
		Font textFont = new Font("Montserrat", Font.BOLD, 14);
		
		lblNome.setFont(labelFont); // CAMPO DE NOME
		lblNome.setForeground(new Color(29, 53, 87));
		lblNome.setBounds(x, y, 60, 20);
		valorNome = new JTextField(100);
		valorNome.setFont(textFont);
		valorNome.setBounds(x, y, 440, 20);
		janela.add(valorNome);
		janela.add(lblNome);
		
		lblCnpj.setFont(labelFont); // CAMPO DO CNPJ
		lblCnpj.setForeground(new Color(29, 53, 87));
		lblCnpj.setBounds(x, y, 50, 20);
		valorCnpj = new JTextField(15);
		valorCnpj.setFont(textFont);
		valorCnpj.setText("00.000.000/0000-00");
		valorCnpj.setBounds(x, y, 195, 20);
		janela.add(lblCnpj);
		janela.add(valorCnpj);
		
		lblSite.setFont(labelFont); // CAMPO DO SITE
		lblSite.setForeground(new Color(29, 53, 87));
		lblSite.setBounds(20, 167, 75, 20);
		valorSite = new JTextField(62);
		valorSite.setFont(textFont);
		valorSite.setBounds(77, 167, 443, 20);
		janela.add(lblSite);
		janela.add(valorSite);
		
		lblAbertura.setFont(labelFont); // CAMPO DA HORA DE ABERTURA
		lblAbertura.setForeground(new Color(29, 53, 87));
		lblAbertura.setBounds(x, y, 75, 20);
		valorAbertura.setFont(textFont);
		valorAbertura.setBounds(x, y, 85, 20);
		janela.add(lblAbertura);
		janela.add(valorAbertura);

		lblFechamento.setFont(labelFont); // CAMPO DA HORA DE FECHAMENTO
		lblFechamento.setForeground(new Color(29, 53, 87));
		lblFechamento.setBounds(x, y, 75, 20);
		valorFechamento.setFont(textFont);
		valorFechamento.setBounds(x, y, 85, 20);
		janela.add(lblFechamento);
		janela.add(valorFechamento);
		
		endereco.setFont(new Font("Montserrat", Font.BOLD, 44)); // TÍTULO DA SEÇÃO DE ENDEREÇO
		endereco.setForeground(new Color(29, 53, 87));
		endereco.setBounds(135, 202, 250, 65);
		janela.add(endereco);

		lblCep.setFont(labelFont); // CAMPO DO CEP
		lblCep.setForeground(new Color(29, 53, 87));
		lblCep.setBounds(20, 276, 50, 20);
		valorCep = new JTextField(10);
		valorCep.setFont(textFont);
		valorCep.setText("00000000");
		valorCep.setBounds(67, 276, 90, 20);
		janela.add(lblCep);
		janela.add(valorCep);

		lblCidade.setFont(labelFont); // CAMPOS DA CIDADE e da UF
		lblCidade.setForeground(new Color(29, 53, 87));
		lblCidade.setBounds(170, 276, 100, 20);
		valorCidade = new JTextField(30);
		valorCidade.setFont(textFont);
		valorCidade.setBounds(270, 276, 175, 20);
		janela.add(lblCidade);
		janela.add(valorCidade);
		valorUf.setFont(textFont);
		valorUf.setBounds(455, 276, 62, 20);
		janela.add(valorUf);

		lblRua.setFont(labelFont); // CAMPO DA RUA
		lblRua.setForeground(new Color(29, 53, 87));
		lblRua.setBounds(20, 305, 120, 20);
		valorRua = new JTextField(50);
		valorRua.setFont(textFont);
		valorRua.setBounds(137, 305, 200, 20);
		janela.add(lblRua);
		janela.add(valorRua);

		lblNum.setFont(labelFont); // CAMPO DO NÚMERO
		lblNum.setForeground(new Color(29, 53, 87));
		lblNum.setBounds(350, 305, 75, 20);
		valorNum = new JTextField(5);
		valorNum.setFont(textFont);
		valorNum.setText("00");
		valorNum.setBounds(420, 305, 97, 20);
		janela.add(lblNum);
		janela.add(valorNum);

		lblQd.setFont(labelFont); // CAMPO DA QUADRA
		lblQd.setForeground(new Color(29, 53, 87));
		lblQd.setBounds(20, 334, 75, 20);
		valorQd = new JTextField(5);
		valorQd.setFont(textFont);
		valorQd.setText("00");
		valorQd.setBounds(90, 334, 97, 20);
		janela.add(lblQd);
		janela.add(valorQd);

		lblBairro.setFont(labelFont); // CAMPO DO BAIRRO
		lblBairro.setForeground(new Color(29, 53, 87));
		lblBairro.setBounds(200, 334, 75, 20);
		valorBairro = new JTextField(30);
		valorBairro.setFont(textFont);
		valorBairro.setBounds(265, 334, 253, 20);
		janela.add(lblBairro);
		janela.add(valorBairro);

		lblApart.setFont(labelFont); // CAMPO DO APARTAMENTO
		lblApart.setForeground(new Color(29, 53, 87));
		lblApart.setBounds(20, 363, 110, 20);
		valorApart = new JTextField(5);
		valorApart.setFont(textFont);
		valorApart.setText("00");
		valorApart.setBounds(131, 363, 57, 20);
		janela.add(lblApart);
		janela.add(valorApart);

		lblComp.setFont(labelFont); // CAMPO DO COMPLEMENTO
		lblComp.setForeground(new Color(29, 53, 87));
		lblComp.setBounds(200, 363, 130, 20);
		valorComp = new JTextField(5);
		valorComp.setFont(textFont);
		valorComp.setBounds(317, 363, 201, 20);
		janela.add(lblComp);
		janela.add(valorComp);
		
		// Lista Funcionarios
		janela.listaFuncionarios.setBackground(Color.white);
		janela.listaFuncionarios.setBounds(x, y, 480, 300);
		janela.listaFuncionarios.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		janela.listaFuncionarios.setVisibleRowCount(10);
		janela.listaFuncionarios.addListSelectionListener(this);
		janela.add(janela.listaFuncionarios);
		
		//Lista Estoque
		janela.listaEstoque.setBackground(Color.white);
		janela.listaEstoque.setBounds(x, y, 480, 300);
		janela.listaEstoque.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		janela.listaEstoque.setVisibleRowCount(10);
		janela.listaEstoque.addListSelectionListener(this);
		janela.add(janela.listaEstoque);
		
		// Adicionando o ActionListener
		getBtnSalvar().addActionListener(janela);
		getBtnAtualizar().addActionListener(janela);

		janela.setVisible(true);
		
	}


	public JFrame getJanela() {
		return janela;
	}


	public void setJanela(JFrame janela) {
		this.janela = janela;
	}


	public JLabel getTitulo() {
		return titulo;
	}


	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}


	public JButton getBtnSalvar() {
		return btnSalvar;
	}


	public void setBtnSalvar(JButton btnSalvar) {
		this.btnSalvar = btnSalvar;
	}


	public JButton getBtnAtualizar() {
		return btnAtualizar;
	}


	public void setBtnAtualizar(JButton btnAtualizar) {
		this.btnAtualizar = btnAtualizar;
	}


	public JLabel getTituloEstoque() {
		return tituloEstoque;
	}


	public void setTituloEstoque(JLabel tituloEstoque) {
		this.tituloEstoque = tituloEstoque;
	}


	public JLabel getTituloFuncionarios() {
		return tituloFuncionarios;
	}


	public void setTituloFuncionarios(JLabel tituloFuncionarios) {
		this.tituloFuncionarios = tituloFuncionarios;
	}


	public JList<String> getListaEstoque() {
		return listaEstoque;
	}


	public void setListaEstoque(JList<String> listaEstoque) {
		this.listaEstoque = listaEstoque;
	}


	public JList<String> getListaFuncionarios() {
		return listaFuncionarios;
	}


	public void setListaFuncionarios(JList<String> listaFuncionarios) {
		this.listaFuncionarios = listaFuncionarios;
	}


	public String[] getEstados() {
		return estados;
	}


	public void setEstados(String[] estados) {
		this.estados = estados;
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


	public JLabel getLblCnpj() {
		return lblCnpj;
	}


	public void setLblCnpj(JLabel lblCnpj) {
		this.lblCnpj = lblCnpj;
	}


	public JTextField getValorCnpj() {
		return valorCnpj;
	}


	public void setValorCnpj(JTextField valorCnpj) {
		this.valorCnpj = valorCnpj;
	}


	public JLabel getLblSite() {
		return lblSite;
	}


	public void setLblSite(JLabel lblSite) {
		this.lblSite = lblSite;
	}


	public JTextField getValorSite() {
		return valorSite;
	}


	public void setValorSite(JTextField valorSite) {
		this.valorSite = valorSite;
	}


	public JLabel getLblAbertura() {
		return lblAbertura;
	}


	public void setLblAbertura(JLabel lblAbertura) {
		this.lblAbertura = lblAbertura;
	}


	public JComboBox<String> getValorAbertura() {
		return valorAbertura;
	}


	public void setValorAbertura(JComboBox<String> valorAbertura) {
		this.valorAbertura = valorAbertura;
	}


	public JLabel getLblFechamento() {
		return lblFechamento;
	}


	public void setLblFechamento(JLabel lblFechamento) {
		this.lblFechamento = lblFechamento;
	}


	public JComboBox<String> getValorFechamento() {
		return valorFechamento;
	}


	public void setValorFechamento(JComboBox<String> valorFechamento) {
		this.valorFechamento = valorFechamento;
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

}
