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

import control.ControleTelaDetalheEstoque;
import model.Dados;

public class TelaDetalheEstoque extends JFrame implements ActionListener {
	private JLabel titulo;
	private JButton btnSalvar = new JButton("Salvar");
	private JButton btnDeletar = new JButton("Deletar");

	private ControleTelaDetalheEstoque controlaDetalhe;

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
	private JLabel valorIdProd;
	private JLabel lblNome = new JLabel("Nome: "); // Nome
	private JTextField valorNome;
	private JLabel lblTamanho = new JLabel("Tamanho: "); // Tamanho
	private JComboBox<String> valorTamanho = new JComboBox<>(tamanhos);
	private JLabel lblPreco = new JLabel("Preço: "); // Preço
	private JTextField valorPreco;
	private JLabel lblMarca = new JLabel("Marca: "); // Marca
	private JTextField valorMarca;
	private JLabel lblOrigem = new JLabel("País de Origem: "); // País de Origem
	private JTextField valorOrigem;
	private JLabel lblGarantia = new JLabel("Garantia: "); // Tempo de Garantia
	private JTextField valorGarantia;
	private JLabel lblGenero = new JLabel("Gênero: "); // Gênero
	private JComboBox<String> valorGenero = new JComboBox<>(gen);
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
	private JComboBox<String> valorAlturaSalto = new JComboBox<>(alturaSaltos);
	private JLabel lblPalmilha = new JLabel("Tipo de Palmilha: "); // Tipo de Palmilha
	private JTextField valorPalmilha;

