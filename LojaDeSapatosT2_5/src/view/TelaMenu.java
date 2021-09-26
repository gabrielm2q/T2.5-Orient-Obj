package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import control.ControleDados;
import control.ControleTelaMenu;

public class TelaMenu extends JFrame implements ActionListener {
	private JLabel titulo = new JLabel("Loja de Sapatos", JLabel.CENTER);
	private JButton btnCliente = new JButton("Cliente");
	private JButton btnFuncionario = new JButton("Funcionário");
	private JButton btnVenda = new JButton("Venda");
	private JButton btnEstoque = new JButton("Estoque");
	private JButton btnLoja = new JButton("Loja");
	private ControleTelaMenu controlaMenu;
	private static ControleDados dados = new ControleDados();

	public TelaMenu() {
		super("Loja de Sapatos"); // JFrame com nome
		this.controlaMenu = new ControleTelaMenu(this, dados);

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
		btnCliente.setFont(f);
		btnFuncionario.setFont(f);
		btnVenda.setFont(f);
		btnEstoque.setFont(f);
		btnLoja.setFont(f);

		// Localização e Tamanho dos componentes da tela
		titulo.setBounds(110, 20, 340, 50);
		btnCliente.setBounds(50, 120, 200, 75);
		btnFuncionario.setBounds(310, 120, 200, 75);
		btnVenda.setBounds(50, 245, 200, 75);
		btnEstoque.setBounds(310, 245, 200, 75);
		btnLoja.setBounds(180, 370, 200, 75);

		// Adicionando componentes a tela
		this.add(titulo);
		this.add(btnCliente);
		this.add(btnFuncionario);
		this.add(btnVenda);
		this.add(btnEstoque);
		this.add(btnLoja);

		// Adicionando o ActionListener
		getBtnCliente().addActionListener(this);
		getBtnFuncionario().addActionListener(this);
		getBtnVenda().addActionListener(this);
		getBtnEstoque().addActionListener(this);
		getBtnLoja().addActionListener(this);

		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
		menu.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) { // ActionPerformed controlado pela classe ControleTelaMenu
		this.controlaMenu.clicaBtn(e);
	}

	public JButton getBtnCliente() {
		return btnCliente;
	}

	public JButton getBtnFuncionario() {
		return btnFuncionario;
	}

	public JButton getBtnVenda() {
		return btnVenda;
	}

	public JButton getBtnEstoque() {
		return btnEstoque;
	}

	public JButton getBtnLoja() {
		return btnLoja;
	}

	public ControleTelaMenu getControlaMenu() {
		return controlaMenu;
	}

}
