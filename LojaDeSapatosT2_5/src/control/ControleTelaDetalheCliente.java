package control;

import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import model.Dados;
import model.Endereco;
import view.TelaDetalheCliente;

public class ControleTelaDetalheCliente {
	private TelaDetalheCliente detalheCliente;
	private ControleCliente cliCtrl;
	private int indexCliente;
	private int opcEditarSalvar;
	private Date data = new Date();
	private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	public ControleTelaDetalheCliente(TelaDetalheCliente detalheCliente, int opcaoEditarSalvar, int indexCliente) {
		this.detalheCliente = detalheCliente;
		cliCtrl = new ControleCliente();
		opcEditarSalvar = opcaoEditarSalvar;
		this.indexCliente = indexCliente;
	}

	public void clicaBtn(ActionEvent e) { // CONTROLANDO AS AÇÕES DOS BOTÕES DE TelaDetalheCliente
		JButton clicado = (JButton) e.getSource();
		ControleValidacao control = new ControleValidacao();

		if (clicado == detalheCliente.getBtnSalvar() && opcEditarSalvar == 0) { // SALVAR CLIENTE
			try {
				// Validando dados inseridos pelo usuário (Endereço e dados do cliente)
				boolean yesNoEnd = control.validaEndereco(Integer.parseInt(detalheCliente.getValorCep().getText()),
						detalheCliente.getValorCidade().getText(), detalheCliente.getValorRua().getText(),
						Integer.parseInt(detalheCliente.getValorNum().getText()),
						Integer.parseInt(detalheCliente.getValorQd().getText()),
						detalheCliente.getValorBairro().getText(),
						Integer.parseInt(detalheCliente.getValorApart().getText()),
						detalheCliente.getValorComp().getText());
				boolean yesNoCli = control.validaCliente(detalheCliente.getValorNome().getText(),
						detalheCliente.getValorCpf().getText(), detalheCliente.getValorFone().getText(),
						detalheCliente.getValorEmail().getText());

				if (yesNoEnd && yesNoCli) {
					// Recebendo os valores do endereço
					Endereco end = new Endereco();
					end.setCep(Integer.parseInt(detalheCliente.getValorCep().getText()));
					end.setCidade(detalheCliente.getValorCidade().getText());
					end.setUf(detalheCliente.getValorUf().getSelectedItem().toString());
					end.setNomeRua(detalheCliente.getValorRua().getText());
					end.setNumero(Integer.parseInt(detalheCliente.getValorNum().getText()));
					end.setQuadra(Integer.parseInt(detalheCliente.getValorQd().getText()));
					end.setBairro(detalheCliente.getValorBairro().getText());
					end.setNumApart(Integer.parseInt(detalheCliente.getValorApart().getText()));
					end.setComplemento(detalheCliente.getValorComp().getText());

					// formatando data de nascimento
					data = formato.parse(detalheCliente.getValorData().getText());

					// Cadastrando o cliente
					cliCtrl.cadastrarCliente(end, detalheCliente.getValorNome().getText(),
							detalheCliente.getValorGenero().getSelectedItem().toString().charAt(0), data,
							detalheCliente.getValorCpf().getText(), detalheCliente.getValorFone().getText(),
							detalheCliente.getValorEmail().getText());

					JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", null,
							JOptionPane.INFORMATION_MESSAGE);

					detalheCliente.dispose();
				}

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			} catch (ParseException excData) {
				JOptionPane.showMessageDialog(null, "Verifique se a data está no padrão correto!", null,
						JOptionPane.ERROR_MESSAGE);
			}

		} else if (clicado == detalheCliente.getBtnSalvar() && opcEditarSalvar == 1) { // SALVAR CLIENTE EDITADO
			try {
				// Validando dados editados pelo usuário (Endereço e dados do cliente)
				boolean yesNoEnd = control.validaEndereco(Integer.parseInt(detalheCliente.getValorCep().getText()),
						detalheCliente.getValorCidade().getText(), detalheCliente.getValorRua().getText(),
						Integer.parseInt(detalheCliente.getValorNum().getText()),
						Integer.parseInt(detalheCliente.getValorQd().getText()),
						detalheCliente.getValorBairro().getText(),
						Integer.parseInt(detalheCliente.getValorApart().getText()),
						detalheCliente.getValorComp().getText());
				boolean yesNoCli = control.validaCliente(detalheCliente.getValorNome().getText(),
						detalheCliente.getValorCpf().getText(), detalheCliente.getValorFone().getText(),
						detalheCliente.getValorEmail().getText());

				if (yesNoEnd && yesNoCli) {
					// Recebendo os valores do endereço
					Endereco end = new Endereco();
					end.setCep(Integer.parseInt(detalheCliente.getValorCep().getText()));
					end.setCidade(detalheCliente.getValorCidade().getText());
					end.setUf(detalheCliente.getValorUf().getSelectedItem().toString());
					end.setNomeRua(detalheCliente.getValorRua().getText());
					end.setNumero(Integer.parseInt(detalheCliente.getValorNum().getText()));
					end.setQuadra(Integer.parseInt(detalheCliente.getValorQd().getText()));
					end.setBairro(detalheCliente.getValorBairro().getText());
					end.setNumApart(Integer.parseInt(detalheCliente.getValorApart().getText()));
					end.setComplemento(detalheCliente.getValorComp().getText());

					// formatando data de nascimento
					data = formato.parse(detalheCliente.getValorData().getText());

					// Editando o cliente
					cliCtrl.editarCliente(indexCliente, end, detalheCliente.getValorNome().getText(),
							detalheCliente.getValorGenero().getSelectedItem().toString().charAt(0), data,
							detalheCliente.getValorCpf().getText(), detalheCliente.getValorFone().getText(),
							detalheCliente.getValorEmail().getText());

					JOptionPane.showMessageDialog(null, "Cliente editado com sucesso!", null,
							JOptionPane.INFORMATION_MESSAGE);

					detalheCliente.dispose();
				}

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			} catch (ParseException excData) {
				JOptionPane.showMessageDialog(null, "Verifique se a data está no padrão correto!", null,
						JOptionPane.ERROR_MESSAGE);
			}

		} else if (clicado == detalheCliente.getBtnDeletar()) { // DELETAR CLIENTE
			try {

				cliCtrl.deletarCliente(indexCliente);
				detalheCliente.dispose();
				JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso!", null,
						JOptionPane.INFORMATION_MESSAGE);

			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Erro!\nNão há cliente a ser deletado!", null,
						JOptionPane.ERROR_MESSAGE);
			}

		} else { // Mensagem de erro apenas por precaução
			JOptionPane.showMessageDialog(null, "ERRO!", null, JOptionPane.ERROR_MESSAGE);
		}
	}

	public void imprimirDetalhes(TelaDetalheCliente tela, int index) {
		// Imprimindo atributos do cliente
		tela.setValorNome(Dados.getCliente().get(index).getNome());
		tela.setValorGenero(Dados.getCliente().get(index).getGenero());
		tela.setValorData(Dados.getCliente().get(index).getDataNasc());
		tela.setValorCpf(Dados.getCliente().get(index).getCpf());
		tela.setValorFone(Dados.getCliente().get(index).getTelefone());
		tela.setValorEmail(Dados.getCliente().get(index).getEmail());

		// Imprimindo atributos do endereço do cliente
		tela.setValorCep(Integer.toString(Dados.getCliente().get(index).getEndereco().getCep()));
		tela.setValorCidade(Dados.getCliente().get(index).getEndereco().getCidade());
		tela.setValorUf(Dados.getCliente().get(index).getEndereco().getUf());
		tela.setValorRua(Dados.getCliente().get(index).getEndereco().getNomeRua());
		tela.setValorNum(Integer.toString(Dados.getCliente().get(index).getEndereco().getNumero()));
		tela.setValorQd(Integer.toString(Dados.getCliente().get(index).getEndereco().getQuadra()));
		tela.setValorBairro(Dados.getCliente().get(index).getEndereco().getBairro());
		tela.setValorApart(Integer.toString(Dados.getCliente().get(index).getEndereco().getNumApart()));
		tela.setValorComp(Dados.getCliente().get(index).getEndereco().getComplemento());
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,
				"Erro!\nVerifique se todos os campos estão preenchidos."
						+ "\nVerifique se os dados em formato numérico são números."
						+ "\nVerifique se a data foi inserida corretamente.",
				null, JOptionPane.ERROR_MESSAGE);
	}

}
