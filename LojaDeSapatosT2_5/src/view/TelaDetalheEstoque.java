package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import control.ControleDados;
import control.ControleTelaDetalheCliente;

public class TelaDetalheEstoque extends JFrame implements ActionListener {
	private JLabel titulo;
	private JButton btnSalvar = new JButton("Salvar");
	private JButton btnDeletar = new JButton("Deletar");

	private ControleTelaDetalheCliente controlaDetalhe;
	private ControleDados dados = new ControleDados();

	// Declarando valores que irão compor as ComboBoxes
	private String[] categorias = { "Salto", "Tênis", "Bota", "Sapato" };
	private String[] tamanhos = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
			"15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32",
			"33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49",
			"50" };
	private String[] gen = { "M", "F", "Unissex" };
	private String[] alturaSaltos = { "Baixo", "Médio", "Alto", "Não Possui" };

	// Trabalhando com datas
	private Date data = new Date();
	private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	// Declarando componentes da tela
	private JLabel lblQuantidade = new JLabel("Quantidade: "); // Quantidade
	private JTextField valorQuantidade;
	private JLabel lblCategoria = new JLabel("Categoria: "); // Categoria
	private JComboBox valorCategoria = new JComboBox(categorias);
	private JLabel lblDataCadastro; // Data de Cadastro
	private JLabel lblIdProd; // ID do Produto
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
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
