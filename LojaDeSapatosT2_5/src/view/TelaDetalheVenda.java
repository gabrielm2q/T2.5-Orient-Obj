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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import control.ControleTelaDetalheVenda;

public class TelaDetalheVenda extends JFrame implements ActionListener, ListSelectionListener {
	private JLabel titulo = new JLabel("Venda", JLabel.CENTER);
	private JButton btnSalvar = new JButton("Salvar");

	private ControleTelaDetalheVenda controlaDetalhe;

	// Trabalhando com datas
	Date data = new Date();
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	// Declarando componentes da tela
	private JLabel lblTituloLista = new JLabel("Produtos Disponíveis: ");
	private JList<String> listaProdutos = new JList<>();
	private JLabel lblQtdEstoque = new JLabel("Quantidade Disponível: ");
	private JLabel valorQtdEstoque = new JLabel();
	private JLabel lblProdVendido = new JLabel("Produto Vendido: ");
	private JLabel valorProdVendido = new JLabel();
	private JLabel lblQuantidade = new JLabel("Quantidade: ");
	private JComboBox<String> valorQuantidade;
	private JLabel lblPrecoUnit = new JLabel("Preço Unitário: ");
	private JLabel valorPrecoUnit = new JLabel();
	private JLabel lblIdVenda = new JLabel("ID da Venda: ");
	private JLabel valorIdVenda = new JLabel();
	private JLabel lblDesconto = new JLabel("Desconto: ");
	private JTextField valorDesconto = new JTextField();
	private JLabel lblDataVenda = new JLabel("Data da Venda: ");
	private JLabel valorDataVenda = new JLabel();
	private JLabel lblCliente = new JLabel("Cliente: ");
	private JComboBox<String> valorCliente;
	private JLabel lblFuncionario = new JLabel("Funcionário: ");
	private JComboBox<String> valorFuncionario;

	public TelaDetalheVenda(int opcaoEditarSalvar, int indexVenda) {
		super("Venda"); // JFrame com nome
		this.controlaDetalhe = new ControleTelaDetalheVenda(this, opcaoEditarSalvar, indexVenda);

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

		// Localização e Tamanho dos componentes da tela
		titulo.setBounds(90, 20, 340, 50);
		btnSalvar.setBounds(20, 395, 507, 70);

		// Adicionando componentes a tela
		this.add(titulo);
		this.add(btnSalvar);

		this.setVisible(true);

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
