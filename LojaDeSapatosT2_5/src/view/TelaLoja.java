package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import model.Dados;

public class TelaLoja extends JFrame implements ActionListener {
	private JLabel titulo = new JLabel("Loja", JLabel.CENTER);
	private JButton btnSalvar = new JButton("Salvar Alterações");
	private JLabel tituloEstoque = new JLabel("Estoque", JLabel.CENTER);
	private JLabel tituloFuncionarios = new JLabel("Funcionários", JLabel.CENTER);
	private JList<String> listaEstoque;
	private JList<String> listaFuncionarios;

	// Declarando valores que irão compor as ComboBoxes
	private String[] estados = { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA",
			"PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" };
	private String[] hora = { "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22",
			"23", "00", "01", "02", "03", "04", "05", "06", "07" };

	// Declarando componentes da tela
	// LOJA
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

	public TelaLoja() {
		super("Loja");

		this.setSize(560, 720);
		this.setLayout(null);
		this.setResizable(false);

		// Estilo do Título
		titulo.setFont(new Font("Montserrat", Font.BOLD, 36));
		titulo.setForeground(new Color(29, 53, 87));

		// Cor do Plano de Fundo
		getContentPane().setBackground(new Color(70, 123, 157));

		// Fontes dos Botões
		Font f = new Font("Montserrat", Font.PLAIN, 20);
		btnSalvar.setFont(f);

		// Localização e Tamanho dos componentes da tela
		titulo.setBounds(85, 5, 340, 50);
		btnSalvar.setBounds(20, 620, 498, 50);

		// Adicionando componentes a tela
		this.add(titulo);
		this.add(btnSalvar);

		// Definindo posição dos JLabels e JTextFields e suas fontes
		Font labelFont = new Font("Montserrat", Font.BOLD, 16);
		Font textFont = new Font("Montserrat", Font.BOLD, 14);

		lblNome.setFont(labelFont); // CAMPO DE NOME
		lblNome.setForeground(new Color(29, 53, 87));
		lblNome.setBounds(20, 60, 60, 20);
		valorNome = new JTextField(100);
		valorNome.setFont(textFont);
		valorNome.setBounds(80, 62, 440, 20);
		valorNome.setText(Dados.getLoja().getNome());
		this.add(valorNome);
		this.add(lblNome);

		lblCnpj.setFont(labelFont); // CAMPO DO CNPJ
		lblCnpj.setForeground(new Color(29, 53, 87));
		lblCnpj.setBounds(20, 89, 60, 20);
		valorCnpj = new JTextField(15);
		valorCnpj.setFont(textFont);
		valorCnpj.setBounds(80, 91, 195, 20);
		valorCnpj.setText(Dados.getLoja().getCnpj());
		this.add(lblCnpj);
		this.add(valorCnpj);

		lblSite.setFont(labelFont); // CAMPO DO SITE
		lblSite.setForeground(new Color(29, 53, 87));
		lblSite.setBounds(20, 118, 75, 20);
		valorSite = new JTextField(62);
		valorSite.setFont(textFont);
		valorSite.setBounds(80, 120, 440, 20);
		valorSite.setText(Dados.getLoja().getSite());
		this.add(lblSite);
		this.add(valorSite);

		lblAbertura.setFont(labelFont); // CAMPO DA HORA DE ABERTURA
		lblAbertura.setForeground(new Color(29, 53, 87));
		lblAbertura.setBounds(20, 147, 85, 20);
		valorAbertura.setFont(textFont);
		valorAbertura.setBounds(105, 149, 85, 20);
		valorAbertura.setSelectedItem(Integer.toString(Dados.getLoja().getHoraAbertura()));
		this.add(lblAbertura);
		this.add(valorAbertura);

		lblFechamento.setFont(labelFont); // CAMPO DA HORA DE FECHAMENTO
		lblFechamento.setForeground(new Color(29, 53, 87));
		lblFechamento.setBounds(215, 147, 113, 20);
		valorFechamento.setFont(textFont);
		valorFechamento.setBounds(333, 149, 85, 20);
		valorFechamento.setSelectedItem(Integer.toString(Dados.getLoja().getHoraFechamento()));
		this.add(lblFechamento);
		this.add(valorFechamento);

		endereco.setFont(new Font("Montserrat", Font.BOLD, 36)); // TÍTULO DA SEÇÃO DE ENDEREÇO
		endereco.setForeground(new Color(29, 53, 87));
		endereco.setBounds(160, 170, 204, 60);
		this.add(endereco);

		lblCep.setFont(labelFont); // CAMPO DO CEP
		lblCep.setForeground(new Color(29, 53, 87));
		lblCep.setBounds(20, 228, 50, 20);
		valorCep = new JTextField(10);
		valorCep.setFont(textFont);
		valorCep.setBounds(67, 230, 90, 20);
		valorCep.setText(Integer.toString(Dados.getLoja().getEndereco().getCep()));
		this.add(lblCep);
		this.add(valorCep);

		lblCidade.setFont(labelFont); // CAMPOS DA CIDADE e da UF
		lblCidade.setForeground(new Color(29, 53, 87));
		lblCidade.setBounds(170, 228, 100, 20);
		valorCidade = new JTextField(30);
		valorCidade.setFont(textFont);
		valorCidade.setBounds(270, 230, 175, 20);
		valorCidade.setText(Dados.getLoja().getEndereco().getCidade());
		this.add(lblCidade);
		this.add(valorCidade);
		valorUf.setFont(textFont);
		valorUf.setBounds(455, 230, 62, 20);
		valorUf.setSelectedItem(Dados.getLoja().getEndereco().getUf());
		this.add(valorUf);

		lblRua.setFont(labelFont); // CAMPO DA RUA
		lblRua.setForeground(new Color(29, 53, 87));
		lblRua.setBounds(20, 257, 120, 20);
		valorRua = new JTextField(50);
		valorRua.setFont(textFont);
		valorRua.setBounds(137, 259, 200, 20);
		valorRua.setText(Dados.getLoja().getEndereco().getNomeRua());
		this.add(lblRua);
		this.add(valorRua);

		lblNum.setFont(labelFont); // CAMPO DO NÚMERO
		lblNum.setForeground(new Color(29, 53, 87));
		lblNum.setBounds(350, 257, 75, 20);
		valorNum = new JTextField(5);
		valorNum.setFont(textFont);
		valorNum.setBounds(420, 259, 97, 20);
		valorNum.setText(Integer.toString(Dados.getLoja().getEndereco().getNumero()));
		this.add(lblNum);
		this.add(valorNum);

		lblQd.setFont(labelFont); // CAMPO DA QUADRA
		lblQd.setForeground(new Color(29, 53, 87));
		lblQd.setBounds(20, 286, 75, 20);
		valorQd = new JTextField(5);
		valorQd.setFont(textFont);
		valorQd.setBounds(90, 288, 97, 20);
		valorQd.setText(Integer.toString(Dados.getLoja().getEndereco().getQuadra()));
		this.add(lblQd);
		this.add(valorQd);

		lblBairro.setFont(labelFont); // CAMPO DO BAIRRO
		lblBairro.setForeground(new Color(29, 53, 87));
		lblBairro.setBounds(200, 286, 75, 20);
		valorBairro = new JTextField(35);
		valorBairro.setFont(textFont);
		valorBairro.setBounds(265, 288, 253, 20);
		valorBairro.setText(Dados.getLoja().getEndereco().getBairro());
		this.add(lblBairro);
		this.add(valorBairro);

		lblComp.setFont(labelFont); // CAMPO DO COMPLEMENTO
		lblComp.setForeground(new Color(29, 53, 87));
		lblComp.setBounds(20, 315, 117, 20);
		valorComp = new JTextField(60);
		valorComp.setFont(textFont);
		valorComp.setBounds(137, 317, 381, 20);
		valorComp.setText(Dados.getLoja().getEndereco().getComplemento());
		this.add(lblComp);
		this.add(valorComp);

		// Lista Funcionarios
		tituloFuncionarios.setFont(new Font("Montserrat", Font.BOLD, 36));
		tituloFuncionarios.setForeground(new Color(29, 53, 87));
		tituloFuncionarios.setBounds(115, 340, 290, 60);
		listaFuncionarios = new JList(Dados.getLoja().getFuncionario().toArray());
		listaFuncionarios.setForeground(new Color(29, 53, 87));
		listaFuncionarios.setBounds(20, 395, 498, 75);
		listaFuncionarios.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaFuncionarios.setVisibleRowCount(10);
		this.add(tituloFuncionarios);
		this.add(listaFuncionarios);

		// Adicionando Barra de Rolagem para a lista de funcionarios
		JScrollPane painel = new JScrollPane(this.getListaFuncionarios());
		painel.setBounds(20, 395, 498, 75);
		painel.setViewportView(this.getListaFuncionarios());
		painel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		painel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		this.add(painel);

		// Lista Estoque
		tituloEstoque.setFont(new Font("Montserrat", Font.BOLD, 36));
		tituloEstoque.setForeground(new Color(29, 53, 87));
		tituloEstoque.setBounds(160, 475, 200, 65);
		listaEstoque = new JList(Dados.getLoja().getEstoque().getProduto().toArray());
		listaEstoque.setBackground(Color.white);
		listaEstoque.setBounds(20, 535, 498, 75);
		listaEstoque.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaEstoque.setVisibleRowCount(10);
		this.add(tituloEstoque);
		this.add(listaEstoque);

		// Adicionando Barra de Rolagem para a lista de produtos do estoque
		JScrollPane painel2 = new JScrollPane(this.getListaEstoque());
		painel2.setBounds(20, 535, 498, 75);
		painel2.setViewportView(this.getListaEstoque());
		painel2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		painel2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		this.add(painel2);

		// Adicionando o ActionListener
		getBtnSalvar().addActionListener(this);

		this.setVisible(true);

	}

	public String[] getHora() {
		return hora;
	}

	public void setHora(String[] hora) {
		this.hora = hora;
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
