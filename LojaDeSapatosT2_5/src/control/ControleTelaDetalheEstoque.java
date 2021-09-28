package control;

import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import view.TelaDetalheEstoque;

public class ControleTelaDetalheEstoque {
	private TelaDetalheEstoque detalheEstoque;
	private ControleEstoque estCtrl;
	private ControleProduto prodCtrl;
	private ControleDados dados = new ControleDados();
	private int indexCliente, opc;
	private String tipoProd;
	Date data = new Date();
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	public ControleTelaDetalheEstoque(TelaDetalheEstoque detalheEstoque, ControleDados d, int editarSalvar, int idx,
			String tipoProduto) {
		this.detalheEstoque = detalheEstoque;
		this.dados = d;
		this.opc = editarSalvar;
		this.indexCliente = idx;
		this.tipoProd = tipoProduto;
		estCtrl = new ControleEstoque(dados);
		prodCtrl = new ControleProduto(dados);
	}

	public void imprimirEditarDetalhe(TelaDetalheEstoque tela, ControleDados d, int index) {

	}

	public void clicaBtn(ActionEvent e) {
		JButton clicado = (JButton) e.getSource();

		if (clicado == detalheEstoque.getBtnSalvar() && opc == 0) { // SALVAR PRODUTOS
			try {
				// Armazenando os valores comuns a todos os tipos de produto
				int id = Integer.parseInt(detalheEstoque.getValorIdProd().getText());
				String nome = detalheEstoque.getValorNome().getText();
				int tamanho = Integer.parseInt(detalheEstoque.getValorTamanho().getSelectedItem().toString());
				Double preco = Double.parseDouble(detalheEstoque.getValorPreco().getText());
				String marca = detalheEstoque.getValorMarca().getText();
				String pais = detalheEstoque.getValorOrigem().getText();
				String garantia = detalheEstoque.getValorGarantia().getText();
				char gen = detalheEstoque.getValorGenero().getSelectedItem().toString().charAt(0);
				String barras = detalheEstoque.getValorBarras().getText();
				String cor = detalheEstoque.getValorCor().getText();
				String material = detalheEstoque.getValorMaterial().getText();

				// Cadastrando cada produto de acordo com seu tipo
				if (tipoProd.equals("Salto")) {
					prodCtrl.cadastrarSalto(id, nome, tamanho, preco, marca, pais, garantia, gen, barras, cor, material,
							detalheEstoque.getValorTipoSalto().getText(), detalheEstoque.getValorCorExt().getText(),
							detalheEstoque.getValorCorSol().getText(), detalheEstoque.getValorAltSalto().getText());

					data = formato.parse(detalheEstoque.getValorDataCadastro().getText());

					estCtrl.cadastrarProduto(Integer.parseInt(detalheEstoque.getValorQuantidade().getText()), tipoProd,
							data, prodCtrl.getSalto());

					JOptionPane.showMessageDialog(null, tipoProd + " cadastrado com sucesso!", null,
							JOptionPane.INFORMATION_MESSAGE);
				} else if (tipoProd.equals("Tênis")) {

				} else if (tipoProd.equals("Bota")) {

				} else if (tipoProd.equals("Sapato")) {

				}
				detalheEstoque.dispose();

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			} catch (ParseException excData) {
				excData.printStackTrace();
				mensagemErroCadastro();
			}
		}
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,
				"Erro!\nVerifique se todos os campos estão preenchidos."
						+ "\nVerifique se os dados em formato numérico são números."
						+ "\nVerifique se as datas foram inseridas corretamente.",
				null, JOptionPane.ERROR_MESSAGE);
	}

}
