package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

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
import model.Cliente;
import model.Dados;
import model.Funcionario;

/**
 * Tela dos Detalhes das Vendas. Exibe os atributos da Venda selecionada.
 * 
 * @author Gabriel Mariano
 */
public class TelaDetalheVenda extends JFrame implements ActionListener, ListSelectionListener {
	private JLabel titulo = new JLabel("Venda", JLabel.CENTER);
	private JButton btnSalvar = new JButton("Pagamento");

	private ControleTelaDetalheVenda controlaDetalhe;
	private int opcEditarSalvar;
	private int indexVenda;

	// Trabalhando com datas
	private GregorianCalendar dataCalendar = new GregorianCalendar();
	private Date data = new Date();
	private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	// Declarando componentes da tela
	private JLabel lblTituloLista = new JLabel("Produtos Disponíveis: ");
	private JList<String> listaProdutos;
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

	/**
	 * Construtor.
	 * 
	 * @see ControleTelaDetalheVenda
	 * 
	 * @param opcaoEditarSalvar Repassa à classe ControleTelaDetalheVenda se o
	 *                          usuário deseja salvar ou editar uma venda
	 * @param indexVenda        Repassa à classe ControleTelaDetalheVenda o index da
	 *                          venda a ser editada, caso necessário
	 */
	public TelaDetalheVenda(int opcaoEditarSalvar, int indexVenda) {
		super("Venda"); // JFrame com nome
		this.controlaDetalhe = new ControleTelaDetalheVenda(this, opcaoEditarSalvar, indexVenda);
		this.opcEditarSalvar = opcaoEditarSalvar;
		this.indexVenda = indexVenda;

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
		this.listaProdutos = new JList(Dados.getEstoque().getProduto().toArray());
		this.listaProdutos.setBackground(Color.white);
		this.listaProdutos.setBounds(20, 105, 480, 100);
		this.listaProdutos.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		this.listaProdutos.setVisibleRowCount(10);
		this.listaProdutos.addListSelectionListener(this);
		this.listaProdutos.setFont(textFont);
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
		valorQtdEstoque.setBounds(200, 210, 100, 20);
		valorQtdEstoque.setText("0");
		this.add(lblQtdEstoque);
		this.add(valorQtdEstoque);

		// Produto Vendido
		lblProdVendido.setFont(labelFont);
		lblProdVendido.setForeground(new Color(29, 53, 87));
		lblProdVendido.setBounds(20, 240, 140, 20);
		valorProdVendido.setFont(labelFont);
		valorProdVendido.setBounds(155, 240, 180, 20);
		valorProdVendido.setText(" ");
		this.add(lblProdVendido);
		this.add(valorProdVendido);

		// Quantidade vendida
		lblQuantidade.setFont(labelFont);
		lblQuantidade.setForeground(new Color(29, 53, 87));
		lblQuantidade.setBounds(340, 240, 100, 20);
		valorQuantidade.setFont(textFont);
		valorQuantidade.setBounds(440, 242, 87, 20);
		valorQuantidade.setText("0");
		this.add(lblQuantidade);
		this.add(valorQuantidade);

		// Preço Unitário
		lblPrecoUnit.setFont(labelFont);
		lblPrecoUnit.setForeground(new Color(29, 53, 87));
		lblPrecoUnit.setBounds(20, 270, 125, 20);
		valorPrecoUnit.setFont(labelFont);
		valorPrecoUnit.setBounds(140, 270, 85, 20);
		this.add(lblPrecoUnit);
		this.add(valorPrecoUnit);

		// Obtendo a Data da Venda
		this.data = dataCalendar.getTime();
		String dataCad = formato.format(data);

		lblDataVenda.setFont(labelFont); // CAMPO DE DATA DA VENDA
		lblDataVenda.setForeground(new Color(29, 53, 87));
		lblDataVenda.setBounds(328, 270, 120, 20);
		valorDataVenda.setFont(labelFont);
		valorDataVenda.setBounds(449, 270, 85, 20);
		valorDataVenda.setText(dataCad);
		this.add(valorDataVenda);
		this.add(lblDataVenda);

		// ID da venda
		lblIdVenda.setFont(labelFont);
		lblIdVenda.setForeground(new Color(29, 53, 87));
		lblIdVenda.setBounds(20, 300, 120, 20);
		valorIdVenda.setFont(labelFont);
		valorIdVenda.setBounds(122, 300, 85, 20);
		valorIdVenda.setText(Integer.toString(Dados.getContadorIdVenda()));
		this.add(lblIdVenda);
		this.add(valorIdVenda);

		// Desconto
		lblDesconto.setFont(labelFont);
		lblDesconto.setForeground(new Color(29, 53, 87));
		lblDesconto.setBounds(340, 300, 100, 20);
		valorDesconto.setFont(textFont);
		valorDesconto.setBounds(425, 302, 100, 20);
		valorDesconto.setText("0.0");
		this.add(lblDesconto);
		this.add(valorDesconto);

		// Clientes
		lblCliente.setFont(labelFont);
		lblCliente.setForeground(new Color(29, 53, 87));
		lblCliente.setBounds(20, 330, 75, 20);
		this.valorCliente = new JComboBox(Dados.getCliente().toArray());
		valorCliente.setFont(textFont);
		valorCliente.setBounds(122, 332, 404, 20);
		this.add(lblCliente);
		this.add(valorCliente);

		// Funcionarios
		lblFuncionario.setFont(labelFont);
		lblFuncionario.setForeground(new Color(29, 53, 87));
		lblFuncionario.setBounds(20, 360, 100, 20);
		this.valorFuncionario = new JComboBox(Dados.getFuncionario().toArray());
		valorFuncionario.setFont(textFont);
		valorFuncionario.setBounds(122, 362, 404, 20);
		this.add(lblFuncionario);
		this.add(valorFuncionario);

		// Adicionando componentes a tela
		this.add(titulo);
		this.add(btnSalvar);

		// Adicionando o ActionListener
		getBtnSalvar().addActionListener(this);

		this.setVisible(true);

	}

