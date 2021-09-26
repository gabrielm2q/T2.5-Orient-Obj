package control;

import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import view.TelaDetalheCliente;

public class ControleTelaDetalheCliente {
	private TelaDetalheCliente detalheCliente;
	private ControleCliente cliCtrl;
	private ControleEndereco endereco;
	private ControleDados dados = new ControleDados();
	private int indexCliente;
	Date data = new Date();
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	public ControleTelaDetalheCliente(TelaDetalheCliente detalheCliente, ControleDados d) {
		this.detalheCliente = detalheCliente;
		this.dados = d;
		cliCtrl = new ControleCliente(dados);
		endereco = new ControleEndereco(dados);
	}

	public void imprimirEditarDetalhe(TelaDetalheCliente tela, ControleDados d, int index) {
		this.setIndexCliente(index);

		// Definindo o index do gênero
		int iGen = 0;
		if (d.getCliente().get(index).getGenero() == 'M') {
			iGen = 0;
		} else if (d.getCliente().get(index).getGenero() == 'F') {
			iGen = 1;
		} else if (d.getCliente().get(index).getGenero() == 'O') {
			iGen = 2;
		}

		// Imprimindo dados do cliente
		tela.getValorNome().setText(d.getCliente().get(index).getNome());
		tela.getValorGenero().setSelectedIndex(iGen);
		tela.getValorData().setText(formato.format(d.getCliente().get(index).getDataNasc()));
		tela.getValorCpf().setText(d.getCliente().get(index).getCpf());
		tela.getValorFone().setText(d.getCliente().get(index).getTelefone());
		tela.getValorEmail().setText(d.getCliente().get(index).getEmail());

		// Imprimindo dados do endereço do cliente
		tela.getValorCep().setText(String.valueOf(d.getEndereco().get(index).getCep()));
		tela.getValorCidade().setText(d.getEndereco().get(index).getCidade());
		tela.getValorUf().setSelectedItem(d.getEndereco().get(index).getUf());
		tela.getValorRua().setText(d.getEndereco().get(index).getNomeRua());
		tela.getValorNum().setText(String.valueOf(d.getEndereco().get(index).getNumero()));
		tela.getValorQd().setText(String.valueOf(d.getEndereco().get(index).getQuadra()));
		tela.getValorBairro().setText(d.getEndereco().get(index).getBairro());
		tela.getValorApart().setText(String.valueOf(d.getEndereco().get(index).getNumApart()));
		tela.getValorComp().setText(d.getEndereco().get(index).getComplemento());

	}

	public void clicaBtn(ActionEvent e) {
		JButton clicado = (JButton) e.getSource();

		if (clicado == detalheCliente.getBtnSalvar()) {
			try {
				// Recebendo os valores do endereço
				endereco.cadastrarEndereco(Integer.parseInt(detalheCliente.getValorCep().getText()), // CEP
						detalheCliente.getValorCidade().getText(), // Cidade
						detalheCliente.getValorUf().getSelectedItem().toString(), // UF
						detalheCliente.getValorRua().getText(), // Nome da Rua
						Integer.parseInt(detalheCliente.getValorNum().getText()), // Número
						Integer.parseInt(detalheCliente.getValorQd().getText()), // Quadra
						detalheCliente.getValorBairro().getText(), // Bairro
						Integer.parseInt(detalheCliente.getValorApart().getText()), // Número do Apartamento
						detalheCliente.getValorComp().getText()); // Complemento

				// Formatando a data inserida
				try {
					data = formato.parse(detalheCliente.getValorData().getText());
				} catch (ParseException excData) {
					excData.printStackTrace();
				}

				// Cadastrando o cliente
				cliCtrl.cadastrarCliente(endereco.getEnder(), // Endereço
						detalheCliente.getValorNome().getText(), // Nome
						detalheCliente.getValorGenero().getSelectedItem().toString().charAt(0), // Gênero
						data, // Data de nascimento
						detalheCliente.getValorCpf().getText(), // CPF
						detalheCliente.getValorFone().getText(), // Telefone
						detalheCliente.getValorEmail().getText()); // Email

				cliCtrl.setNome(detalheCliente.getValorNome().getText());

				JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", null,
						JOptionPane.INFORMATION_MESSAGE);

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}

			detalheCliente.dispose();

		} else if (clicado == detalheCliente.getBtnSalvar() && 0 > 1) {

			try {
				// Recebendo os valores do endereço
				endereco.editarEndereco(dados, this.getIndexCliente(), // Dados para preencher o endereço
						Integer.parseInt(detalheCliente.getValorCep().getText()), // CEP
						detalheCliente.getValorCidade().getText(), // Cidade
						detalheCliente.getValorUf().getSelectedItem().toString(), // UF
						detalheCliente.getValorRua().getText(), // Nome da Rua
						Integer.parseInt(detalheCliente.getValorNum().getText()), // Número
						Integer.parseInt(detalheCliente.getValorQd().getText()), // Quadra
						detalheCliente.getValorBairro().getText(), // Bairro
						Integer.parseInt(detalheCliente.getValorApart().getText()), // Número do Apartamento
						detalheCliente.getValorComp().getText()); // Complemento

				// Formatando a data inserida
				try {
					data = formato.parse(detalheCliente.getValorData().getText());
				} catch (ParseException excData) {
					excData.printStackTrace();
				}

				// Cadastrando o cliente
				cliCtrl.editarCliente(dados, this.getIndexCliente(), // Dados para preencher o endereço
						endereco.getEnder(), // Endereço
						detalheCliente.getValorNome().getText(), // Nome
						detalheCliente.getValorGenero().getSelectedItem().toString().charAt(0), // Gênero
						data, // Data de nascimento
						detalheCliente.getValorCpf().getText(), // CPF
						detalheCliente.getValorFone().getText(), // Telefone
						detalheCliente.getValorEmail().getText()); // Email

				cliCtrl.setNomeAt(detalheCliente.getValorNome().getText(), this.getIndexCliente());

				JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", null,
						JOptionPane.INFORMATION_MESSAGE);

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}

			detalheCliente.dispose();

		} else if (clicado == detalheCliente.getBtnDeletar()) {
			JOptionPane.showMessageDialog(null, "SISTEMA EM CONSTRUÇÃO!", null, JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "ERRO!", null, JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,
				"Erro!\nVerifique se todos os campos estão preenchidos."
						+ "\nVerifique se os dados em formato numérico são números."
						+ "\nVerifique se a data foi inserida corretamente.",
				null, JOptionPane.ERROR_MESSAGE);
	}

	public int getIndexCliente() {
		return indexCliente;
	}

	public void setIndexCliente(int indexCliente) {
		this.indexCliente = indexCliente;
	}

}
