package control;

import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import model.Dados;
import model.Endereco;
import view.TelaDetalheFuncionario;

public class ControleTelaDetalheFuncionario {
	private TelaDetalheFuncionario detalheFunc;
	private ControleFuncionario funCtrl;
	private int indexFunc;
	private int opcEditarSalvar;
	Date data = new Date();
	Date dataContrat = new Date();
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	public ControleTelaDetalheFuncionario(TelaDetalheFuncionario detalheFunc, int opcaoEditarSalvar, int indexFuncio) {
		this.detalheFunc = detalheFunc;
		funCtrl = new ControleFuncionario();
		this.opcEditarSalvar = opcaoEditarSalvar;
		this.indexFunc = indexFuncio;
	}

	public void clicaBtn(ActionEvent e) { // CONTROLANDO AS A��ES DOS BOT�ES DE TelaDetalheFuncion�rio
		JButton clicado = (JButton) e.getSource();
		ControleValidacao control = new ControleValidacao();

		if (clicado == detalheFunc.getBtnSalvar() && opcEditarSalvar == 0) { // SALVAR FUNCIONARIO
			try {
				// Validando dados inseridos pelo usu�rio (Endere�o e dados do funcion�rio)
				boolean yesNoEnd = control.validaEndereco(Integer.parseInt(detalheFunc.getValorCep().getText()),
						detalheFunc.getValorCidade().getText(), detalheFunc.getValorRua().getText(),
						Integer.parseInt(detalheFunc.getValorNum().getText()),
						Integer.parseInt(detalheFunc.getValorQd().getText()), detalheFunc.getValorBairro().getText(),
						Integer.parseInt(detalheFunc.getValorApart().getText()), detalheFunc.getValorComp().getText());
				boolean yesNoFunc = control.validaFuncionario(detalheFunc.getValorNome().getText(),
						detalheFunc.getValorCpf().getText(), detalheFunc.getValorFone().getText());

				if (yesNoEnd && yesNoFunc) {

					// Recebendo os valores do endere�o
					Endereco end = new Endereco();
					end.setCep(Integer.parseInt(detalheFunc.getValorCep().getText()));
					end.setCidade(detalheFunc.getValorCidade().getText());
					end.setUf(detalheFunc.getValorUf().getSelectedItem().toString());
					end.setNomeRua(detalheFunc.getValorRua().getText());
					end.setNumero(Integer.parseInt(detalheFunc.getValorNum().getText()));
					end.setQuadra(Integer.parseInt(detalheFunc.getValorQd().getText()));
					end.setBairro(detalheFunc.getValorBairro().getText());
					end.setNumApart(Integer.parseInt(detalheFunc.getValorApart().getText()));
					end.setComplemento(detalheFunc.getValorComp().getText());

					// Formatando a data inserida
					data = formato.parse(detalheFunc.getValorData().getText());
					dataContrat = formato.parse(detalheFunc.getValorDataCon().getText());

					// Cadastrando o Funcionario
					funCtrl.cadastrarFuncionario(end, detalheFunc.getValorNome().getText(), data,
							detalheFunc.getValorCpf().getText(), detalheFunc.getValorFone().getText(), dataContrat,
							detalheFunc.getValorTurno().getSelectedItem().toString(),
							Integer.parseInt(detalheFunc.getValorEntrada().getSelectedItem().toString()),
							Integer.parseInt(detalheFunc.getValorSaida().getSelectedItem().toString()));

					JOptionPane.showMessageDialog(null, "Funcion�rio cadastrado com sucesso!", null,
							JOptionPane.INFORMATION_MESSAGE);

					detalheFunc.dispose();
				}

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			} catch (ParseException excData) {
				excData.printStackTrace();
				JOptionPane.showMessageDialog(null, "Verifique se a data est� no padr�o correto!", null,
						JOptionPane.ERROR_MESSAGE);
			}

		} else if (clicado == detalheFunc.getBtnSalvar() && opcEditarSalvar == 1) { // SALVAR FUNCIONARIO EDITADO
			try {
				// Validando dados editados pelo usu�rio (Endere�o e dados do funcion�rio)
				boolean yesNoEnd = control.validaEndereco(Integer.parseInt(detalheFunc.getValorCep().getText()),
						detalheFunc.getValorCidade().getText(), detalheFunc.getValorRua().getText(),
						Integer.parseInt(detalheFunc.getValorNum().getText()),
						Integer.parseInt(detalheFunc.getValorQd().getText()), detalheFunc.getValorBairro().getText(),
						Integer.parseInt(detalheFunc.getValorApart().getText()), detalheFunc.getValorComp().getText());
				boolean yesNoFunc = control.validaFuncionario(detalheFunc.getValorNome().getText(),
						detalheFunc.getValorCpf().getText(), detalheFunc.getValorFone().getText());

				if (yesNoEnd && yesNoFunc) {
					// Recebendo os valores do endere�o
					Endereco end = new Endereco();
					end.setCep(Integer.parseInt(detalheFunc.getValorCep().getText()));
					end.setCidade(detalheFunc.getValorCidade().getText());
					end.setUf(detalheFunc.getValorUf().getSelectedItem().toString());
					end.setNomeRua(detalheFunc.getValorRua().getText());
					end.setNumero(Integer.parseInt(detalheFunc.getValorNum().getText()));
					end.setQuadra(Integer.parseInt(detalheFunc.getValorQd().getText()));
					end.setBairro(detalheFunc.getValorBairro().getText());
					end.setNumApart(Integer.parseInt(detalheFunc.getValorApart().getText()));
					end.setComplemento(detalheFunc.getValorComp().getText());

					// Formatando a data inserida
					data = formato.parse(detalheFunc.getValorData().getText());
					dataContrat = formato.parse(detalheFunc.getValorDataCon().getText());

					// Cadastrando o Funcionario
					funCtrl.editarFuncionario(indexFunc, end, detalheFunc.getValorNome().getText(), data,
							detalheFunc.getValorCpf().getText(), detalheFunc.getValorFone().getText(), dataContrat,
							detalheFunc.getValorTurno().getSelectedItem().toString(),
							Integer.parseInt(detalheFunc.getValorEntrada().getSelectedItem().toString()),
							Integer.parseInt(detalheFunc.getValorSaida().getSelectedItem().toString()));

					JOptionPane.showMessageDialog(null, "Funcion�rio editado com sucesso!", null,
							JOptionPane.INFORMATION_MESSAGE);

					detalheFunc.dispose();
				}

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			} catch (ParseException excData) {
				excData.printStackTrace();
				JOptionPane.showMessageDialog(null, "Verifique se a data est� no padr�o correto!", null,
						JOptionPane.ERROR_MESSAGE);
			}

		} else if (clicado == detalheFunc.getBtnDeletar()) { // DELETAR FUNCION�RIO
			try {

				funCtrl.deletarFuncionario(indexFunc);
				detalheFunc.dispose();
				JOptionPane.showMessageDialog(null, "Funcion�rio deletado com sucesso!", null,
						JOptionPane.INFORMATION_MESSAGE);

			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Erro!\nN�o h� funcion�rio a ser deletado!", null,
						JOptionPane.ERROR_MESSAGE);
			}
		} else { // Mensagem de erro apenas por precau��o
			JOptionPane.showMessageDialog(null, "ERRO!", null, JOptionPane.ERROR_MESSAGE);
		}
	}

	public void imprimirDetalhes(TelaDetalheFuncionario tela, int index) {

		// Imprimindo atributos do funcion�rio
		tela.setValorNome(Dados.getFuncionario().get(index).getNome());
		tela.setValorData(Dados.getFuncionario().get(index).getDataNasc());
		tela.setValorCpf(Dados.getFuncionario().get(index).getCpf());
		tela.setValorFone(Dados.getFuncionario().get(index).getTelefone());
		tela.setValorDataCon(Dados.getFuncionario().get(index).getDataContratacao());
		tela.setValorTurno(Dados.getFuncionario().get(index).getTurno());
		tela.setValorEntrada(Integer.toString(Dados.getFuncionario().get(index).getHoraEntrada()));
		tela.setValorSaida(Integer.toString(Dados.getFuncionario().get(index).getHoraSaida()));

		// Imprimindo atributos do endere�o do funcion�rio
		tela.setValorCep(Integer.toString(Dados.getFuncionario().get(index).getEndereco().getCep()));
		tela.setValorCidade(Dados.getFuncionario().get(index).getEndereco().getCidade());
		tela.setValorUf(Dados.getFuncionario().get(index).getEndereco().getUf());
		tela.setValorRua(Dados.getFuncionario().get(index).getEndereco().getNomeRua());
		tela.setValorNum(Integer.toString(Dados.getFuncionario().get(index).getEndereco().getNumero()));
		tela.setValorQd(Integer.toString(Dados.getFuncionario().get(index).getEndereco().getQuadra()));
		tela.setValorBairro(Dados.getFuncionario().get(index).getEndereco().getBairro());
		tela.setValorApart(Integer.toString(Dados.getFuncionario().get(index).getEndereco().getNumApart()));
		tela.setValorComp(Dados.getFuncionario().get(index).getEndereco().getComplemento());

	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,
				"Erro!\nVerifique se todos os campos est�o preenchidos."
						+ "\nVerifique se os dados em formato num�rico s�o n�meros."
						+ "\nVerifique se as datas foram inseridas corretamente.",
				null, JOptionPane.ERROR_MESSAGE);
	}

}
