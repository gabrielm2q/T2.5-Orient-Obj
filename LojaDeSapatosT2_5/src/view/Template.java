package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;

public abstract class Template extends JFrame implements ActionListener, ListSelectionListener {
	private JLabel texto;
	private JButton btnCadastrar = new JButton("Cadastrar");
	private JButton btnOrdenar = new JButton("Buscar");
	private JButton btnAtualizar = new JButton("Atualizar");
	private JList<String> listaPessoasProd = new JList<>();

	public Template(String texto) {
		super(texto); // JFrame com nome
		this.setSize(560, 520);
		this.setLayout(null);
		this.setResizable(false);

		// Estilo do T�tulo
		this.texto = new JLabel(texto, JLabel.CENTER);
		this.texto.setFont(new Font("Montserrat", Font.BOLD, 44));
		this.texto.setForeground(new Color(29, 53, 87));

		// Cor do Plano de Fundo
		getContentPane().setBackground(new Color(70, 123, 157));

		// Fontes dos Bot�es
		Font f = new Font("Montserrat", Font.PLAIN, 15);
		btnCadastrar.setFont(f);
		btnOrdenar.setFont(f);
		btnAtualizar.setFont(f);

		// Localiza��o e Tamanho dos componentes da tela
		this.texto.setBounds(120, 20, 300, 50);

		if (texto == "Funcion�rios") {
			btnCadastrar.setBounds(32, 420, 230, 50);
			btnAtualizar.setBounds(282, 420, 230, 50);
		} else {
			btnCadastrar.setBounds(32, 420, 146, 50);
			btnOrdenar.setBounds(198, 420, 146, 50);
			btnAtualizar.setBounds(368, 420, 145, 50);
		}

		// Editando Lista
		this.listaPessoasProd.setBackground(Color.white);
		this.listaPessoasProd.setBounds(32, 95, 480, 300);
		this.listaPessoasProd.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		this.listaPessoasProd.setVisibleRowCount(10);
		this.listaPessoasProd.addListSelectionListener(this);
		this.add(this.listaPessoasProd);

		// Adicionando Barra de Rolagem
		JScrollPane painel = new JScrollPane(this.getListaPessoasProd());
		painel.setBounds(32, 95, 480, 300);
		painel.setViewportView(this.getListaPessoasProd());
		painel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		painel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		this.add(painel);

		// Adicionando componentes a tela
		this.add(this.texto);
		this.add(btnCadastrar);
		if (texto != "Funcion�rios") { // Tela de Funcion�rios nao requer funcao de ordenar
			this.add(btnOrdenar);
		}
		this.add(btnAtualizar);

		// Adicionando o ActionListener
		getBtnCadastrar().addActionListener(this);
		if (texto != "Funcion�rios") { // Tela de Funcion�rios nao requer funcao de ordenar
			getBtnOrdenar().addActionListener(this);
		}
		getBtnAtualizar().addActionListener(this);

		this.setVisible(true);

	}

	public JLabel getTexto() {
		return texto;
	}

	public void setTexto(JLabel texto) {
		this.texto = texto;
	}

	public JButton getBtnCadastrar() {
		return btnCadastrar;
	}

	public void setBtnCadastrar(JButton btnCadastrar) {
		this.btnCadastrar = btnCadastrar;
	}

	public JButton getBtnOrdenar() {
		return btnOrdenar;
	}

	public void setBtnOrdenar(JButton btnOrdenar) {
		this.btnOrdenar = btnOrdenar;
	}

	public JButton getBtnAtualizar() {
		return btnAtualizar;
	}

	public void setBtnAtualizar(JButton btnAtualizar) {
		this.btnAtualizar = btnAtualizar;
	}

	public JList<String> getListaPessoasProd() {
		return listaPessoasProd;
	}

	public void setListaPessoasProd(DefaultListModel<String> nomes) {
		this.listaPessoasProd.setModel(nomes);
		this.listaPessoasProd.updateUI();
	}

}
