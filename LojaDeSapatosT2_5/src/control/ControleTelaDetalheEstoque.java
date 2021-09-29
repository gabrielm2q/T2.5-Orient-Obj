package control;

import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import model.Bota;
import model.Salto;
import model.Sapato;
import model.Tenis;
import view.TelaDetalheEstoque;

public class ControleTelaDetalheEstoque {
	private TelaDetalheEstoque detalheEstoque;
	private ControleEstoque estCtrl = new ControleEstoque();
	private ControleDados dados = new ControleDados();
	private int indexProduto;
	private int opcEditarSalvar;
	private String tipoProd;
	private Date data = new Date();
	private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	public ControleTelaDetalheEstoque(TelaDetalheEstoque detalheEstoque, int editarSalvar, String tipoProd) {
		this.detalheEstoque = detalheEstoque;
		this.opcEditarSalvar = editarSalvar;
		this.tipoProd = tipoProd;
	}

	public void imprimirDetalhes(TelaDetalheEstoque tela, int index) {

	}

	public void clicaBtn(ActionEvent e) {
		JButton clicado = (JButton) e.getSource();

		if (clicado == detalheEstoque.getBtnSalvar() && opcEditarSalvar == 0) { // SALVAR PRODUTOS
			try {

				if (tipoProd.equals("Salto")) {
					Salto salto = new Salto();

					salto.setIdProd(Integer.parseInt(detalheEstoque.getValorIdProd().getText()));
					salto.setNome(detalheEstoque.getValorNome().getText());
					salto.setTamanho(Integer.parseInt(detalheEstoque.getValorTamanho().getSelectedItem().toString()));
					salto.setPreco(Double.parseDouble(detalheEstoque.getValorPreco().getText()));
					salto.setMarca(detalheEstoque.getValorMarca().getText());
					salto.setPaisOrigem(detalheEstoque.getValorOrigem().getText());
					salto.setTempoGarantia(detalheEstoque.getValorGarantia().getText());
					salto.setGenero(detalheEstoque.getValorGenero().getSelectedItem().toString().charAt(0));
					salto.setCodBarras(detalheEstoque.getValorBarras().getText());
					salto.setCor(detalheEstoque.getValorCor().getText());
					salto.setMaterial(detalheEstoque.getValorMaterial().getText());
					salto.setTipoSalto(detalheEstoque.getValorSalto().getText());
					salto.setCorExterna(detalheEstoque.getValorCorExt().getText());
					salto.setCorSolado(detalheEstoque.getValorCorSol().getText());
					salto.setAlturaSalto(detalheEstoque.getValorAltSalto().getText());

					// formatando data
					try {
						data = formato.parse(detalheEstoque.getValorDataCadastro().getText());
					} catch (ParseException excData) {
						excData.printStackTrace();
						JOptionPane.showMessageDialog(null, "Verifique se a data está no padrão correto!", null,
								JOptionPane.ERROR_MESSAGE);
					}

					estCtrl.cadastrarProduto(Integer.parseInt(detalheEstoque.getValorQuantidade().getText()), tipoProd,
							data, salto);

					JOptionPane.showMessageDialog(null, tipoProd + " cadastrado com sucesso!", null,
							JOptionPane.INFORMATION_MESSAGE);
				} else if (tipoProd.equals("Tênis")) {
					Tenis tenis = new Tenis();

					tenis.setIdProd(Integer.parseInt(detalheEstoque.getValorIdProd().getText()));
					tenis.setNome(detalheEstoque.getValorNome().getText());
					tenis.setTamanho(Integer.parseInt(detalheEstoque.getValorTamanho().getSelectedItem().toString()));
					tenis.setPreco(Double.parseDouble(detalheEstoque.getValorPreco().getText()));
					tenis.setMarca(detalheEstoque.getValorMarca().getText());
					tenis.setPaisOrigem(detalheEstoque.getValorOrigem().getText());
					tenis.setTempoGarantia(detalheEstoque.getValorGarantia().getText());
					tenis.setGenero(detalheEstoque.getValorGenero().getSelectedItem().toString().charAt(0));
					tenis.setCodBarras(detalheEstoque.getValorBarras().getText());
					tenis.setCor(detalheEstoque.getValorCor().getText());
					tenis.setMaterial(detalheEstoque.getValorMaterial().getText());
					tenis.setAtvdIndicada(detalheEstoque.getValorAtividade().getText());
					tenis.setTecnoSolado(detalheEstoque.getValorTecSol().getText());
					tenis.setTipoPisada(detalheEstoque.getValorPisada().getText());
					tenis.setTipoPalmilha(detalheEstoque.getValorTipoPalmilha().getText());
					tenis.setPeso(Double.parseDouble(detalheEstoque.getValorPeso().getText()));
					tenis.setTipoAmarracao(detalheEstoque.getValorAmarra().getText());
					tenis.setCorCadarco(detalheEstoque.getValorCorCadarco().getText());

					// formatando data
					try {
						data = formato.parse(detalheEstoque.getValorDataCadastro().getText());
					} catch (ParseException excData) {
						excData.printStackTrace();
						JOptionPane.showMessageDialog(null, "Verifique se a data está no padrão correto!", null,
								JOptionPane.ERROR_MESSAGE);
					}

					estCtrl.cadastrarProduto(Integer.parseInt(detalheEstoque.getValorQuantidade().getText()), tipoProd,
							data, tenis);

					JOptionPane.showMessageDialog(null, tipoProd + " cadastrado com sucesso!", null,
							JOptionPane.INFORMATION_MESSAGE);
				} else if (tipoProd.equals("Bota")) {
					Bota bota = new Bota();

					bota.setIdProd(Integer.parseInt(detalheEstoque.getValorIdProd().getText()));
					bota.setNome(detalheEstoque.getValorNome().getText());
					bota.setTamanho(Integer.parseInt(detalheEstoque.getValorTamanho().getSelectedItem().toString()));
					bota.setPreco(Double.parseDouble(detalheEstoque.getValorPreco().getText()));
					bota.setMarca(detalheEstoque.getValorMarca().getText());
					bota.setPaisOrigem(detalheEstoque.getValorOrigem().getText());
					bota.setTempoGarantia(detalheEstoque.getValorGarantia().getText());
					bota.setGenero(detalheEstoque.getValorGenero().getSelectedItem().toString().charAt(0));
					bota.setCodBarras(detalheEstoque.getValorBarras().getText());
					bota.setCor(detalheEstoque.getValorCor().getText());
					bota.setMaterial(detalheEstoque.getValorMaterial().getText());
					bota.setModelo(detalheEstoque.getValorModelo().getText());
					bota.setAlturaCano(detalheEstoque.getValorAltCano().getText());
					bota.setTipoSalto(detalheEstoque.getValorTipoSalto().getText());
					bota.setTipoPalmilha(detalheEstoque.getValorTiPalmilha().getText());
					bota.setMaterialSolado(detalheEstoque.getValorMatSolado().getText());

					// formatando data
					try {
						data = formato.parse(detalheEstoque.getValorDataCadastro().getText());
					} catch (ParseException excData) {
						excData.printStackTrace();
						JOptionPane.showMessageDialog(null, "Verifique se a data está no padrão correto!", null,
								JOptionPane.ERROR_MESSAGE);
					}

					estCtrl.cadastrarProduto(Integer.parseInt(detalheEstoque.getValorQuantidade().getText()), tipoProd,
							data, bota);

					JOptionPane.showMessageDialog(null, tipoProd + " cadastrado com sucesso!", null,
							JOptionPane.INFORMATION_MESSAGE);
				} else if (tipoProd.equals("Sapato")) {
					Sapato sapato = new Sapato();

					sapato.setIdProd(Integer.parseInt(detalheEstoque.getValorIdProd().getText()));
					sapato.setNome(detalheEstoque.getValorNome().getText());
					sapato.setTamanho(Integer.parseInt(detalheEstoque.getValorTamanho().getSelectedItem().toString()));
					sapato.setPreco(Double.parseDouble(detalheEstoque.getValorPreco().getText()));
					sapato.setMarca(detalheEstoque.getValorMarca().getText());
					sapato.setPaisOrigem(detalheEstoque.getValorOrigem().getText());
					sapato.setTempoGarantia(detalheEstoque.getValorGarantia().getText());
					sapato.setGenero(detalheEstoque.getValorGenero().getSelectedItem().toString().charAt(0));
					sapato.setCodBarras(detalheEstoque.getValorBarras().getText());
					sapato.setCor(detalheEstoque.getValorCor().getText());
					sapato.setMaterial(detalheEstoque.getValorMaterial().getText());
					sapato.setMaterialSolado(detalheEstoque.getValorSolado().getText());
					sapato.setMaterialInterno(detalheEstoque.getValorInterno().getText());
					sapato.setTipoBico(detalheEstoque.getValorBico().getText());
					sapato.setAlturaSalto(detalheEstoque.getValorAlturaSalto().getSelectedItem().toString());
					sapato.setTipoPalmilha(detalheEstoque.getValorPalmilha().getText());

					// formatando data
					try {
						data = formato.parse(detalheEstoque.getValorDataCadastro().getText());
					} catch (ParseException excData) {
						excData.printStackTrace();
						JOptionPane.showMessageDialog(null, "Verifique se a data está no padrão correto!", null,
								JOptionPane.ERROR_MESSAGE);
					}

					estCtrl.cadastrarProduto(Integer.parseInt(detalheEstoque.getValorQuantidade().getText()), tipoProd,
							data, sapato);

					JOptionPane.showMessageDialog(null, tipoProd + " cadastrado com sucesso!", null,
							JOptionPane.INFORMATION_MESSAGE);
				}

				detalheEstoque.dispose();

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}
		} else if (clicado == detalheEstoque.getBtnSalvar() && opcEditarSalvar == 9) { // SALVAR PRODUTOS EDITADOS
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
			}
		} else if (clicado == detalheEstoque.getBtnDeletar()) { // DELETAR PRODUTO
			try {

				if (tipoProd == "Salto") {

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
