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

import control.ControleTelaDetalheFuncionario;

/**
 * Tela dos Detalhes dos Funcion�rios. Exibe os atributos do Funcion�rio
 * selecionado.
 * 
 * @author Gabriel Mariano
 */
public class TelaDetalheFuncionario extends JFrame implements ActionListener {
	private JLabel titulo = new JLabel("Funcion�rio", JLabel.CENTER);
	private JButton btnSalvar = new JButton("Salvar");
	private JButton btnDeletar = new JButton("Deletar");

	private ControleTelaDetalheFuncionario controlaDetalhe;

	// Trabalhando com datas
	Date data = new Date();
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	// Declarando valores que ir�o compor as ComboBoxes
	private String[] estados = { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA",
			"PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" };
	private String[] turno = { "Matutino", "Vespertino", "Noturno", "Outros" };
	private String[] hora = { "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22",
			"23", "00", "01", "02", "03", "04", "05", "06", "07" };

	// FUNCION�RIO
	private JLabel lblNome = new JLabel("Nome: "); // Nome
	private JTextField valorNome;
	private JLabel lblData = new JLabel("Data de Nascimento: "); // Nascimento
	private JTextField valorData;
	private JLabel lblCpf = new JLabel("CPF: "); // CPF
	private JTextField valorCpf;
	private JLabel lblFone = new JLabel("Telefone: "); // Telefone
	private JTextField valorFone;
	private JLabel lblDataCon = new JLabel("Data de Contrata��o: "); // Data de Contrata��o
	private JTextField valorDataCon;
	private JLabel lblTurno = new JLabel("Turno: "); // Turno
	private JComboBox<String> valorTurno = new JComboBox<>(turno);
	private JLabel lblEntrada = new JLabel("Entrada: "); // Hora de Entrada
	private JComboBox<String> valorEntrada = new JComboBox<>(hora);
	private JLabel lblSaida = new JLabel("Sa�da: "); // Hora de Sa�da
	private JComboBox<String> valorSaida = new JComboBox<>(hora);

	// ENDERE�O
	private JLabel endereco = new JLabel("Endere�o", JLabel.CENTER); // T�tulo da se��o
	private JLabel lblCep = new JLabel("CEP: "); // CEP
	private JTextField valorCep;
	private JLabel lblCidade = new JLabel("Cidade (UF): "); // Cidade
	private JTextField valorCidade;
	private JComboBox<String> valorUf = new JComboBox<>(estados); // UF
	private JLabel lblRua = new JLabel("Nome da Rua: "); // Rua
	private JTextField valorRua;
	private JLabel lblNum = new JLabel("N�mero: "); // N�mero
	private JTextField valorNum;
	private JLabel lblQd = new JLabel("Quadra: "); // Quadra
	private JTextField valorQd;
	private JLabel lblBairro = new JLabel("Bairro: "); // Bairro
	private JTextField valorBairro;
	private JLabel lblApart = new JLabel("Apartamento: "); // Apartamento
	private JTextField valorApart;
	private JLabel lblComp = new JLabel("Complemento: "); // Complemento
	private JTextField valorComp;

