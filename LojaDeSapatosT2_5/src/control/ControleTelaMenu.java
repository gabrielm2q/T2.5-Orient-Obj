package control;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import model.Dados;
import view.TelaCliente;
import view.TelaEstoque;
import view.TelaFuncionario;
import view.TelaLoja;
import view.TelaMenu;
import view.TelaVenda;

public class ControleTelaMenu {
	private final TelaMenu menu;

	public ControleTelaMenu(TelaMenu menu) {
		this.menu = menu;
	}

	public void clicaBtn(ActionEvent e) {
		JButton clicado = (JButton) e.getSource();

		if (clicado == menu.getBtnCliente()) {
			new TelaCliente();
		} else if (clicado == menu.getBtnFuncionario()) {
			new TelaFuncionario();
		} else if (clicado == menu.getBtnEstoque()) {
			new TelaEstoque();
		} else if (clicado == menu.getBtnVenda()) {
			if (Dados.getCliente().size() == 0 || Dados.getFuncionario().size() == 0
					|| Dados.getEstoque().getProduto().size() == 0) {
				JOptionPane.showMessageDialog(null,
						"Para cadastrar vendas � necess�rio ter:\n- Clientes cadastrados;"
								+ "\n- Funcion�rios cadastrados;\n- Produtos no estoque.",
						null, JOptionPane.ERROR_MESSAGE);
			} else {
				new TelaVenda();
			}
		} else if (clicado == menu.getBtnLoja()) {
			new TelaLoja();
		} else {
			JOptionPane.showMessageDialog(null, "SISTEMA EM CONSTRU��O!", null, JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
