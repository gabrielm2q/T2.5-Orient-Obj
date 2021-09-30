package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

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
	private JLabel lblFormaPag = new JLabel("Forma de Pagamento: ");
	private JComboBox valorFormaPag = new JComboBox(formasPagamento);
	private JLabel lblNumParcelas = new JLabel("Número de Parcelas: ");
	private JComboBox valorNumParcelas = new JComboBox(numParcelas);

	public TelaPagamento(Venda venda, TelaDetalheVenda detalheVenda) {
		super("Pagamento"); // JFrame com nome
		this.controlaPag = new ControleTelaPagamento(this, this.opcEditarSalvar);
		this.venda = venda;
		this.detalheVenda = detalheVenda;
		this.opcEditarSalvar = this.detalheVenda.getOpcEditarSalvar();

		this.setSize(490, 313);
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
		titulo.setBounds(80, 20, 320, 60);
		btnSalvar.setBounds(20, 190, 438, 70);
		this.add(titulo);
		this.add(btnSalvar);
		btnSalvar.addActionListener(this);

		// Definindo posição dos JLabels e JTextFields e suas fontes
		Font labelFont = new Font("Montserrat", Font.BOLD, 16);
		Font textFont = new Font("Montserrat", Font.BOLD, 14);

		// Valor Pago
		valorPago = new JLabel("Valor Pago: R$ " + venda.getValorVenda());
		valorPago.setFont(labelFont);
		valorPago.setForeground(new Color(29, 53, 87));
		valorPago.setBounds(20, 90, 185, 20);
		this.add(valorPago);

		// Data de Pagamento
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		dataPag = new JLabel("Data de Pagamento: " + formato.format(venda.getDataPedido()));
		dataPag.setFont(labelFont);
		dataPag.setForeground(new Color(29, 53, 87));
		dataPag.setBounds(220, 90, 300, 20);
		this.add(dataPag);

		// Forma de Pagamento
		lblFormaPag.setFont(labelFont);
		lblFormaPag.setForeground(new Color(29, 53, 87));
		lblFormaPag.setBounds(20, 120, 180, 20);
		valorFormaPag.setFont(textFont);
		valorFormaPag.setBounds(200, 122, 258, 20);
		this.add(valorFormaPag);
		this.add(lblFormaPag);

		// Numero de Parcelas
		lblNumParcelas.setFont(labelFont);
		lblNumParcelas.setForeground(new Color(29, 53, 87));
		lblNumParcelas.setBounds(20, 150, 170, 20);
		valorNumParcelas.setFont(textFont);
		valorNumParcelas.setBounds(200, 152, 258, 20);
		this.add(valorNumParcelas);
		this.add(lblNumParcelas);

		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.controlaPag.clicaBtn(e);

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

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public TelaDetalheVenda getDetalheVenda() {
		return detalheVenda;
	}

	public void setDetalheVenda(TelaDetalheVenda detalheVenda) {
		this.detalheVenda = detalheVenda;
	}

	public ControleTelaPagamento getControlaPag() {
		return controlaPag;
	}

	public void setControlaPag(ControleTelaPagamento controlaPag) {
		this.controlaPag = controlaPag;
	}

	public int getOpcEditarSalvar() {
		return opcEditarSalvar;
	}

	public void setOpcEditarSalvar(int opcEditarSalvar) {
		this.opcEditarSalvar = opcEditarSalvar;
	}

	public String[] getFormasPagamento() {
		return formasPagamento;
	}

	public void setFormasPagamento(String[] formasPagamento) {
		this.formasPagamento = formasPagamento;
	}

	public String[] getNumParcelas() {
		return numParcelas;
	}

	public void setNumParcelas(String[] numParcelas) {
		this.numParcelas = numParcelas;
	}

	public JLabel getValorPago() {
		return valorPago;
	}

	public void setValorPago(JLabel valorPago) {
		this.valorPago = valorPago;
	}

	public JLabel getDataPag() {
		return dataPag;
	}

	public void setDataPag(JLabel dataPag) {
		this.dataPag = dataPag;
	}

	public JLabel getLblFormaPag() {
		return lblFormaPag;
	}

	public void setLblFormaPag(JLabel lblFormaPag) {
		this.lblFormaPag = lblFormaPag;
	}

	public JComboBox getValorFormaPag() {
		return valorFormaPag;
	}

	public void setValorFormaPag(JComboBox valorFormaPag) {
		this.valorFormaPag = valorFormaPag;
	}

	public JLabel getLblNumParcelas() {
		return lblNumParcelas;
	}

	public void setLblNumParcelas(JLabel lblNumParcelas) {
		this.lblNumParcelas = lblNumParcelas;
	}

	public JComboBox getValorNumParcelas() {
		return valorNumParcelas;
	}

	public void setValorNumParcelas(JComboBox valorNumParcelas) {
		this.valorNumParcelas = valorNumParcelas;
	}

}
