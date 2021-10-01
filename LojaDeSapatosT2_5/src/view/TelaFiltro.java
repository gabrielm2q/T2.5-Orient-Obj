package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import control.ControleTelaFiltro;

public class TelaFiltro extends JFrame implements ActionListener {
	private ControleTelaFiltro controlTela;
	private String tipoFiltro;

	// Declarando valores que irão compor as ComboBoxes
	private String[] tamanhos = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
			"15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32",
			"33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49",
			"50" };

	// Declarando componentes da tela
	private JLabel titulo;
	private JButton btnBuscar = new JButton("Realizar Busca");
	private JList<String> lista;

	// Componentes de buscar pelo nome
	private JLabel lblNome = new JLabel("Nome do Produto: ");
	private JTextField valorNome;

	// Componentes de buscar produto pelo tamanho
	private JLabel lblTamanho = new JLabel("Tamanho do Produto: ");
	private JComboBox<String> valorTamanho = new JComboBox<>(tamanhos);

	public TelaFiltro(String tipoFiltro) {
		super("Buscar");
		this.controlTela = new ControleTelaFiltro(this);
		this.setTipoFiltro(tipoFiltro);

		this.setSize(560, 520);
		this.setLayout(null);
		this.setResizable(false);

		// Definindo fontes
		Font labelFont = new Font("Montserrat", Font.BOLD, 16);
		Font textFont = new Font("Montserrat", Font.BOLD, 14);

		/*
		 * De acordo com o tipo de filtro escolhido e recebido na string tipo filtro,
		 * sera exibida uma tela que melhor se adequará ao retorno esperado
		 */
		if (tipoFiltro.equals("nomeproduto")) {// BUSCAR PELO NOME DO PRODUTO
			titulo = new JLabel("Buscar Produto", JLabel.CENTER);

			lblNome.setFont(labelFont); // CAMPO DE NOME A SER BUSCADO
			lblNome.setForeground(new Color(29, 53, 87));
			lblNome.setBounds(20, 60, 150, 20);
			valorNome = new JTextField(100);
			valorNome.setFont(textFont);
			valorNome.setBounds(170, 62, 350, 20);
			this.add(valorNome);
			this.add(lblNome);

			lista = new JList<String>(); // Adicionando Lista
			lista.setForeground(new Color(29, 53, 87));
			lista.setBounds(20, 95, 500, 300);
			lista.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			lista.setVisibleRowCount(10);
			this.add(lista);

			JScrollPane painel = new JScrollPane(this.getLista()); // Adicionando Barra de Rolagem para a lista
			painel.setBounds(20, 95, 500, 300);
			painel.setViewportView(this.getLista());
			painel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			painel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			this.add(painel);

			btnBuscar.setBounds(20, 410, 500, 55); // Posicao do botao de buscar

		} else if (tipoFiltro.equals("tamanhoproduto")) {

			titulo = new JLabel("Buscar Produto", JLabel.CENTER);

			lblTamanho.setFont(labelFont); // CAMPO DE NOME A SER BUSCADO
			lblTamanho.setForeground(new Color(29, 53, 87));
			lblTamanho.setBounds(20, 60, 175, 20);
			valorTamanho.setFont(textFont);
			valorTamanho.setBounds(195, 62, 325, 20);
			this.add(valorTamanho);
			this.add(lblTamanho);

			lista = new JList<String>(); // Adicionando Lista
			lista.setForeground(new Color(29, 53, 87));
			lista.setBounds(20, 95, 500, 300);
			lista.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			lista.setVisibleRowCount(10);
			this.add(lista);

			JScrollPane painel = new JScrollPane(this.getLista()); // Adicionando Barra de Rolagem para a lista
			painel.setBounds(20, 95, 500, 300);
			painel.setViewportView(this.getLista());
			painel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			painel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			this.add(painel);

			btnBuscar.setBounds(20, 410, 500, 55); // Posicao do botao de buscar

		} else if (tipoFiltro.equals("nomecliente")) {

			titulo = new JLabel("Buscar Cliente", JLabel.CENTER);

			lblNome.setFont(labelFont); // CAMPO DE NOME A SER BUSCADO
			lblNome.setForeground(new Color(29, 53, 87));
			lblNome.setBounds(20, 60, 140, 20);
			lblNome.setText("Nome do Cliente: ");
			valorNome = new JTextField(100);
			valorNome.setFont(textFont);
			valorNome.setBounds(160, 62, 360, 20);
			this.add(valorNome);
			this.add(lblNome);

			lista = new JList<String>(); // Adicionando Lista
			lista.setForeground(new Color(29, 53, 87));
			lista.setBounds(20, 95, 500, 300);
			lista.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			lista.setVisibleRowCount(10);
			this.add(lista);

			JScrollPane painel = new JScrollPane(this.getLista()); // Adicionando Barra de Rolagem para a lista
			painel.setBounds(20, 95, 500, 300);
			painel.setViewportView(this.getLista());
			painel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			painel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			this.add(painel);

			btnBuscar.setBounds(20, 410, 500, 55); // Posicao do botao de buscar

		} else if (tipoFiltro.equals("vendacliente")) {

			titulo = new JLabel("Buscar Venda", JLabel.CENTER);

			lblNome.setFont(labelFont); // CAMPO DE NOME A SER BUSCADO
			lblNome.setForeground(new Color(29, 53, 87));
			lblNome.setBounds(20, 60, 175, 20);
			lblNome.setText("Nome do Comprador: ");
			valorNome = new JTextField(100);
			valorNome.setFont(textFont);
			valorNome.setBounds(195, 62, 325, 20);
			this.add(valorNome);
			this.add(lblNome);

			lista = new JList<String>(); // Adicionando Lista
			lista.setForeground(new Color(29, 53, 87));
			lista.setBounds(20, 95, 500, 300);
			lista.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			lista.setVisibleRowCount(10);
			this.add(lista);

			JScrollPane painel = new JScrollPane(this.getLista()); // Adicionando Barra de Rolagem para a lista
			painel.setBounds(20, 95, 500, 300);
			painel.setViewportView(this.getLista());
			painel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			painel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			this.add(painel);

			btnBuscar.setBounds(20, 410, 500, 55); // Posicao do botao de buscar

		}

		// Estilo do Título
		titulo.setFont(new Font("Montserrat", Font.BOLD, 36));
		titulo.setForeground(new Color(29, 53, 87));

		// Cor do Plano de Fundo
		getContentPane().setBackground(new Color(70, 123, 157));

		// Fontes dos Botões
		Font f = new Font("Montserrat", Font.PLAIN, 20);
		btnBuscar.setFont(f);

		// Localização e Tamanho do Título
		titulo.setBounds(100, 5, 340, 50);

		// Adicionando componentes a tela
		this.add(titulo);
		this.add(btnBuscar);

		// Adicionando o ActionListener
		getBtnBuscar().addActionListener(this);

		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.controlTela.clicaBtn(e);

	}

	public ControleTelaFiltro getControlTela() {
		return controlTela;
	}

	public void setControlTela(ControleTelaFiltro controlTela) {
		this.controlTela = controlTela;
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}

	public JList<String> getLista() {
		return lista;
	}

	public void setLista(DefaultListModel<String> nomes) {
		this.lista.setModel(nomes);
		this.lista.updateUI();
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

	public String getTipoFiltro() {
		return tipoFiltro;
	}

	public void setTipoFiltro(String tipoFiltro) {
		this.tipoFiltro = tipoFiltro;
	}

	public String[] getTamanhos() {
		return tamanhos;
	}

	public void setTamanhos(String[] tamanhos) {
		this.tamanhos = tamanhos;
	}

	public JLabel getLblTamanho() {
		return lblTamanho;
	}

	public void setLblTamanho(JLabel lblTamanho) {
		this.lblTamanho = lblTamanho;
	}

	public int getValorTamanho() {
		return Integer.parseInt(valorTamanho.getSelectedItem().toString());
	}

	public void setValorTamanho(JComboBox<String> valorTamanho) {
		this.valorTamanho = valorTamanho;
	}

	public void setLista(JList<String> lista) {
		this.lista = lista;
	}

}
