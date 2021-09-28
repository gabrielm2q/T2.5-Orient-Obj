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
	private int indexProduto, opc;
	private String tipoProd;
	Date data = new Date();
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	public ControleTelaDetalheEstoque(TelaDetalheEstoque detalheEstoque, ControleDados d, int editarSalvar, int idx,
			String tipoProduto) {
		this.detalheEstoque = detalheEstoque;
		this.dados = d;
		this.opc = editarSalvar;
		this.indexProduto = idx;
		this.tipoProd = tipoProduto;
		estCtrl = new ControleEstoque(dados);
		prodCtrl = new ControleProduto(dados);
	}

	public void imprimirEditarDetalhe(TelaDetalheEstoque tela, ControleDados d, int index) {
		// Definindo o index do gênero
		int iGen = 0;

		if (d.getProdEstoque().get(index).getProduto().get(index).getGenero() == 'M') {
			iGen = 0;
		} else if (d.getProdEstoque().get(index).getProduto().get(index).getGenero() == 'F') {
			iGen = 1;
		} else if (d.getProdEstoque().get(index).getProduto().get(index).getGenero() == 'U') {
			iGen = 2;
		}

		String datCad = formato.format(d.getProdEstoque().get(index).getDataCadastro().get(index));

		// Imprimindo comuns a todos os produtos
		tela.getValorQuantidade().setText(String.valueOf(d.getProdEstoque().get(index).getQuantidade().get(index)));
		tela.getValorCategoria().setText(d.getProdEstoque().get(index).getCategoria().get(index));
		tela.getValorDataCadastro().setText(datCad);
		tela.getValorIdProd()
				.setText(String.valueOf(d.getProdEstoque().get(index).getProduto().get(index).getIdProd()));
		tela.getValorNome().setText(d.getProdEstoque().get(index).getProduto().get(index).getNome());
		tela.getValorTamanho().setSelectedIndex(d.getProdEstoque().get(index).getProduto().get(index).getTamanho() - 1);
		tela.getValorPreco().setText(d.getProdEstoque().get(index).getProduto().get(index).getPreco().toString());
		tela.getValorMarca().setText(d.getProdEstoque().get(index).getProduto().get(index).getMarca());
		tela.getValorOrigem().setText(d.getProdEstoque().get(index).getProduto().get(index).getPaisOrigem());
		tela.getValorGarantia().setText(d.getProdEstoque().get(index).getProduto().get(index).getTempoGarantia());
		tela.getValorGenero().setSelectedIndex(iGen);
		tela.getValorBarras().setText(d.getProdEstoque().get(index).getProduto().get(index).getCodBarras());
		tela.getValorCor().setText(d.getProdEstoque().get(index).getProduto().get(index).getCor());
		tela.getValorMaterial().setText(d.getProdEstoque().get(index).getProduto().get(index).getMaterial());

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
							detalheEstoque.getValorSalto().getText(), detalheEstoque.getValorCorExt().getText(),
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
		} else if (clicado == detalheEstoque.getBtnSalvar() && opc == 1) { // SALVAR PRODUTOS EDITADOS
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
					prodCtrl.editarSalto(dados, indexProduto, id, nome, tamanho, preco, marca, pais, garantia, gen,
							barras, cor, material, detalheEstoque.getValorSalto().getText(),
							detalheEstoque.getValorCorExt().getText(), detalheEstoque.getValorCorSol().getText(),
							detalheEstoque.getValorAltSalto().getText());

					data = formato.parse(detalheEstoque.getValorDataCadastro().getText());

					estCtrl.editarProduto(dados, indexProduto,
							Integer.parseInt(detalheEstoque.getValorQuantidade().getText()), tipoProd, data,
							prodCtrl.getSalto());

					JOptionPane.showMessageDialog(null, tipoProd + " editado com sucesso!", null,
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
		} else if (clicado == detalheEstoque.getBtnDeletar()) { // DELETAR PRODUTO
			try {

				if (tipoProd == "Salto") {
					if (detalheEstoque.getValorNome().getText().equals(
							dados.getProdEstoque().get(indexProduto).getProduto().get(indexProduto).getNome())) {
						estCtrl.deletarProduto(dados, indexProduto, tipoProd);
						JOptionPane.showMessageDialog(null, tipoProd + " deletado com sucesso!", null,
								JOptionPane.INFORMATION_MESSAGE);
						detalheEstoque.dispose();
					} else {
						JOptionPane.showMessageDialog(null, "ERRO!\nSelecione um produto na lista para deletar!", null,
								JOptionPane.ERROR_MESSAGE);
					}
				}
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Erro!\nNão há cliente a ser deletado!", null,
						JOptionPane.ERROR_MESSAGE);
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
