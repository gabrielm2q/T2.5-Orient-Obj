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

public class TelaLoja implements ActionListener {
	
	private JFrame janela = new JFrame("Loja");
	private JLabel titulo = new JLabel("Loja", JLabel.CENTER);
	private JButton btnSalvar = new JButton("Salvar");
	private JButton btnAtualizar = new JButton("Atualizar");
	private JLabel tituloEstoque = new JLabel("Estoque");
	private JLabel tituloFuncionarios = new JLabel("Funcionários");
	
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
	}  

}
