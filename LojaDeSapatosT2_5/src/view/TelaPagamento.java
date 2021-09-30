package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import control.ControleTelaPagamento;
import model.Venda;

public class TelaPagamento extends JFrame implements ActionListener {
	private JLabel titulo = new JLabel("Pagamento", JLabel.CENTER);
	private JButton btnSalvar = new JButton("Salvar Venda");

	private Venda venda = new Venda();
	private TelaDetalheVenda detalheVenda;
	private ControleTelaPagamento controlaPag;
	private int opcEditarSalvar;

	// Declarando valores para as ComboBoxes
	String[] formasPagamento = { "A vista", "Débito", "Crédito", "Parcelado" };
	String[] numParcelas = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };

	// Declarando componentes da tela
	private JLabel valorPago;
	private JLabel dataPag;
	private JLabel lblFormaPag = new JLabel("Forma Pagamento: ");
	private JComboBox valorFormaPag = new JComboBox(formasPagamento);
	private JLabel lblNumParcelas = new JLabel("Forma Pagamento: ");
	private JComboBox valorNumParcelas = new JComboBox(formasPagamento);

	public TelaPagamento(Venda venda, TelaDetalheVenda detalheVenda) {
		super("Pagamento"); // JFrame com nome
		this.controlaPag = new ControleTelaPagamento(this, this.opcEditarSalvar);
		this.venda = venda;
		this.detalheVenda = detalheVenda;
		this.opcEditarSalvar = this.detalheVenda.getOpcEditarSalvar();

		this.setSize(560, 520);
		this.setLayout(null);
		this.setResizable(false);

		// COMPONENTES DA TELA
		// Estilo do Título
		titulo.setFont(new Font("Montserrat", Font.BOLD, 44));
		titulo.setForeground(new Color(29, 53, 87));

		// Cor do Plano de Fundo
		getContentPane().setBackground(new Color(70, 123, 157));

		// Fontes dos Botões
		Font f = new Font("Montserrat", Font.PLAIN, 20);
		btnSalvar.setFont(f);

		// Localização e Tamanho dos componentes da tela
		titulo.setBounds(90, 20, 340, 60);
		btnSalvar.setBounds(20, 395, 507, 70);
		this.add(titulo);
		this.add(btnSalvar);

		// Definindo posição dos JLabels e JTextFields e suas fontes
		Font labelFont = new Font("Montserrat", Font.BOLD, 16);
		Font textFont = new Font("Montserrat", Font.BOLD, 14);

		// Valor Pago
		valorPago = new JLabel("Valor Pago: R$ " + venda.getValorVenda());
		valorPago.setFont(labelFont);
		valorPago.setForeground(new Color(29, 53, 87));
		valorPago.setBounds(20, 90, 185, 20);
		this.add(valorPago);

		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.controlaPag.clicaBtn(e);

	}

}
