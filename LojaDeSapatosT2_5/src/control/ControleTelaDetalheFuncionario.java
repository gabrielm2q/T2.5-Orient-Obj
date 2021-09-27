package control;

import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import view.TelaDetalheFuncionario;

public class ControleTelaDetalheFuncionario {
	private TelaDetalheFuncionario detalheFunc;
	private ControleFuncionario funCtrl;
	private ControleEndereco endereco;
	private ControleDados dados = new ControleDados();
	private int indexFunc, opc;
	Date data = new Date();
	Date dataContrat = new Date();
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	public ControleTelaDetalheFuncionario(TelaDetalheFuncionario detalheFunc, ControleDados d, int editarSalvar,
			int idx) {
		this.detalheFunc = detalheFunc;
		this.dados = d;
		funCtrl = new ControleFuncionario(dados);
		endereco = new ControleEndereco(dados);
		opc = editarSalvar;
		indexFunc = idx;
	}

	public void imprimirEditarDetalhe(TelaDetalheFuncionario tela, ControleDados d, int index) {

		// Imprimindo dados do funcionário
		tela.getValorNome().setText(d.getFuncionario().get(index).getNome());
		tela.getValorData().setText(formato.format(d.getFuncionario().get(index).getDataNasc()));
		tela.getValorCpf().setText(d.getFuncionario().get(index).getCpf());
		tela.getValorFone().setText(d.getFuncionario().get(index).getTelefone());
		tela.getValorDataCon().setText(formato.format(d.getFuncionario().get(index).getDataContratacao()));
		tela.getValorTurno().setSelectedItem(d.getFuncionario().get(index).getTurno());
		tela.getValorEntrada().setSelectedItem(String.valueOf(d.getFuncionario().get(index).getHoraEntrada()));
		tela.getValorEntrada().setSelectedItem(String.valueOf(d.getFuncionario().get(index).getHoraSaida()));

		// Imprimindo dados do endereço do funcionário
		tela.getValorCep().setText(String.valueOf(d.getEnderecoFuncionario().get(index).getCep()));
		tela.getValorCidade().setText(d.getEnderecoFuncionario().get(index).getCidade());
		tela.getValorUf().setSelectedItem(d.getEnderecoFuncionario().get(index).getUf());
		tela.getValorRua().setText(d.getEnderecoFuncionario().get(index).getNomeRua());
		tela.getValorNum().setText(String.valueOf(d.getEnderecoFuncionario().get(index).getNumero()));
		tela.getValorQd().setText(String.valueOf(d.getEnderecoFuncionario().get(index).getQuadra()));
		tela.getValorBairro().setText(d.getEnderecoFuncionario().get(index).getBairro());
		tela.getValorApart().setText(String.valueOf(d.getEnderecoFuncionario().get(index).getNumApart()));
		tela.getValorComp().setText(d.getEnderecoFuncionario().get(index).getComplemento());

	}