	public TelaDetalheEstoque(int opcEditarSalvar, String tipoProd, int indexProduto) {
		super(tipoProd); // JFrame com a categoria do produto como título
		this.controlaDetalhe = new ControleTelaDetalheEstoque(this, opcEditarSalvar, tipoProd, indexProduto);

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
		btnDeletar.setBounds(20, 395, 239, 75);
		btnSalvar.setBounds(279, 395, 239, 75);

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
		//

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
		lblQuantidade.setBounds(20, 111, 110, 20);
		valorQuantidade = new JTextField(8);
		valorQuantidade.setFont(textFont);
		valorQuantidade.setText("0000");
		valorQuantidade.setBounds(118, 113, 40, 20);
		this.add(valorQuantidade);
		this.add(lblQuantidade);

		lblCategoria.setFont(labelFont); // CAMPO DE CATEGORIA
		lblCategoria.setForeground(new Color(29, 53, 87));
		lblCategoria.setBounds(170, 111, 100, 20);
		valorCategoria = new JLabel(tipoProd);
		valorCategoria.setFont(labelFont);
		valorCategoria.setBounds(252, 111, 55, 20);
		this.add(valorCategoria);
		this.add(lblCategoria);

		lblIdProd.setFont(labelFont); // CAMPO DE ID
		lblIdProd.setForeground(new Color(29, 53, 87));
		lblIdProd.setBounds(318, 111, 35, 20);
		valorIdProd = new JLabel();
		valorIdProd.setFont(labelFont);
		valorIdProd.setText(Integer.toString(Dados.getContadorIdProd()));
		valorIdProd.setBounds(343, 111, 30, 20);
		this.add(valorIdProd);
		this.add(lblIdProd);

		lblTamanho.setFont(labelFont); // CAMPO DE TAMANHO
		lblTamanho.setForeground(new Color(29, 53, 87));
		lblTamanho.setBounds(389, 111, 85, 20);
		valorTamanho.setFont(textFont);
		valorTamanho.setBounds(470, 113, 45, 20);
		this.add(valorTamanho);
		this.add(lblTamanho);

		lblPreco.setFont(labelFont); // CAMPO DE PRECO
		lblPreco.setForeground(new Color(29, 53, 87));
		lblPreco.setBounds(20, 146, 85, 20);
		valorPreco = new JTextField(50);
		valorPreco.setFont(textFont);
		valorPreco.setText("00.00");
		valorPreco.setBounds(75, 148, 45, 20);
		this.add(valorPreco);
		this.add(lblPreco);

		lblMarca.setFont(labelFont); // CAMPO DE MARCA
		lblMarca.setForeground(new Color(29, 53, 87));
		lblMarca.setBounds(133, 146, 65, 20);
		valorMarca = new JTextField(40);
		valorMarca.setFont(textFont);
		valorMarca.setBounds(189, 148, 100, 20);
		this.add(valorMarca);
		this.add(lblMarca);

		lblOrigem.setFont(labelFont); // CAMPO DE PAIS DE ORIGEM
		lblOrigem.setForeground(new Color(29, 53, 87));
		lblOrigem.setBounds(300, 146, 135, 20);
		valorOrigem = new JTextField(40);
		valorOrigem.setFont(textFont);
		valorOrigem.setBounds(425, 148, 91, 20);
		this.add(valorOrigem);
		this.add(lblOrigem);

		lblGarantia.setFont(labelFont); // CAMPO DE GARANTIA
		lblGarantia.setForeground(new Color(29, 53, 87));
		lblGarantia.setBounds(20, 181, 75, 20);
		valorGarantia = new JTextField(40);
		valorGarantia.setFont(textFont);
		valorGarantia.setText("0 ano");
		valorGarantia.setBounds(97, 183, 75, 20);
		this.add(valorGarantia);
		this.add(lblGarantia);

		lblGenero.setFont(labelFont); // CAMPO DE GENERO
		lblGenero.setForeground(new Color(29, 53, 87));
		lblGenero.setBounds(187, 181, 75, 20);
		valorGenero.setFont(textFont);
		valorGenero.setBounds(255, 183, 85, 20);
		this.add(valorGenero);
		this.add(lblGenero);

		lblCor.setFont(labelFont); // CAMPO DE COR
		lblCor.setForeground(new Color(29, 53, 87));
		lblCor.setBounds(355, 181, 50, 20);
		valorCor = new JTextField(40);
		valorCor.setFont(textFont);
		valorCor.setBounds(395, 183, 122, 20);
		this.add(valorCor);
		this.add(lblCor);

		lblBarras.setFont(labelFont); // CAMPO DE CODIGO DE BARRAS
		lblBarras.setForeground(new Color(29, 53, 87));
		lblBarras.setBounds(20, 216, 150, 20);
		valorBarras = new JTextField(40);
		valorBarras.setFont(textFont);
		valorBarras.setText("000000");
		valorBarras.setBounds(166, 218, 125, 20);
		this.add(valorBarras);
		this.add(lblBarras);

		lblMaterial.setFont(labelFont); // CAMPO DE MATERIAL
		lblMaterial.setForeground(new Color(29, 53, 87));
		lblMaterial.setBounds(307, 216, 100, 20);
		valorMaterial = new JTextField(40);
		valorMaterial.setFont(textFont);
		valorMaterial.setBounds(381, 218, 136, 20);
		this.add(valorMaterial);
		this.add(lblMaterial);

		// CONSTRUIR DIVERSAS INTERFACES DE ACORDO COM O PRODUTO ESCOLHIDO
		if (tipoProd.equals("Salto")) { // PARTE ESPECÍFICA DE SALTO

			lblSalto.setFont(labelFont); // CAMPO DE TIPO DE SALTO
			lblSalto.setForeground(new Color(29, 53, 87));
			lblSalto.setBounds(20, 251, 110, 20);
			valorSalto = new JTextField(40);
			valorSalto.setFont(textFont);
			valorSalto.setBounds(135, 253, 156, 20);
			this.add(valorSalto);
			this.add(lblSalto);

			lblCorExt.setFont(labelFont); // CAMPO DE COR EXTERNA
			lblCorExt.setForeground(new Color(29, 53, 87));
			lblCorExt.setBounds(307, 251, 110, 20);
			valorCorExt = new JTextField(40);
			valorCorExt.setFont(textFont);
			valorCorExt.setBounds(410, 253, 107, 20);
			this.add(valorCorExt);
			this.add(lblCorExt);

			lblCorSol.setFont(labelFont); // CAMPO DE COR SOLADO
			lblCorSol.setForeground(new Color(29, 53, 87));
			lblCorSol.setBounds(20, 286, 125, 20);
			valorCorSol = new JTextField(40);
			valorCorSol.setFont(textFont);
			valorCorSol.setBounds(138, 288, 153, 20);
			this.add(valorCorSol);
			this.add(lblCorSol);

			lblAltSalto.setFont(labelFont); // CAMPO DE ALTURA DO SALTO
			lblAltSalto.setForeground(new Color(29, 53, 87));
			lblAltSalto.setBounds(307, 286, 130, 20);
			valorAltSalto = new JTextField(8);
			valorAltSalto.setFont(textFont);
			valorAltSalto.setText("00 cm");
			valorAltSalto.setBounds(430, 288, 87, 20);
			this.add(valorAltSalto);
			this.add(lblAltSalto);

		} else if (tipoProd.equals("Tênis")) { // PARTE ESPECÍFICA DE TENIS

			lblAtividade.setFont(labelFont); // CAMPO DE ATIVIDADE INDICADA
			lblAtividade.setForeground(new Color(29, 53, 87));
			lblAtividade.setBounds(20, 251, 150, 20);
			valorAtividade = new JTextField(40);
			valorAtividade.setFont(textFont);
			valorAtividade.setBounds(170, 253, 100, 20);
			this.add(valorAtividade);
			this.add(lblAtividade);

			lblPisada.setFont(labelFont); // CAMPO DE TIPO DE PISADA
			lblPisada.setForeground(new Color(29, 53, 87));
			lblPisada.setBounds(282, 251, 130, 20);
			valorPisada = new JTextField(40);
			valorPisada.setFont(textFont);
			valorPisada.setBounds(407, 253, 111, 20);
			this.add(valorPisada);
			this.add(lblPisada);

			lblTecSol.setFont(labelFont); // CAMPO DE TECNOLOGIA DO SOLADO
			lblTecSol.setForeground(new Color(29, 53, 87));
			lblTecSol.setBounds(20, 286, 180, 20);
			valorTecSol = new JTextField(40);
			valorTecSol.setFont(textFont);
			valorTecSol.setBounds(197, 288, 140, 20);
			this.add(valorTecSol);
			this.add(lblTecSol);

			lblPeso.setFont(labelFont); // CAMPO DE PESO
			lblPeso.setForeground(new Color(29, 53, 87));
			lblPeso.setBounds(347, 286, 75, 20);
			valorPeso = new JTextField(10);
			valorPeso.setFont(textFont);
			valorPeso.setText("000.0");
			valorPeso.setBounds(422, 288, 96, 20);
			this.add(valorPeso);
			this.add(lblPeso);

			lblTipoPalmilha.setFont(labelFont); // CAMPO DE TIPO DE PALMILHA
			lblTipoPalmilha.setForeground(new Color(29, 53, 87));
			lblTipoPalmilha.setBounds(20, 321, 135, 20);
			valorTipoPalmilha = new JTextField(25);
			valorTipoPalmilha.setFont(textFont);
			valorTipoPalmilha.setBounds(158, 323, 100, 20);
			this.add(valorTipoPalmilha);
			this.add(lblTipoPalmilha);

			lblAmarra.setFont(labelFont); // CAMPO DE TIPO DE AMARRACAO
			lblAmarra.setForeground(new Color(29, 53, 87));
			lblAmarra.setBounds(268, 321, 157, 20);
			valorAmarra = new JTextField(40);
			valorAmarra.setFont(textFont);
			valorAmarra.setBounds(425, 323, 93, 20);
			this.add(valorAmarra);
			this.add(lblAmarra);

			lblCorCadarco.setFont(labelFont); // CAMPO DE COR DO CADARCO
			lblCorCadarco.setForeground(new Color(29, 53, 87));
			lblCorCadarco.setBounds(20, 356, 130, 20);
			valorCorCadarco = new JTextField(40);
			valorCorCadarco.setFont(textFont);
			valorCorCadarco.setBounds(158, 358, 100, 20);
			this.add(valorCorCadarco);
			this.add(lblCorCadarco);

		} else if (tipoProd.equals("Bota")) { // PARTE ESPECÍFICA DE BOTA

			lblModelo.setFont(labelFont); // CAMPO DE MODELO
			lblModelo.setForeground(new Color(29, 53, 87));
			lblModelo.setBounds(20, 251, 70, 20);
			valorModelo = new JTextField(25);
			valorModelo.setFont(textFont);
			valorModelo.setBounds(90, 253, 150, 20);
			this.add(valorModelo);
			this.add(lblModelo);

			lblAltCano.setFont(labelFont); // CAMPO DE ALTURA DO CANO
			lblAltCano.setForeground(new Color(29, 53, 87));
			lblAltCano.setBounds(257, 251, 130, 20);
			valorAltCano = new JTextField(20);
			valorAltCano.setFont(textFont);
			valorAltCano.setBounds(385, 253, 132, 20);
			this.add(valorAltCano);
			this.add(lblAltCano);

			lblTipoSalto.setFont(labelFont); // CAMPO DE TIPO DE SALTO
			lblTipoSalto.setForeground(new Color(29, 53, 87));
			lblTipoSalto.setBounds(20, 286, 130, 20);
			valorTipoSalto = new JTextField(40);
			valorTipoSalto.setFont(textFont);
			valorTipoSalto.setBounds(135, 288, 104, 20);
			this.add(valorTipoSalto);
			this.add(lblTipoSalto);

			lblTiPalmilha.setFont(labelFont); // CAMPO DE TIPO DE PALMILHA
			lblTiPalmilha.setForeground(new Color(29, 53, 87));
			lblTiPalmilha.setBounds(256, 286, 175, 20);
			valorTiPalmilha = new JTextField(40);
			valorTiPalmilha.setFont(textFont);
			valorTiPalmilha.setBounds(394, 288, 123, 20);
			this.add(valorTiPalmilha);
			this.add(lblTiPalmilha);

			lblMatSolado.setFont(labelFont); // CAMPO DE MATERIAL DO SOLADO
			lblMatSolado.setForeground(new Color(29, 53, 87));
			lblMatSolado.setBounds(20, 321, 155, 20);
			valorMatSolado = new JTextField(40);
			valorMatSolado.setFont(textFont);
			valorMatSolado.setBounds(176, 323, 210, 20);
			this.add(valorMatSolado);
			this.add(lblMatSolado);

		} else if (tipoProd.equals("Sapato")) { // PARTE ESPECÍFICA DE SAPATO

			lblSolado.setFont(labelFont); // CAMPO DE MATERIAL DO SOLADO
			lblSolado.setForeground(new Color(29, 53, 87));
			lblSolado.setBounds(20, 251, 155, 20);
			valorSolado = new JTextField(40);
			valorSolado.setFont(textFont);
			valorSolado.setBounds(176, 253, 135, 20);
			this.add(valorSolado);
			this.add(lblSolado);

			lblBico.setFont(labelFont); // CAMPO DE TIPO DO BICO
			lblBico.setForeground(new Color(29, 53, 87));
			lblBico.setBounds(320, 251, 125, 20);
			valorBico = new JTextField(40);
			valorBico.setFont(textFont);
			valorBico.setBounds(428, 253, 89, 20);
			this.add(valorBico);
			this.add(lblBico);

			lblInterno.setFont(labelFont); // CAMPO DE MATERIAL INTERNO
			lblInterno.setForeground(new Color(29, 53, 87));
			lblInterno.setBounds(20, 286, 135, 20);
			valorInterno = new JTextField(40);
			valorInterno.setFont(textFont);
			valorInterno.setBounds(155, 288, 115, 20);
			this.add(valorInterno);
			this.add(lblInterno);

			lblAlturaSalto.setFont(labelFont); // CAMPO ALTURA DO SALTO
			lblAlturaSalto.setForeground(new Color(29, 53, 87));
			lblAlturaSalto.setBounds(285, 286, 130, 20);
			valorAlturaSalto.setFont(textFont);
			valorAlturaSalto.setBounds(410, 288, 107, 20);
			this.add(valorAlturaSalto);
			this.add(lblAlturaSalto);

			lblPalmilha.setFont(labelFont); // CAMPO DE TIPO DE PALMILHA
			lblPalmilha.setForeground(new Color(29, 53, 87));
			lblPalmilha.setBounds(20, 321, 135, 20);
			valorPalmilha = new JTextField(40);
			valorPalmilha.setFont(textFont);
			valorPalmilha.setBounds(160, 323, 165, 20);
			this.add(valorPalmilha);
			this.add(lblPalmilha);

		}

		// Adicionando o ActionListener
		getBtnSalvar().addActionListener(this);
		getBtnDeletar().addActionListener(this);

		this.setVisible(true);
	}

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

