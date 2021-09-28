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
import javax.swing.JTextField;

import control.ControleDados;
import control.ControleTelaDetalheEstoque;

public class TelaDetalheEstoque extends JFrame implements ActionListener {
	private JLabel titulo;
	private JButton btnSalvar = new JButton("Salvar");
	private JButton btnDeletar = new JButton("Deletar");

	private ControleTelaDetalheEstoque controlaDetalhe;
	private ControleDados dados = new ControleDados();

	// Declarando valores que irão compor as ComboBoxes
	private String[] tamanhos = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
			"15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32",
			"33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49",
			"50" };
	private String[] gen = { "M", "F", "Unissex" };
	private String[] alturaSaltos = { "Baixo", "Médio", "Alto", "Não Possui" };

	// Trabalhando com datas
	private GregorianCalendar dataCalendar = new GregorianCalendar();
	private Date data = new Date();
	private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	// Declarando componentes da tela
	private JLabel lblQuantidade = new JLabel("Quantidade: "); // Quantidade
	private JTextField valorQuantidade;
	private JLabel lblCategoria = new JLabel("Categoria: "); // Categoria
	private JLabel valorCategoria;
	private JLabel lblDataCadastro = new JLabel("Data de Cadastro: "); // Data de Cadastro
	private JLabel valorDataCadastro;
	private JLabel lblIdProd = new JLabel("ID: "); // ID do Produto
	private JTextField valorIdProd;
	private JLabel lblNome = new JLabel("Nome: "); // Nome
	private JTextField valorNome;
	private JLabel lblTamanho = new JLabel("Tamanho: "); // Tamanho
	private JComboBox valorTamanho = new JComboBox(tamanhos);
	private JLabel lblPreco = new JLabel("Preço: "); // Preço
	private JTextField valorPreco;
	private JLabel lblMarca = new JLabel("Marca: "); // Marca
	private JTextField valorMarca;
	private JLabel lblOrigem = new JLabel("País de Origem: "); // País de Origem
	private JTextField valorOrigem;
	private JLabel lblGarantia = new JLabel("Garantia: "); // Tempo de Garantia
	private JTextField valorGarantia;
	private JLabel lblGenero = new JLabel("Gênero: "); // Gênero
	private JComboBox valorGenero = new JComboBox(gen);
	private JLabel lblBarras = new JLabel("Código de Barras: "); // Código de Barras
	private JTextField valorBarras;
	private JLabel lblCor = new JLabel("Cor: "); // Cor
	private JTextField valorCor;
	private JLabel lblMaterial = new JLabel("Material: ");
	private JTextField valorMaterial;

	// Declarando componentes específicos da tela
	// SALTO
	private JLabel lblSalto = new JLabel("Tipo de Salto: "); // Tipo de Salto
	private JTextField valorSalto;
	private JLabel lblCorExt = new JLabel("Cor Externa: "); // Cor externa
	private JTextField valorCorExt;
	private JLabel lblCorSol = new JLabel("Cor do Solado: "); // Cor do Solado
	private JTextField valorCorSol;
	private JLabel lblAltSalto = new JLabel("Altura do Salto: "); // Altura do Salto
	private JTextField valorAltSalto;

	// TENIS
	private JLabel lblAtividade = new JLabel("Atividade Indicada: "); // Atividade Indicada
	private JTextField valorAtividade;
	private JLabel lblTecSol = new JLabel("Tecnologia do Solado: "); // Tecnologia do Solado
	private JTextField valorTecSol;
	private JLabel lblPisada = new JLabel("Tipo de Pisada: "); // Tipo de Pisada
	private JTextField valorPisada;
	private JLabel lblTipoPalmilha = new JLabel("Tipo de Palmilha: "); // Tipo de Palmilha
	private JTextField valorTipoPalmilha;
	private JLabel lblPeso = new JLabel("Peso (g): "); // Peso
	private JTextField valorPeso;
	private JLabel lblAmarra = new JLabel("Tipo de Amarração: "); // Tipo de Amarração
	private JTextField valorAmarra;
	private JLabel lblCorCadarco = new JLabel("Cor do Cadarço: "); // Cor do Cadarço
	private JTextField valorCorCadarco;

	// BOTA
	private JLabel lblModelo = new JLabel("Modelo: "); // Modelo
	private JTextField valorModelo;
	private JLabel lblAltCano = new JLabel("Altura do Cano: "); // Altura do Cano
	private JTextField valorAltCano;
	private JLabel lblTipoSalto = new JLabel("Tipo de Salto: "); // Tipo de Salto
	private JTextField valorTipoSalto;
	private JLabel lblTiPalmilha = new JLabel("Tipo de Palmilha: "); // Tipo de Palmilha
	private JTextField valorTiPalmilha;
	private JLabel lblMatSolado = new JLabel("Material do Solado: "); // Material do Solado
	private JTextField valorMatSolado;

	// SAPATO
	private JLabel lblSolado = new JLabel("Material do Solado: "); // Material do Solado
	private JTextField valorSolado;
	private JLabel lblInterno = new JLabel("Material Interno: "); // Material Interno
	private JTextField valorInterno;
	private JLabel lblBico = new JLabel("Tipo de Bico: "); // Tipo de Bico
	private JTextField valorBico;
	private JLabel lblAlturaSalto = new JLabel("Altura do Salto: "); // Altura do Salto
	private JComboBox valorAlturaSalto = new JComboBox(alturaSaltos);
	private JLabel lblPalmilha = new JLabel("Tipo de Palmilha: "); // Tipo de Palmilha
	private JTextField valorPalmilha;

	public TelaDetalheEstoque(ControleDados d, int opcao, int idx, String tipoProd) {
		super(tipoProd); // JFrame com o tipo do produto
		this.dados = d;
		this.controlaDetalhe = new ControleTelaDetalheEstoque(this, dados, opcao, idx);

		this.setSize(560, 520);
		this.setLayout(null);
		this.setResizable(false);

		// Estilo do Título
		titulo = new JLabel(tipoProd, JLabel.CENTER);
		titulo.setFont(new Font("Montserrat", Font.BOLD, 44));
		titulo.setForeground(new Color(29, 53, 87));

		// Cor do Plano de Fundo
		getContentPane().setBackground(new Color(70, 123, 157));

		// Fontes dos Botões
		Font f = new Font("Montserrat", Font.PLAIN, 20);
		btnSalvar.setFont(f);
		btnDeletar.setFont(f);

		// Localização e Tamanho dos componentes da tela
		titulo.setBounds(90, 20, 340, 50);
		btnDeletar.setBounds(20, 400, 239, 75);
		btnSalvar.setBounds(279, 400, 239, 75);

		// Adicionando componentes a tela
		this.add(titulo);
		this.add(btnSalvar);
		this.add(btnDeletar);

		// Definindo posição dos JLabels e JTextFields e suas fontes
		Font labelFont = new Font("Montserrat", Font.BOLD, 16);
		Font textFont = new Font("Montserrat", Font.BOLD, 14);

		/*
		 * A partir de agora, será gerada uma tela diferente para cada tipo de produto
		 * da lista (Salto, Sapato, Tênis e Bota).
		 */
		// lblCategoria = new JLabel("Categoria: ")

		lblNome.setFont(labelFont); // CAMPO DE NOME
		lblNome.setForeground(new Color(29, 53, 87));
		lblNome.setBounds(20, 78, 60, 20);
		valorNome = new JTextField(50);
		valorNome.setFont(textFont);
		valorNome.setBounds(75, 80, 200, 20);
		this.add(valorNome);
		this.add(lblNome);

		this.data = dataCalendar.getTime(); // Obtendo a data de Cadastro
		String dataCad = formato.format(data);

		lblDataCadastro.setFont(labelFont); // CAMPO DE DATA DE CADASTRO
		lblDataCadastro.setForeground(new Color(29, 53, 87));
		lblDataCadastro.setBounds(292, 78, 165, 20);
		valorDataCadastro = new JLabel();
		valorDataCadastro.setFont(labelFont);
		valorDataCadastro.setBounds(435, 78, 80, 20);
		valorDataCadastro.setText(dataCad);
		this.add(valorDataCadastro);
		this.add(lblDataCadastro);

		lblQuantidade.setFont(labelFont); // CAMPO DE QUANTIDADE
		lblQuantidade.setForeground(new Color(29, 53, 87));
		lblQuantidade.setBounds(20, 105, 110, 20);
		valorQuantidade = new JTextField(8);
		valorQuantidade.setFont(textFont);
		valorQuantidade.setText("0000");
		valorQuantidade.setBounds(118, 107, 40, 20);
		this.add(valorQuantidade);
		this.add(lblQuantidade);

		lblCategoria.setFont(labelFont); // CAMPO DE CATEGORIA
		lblCategoria.setForeground(new Color(29, 53, 87));
		lblCategoria.setBounds(170, 105, 100, 20);
		valorCategoria = new JLabel(tipoProd);
		valorCategoria.setFont(labelFont);
		valorCategoria.setBounds(252, 105, 55, 20);
		this.add(valorCategoria);
		this.add(lblCategoria);

		lblIdProd.setFont(labelFont); // CAMPO DE ID
		lblIdProd.setForeground(new Color(29, 53, 87));
		lblIdProd.setBounds(318, 105, 35, 20);
		valorIdProd = new JTextField(8);
		valorIdProd.setFont(textFont);
		valorIdProd.setText("00");
		valorIdProd.setBounds(343, 107, 30, 20);
		this.add(valorIdProd);
		this.add(lblIdProd);

		lblTamanho.setFont(labelFont); // CAMPO DE TAMANHO
		lblTamanho.setForeground(new Color(29, 53, 87));
		lblTamanho.setBounds(389, 105, 85, 20);
		valorTamanho.setFont(textFont);
		valorTamanho.setBounds(470, 107, 45, 20);
		this.add(valorTamanho);
		this.add(lblTamanho);

		lblPreco.setFont(labelFont); // CAMPO DE PRECO
		lblPreco.setForeground(new Color(29, 53, 87));
		lblPreco.setBounds(20, 134, 85, 20);
		valorPreco = new JTextField(50);
		valorPreco.setFont(textFont);
		valorPreco.setBounds(75, 136, 45, 20);
		this.add(valorPreco);
		this.add(lblPreco);

		lblMarca.setFont(labelFont); // CAMPO DE MARCA
		lblMarca.setForeground(new Color(29, 53, 87));
		lblMarca.setBounds(133, 134, 65, 20);
		valorMarca = new JTextField(40);
		valorMarca.setFont(textFont);
		valorMarca.setBounds(189, 136, 100, 20);
		this.add(valorMarca);
		this.add(lblMarca);

		lblOrigem.setFont(labelFont); // CAMPO DE PAIS DE ORIGEM
		lblOrigem.setForeground(new Color(29, 53, 87));
		lblOrigem.setBounds(300, 134, 135, 20);
		valorOrigem = new JTextField(40);
		valorOrigem.setFont(textFont);
		valorOrigem.setBounds(425, 136, 91, 20);
		this.add(valorOrigem);
		this.add(lblOrigem);

		// DAQUI

		lblGarantia.setFont(labelFont); // CAMPO DE GARANTIA
		lblGarantia.setForeground(new Color(29, 53, 87));
		lblGarantia.setBounds(20, 163, 75, 20);
		valorGarantia = new JTextField(40);
		valorGarantia.setFont(textFont);
		valorGarantia.setText("1 ano");
		valorGarantia.setBounds(97, 165, 75, 20);
		this.add(valorGarantia);
		this.add(lblGarantia);

		lblGenero.setFont(labelFont); // CAMPO DE GENERO
		lblGenero.setForeground(new Color(29, 53, 87));
		lblGenero.setBounds(187, 163, 75, 20);
		valorGenero.setFont(textFont);
		valorGenero.setBounds(255, 165, 85, 20);
		this.add(valorGenero);
		this.add(lblGenero);

		lblCor.setFont(labelFont); // CAMPO DE COR
		lblCor.setForeground(new Color(29, 53, 87));
		lblCor.setBounds(355, 163, 50, 20);
		valorCor = new JTextField(40);
		valorCor.setFont(textFont);
		valorCor.setBounds(395, 165, 122, 20);
		this.add(valorCor);
		this.add(lblCor);

		lblBarras.setFont(labelFont); // CAMPO DE CODIGO DE BARRAS
		lblBarras.setForeground(new Color(29, 53, 87));
		lblBarras.setBounds(20, 192, 150, 20);
		valorBarras = new JTextField(40);
		valorBarras.setFont(textFont);
		valorBarras.setText("010101");
		valorBarras.setBounds(166, 194, 125, 20);
		this.add(valorBarras);
		this.add(lblBarras);

		lblMaterial.setFont(labelFont); // CAMPO DE MATERIAL
		lblMaterial.setForeground(new Color(29, 53, 87));
		lblMaterial.setBounds(307, 192, 100, 20);
		valorMaterial = new JTextField(40);
		valorMaterial.setFont(textFont);
		valorMaterial.setBounds(381, 194, 136, 20);
		this.add(valorMaterial);
		this.add(lblMaterial);

		// CONSTRUIR DIVERSAS INTERFACES DE ACORDO COM O PRODUTO ESCOLHIDO
		if (tipoProd.equals("Salto")) {

		}

		// Adicionando o ActionListener
		getBtnSalvar().addActionListener(this);
		getBtnDeletar().addActionListener(this);

		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

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

	public ControleDados getDados() {
		return dados;
	}

	public void setDados(ControleDados dados) {
		this.dados = dados;
	}

}