	/**
	 * ActionPerformed da Lista da Tela. Envia o evento à classe
	 * ControleTelaDetalheVenda para que esta execute as ações adequadas.
	 * 
	 * @see ControleTelaDetalheVenda
	 * 
	 * @param ListSelectionEvent
	 * @return void
	 */
	@Override
	public void valueChanged(ListSelectionEvent e) {
		this.controlaDetalhe.clicaLista(e);

	}

	/**
	 * ActionPerformed dos Botões da Tela. Envia o evento à classe
	 * ControleTelaDetalheVenda para que esta execute as ações adequadas.
	 * 
	 * @see ControleTelaDetalheVenda
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

	public ControleTelaDetalheVenda getControlaDetalhe() {
		return controlaDetalhe;
	}

	public void setControlaDetalhe(ControleTelaDetalheVenda controlaDetalhe) {
		this.controlaDetalhe = controlaDetalhe;
	}

	public GregorianCalendar getDataCalendar() {
		return dataCalendar;
	}

	public void setDataCalendar(GregorianCalendar dataCalendar) {
		this.dataCalendar = dataCalendar;
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

	public JLabel getLblTituloLista() {
		return lblTituloLista;
	}

	public void setLblTituloLista(JLabel lblTituloLista) {
		this.lblTituloLista = lblTituloLista;
	}

	public JList<String> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(JList<String> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

	public JLabel getLblQtdEstoque() {
		return lblQtdEstoque;
	}

	public void setLblQtdEstoque(JLabel lblQtdEstoque) {
		this.lblQtdEstoque = lblQtdEstoque;
	}

	public JLabel getValorQtdEstoque() {
		return valorQtdEstoque;
	}

	public void setValorQtdEstoque(String valorQtdEstoque) {
		this.valorQtdEstoque.setText(valorQtdEstoque);
	}

	public JLabel getLblProdVendido() {
		return lblProdVendido;
	}

	public void setLblProdVendido(JLabel lblProdVendido) {
		this.lblProdVendido = lblProdVendido;
	}

	public JLabel getValorProdVendido() {
		return valorProdVendido;
	}

	public void setValorProdVendido(String valorProdVendido) {
		this.valorProdVendido.setText(valorProdVendido);
	}

	public JLabel getLblQuantidade() {
		return lblQuantidade;
	}

	public void setLblQuantidade(JLabel lblQuantidade) {
		this.lblQuantidade = lblQuantidade;
	}

	public JTextField getValorQuantidade() {
		return valorQuantidade;
	}

	public void setValorQuantidade(String valorQuantidade) {
		this.valorQuantidade.setText(valorQuantidade);
	}

	public JLabel getLblPrecoUnit() {
		return lblPrecoUnit;
	}

	public void setLblPrecoUnit(JLabel lblPrecoUnit) {
		this.lblPrecoUnit = lblPrecoUnit;
	}

	public JLabel getValorPrecoUnit() {
		return valorPrecoUnit;
	}

	public void setValorPrecoUnit(String valorPrecoUnit) {
		this.valorPrecoUnit.setText(valorPrecoUnit);
	}

	public JLabel getLblIdVenda() {
		return lblIdVenda;
	}

	public void setLblIdVenda(JLabel lblIdVenda) {
		this.lblIdVenda = lblIdVenda;
	}

	public JLabel getValorIdVenda() {
		return valorIdVenda;
	}

	public void setValorIdVenda(String valorIdVenda) {
		this.valorIdVenda.setText(valorIdVenda);
	}

	public JLabel getLblDesconto() {
		return lblDesconto;
	}

	public void setLblDesconto(JLabel lblDesconto) {
		this.lblDesconto = lblDesconto;
	}

	public JTextField getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(String valorDesconto) {
		this.valorDesconto.setText(valorDesconto);
	}

	public JLabel getLblDataVenda() {
		return lblDataVenda;
	}

	public void setLblDataVenda(JLabel lblDataVenda) {
		this.lblDataVenda = lblDataVenda;
	}

	public JLabel getValorDataVenda() {
		return valorDataVenda;
	}

	public void setValorDataVenda(Date valorDataVenda) {
		String data = formato.format(valorDataVenda);
		this.valorDataVenda.setText(data);
	}

	public JLabel getLblCliente() {
		return lblCliente;
	}

	public void setLblCliente(JLabel lblCliente) {
		this.lblCliente = lblCliente;
	}

	public JComboBox<String> getValorCliente() {
		return valorCliente;
	}

	public void setValorCliente(Cliente cli) {
		this.valorCliente.setSelectedItem(cli);
	}

	public JLabel getLblFuncionario() {
		return lblFuncionario;
	}

	public void setLblFuncionario(JLabel lblFuncionario) {
		this.lblFuncionario = lblFuncionario;
	}

	public JComboBox<String> getValorFuncionario() {
		return valorFuncionario;
	}

	public void setValorFuncionario(Funcionario func) {
		this.valorFuncionario.setSelectedItem(func);
	}

	public int getOpcEditarSalvar() {
		return opcEditarSalvar;
	}

	public void setOpcEditarSalvar(int opcEditarSalvar) {
		this.opcEditarSalvar = opcEditarSalvar;
	}

	public int getIndexVenda() {
		return indexVenda;
	}

	public void setIndexVenda(int indexVenda) {
		this.indexVenda = indexVenda;
	}

	public void setValorQtdEstoque(JLabel valorQtdEstoque) {
		this.valorQtdEstoque = valorQtdEstoque;
	}

	public void setValorProdVendido(JLabel valorProdVendido) {
		this.valorProdVendido = valorProdVendido;
	}

	public void setValorQuantidade(JTextField valorQuantidade) {
		this.valorQuantidade = valorQuantidade;
	}

	public void setValorPrecoUnit(JLabel valorPrecoUnit) {
		this.valorPrecoUnit = valorPrecoUnit;
	}

	public void setValorIdVenda(JLabel valorIdVenda) {
		this.valorIdVenda = valorIdVenda;
	}

	public void setValorDesconto(JTextField valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public void setValorDataVenda(JLabel valorDataVenda) {
		this.valorDataVenda = valorDataVenda;
	}

	public void setValorCliente(JComboBox<String> valorCliente) {
		this.valorCliente = valorCliente;
	}

	public void setValorFuncionario(JComboBox<String> valorFuncionario) {
		this.valorFuncionario = valorFuncionario;
	}

}
