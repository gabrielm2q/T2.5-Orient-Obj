package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class TelaMenu extends JFrame implements ActionListener {
	private final JPanel fundo = new JPanel();
	private final JLabel titulo = new JLabel("Loja de Sapatos", JLabel.CENTER);
	private final JButton btnCliente = new JButton("Cliente");
	private final JButton btnFuncionario = new JButton("Funcionário");
	private final JButton btnVenda = new JButton("Venda");
	private final JButton btnEstoque = new JButton("Estoque");
	private final JButton btnLoja = new JButton("Loja");

	public TelaMenu() {
		super("Loja de Sapatos"); // JFrame com nome
		this.setSize(560, 520);
		this.setLayout(null);

		this.add(fundo);
		fundo.setBackground(Color.black);

		// Estilo do Título
		titulo.setFont(new Font("Montserrat", Font.BOLD, 44));
		titulo.setForeground(new Color(29, 53, 87));
		getContentPane().setBackground(new Color(70, 123, 157));
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

		this.setVisible(true);

		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
	}

}