	public void clicaBtn(ActionEvent e) { // CONTROLANDO AS AÇÕES DOS BOTÕES DE TelaDetalheFuncionário
		JButton clicado = (JButton) e.getSource();

		if (clicado == detalheFunc.getBtnSalvar() && opc == 0) { // SALVAR FUNCIONARIO
			try {
				// Recebendo os valores do endereço
				endereco.cadastrarEndereco(2, Integer.parseInt(detalheFunc.getValorCep().getText()), // CEP
						detalheFunc.getValorCidade().getText(), // Cidade
						detalheFunc.getValorUf().getSelectedItem().toString(), // UF
						detalheFunc.getValorRua().getText(), // Nome da Rua
						Integer.parseInt(detalheFunc.getValorNum().getText()), // Número
						Integer.parseInt(detalheFunc.getValorQd().getText()), // Quadra
						detalheFunc.getValorBairro().getText(), // Bairro
						Integer.parseInt(detalheFunc.getValorApart().getText()), // Número do Apartamento
						detalheFunc.getValorComp().getText()); // Complemento

				// Formatando a data inserida
				data = formato.parse(detalheFunc.getValorData().getText());
				dataContrat = formato.parse(detalheFunc.getValorDataCon().getText());

				// Cadastrando o Funcionario
				funCtrl.cadastrarFuncionario(endereco.getEnder(), // Endereço
						detalheFunc.getValorNome().getText(), // Nome
						data, // Data de nascimento
						detalheFunc.getValorCpf().getText(), // CPF
						detalheFunc.getValorFone().getText(), // Telefone
						dataContrat, // Data de Contratação
						detalheFunc.getValorTurno().getSelectedItem().toString(), // Turno
						Integer.parseInt(detalheFunc.getValorEntrada().getSelectedItem().toString()), // Hora de Entrada
						Integer.parseInt(detalheFunc.getValorSaida().getSelectedItem().toString())); // Hora de Saída

				funCtrl.setNome(detalheFunc.getValorNome().getText());

				JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!", null,
						JOptionPane.INFORMATION_MESSAGE);
				detalheFunc.dispose();

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			} catch (ParseException excData) {
				excData.printStackTrace();
				mensagemErroCadastro();
			}

		} else if (clicado == detalheFunc.getBtnSalvar() && opc == 1) { // SALVAR FUNCIONARIO EDITADO
			try {
				// Recebendo os valores do endereço
				endereco.editarEndereco(2, dados, indexFunc, // Dados para preencher o endereço
						Integer.parseInt(detalheFunc.getValorCep().getText()), // CEP
						detalheFunc.getValorCidade().getText(), // Cidade
						detalheFunc.getValorUf().getSelectedItem().toString(), // UF
						detalheFunc.getValorRua().getText(), // Nome da Rua
						Integer.parseInt(detalheFunc.getValorNum().getText()), // Número
						Integer.parseInt(detalheFunc.getValorQd().getText()), // Quadra
						detalheFunc.getValorBairro().getText(), // Bairro
						Integer.parseInt(detalheFunc.getValorApart().getText()), // Número do Apartamento
						detalheFunc.getValorComp().getText()); // Complemento

				// Formatando a data inserida
				data = formato.parse(detalheFunc.getValorData().getText());
				dataContrat = formato.parse(detalheFunc.getValorDataCon().getText());

				// Editando o funcionário
				funCtrl.editarFuncionario(dados, this.getIndexFunc(), // Index do cliente a ser editado
						endereco.getEnder(), // Endereço
						detalheFunc.getValorNome().getText(), // Nome
						data, // Data de nascimento
						detalheFunc.getValorCpf().getText(), // CPF
						detalheFunc.getValorFone().getText(), // Telefone
						dataContrat, // Data de Contratação
						detalheFunc.getValorTurno().getSelectedItem().toString(), // Turno
						Integer.parseInt(detalheFunc.getValorEntrada().getSelectedItem().toString()), // Hora de Entrada
						Integer.parseInt(detalheFunc.getValorSaida().getSelectedItem().toString())); // Hora de Saída

				funCtrl.setNomeAt(detalheFunc.getValorNome().getText(), this.getIndexFunc());

				JOptionPane.showMessageDialog(null, "Funcionário editado com sucesso!", null,
						JOptionPane.INFORMATION_MESSAGE);
				detalheFunc.dispose();

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			} catch (ParseException excData) {
				excData.printStackTrace();
				mensagemErroCadastro();
			}

		} else if (clicado == detalheFunc.getBtnDeletar()) { // DELETAR FUNCIONÁRIO
			try {
				if (detalheFunc.getValorNome().getText().equals(dados.getFuncionario().get(indexFunc).getNome())
						&& detalheFunc.getValorCpf().getText().equals(dados.getFuncionario().get(indexFunc).getCpf())) {
					funCtrl.deletarFuncionario(dados, indexFunc);
					JOptionPane.showMessageDialog(null, "Funcionário deletado com sucesso!", null,
							JOptionPane.INFORMATION_MESSAGE);
					detalheFunc.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "ERRO!\nSelecione um funcionário na lista para deletar!", null,
							JOptionPane.ERROR_MESSAGE);
				}
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Erro!\nNão há funcionário a ser deletado!", null,
						JOptionPane.ERROR_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(null, "ERRO!", null, JOptionPane.ERROR_MESSAGE);
		}
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,
				"Erro!\nVerifique se todos os campos estão preenchidos."
						+ "\nVerifique se os dados em formato numérico são números."
						+ "\nVerifique se as datas foram inseridas corretamente.",
				null, JOptionPane.ERROR_MESSAGE);
	}

	public int getIndexFunc() {
		return indexFunc;
	}

	public void setIndexFunc(int indexFunc) {
		this.indexFunc = indexFunc;
	}

	public int getOpc() {
		return opc;
	}

	public void setOpc(int opc) {
		this.opc = opc;
	}

}