	/**
	 * Construtor.
	 * 
	 * @see ControleTelaDetalheFuncionario
	 * 
	 * @param opcaoEditarSalvar Repassa � classe ControleTelaDetalheFuncionario se o
	 *                          usu�rio deseja salvar ou editar um funcion�rio
	 * @param indexFuncionario  Repassa � classe ControleTelaDetalheFuncionario o
	 *                          index do funcion�rio a ser editado, caso necess�rio
	 */
	public TelaDetalheFuncionario(int opcaoEditarSalvar, int indexFuncionario) {
		super("Funcion�rio"); // JFrame com nome
		this.controlaDetalhe = new ControleTelaDetalheFuncionario(this, opcaoEditarSalvar, indexFuncionario);

		this.setSize(560, 520);
		this.setLayout(null);
		this.setResizable(false);

		// Estilo do T�tulo
		titulo.setFont(new Font("Montserrat", Font.BOLD, 44));
		titulo.setForeground(new Color(29, 53, 87));

		// Cor do Plano de Fundo
		getContentPane().setBackground(new Color(70, 123, 157));

		// Fontes dos Bot�es
		Font f = new Font("Montserrat", Font.PLAIN, 20);
		btnSalvar.setFont(f);
		btnDeletar.setFont(f);

		// Localiza��o e Tamanho dos componentes da tela
		titulo.setBounds(90, 20, 340, 50);
		btnDeletar.setBounds(20, 400, 239, 75);
		btnSalvar.setBounds(279, 400, 239, 75);

		// Adicionando componentes a tela
		this.add(titulo);
		this.add(btnSalvar);
		this.add(btnDeletar);

		// Definindo posi��o dos JLabels e JTextFields e suas fontes
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

		lblData.setFont(labelFont); // CAMPO DE DATA DE NASCIMENTO
		lblData.setForeground(new Color(29, 53, 87));
		lblData.setBounds(20, 109, 185, 20);
		valorData = new JTextField(10);
		valorData.setText("dd/mm/aaaa");
		valorData.setFont(textFont);
		valorData.setBounds(185, 109, 110, 20);
		this.add(lblData);
		this.add(valorData);

		lblCpf.setFont(labelFont); // CAMPO DO CPF
		lblCpf.setForeground(new Color(29, 53, 87));
		lblCpf.setBounds(307, 109, 50, 20);
		valorCpf = new JTextField(15);
		valorCpf.setFont(textFont);
		valorCpf.setText("000.000.000-00");
		valorCpf.setBounds(350, 109, 170, 20);
		this.add(lblCpf);
		this.add(valorCpf);

		lblFone.setFont(labelFont); // CAMPO DO TELEFONE
		lblFone.setForeground(new Color(29, 53, 87));
		lblFone.setBounds(20, 138, 100, 20);
		valorFone = new JTextField(15);
		valorFone.setFont(textFont);
		valorFone.setText("11922223333");
		valorFone.setBounds(100, 138, 120, 20);
		this.add(lblFone);
		this.add(valorFone);

		lblDataCon.setFont(labelFont); // CAMPO DA DATA DE CONTRATA��O
		lblDataCon.setForeground(new Color(29, 53, 87));
		lblDataCon.setBounds(230, 138, 185, 20);
		valorDataCon = new JTextField(10);
		valorDataCon.setText("dd/mm/aaaa");
		valorDataCon.setFont(textFont);
		valorDataCon.setBounds(395, 138, 125, 20);
		this.add(lblDataCon);
		this.add(valorDataCon);

		lblTurno.setFont(labelFont); // CAMPO DO TURNO
		lblTurno.setForeground(new Color(29, 53, 87));
		lblTurno.setBounds(20, 167, 75, 20);
		valorTurno.setFont(textFont);
		valorTurno.setBounds(80, 168, 110, 20);
		this.add(lblTurno);
		this.add(valorTurno);

		lblEntrada.setFont(labelFont); // CAMPO DA HORA DE ENTRADA
		lblEntrada.setForeground(new Color(29, 53, 87));
		lblEntrada.setBounds(207, 167, 75, 20);
		valorEntrada.setFont(textFont);
		valorEntrada.setBounds(280, 168, 85, 20);
		this.add(lblEntrada);
		this.add(valorEntrada);

		lblSaida.setFont(labelFont); // CAMPO DA HORA DE SAIDA
		lblSaida.setForeground(new Color(29, 53, 87));
		lblSaida.setBounds(380, 167, 75, 20);
		valorSaida.setFont(textFont);
		valorSaida.setBounds(435, 168, 85, 20);
		this.add(lblSaida);
		this.add(valorSaida);

		endereco.setFont(new Font("Montserrat", Font.BOLD, 44)); // T�TULO DA SE��O DE ENDERE�O
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

		lblNum.setFont(labelFont); // CAMPO DO N�MERO
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

	/**
	 * ActionPerformed dos Bot�es da Tela. Envia o evento � classe
	 * ControleTelaDetalheFuncionario para que esta execute as a��es adequadas.
	 * 
	 * @see ControleTelaDetalheFuncionario
	 * 
	 * @param ActionEvent
	 * @return void
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		this.controlaDetalhe.clicaBtn(e);

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

	public JButton getBtnDeletar() {
		return btnDeletar;
	}

	public void setBtnDeletar(JButton btnDeletar) {
		this.btnDeletar = btnDeletar;
	}

	public ControleTelaDetalheFuncionario getControlaDetalhe() {
		return controlaDetalhe;
	}

	public void setControlaDetalhe(ControleTelaDetalheFuncionario controlaDetalhe) {
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

	public String[] getEstados() {
		return estados;
	}

	public void setEstados(String[] estados) {
		this.estados = estados;
	}

	public String[] getTurno() {
		return turno;
	}

	public void setTurno(String[] turno) {
		this.turno = turno;
	}

	public String[] getHora() {
		return hora;
	}

	public void setHora(String[] hora) {
		this.hora = hora;
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

	public void setValorNome(String valorNome) {
		this.valorNome.setText(valorNome);
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

	public void setValorData(Date valorData) {
		String data = formato.format(valorData);
		this.valorData.setText(data);
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

	public void setValorCpf(String valorCpf) {
		this.valorCpf.setText(valorCpf);
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

	public void setValorFone(String valorFone) {
		this.valorFone.setText(valorFone);
	}

	public JLabel getLblDataCon() {
		return lblDataCon;
	}

	public void setLblDataCon(JLabel lblDataCon) {
		this.lblDataCon = lblDataCon;
	}

	public JTextField getValorDataCon() {
		return valorDataCon;
	}

	public void setValorDataCon(Date valorDataCon) {
		String data = formato.format(valorDataCon);
		this.valorDataCon.setText(data);
	}

	public JLabel getLblTurno() {
		return lblTurno;
	}

	public void setLblTurno(JLabel lblTurno) {
		this.lblTurno = lblTurno;
	}

	public JComboBox<String> getValorTurno() {
		return valorTurno;
	}

	public void setValorTurno(String valorTurno) {
		this.valorTurno.setSelectedItem(valorTurno);
	}

	public JLabel getLblEntrada() {
		return lblEntrada;
	}

	public void setLblEntrada(JLabel lblEntrada) {
		this.lblEntrada = lblEntrada;
	}

	public JComboBox<String> getValorEntrada() {
		return valorEntrada;
	}

	public void setValorEntrada(String valorEntrada) {
		this.valorEntrada.setSelectedItem(valorEntrada);
	}

	public JLabel getLblSaida() {
		return lblSaida;
	}

	public void setLblSaida(JLabel lblSaida) {
		this.lblSaida = lblSaida;
	}

	public JComboBox<String> getValorSaida() {
		return valorSaida;
	}

	public void setValorSaida(String valorSaida) {
		this.valorSaida.setSelectedItem(valorSaida);
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

	public void setValorCep(String valorCep) {
		this.valorCep.setText(valorCep);
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

	public void setValorCidade(String valorCidade) {
		this.valorCidade.setText(valorCidade);
	}

	public JComboBox<String> getValorUf() {
		return valorUf;
	}

	public void setValorUf(String valorUf) {
		this.valorUf.setSelectedItem(valorUf);
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

	public void setValorRua(String valorRua) {
		this.valorRua.setText(valorRua);
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

	public void setValorNum(String valorNum) {
		this.valorNum.setText(valorNum);
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

	public void setValorQd(String valorQd) {
		this.valorQd.setText(valorQd);
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

	public void setValorBairro(String valorBairro) {
		this.valorBairro.setText(valorBairro);
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

	public void setValorApart(String valorApart) {
		this.valorApart.setText(valorApart);
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

	public void setValorComp(String valorComp) {
		this.valorComp.setText(valorComp);
	}

}