	public ControleTelaDetalheEstoque getControlaDetalhe() {
		return controlaDetalhe;
	}

	public void setControlaDetalhe(ControleTelaDetalheEstoque controlaDetalhe) {
		this.controlaDetalhe = controlaDetalhe;
	}

	public String[] getTamanhos() {
		return tamanhos;
	}

	public void setTamanhos(String[] tamanhos) {
		this.tamanhos = tamanhos;
	}

	public String[] getGen() {
		return gen;
	}

	public void setGen(String[] gen) {
		this.gen = gen;
	}

	public String[] getAlturaSaltos() {
		return alturaSaltos;
	}

	public void setAlturaSaltos(String[] alturaSaltos) {
		this.alturaSaltos = alturaSaltos;
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

	public JLabel getLblCategoria() {
		return lblCategoria;
	}

	public void setLblCategoria(JLabel lblCategoria) {
		this.lblCategoria = lblCategoria;
	}

	public JLabel getValorCategoria() {
		return valorCategoria;
	}

	public void setValorCategoria(String valorCategoria) {
		this.valorCategoria.setText(valorCategoria);
	}

	public JLabel getLblDataCadastro() {
		return lblDataCadastro;
	}

	public void setLblDataCadastro(JLabel lblDataCadastro) {
		this.lblDataCadastro = lblDataCadastro;
	}

	public JLabel getValorDataCadastro() {
		return valorDataCadastro;
	}

	public void setValorDataCadastro(Date valorDataCadastro) {
		String data = formato.format(valorDataCadastro);
		this.valorDataCadastro.setText(data);
	}

	public JLabel getLblIdProd() {
		return lblIdProd;
	}

	public void setLblIdProd(JLabel lblIdProd) {
		this.lblIdProd = lblIdProd;
	}

	public JLabel getValorIdProd() {
		return valorIdProd;
	}

	public void setValorIdProd(String valorIdProd) {
		this.valorIdProd.setText(valorIdProd);
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

	public JLabel getLblTamanho() {
		return lblTamanho;
	}

	public void setLblTamanho(JLabel lblTamanho) {
		this.lblTamanho = lblTamanho;
	}

	public JComboBox<String> getValorTamanho() {
		return valorTamanho;
	}

	public void setValorTamanho(String valorTamanho) {
		this.valorTamanho.setSelectedItem(valorTamanho);
	}

	public JLabel getLblPreco() {
		return lblPreco;
	}

	public void setLblPreco(JLabel lblPreco) {
		this.lblPreco = lblPreco;
	}

	public JTextField getValorPreco() {
		return valorPreco;
	}

	public void setValorPreco(String valorPreco) {
		this.valorPreco.setText(valorPreco);
	}

	public JLabel getLblMarca() {
		return lblMarca;
	}

	public void setLblMarca(JLabel lblMarca) {
		this.lblMarca = lblMarca;
	}

	public JTextField getValorMarca() {
		return valorMarca;
	}

	public void setValorMarca(String valorMarca) {
		this.valorMarca.setText(valorMarca);
	}

	public JLabel getLblOrigem() {
		return lblOrigem;
	}

	public void setLblOrigem(JLabel lblOrigem) {
		this.lblOrigem = lblOrigem;
	}

	public JTextField getValorOrigem() {
		return valorOrigem;
	}

	public void setValorOrigem(String valorOrigem) {
		this.valorOrigem.setText(valorOrigem);
	}

	public JLabel getLblGarantia() {
		return lblGarantia;
	}

	public void setLblGarantia(JLabel lblGarantia) {
		this.lblGarantia = lblGarantia;
	}

	public JTextField getValorGarantia() {
		return valorGarantia;
	}

	public void setValorGarantia(String valorGarantia) {
		this.valorGarantia.setText(valorGarantia);
	}

	public JLabel getLblGenero() {
		return lblGenero;
	}

	public void setLblGenero(JLabel lblGenero) {
		this.lblGenero = lblGenero;
	}

	public JComboBox<String> getValorGenero() {
		return valorGenero;
	}

	public void setValorGenero(char valorGenero) {
		int indexGen = 0;

		if (valorGenero == 'M') {
			indexGen = 0;
		} else if (valorGenero == 'F') {
			indexGen = 1;
		} else if (valorGenero == 'U') {
			indexGen = 2;
		}

		this.valorGenero.setSelectedIndex(indexGen);
	}

	public JLabel getLblBarras() {
		return lblBarras;
	}

	public void setLblBarras(JLabel lblBarras) {
		this.lblBarras = lblBarras;
	}

	public JTextField getValorBarras() {
		return valorBarras;
	}

	public void setValorBarras(String valorBarras) {
		this.valorBarras.setText(valorBarras);
	}

	public JLabel getLblCor() {
		return lblCor;
	}

	public void setLblCor(JLabel lblCor) {
		this.lblCor = lblCor;
	}

	public JTextField getValorCor() {
		return valorCor;
	}

	public void setValorCor(String valorCor) {
		this.valorCor.setText(valorCor);
	}

	public JLabel getLblMaterial() {
		return lblMaterial;
	}

	public void setLblMaterial(JLabel lblMaterial) {
		this.lblMaterial = lblMaterial;
	}

	public JTextField getValorMaterial() {
		return valorMaterial;
	}

	public void setValorMaterial(String valorMaterial) {
		this.valorMaterial.setText(valorMaterial);
	}

	public JLabel getLblSalto() {
		return lblSalto;
	}

	public void setLblSalto(JLabel lblSalto) {
		this.lblSalto = lblSalto;
	}

	public JTextField getValorSalto() {
		return valorSalto;
	}

	public void setValorSalto(String valorSalto) {
		this.valorSalto.setText(valorSalto);
	}

	public JLabel getLblCorExt() {
		return lblCorExt;
	}

	public void setLblCorExt(JLabel lblCorExt) {
		this.lblCorExt = lblCorExt;
	}

	public JTextField getValorCorExt() {
		return valorCorExt;
	}

	public void setValorCorExt(String valorCorExt) {
		this.valorCorExt.setText(valorCorExt);
	}

	public JLabel getLblCorSol() {
		return lblCorSol;
	}

	public void setLblCorSol(JLabel lblCorSol) {
		this.lblCorSol = lblCorSol;
	}

	public JTextField getValorCorSol() {
		return valorCorSol;
	}

	public void setValorCorSol(String valorCorSol) {
		this.valorCorSol.setText(valorCorSol);
	}

	public JLabel getLblAltSalto() {
		return lblAltSalto;
	}

	public void setLblAltSalto(JLabel lblAltSalto) {
		this.lblAltSalto = lblAltSalto;
	}

	public JTextField getValorAltSalto() {
		return valorAltSalto;
	}

	public void setValorAltSalto(String valorAltSalto) {
		this.valorAltSalto.setText(valorAltSalto);
	}

	public JLabel getLblAtividade() {
		return lblAtividade;
	}

	public void setLblAtividade(JLabel lblAtividade) {
		this.lblAtividade = lblAtividade;
	}

	public JTextField getValorAtividade() {
		return valorAtividade;
	}

	public void setValorAtividade(String valorAtividade) {
		this.valorAtividade.setText(valorAtividade);
	}

	public JLabel getLblTecSol() {
		return lblTecSol;
	}

	public void setLblTecSol(JLabel lblTecSol) {
		this.lblTecSol = lblTecSol;
	}

	public JTextField getValorTecSol() {
		return valorTecSol;
	}

	public void setValorTecSol(String valorTecSol) {
		this.valorTecSol.setText(valorTecSol);
	}

	public JLabel getLblPisada() {
		return lblPisada;
	}

	public void setLblPisada(JLabel lblPisada) {
		this.lblPisada = lblPisada;
	}

	public JTextField getValorPisada() {
		return valorPisada;
	}

	public void setValorPisada(String valorPisada) {
		this.valorPisada.setText(valorPisada);
	}

	public JLabel getLblTipoPalmilha() {
		return lblTipoPalmilha;
	}

	public void setLblTipoPalmilha(JLabel lblTipoPalmilha) {
		this.lblTipoPalmilha = lblTipoPalmilha;
	}

	public JTextField getValorTipoPalmilha() {
		return valorTipoPalmilha;
	}

	public void setValorTipoPalmilha(String valorTipoPalmilha) {
		this.valorTipoPalmilha.setText(valorTipoPalmilha);
	}

	public JLabel getLblPeso() {
		return lblPeso;
	}

	public void setLblPeso(JLabel lblPeso) {
		this.lblPeso = lblPeso;
	}

	public JTextField getValorPeso() {
		return valorPeso;
	}

	public void setValorPeso(String valorPeso) {
		this.valorPeso.setText(valorPeso);
	}

	public JLabel getLblAmarra() {
		return lblAmarra;
	}

	public void setLblAmarra(JLabel lblAmarra) {
		this.lblAmarra = lblAmarra;
	}

	public JTextField getValorAmarra() {
		return valorAmarra;
	}

	public void setValorAmarra(String valorAmarra) {
		this.valorAmarra.setText(valorAmarra);
	}

	public JLabel getLblCorCadarco() {
		return lblCorCadarco;
	}

	public void setLblCorCadarco(JLabel lblCorCadarco) {
		this.lblCorCadarco = lblCorCadarco;
	}

	public JTextField getValorCorCadarco() {
		return valorCorCadarco;
	}

	public void setValorCorCadarco(String valorCorCadarco) {
		this.valorCorCadarco.setText(valorCorCadarco);
	}

	public JLabel getLblModelo() {
		return lblModelo;
	}

	public void setLblModelo(JLabel lblModelo) {
		this.lblModelo = lblModelo;
	}

	public JTextField getValorModelo() {
		return valorModelo;
	}

	public void setValorModelo(String valorModelo) {
		this.valorModelo.setText(valorModelo);
	}

	public JLabel getLblAltCano() {
		return lblAltCano;
	}

	public void setLblAltCano(JLabel lblAltCano) {
		this.lblAltCano = lblAltCano;
	}

	public JTextField getValorAltCano() {
		return valorAltCano;
	}

	public void setValorAltCano(String valorAltCano) {
		this.valorAltCano.setText(valorAltCano);
	}

	public JLabel getLblTipoSalto() {
		return lblTipoSalto;
	}

	public void setLblTipoSalto(JLabel lblTipoSalto) {
		this.lblTipoSalto = lblTipoSalto;
	}

	public JTextField getValorTipoSalto() {
		return valorTipoSalto;
	}

	public void setValorTipoSalto(String valorTipoSalto) {
		this.valorTipoSalto.setText(valorTipoSalto);
	}

	public JLabel getLblTiPalmilha() {
		return lblTiPalmilha;
	}

	public void setLblTiPalmilha(JLabel lblTiPalmilha) {
		this.lblTiPalmilha = lblTiPalmilha;
	}

	public JTextField getValorTiPalmilha() {
		return valorTiPalmilha;
	}

	public void setValorTiPalmilha(String valorTiPalmilha) {
		this.valorTiPalmilha.setText(valorTiPalmilha);
	}

	public JLabel getLblMatSolado() {
		return lblMatSolado;
	}

	public void setLblMatSolado(JLabel lblMatSolado) {
		this.lblMatSolado = lblMatSolado;
	}

	public JTextField getValorMatSolado() {
		return valorMatSolado;
	}

	public void setValorMatSolado(String valorMatSolado) {
		this.valorMatSolado.setText(valorMatSolado);
	}

	public JLabel getLblSolado() {
		return lblSolado;
	}

	public void setLblSolado(JLabel lblSolado) {
		this.lblSolado = lblSolado;
	}

	public JTextField getValorSolado() {
		return valorSolado;
	}

	public void setValorSolado(String valorSolado) {
		this.valorSolado.setText(valorSolado);
	}

	public JLabel getLblInterno() {
		return lblInterno;
	}

	public void setLblInterno(JLabel lblInterno) {
		this.lblInterno = lblInterno;
	}

	public JTextField getValorInterno() {
		return valorInterno;
	}

	public void setValorInterno(String valorInterno) {
		this.valorInterno.setText(valorInterno);
	}

	public JLabel getLblBico() {
		return lblBico;
	}

	public void setLblBico(JLabel lblBico) {
		this.lblBico = lblBico;
	}

	public JTextField getValorBico() {
		return valorBico;
	}

	public void setValorBico(String valorBico) {
		this.valorBico.setText(valorBico);
	}

	public JLabel getLblAlturaSalto() {
		return lblAlturaSalto;
	}

	public void setLblAlturaSalto(JLabel lblAlturaSalto) {
		this.lblAlturaSalto = lblAlturaSalto;
	}

	public JComboBox<String> getValorAlturaSalto() {
		return valorAlturaSalto;
	}

	public void setValorAlturaSalto(String valorAlturaSalto) {
		this.valorAlturaSalto.setSelectedItem(valorAlturaSalto);
	}

	public JLabel getLblPalmilha() {
		return lblPalmilha;
	}

	public void setLblPalmilha(JLabel lblPalmilha) {
		this.lblPalmilha = lblPalmilha;
	}

	public JTextField getValorPalmilha() {
		return valorPalmilha;
	}

	public void setValorPalmilha(String valorPalmilha) {
		this.valorPalmilha.setText(valorPalmilha);
	}

}
