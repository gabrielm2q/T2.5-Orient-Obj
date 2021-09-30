package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
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

	public TelaPagamento(Venda venda, TelaDetalheVenda detalheVenda) {
		super("Venda"); // JFrame com nome
		this.controlaPag = new ControleTelaPagamento();

		this.setSize(560, 520);
		this.setLayout(null);
		this.setResizable(false);

		this.venda = venda;
		this.detalheVenda = detalheVenda;

		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
