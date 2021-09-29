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
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
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
	private JTextField valorQuantidade = new JTextField(200);
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

		// Definindo posição dos JLabels e JTextFields e suas fontes
		Font labelFont = new Font("Montserrat", Font.BOLD, 16);
		Font textFont = new Font("Montserrat", Font.BOLD, 14);

		// Adicionando título da lista de produtos
		lblTituloLista.setFont(labelFont);
		lblTituloLista.setForeground(new Color(29, 53, 87));
		lblTituloLista.setBounds(20, 80, 200, 20);
		this.add(lblTituloLista);

		// Editando Lista
		this.listaProdutos.setBackground(Color.white);
		this.listaProdutos.setBounds(20, 105, 480, 100);
		this.listaProdutos.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		this.listaProdutos.setVisibleRowCount(10);
		this.listaProdutos.addListSelectionListener(this);
		this.add(this.listaProdutos);

		// Adicionando Barra de Rolagem
		JScrollPane painel = new JScrollPane(this.getListaProdutos());
		painel.setBounds(20, 105, 507, 100);
		painel.setViewportView(this.getListaProdutos());
		painel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		painel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		this.add(painel);

		// Quantidade no Estoque
		lblQtdEstoque.setFont(labelFont);
		lblQtdEstoque.setForeground(new Color(29, 53, 87));
		lblQtdEstoque.setBounds(20, 210, 185, 20);
		valorQtdEstoque.setFont(labelFont);
		valorQtdEstoque.setForeground(new Color(29, 53, 87));
		valorQtdEstoque.setBounds(200, 210, 100, 20);
		valorQtdEstoque.setText("0");
		this.add(lblQtdEstoque);
		this.add(valorQtdEstoque);

		// Produto Vendido
		lblProdVendido.setFont(labelFont);
		lblProdVendido.setForeground(new Color(29, 53, 87));
		lblProdVendido.setBounds(20, 240, 140, 20);
		valorProdVendido.setFont(labelFont);
		valorProdVendido.setForeground(new Color(29, 53, 87));
		valorProdVendido.setBounds(155, 240, 180, 20);
		valorProdVendido.setText(" ");
		this.add(lblProdVendido);
		this.add(valorProdVendido);

		// Quantidade vendida
		lblQuantidade.setFont(labelFont);
		lblQuantidade.setForeground(new Color(29, 53, 87));
		lblQuantidade.setBounds(340, 240, 100, 20);
		valorQuantidade.setFont(labelFont);
		valorQuantidade.setForeground(new Color(29, 53, 87));
		valorQuantidade.setBounds(440, 240, 87, 20);
		this.add(lblQuantidade);
		this.add(valorQuantidade);

		// Preço Unitário
		lblPrecoUnit.setFont(labelFont);
		lblPrecoUnit.setForeground(new Color(29, 53, 87));
		lblPrecoUnit.setBounds(20, 270, 125, 20);
		valorPrecoUnit.setFont(labelFont);
		valorPrecoUnit.setForeground(new Color(29, 53, 87));
		valorPrecoUnit.setBounds(145, 270, 87, 20);
		valorPrecoUnit.setText("0");
		this.add(lblPrecoUnit);
		this.add(valorPrecoUnit);

		// Preço Unitário
		lblIdVenda.setFont(labelFont);
		lblIdVenda.setForeground(new Color(29, 53, 87));
		lblIdVenda.setBounds(20, 270, 125, 20);
		valorIdVenda.setFont(labelFont);
		valorIdVenda.setForeground(new Color(29, 53, 87));
		valorIdVenda.setBounds(145, 270, 87, 20);
		valorIdVenda.setText(Integer.toString(indexVenda));
		this.add(lblIdVenda);
		this.add(valorIdVenda);

		// TERMINAR DE ADICIONAR COMPONENTES

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

	public JList<String> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(JList<String> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

}
