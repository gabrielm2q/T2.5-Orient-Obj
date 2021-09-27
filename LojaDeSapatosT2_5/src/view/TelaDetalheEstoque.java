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
	private JTextField valorNome = new JTextField();
	private JLabel lblTamanho = new JLabel("Tamanho: "); // Tamanho
	private JComboBox valorTamanho = new JComboBox(tamanhos);
	private JLabel lblPreco = new JLabel("Preço: "); // Preço
	private JTextField valorPreco = new JTextField();
	private JLabel lblMarca = new JLabel("Marca: "); // Marca
	private JTextField valorMarca = new JTextField();
	private JLabel lblOrigem = new JLabel("País de Origem: "); // País de Origem
	private JTextField valorOrigem = new JTextField();
	private JLabel lblGarantia = new JLabel("Garantia: "); // Tempo de Garantia
	private JTextField valorGarantia = new JTextField();
	private JLabel lblGenero = new JLabel("Gênero: "); // Gênero
	private JComboBox valorGenero = new JComboBox(gen);
	private JLabel lblBarras = new JLabel("Código de Barras: "); // Código de Barras
	private JTextField valorBarras = new JTextField();
	private JLabel lblCor = new JLabel("Cor: "); // Cor
	private JTextField valorCor = new JTextField();
	private JLabel lblMaterial = new JLabel("Material: ");
	private JTextField valorMaterial = new JTextField();

	// Declarando componentes específicos da tela
	// SALTO
	private JLabel lblSalto = new JLabel("Tipo de Salto: "); // Tipo de Salto
	private JTextField valorSalto = new JTextField();
	private JLabel lblCorExt = new JLabel("Cor Externa: "); // Cor externa
	private JTextField valorCorExt = new JTextField();
	private JLabel lblCorSol = new JLabel("Cor do Solado: "); // Cor do Solado
	private JTextField valorCorSol = new JTextField();
	private JLabel lblAltSalto = new JLabel("Altura do Salto: "); // Altura do Salto
	private JTextField valorAltSalto = new JTextField();
	// TENIS

	public TelaDetalheEstoque(ControleDados d, int opcao, int idx) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
