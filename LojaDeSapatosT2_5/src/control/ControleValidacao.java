package control;

import javax.swing.JOptionPane;

import model.Bota;
import model.Cliente;
import model.Endereco;
import model.Funcionario;
import model.Loja;
import model.Salto;
import model.Sapato;

/**
 * Validadora. Valida os dados inseridos pelo usu�rio de acordo com cada tipo de
 * dado e a entrada esperada. Exibe mensagem informando o erro detalhado. Usado
 * antes dos m�todos de cadastro e edi��o.
 * 
 * @author Gabriel Mariano
 */
public class ControleValidacao {

	/**
	 * Construtor vazio.
	 */
	public ControleValidacao() {

	}

	/**
	 * Valida��o de Endere�o. Valida os dados requeridos para o cadastro de
	 * endere�o. Retorna True caso seja v�lido e False caso seja inv�lido.
	 * 
	 * @see Endereco
	 * 
	 * @param CEP         CEP da Cidade cadastrada
	 * @param Cidade      Nome da Cidade
	 * @param Rua         Nome da Rua
	 * @param N�mero      N�mero da Casa
	 * @param Quadra      N�mero da Quadra
	 * @param Bairro      Nome do Bairro
	 * @param numApart    N�mero do Apartamento, se necess�rio
	 * @param Complemento Complemento do Endere�o
	 * @return boolean True ou False
	 */
	public boolean validaEndereco(int cep, String cidade, String rua, int num, int quadra, String bairro, int numApart,
			String comp) {
		try { // Validando o CEP
			if (cep < 10000000 || cep > 99999999) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o CEP possui 8 d�gitos num�ricos!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o CEP foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		} catch (NumberFormatException exc2) {
			JOptionPane.showMessageDialog(null, "Erro!\\nVerifique se o CEP foi preenchido com apenas n�meros!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		try { // Validando o nome da cidade
			if (cidade.isBlank() || cidade.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome da cidade n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (cidade.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome da cidade foi preenchido corretamente!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (cidade.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO nome da cidade n�o pode ser composto apenas por n�meros!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome da cidade foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		try { // Validando o nome da rua
			if (rua.isBlank() || rua.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome da rua n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (rua.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome da rua foi preenchido corretamente!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (rua.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO nome da rua n�o pode ser composto apenas por n�meros!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome da rua foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		try { // Validando o n�mero
			if (num <= 0 || num >= 999999) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o n�mero � maior que zero\ne menor que 999.999!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o n�mero foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		} catch (NumberFormatException exc2) {
			JOptionPane.showMessageDialog(null, "Erro!\\nVerifique se o n�mero foi preenchido com apenas n�meros!",
					null, JOptionPane.ERROR_MESSAGE);
		}

		try { // Validando o n�mero da quadra
			if (quadra <= 0 || quadra >= 999999) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o n�mero da quadra � maior que zero\ne menor que 999.999!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o n�mero da quadra foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		} catch (NumberFormatException exc2) {
			JOptionPane.showMessageDialog(null,
					"Erro!\\nVerifique se o n�mero da quadra foi preenchido com apenas n�meros!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		try { // Validando o nome do bairro
			if (bairro.isBlank() || bairro.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome do bairro n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (bairro.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome do bairro foi preenchido corretamente!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (bairro.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO nome do bairro n�o pode ser composto apenas por n�meros!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome do bairro foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		try { // Validando o n�mero do apartamento
			if (numApart <= 0 || numApart >= 901) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o n�mero do apartamento � maior que zero\ne menor que 901!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o n�mero do apartamento foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		} catch (NumberFormatException exc2) {
			JOptionPane.showMessageDialog(null,
					"Erro!\\nVerifique se o n�mero do apartamento foi preenchido com apenas n�meros!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		try { // Validando o complemento
			if (comp.isBlank() || comp.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o complemento n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (comp.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o complemento foi preenchido corretamente!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (comp.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO complemento n�o pode ser composto apenas por n�meros!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o complemento foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		return true;
	}

	/**
	 * Valida��o dos dados da Loja. Valida os dados requeridos para o cadastro da
	 * Loja. Retorna True caso seja v�lido e False caso seja inv�lido.
	 * 
	 * @see Loja
	 * 
	 * @param Nome Nome da Loja
	 * @param CNPJ CNPJ da Loja
	 * @param Site Link do site da loja
	 * @return boolean True ou False
	 */
	public boolean validaLoja(String nome, String cnpj, String site) {

		try { // Validando o nome da loja
			if (nome.isBlank() || nome.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome da loja n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (nome.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome da loja foi preenchido corretamente!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (nome.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO nome da loja n�o pode ser composto apenas por n�meros!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome da loja foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		try { // Validando o cnpj
			if (cnpj.isBlank() || cnpj.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o CNPJ n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (cnpj.trim().length() != 18) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o CNPJ foi preenchido corretamente!\nO padr�o �: XX.XXX.XXX/0001-XX ou XX.XXX.XXX/0002-XX",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (cnpj.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO CNPJ n�o pode ser composto apenas por n�meros!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}

			// Verificando se o CNPJ seguiu o padrao numerico requerido
			if (!cnpj.substring(0, 2).matches("[0-9]+") || !cnpj.substring(3, 6).matches("[0-9]+")
					|| !cnpj.substring(7, 10).matches("[0-9]+") || !cnpj.substring(11, 14).equals("000")
					|| !cnpj.substring(14, 15).matches("[1-2]") || !cnpj.substring(16, 18).matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se os valores do CNPJ est�o certos!\nO padr�o �: XX.XXX.XXX/0001-XX ou XX.XXX.XXX/0002-XX",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}

			// Verificando se o CNPJ seguiu o padrao de pontuacao requerido
			if (!cnpj.substring(2, 3).equals(".") || !cnpj.substring(6, 7).equals(".")
					|| !cnpj.substring(10, 11).equals("/") || !cnpj.substring(15, 16).equals("-")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique a pontua��o do CNPJ!\nO padr�o �: XX.XXX.XXX/0001-XX ou XX.XXX.XXX/0002-XX",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}

			// Verificando se o CNPJ nao e composto apenas de zeros
			if (cnpj.substring(0, 2).equals("00") || cnpj.substring(3, 6).equals("000")
					|| cnpj.substring(7, 10).equals("000") || cnpj.substring(16, 18).equals("00")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO CNPJ n�o pode ser composto apenas por zeros!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o CNPJ foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		try { // Validando o site da loja
			if (site.isBlank() || site.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o site da loja n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (site.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o site da loja foi preenchido corretamente!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (site.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO site da loja n�o pode ser composto apenas por n�meros!",
						null, JOptionPane.ERROR_MESSAGE);

				return false;
			} else if (site.trim().contains(" ")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO site da loja n�o pode ter espa�os no meio!", null,
						JOptionPane.ERROR_MESSAGE);

				return false;
			} else if (!site.trim().contains("www.") && !site.trim().contains("http") && !site.trim().contains(".com")
					&& !site.trim().contains(".edu") && !site.trim().contains(".html") && !site.trim().contains(".br")
					&& !site.trim().contains(".us") && !site.trim().contains(".fr") && !site.trim().contains(".fi")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO site da loja deve ser um link!", null,
						JOptionPane.ERROR_MESSAGE);

				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o site da loja foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		return true;
	}

	/**
	 * Valida��o do Cliente. Valida os dados requeridos para o cadastro do Cliente.
	 * Retorna True caso seja v�lido e False caso seja inv�lido.
	 * 
	 * @see Cliente
	 * 
	 * @param Nome     Nome do Cliente
	 * @param CPF      CPF do Cliente
	 * @param Telefone Celular do Cliente
	 * @param Email    Email do Cliente
	 * @return boolean True ou False
	 */
	public boolean validaCliente(String nome, String cpf, String fone, String email) {

		// Validando o nome do cliente
		try {
			if (nome.isBlank() || nome.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome do cliente n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (nome.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o nome do cliente foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (nome.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO nome do cliente n�o pode ser composto apenas por n�meros!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome do cliente foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o CPF
		try {
			if (cpf.isBlank() || cpf.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o CPF n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (cpf.trim().length() != 14) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o CPF foi preenchido corretamente!\nO padr�o �: XXX.XXX.XXX-XX", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (cpf.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO CPF n�o pode ser composto apenas por n�meros!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}

			// Verificando se o CPF seguiu o padrao numerico requerido
			if (!cpf.substring(0, 3).matches("[0-9]+") || !cpf.substring(4, 7).matches("[0-9]+")
					|| !cpf.substring(8, 11).matches("[0-9]+") || !cpf.substring(12, 14).matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se os valores do CPF est�o certos!\nO padr�o �: XXX.XXX.XXX-XX", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}

			// Verificando se o CPF seguiu o padrao de pontuacao requerido
			if (!cpf.substring(3, 4).equals(".") || !cpf.substring(7, 8).equals(".")
					|| !cpf.substring(11, 12).equals("-")) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique a pontua��o do CPF!\nO padr�o �: XXX.XXX.XXX-XX",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}

			/*
			 * Verificando se o CPF nao e composto apenas de numeros repetidos ou cont�m
			 * algum espa�o com 000
			 */
			if (cpf.contains("000") || cpf.equals("111.111.111-11") || cpf.equals("222.222.222-22")
					|| cpf.equals("333.333.333-33") || cpf.equals("444.444.444-44") || cpf.equals("555.555.555-55")
					|| cpf.equals("666.666.666-66") || cpf.equals("777.777.777-77") || cpf.equals("888.888.888-88")
					|| cpf.equals("999.999.999-99") || cpf.substring(12, 14).equals("00")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se os valores do CPF n�o s�o repetidos!\nO padr�o de CPF �: XXX.XXX.XXX-XX",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}

		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o CPF foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o telefone do cliente
		try {
			if (fone.isBlank() || fone.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o telefone n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (fone.trim().length() != 11) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o telefone foi preenchido corretamente!\nO formato �: DDD + 9 + XXXX + XXXX\nUse apenas n�meros! Sem espa�os!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (!fone.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO telefone deve possuir apenas n�meros! Sem espa�os!\nO formato �: DDD + 9 + XXXX + XXXX",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (fone.equals("00000000000")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO telefone n�o pode conter apenas zeros! Sem espa�os!\nO formato �: DDD + 9 + XXXX + XXXX",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (fone.substring(0, 2).equals("00") || !fone.substring(2, 3).equals("9")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO DDD deve ser v�lido!\nUse o d�gito 9 antes do telefone!\nO formato �: DDD + 9 + XXXX + XXXX",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}

		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o telefone foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		try { // Validando o email
			if (email.isBlank() || email.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o email n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (email.trim().length() < 7) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o email foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (email.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO email n�o pode ser composto apenas por n�meros!", null,
						JOptionPane.ERROR_MESSAGE);

				return false;
			} else if (email.trim().contains(" ")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO email n�o pode ter espa�os no meio!", null,
						JOptionPane.ERROR_MESSAGE);

				return false;
			} else if (!email.trim().contains(".com") && !email.trim().contains(".edu")
					&& !email.trim().contains(".unb") && !email.trim().contains(".br") && !email.trim().contains(".gov")
					&& !email.trim().contains(".us") && !email.trim().contains(".fi")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO email deve ser v�lido!", null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (!email.trim().contains("@")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO email deve conter @!", null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (email.trim().substring(0, 1).equals("@")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO primeiro d�gito do email n�o pode ser @!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o email foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		return true;
	}

	/**
	 * Valida��o do Funcion�rio. Valida os dados requeridos para o cadastro do
	 * Funcion�rio. Retorna True caso seja v�lido e False caso seja inv�lido.
	 * 
	 * @see Funcionario
	 * 
	 * @param Nome     Nome do Funcion�rio
	 * @param CPF      CPF do Funcion�rio
	 * @param Telefone Celular do Funcion�rio
	 * @return boolean True ou False
	 */
	public boolean validaFuncionario(String nome, String cpf, String fone) {

		// Validando o nome do funcionario
		try {
			if (nome.isBlank() || nome.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome do funcion�rio n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (nome.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o nome do funcion�rio foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (nome.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO nome do funcion�rio n�o pode ser composto apenas por n�meros!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome do funcion�rio foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o CPF do funcion�rio
		try {
			if (cpf.isBlank() || cpf.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o CPF n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (cpf.trim().length() != 14) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o CPF foi preenchido corretamente!\nO padr�o �: XXX.XXX.XXX-XX", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (cpf.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO CPF n�o pode ser composto apenas por n�meros!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}

			// Verificando se o CPF seguiu o padrao numerico requerido
			if (!cpf.substring(0, 3).matches("[0-9]+") || !cpf.substring(4, 7).matches("[0-9]+")
					|| !cpf.substring(8, 11).matches("[0-9]+") || !cpf.substring(12, 14).matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se os valores do CPF est�o certos!\nO padr�o �: XXX.XXX.XXX-XX", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}

			// Verificando se o CPF seguiu o padrao de pontuacao requerido
			if (!cpf.substring(3, 4).equals(".") || !cpf.substring(7, 8).equals(".")
					|| !cpf.substring(11, 12).equals("-")) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique a pontua��o do CPF!\nO padr�o �: XXX.XXX.XXX-XX",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}

			/*
			 * Verificando se o CPF nao e composto apenas de numeros repetidos ou cont�m
			 * algum espa�o com 000
			 */
			if (cpf.contains("000") || cpf.equals("111.111.111-11") || cpf.equals("222.222.222-22")
					|| cpf.equals("333.333.333-33") || cpf.equals("444.444.444-44") || cpf.equals("555.555.555-55")
					|| cpf.equals("666.666.666-66") || cpf.equals("777.777.777-77") || cpf.equals("888.888.888-88")
					|| cpf.equals("999.999.999-99") || cpf.substring(12, 14).equals("00")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se os valores do CPF n�o s�o repetidos!\nO padr�o de CPF �: XXX.XXX.XXX-XX",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}

		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o CPF foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o telefone do funcion�rio
		try {
			if (fone.isBlank() || fone.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o telefone n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (fone.trim().trim().length() != 11) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o telefone foi preenchido corretamente!\nO formato �: DDD + 9 + XXXX + XXXX\nUse apenas n�meros! Sem espa�os!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (!fone.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO telefone deve possuir apenas n�meros! Sem espa�os!\nO formato �: DDD + 9 + XXXX + XXXX",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (fone.equals("00000000000")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO telefone n�o pode conter apenas zeros! Sem espa�os!\nO formato �: DDD + 9 + XXXX + XXXX",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (fone.substring(0, 2).equals("00") || !fone.substring(2, 3).equals("9")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO DDD deve ser v�lido!\nUse o d�gito 9 antes do telefone!\nO formato �: DDD + 9 + XXXX + XXXX",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}

		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o telefone foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		return true;
	}

	/**
	 * Valida��o do Salto. Valida os dados requeridos para o cadastro de um Produto
	 * do tipo Salto. Retorna True caso seja v�lido e False caso seja inv�lido.
	 * 
	 * @see Salto
	 * 
	 * @param Nome
	 * @param Quantidade
	 * @param Pre�o
	 * @param Marca
	 * @param paisOrigem
	 * @param Garantia
	 * @param Cor
	 * @param codBarras
	 * @param Material
	 * @param tipoSalto
	 * @param corExterna
	 * @param corSolado
	 * @param alturaSalto
	 * @return boolean True ou False
	 */
	public boolean validaSalto(String nome, int quantidade, Double preco, String marca, String paisOrigem,
			String garantia, String cor, String codBarras, String material, String tipoSalto, String corExterna,
			String corSolado, String alturaSalto) {

		// Validando o nome do salto
		try {
			if (nome.isBlank() || nome.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome do salto n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (nome.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome do salto foi preenchido corretamente!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (nome.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO nome do salto n�o pode ser composto apenas por n�meros!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome do salto foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando a quantidade de saltos
		try {
			if (quantidade <= 0 || quantidade >= 100000) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se a quantidade do produto � maior que 0\ne menor que 100,000!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a quantidade do produto foi preenchida!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o pre�o dos saltos
		try {
			if (preco <= 0 || preco >= 1000000) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o pre�o do produto � maior que 0\ne menor que 1,000,000.00!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o pre�o do produto foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando a marca do salto
		try {
			if (marca.isBlank() || marca.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a marca do salto n�o est� vazia!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (marca.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a marca do salto foi preenchida corretamente!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a marca do salto foi preenchida!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o pais de origem
		try {
			if (paisOrigem.isBlank() || paisOrigem.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o pa�s de origem do salto n�o est� vazio!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (paisOrigem.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o pa�s de origem do salto foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (paisOrigem.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO pa�s de origem do salto n�o pode ser composto apenas por n�meros!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o pa�s de origem do salto foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o tempo de garantia do salto
		try {
			if (garantia.isBlank() || garantia.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o tempo de garantia do salto n�o est� vazio!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (garantia.trim().length() < 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o tempo de garantia foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (garantia.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO tempo de garantia do salto n�o pode ser composto apenas por n�meros!\nDeve conter a medida de tempo (anos/meses...)!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (garantia.trim().matches("[a-z]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO tempo de garantia deve conter o tempo!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o tempo de garantia do salto foi preenchido!",
					null, JOptionPane.ERROR_MESSAGE);
		}

		// Validando a cor do produto
		try {
			if (cor.isBlank() || cor.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a cor do salto n�o est� vazia!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (cor.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a cor do salto foi preenchida corretamente!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (cor.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nA cor do salto n�o pode ser composta apenas por n�meros!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a cor do salto foi preenchida!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o c�digo de barras
		try {
			if (codBarras.isBlank() || codBarras.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o c�digo de barras n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (codBarras.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o c�digo de barras foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (!codBarras.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO c�digo de barras n�o pode ser composto por letras!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o c�digo de barras foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o material do produto
		try {
			if (material.isBlank() || material.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o material n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (material.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o material foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (material.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO material n�o pode ser composto apenas por n�meros!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o material foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o tipo de salto
		try {
			if (tipoSalto.isBlank() || tipoSalto.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o tipo de salto n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (tipoSalto.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o tipo de salto foi preenchido corretamente!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (tipoSalto.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO tipo de salto n�o pode ser composto apenas por n�meros!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o tipo de salto foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando a cor externa
		try {
			if (corExterna.isBlank() || corExterna.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a cor externa n�o est� vazia!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (corExterna.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a cor externa foi preenchida corretamente!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (corExterna.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nA cor externa n�o pode ser composta apenas por n�meros!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a cor externa foi preenchida!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando a cor do solado
		try {
			if (corSolado.isBlank() || corSolado.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a cor do solado n�o est� vazia!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (corSolado.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a cor do solado foi preenchida corretamente!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (corSolado.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nA cor do solado n�o pode ser composta apenas por n�meros!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a cor do solado foi preenchida!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando a altura do salto
		try {
			if (alturaSalto.isBlank() || alturaSalto.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a altura do salto n�o est� vazia!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (alturaSalto.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se a altura do salto foi preenchida corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (alturaSalto.trim().matches("[a-z]+") || alturaSalto.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nA altura do salto n�o pode ser composta apenas por letras!\n Detalhe a altura e a unidade de medida!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a altura do salto foi preenchida!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		return true;
	}

	/**
	 * Valida��o do T�nis. Valida os dados requeridos para o cadastro de um Produto
	 * do tipo T�nis. Retorna True caso seja v�lido e False caso seja inv�lido.
	 * 
	 * @see T�nis
	 * 
	 * @param Nome
	 * @param Quantidade
	 * @param Pre�o
	 * @param Marca
	 * @param paisOrigem
	 * @param GarantiaDoProduto
	 * @param Cor
	 * @param codBarras
	 * @param Material
	 * @param AtividadeIndicada
	 * @param TipoDePisada
	 * @param TecnologiaDoSolado
	 * @param Peso
	 * @param TipoDePalmilha
	 * @param TipoDeAmarra��o
	 * @param CorDoCadar�o
	 * @return boolean True ou False
	 */
	public boolean validaTenis(String nome, int quantidade, Double preco, String marca, String paisOrigem,
			String garantia, String cor, String codBarras, String material, String atividade, String tipoPisada,
			String tecnoSolado, Double peso, String tipoPalmilha, String tipoAmarra, String corCadarco) {

		// Validando o nome do produto
		try {
			if (nome.isBlank() || nome.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome do produto n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (nome.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o nome do produto foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (nome.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO nome do produto n�o pode ser composto apenas por n�meros!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome do produto foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando a quantidade
		try {
			if (quantidade <= 0 || quantidade >= 100000) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se a quantidade do produto � maior que 0\ne menor que 100,000!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a quantidade do produto foi preenchida!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o pre�o do produto
		try {
			if (preco <= 0 || preco >= 1000000) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o pre�o do produto � maior que 0\ne menor que 1,000,000.00!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o pre�o do produto foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando a marca do produto
		try {
			if (marca.isBlank() || marca.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a marca do produto n�o est� vazia!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (marca.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se a marca do produto foi preenchida corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a marca do produto foi preenchida!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o pais de origem
		try {
			if (paisOrigem.isBlank() || paisOrigem.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o pa�s de origem n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (paisOrigem.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o pa�s de origem foi preenchido corretamente!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (paisOrigem.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO pa�s de origem n�o pode ser composto apenas por n�meros!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o pa�s de origem foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o tempo de garantia do produto
		try {
			if (garantia.isBlank() || garantia.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o tempo de garantia n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (garantia.trim().length() < 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o tempo de garantia foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (garantia.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO tempo de garantia do produto n�o pode ser composto apenas por n�meros!\nDeve conter a medida de tempo (anos/meses...)!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (garantia.trim().matches("[a-z]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO tempo de garantia deve conter o tempo!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o tempo de garantia foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando a cor do produto
		try {
			if (cor.isBlank() || cor.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a cor do produto n�o est� vazia!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (cor.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a cor do produto foi preenchida corretamente!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (cor.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nA cor do produto n�o pode ser composta apenas por n�meros!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a cor do produto foi preenchida!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o c�digo de barras
		try {
			if (codBarras.isBlank() || codBarras.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o c�digo de barras n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (codBarras.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o c�digo de barras foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (!codBarras.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO c�digo de barras n�o pode ser composto por letras!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o c�digo de barras foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o material do produto
		try {
			if (material.isBlank() || material.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o material n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (material.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o material foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (material.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO material n�o pode ser composto apenas por n�meros!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o material foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando a atividade indicada do t�nis
		try {
			if (atividade.isBlank() || atividade.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a atividade indicada n�o est� vazia!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (atividade.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se a atividade indicada foi preenchida corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (atividade.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nA atividade indicada n�o pode ser composta apenas por n�meros!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a atividade indicada foi preenchida!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o tipo de pisada do t�nis
		try {
			if (tipoPisada.isBlank() || tipoPisada.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o tipo de pisada n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (tipoPisada.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o tipo de pisada foi preenchido corretamente!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (tipoPisada.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO tipo de pisada n�o pode ser composto apenas por n�meros!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o tipo de pisada foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando a tecnologia do t�nis
		try {
			if (tecnoSolado.isBlank() || tecnoSolado.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a tecnologia do solado n�o est� vazia!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (tecnoSolado.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se a tecnologia do solado foi preenchida corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (tecnoSolado.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nA tecnologia do solado n�o pode ser composta apenas por n�meros!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a tecnologia do solado foi preenchida!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o peso do t�nis
		try {
			if (peso <= 0 || peso >= 1500) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o peso do t�nis � maior que 0\ne menor que 1500g!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o peso do t�nis foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o tipo de palmilha do t�nis
		try {
			if (tipoPalmilha.isBlank() || tipoPalmilha.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o tipo de palmilha n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (tipoPalmilha.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o tipo de palmilha foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (tipoPalmilha.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO tipo de palmilha n�o pode ser composto apenas por n�meros!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o tipo de palmilha foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o tipo de amarra��o do t�nis
		try {
			if (tipoAmarra.isBlank() || tipoAmarra.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o tipo de amarra��o n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (tipoAmarra.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o tipo de amarra��o foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (tipoAmarra.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO tipo de amarra��o n�o pode ter apenas n�meros!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o tipo de amarra��o foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando a cor do cadar�o do t�nis
		try {
			if (corCadarco.isBlank() || corCadarco.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a cor do cadar�o n�o est� vazia!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (corCadarco.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a cor do cadar�o foi preenchida corretamente!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (corCadarco.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nA cor do cadar�o n�o pode ter apenas n�meros!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a cor do cadar�o foi preenchida!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		return true;
	}

	/**
	 * Valida��o da Bota. Valida os dados requeridos para o cadastro de um Produto
	 * do tipo Bota. Retorna True caso seja v�lido e False caso seja inv�lido.
	 * 
	 * @see Bota
	 * 
	 * @param Nome
	 * @param Quantidade
	 * @param Pre�o
	 * @param Marca
	 * @param paisOrigem
	 * @param Garantia
	 * @param Cor
	 * @param codBarras
	 * @param Material
	 * @param Modelo
	 * @param AlturaDoCano
	 * @param TipoDeSalto
	 * @param TipoDePalmilha
	 * @param MaterialDoSolado
	 * @return boolean True ou False
	 */
	public boolean validaBota(String nome, int quantidade, Double preco, String marca, String paisOrigem,
			String garantia, String cor, String codBarras, String material, String modelo, String alturaCano,
			String tipoSalto, String tipoPalmilha, String materialSolado) {

		// Validando o nome do produto
		try {
			if (nome.isBlank() || nome.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome do produto n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (nome.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o nome do produto foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (nome.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO nome do produto n�o pode ser composto apenas por n�meros!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome do produto foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando a quantidade
		try {
			if (quantidade <= 0 || quantidade >= 100000) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se a quantidade do produto � maior que 0\ne menor que 100,000!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a quantidade do produto foi preenchida!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o pre�o do produto
		try {
			if (preco <= 0 || preco >= 1000000) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o pre�o do produto � maior que 0\ne menor que 1,000,000.00!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o pre�o do produto foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando a marca do produto
		try {
			if (marca.isBlank() || marca.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a marca do produto n�o est� vazia!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (marca.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se a marca do produto foi preenchida corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a marca do produto foi preenchida!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o pais de origem
		try {
			if (paisOrigem.isBlank() || paisOrigem.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o pa�s de origem n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (paisOrigem.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o pa�s de origem foi preenchido corretamente!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (paisOrigem.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO pa�s de origem n�o pode ser composto apenas por n�meros!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o pa�s de origem foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o tempo de garantia do produto
		try {
			if (garantia.isBlank() || garantia.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o tempo de garantia n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (garantia.trim().length() < 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o tempo de garantia foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (garantia.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO tempo de garantia do produto n�o pode ser composto apenas por n�meros!\nDeve conter a medida de tempo (anos/meses...)!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (garantia.trim().matches("[a-z]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO tempo de garantia deve conter o tempo!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o tempo de garantia foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando a cor do produto
		try {
			if (cor.isBlank() || cor.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a cor do produto n�o est� vazia!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (cor.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a cor do produto foi preenchida corretamente!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (cor.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nA cor do produto n�o pode ser composta apenas por n�meros!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a cor do produto foi preenchida!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o c�digo de barras
		try {
			if (codBarras.isBlank() || codBarras.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o c�digo de barras n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (codBarras.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o c�digo de barras foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (!codBarras.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO c�digo de barras n�o pode ser composto por letras!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o c�digo de barras foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o material do produto
		try {
			if (material.isBlank() || material.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o material n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (material.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o material foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (material.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO material n�o pode ser composto apenas por n�meros!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o material foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o modelo da bota
		try {
			if (modelo.isBlank() || modelo.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o modelo n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (modelo.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o modelo foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (modelo.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO modelo n�o pode ser composto apenas por n�meros!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o modelo foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando a altura do cano da bota
		try {
			if (alturaCano.isBlank() || alturaCano.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a altura do cano da bota n�o est� vazia!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (alturaCano.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se a altura do cano da bota foi preenchida corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (alturaCano.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nA altura do cano da bota n�o pode ser composta apenas por n�meros!\n Especifique se � alto, baixo, m�dio...",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a altura do cano da bota foi preenchida!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o tipo de salto da bota
		try {
			if (tipoSalto.isBlank() || tipoSalto.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o tipo de salto da bota n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (tipoSalto.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o tipo de salto da bota foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (tipoSalto.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO tipo de salto da bota n�o pode ser composto apenas por n�meros!\n Especifique se � alto, baixo, m�dio...",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o tipo de salto da bota foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o tipo de palmilha da bota
		try {
			if (tipoPalmilha.isBlank() || tipoPalmilha.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o tipo de palmilha da bota n�o est� vazio!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (tipoPalmilha.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o tipo de palmilha da bota foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (tipoPalmilha.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO tipo de palmilha da bota n�o pode ser composto apenas por n�meros!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o tipo de palmilha da bota foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o material do solado da bota
		try {
			if (materialSolado.isBlank() || materialSolado.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o material do solado da bota n�o est� vazio!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (materialSolado.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o material do solado da bota foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (materialSolado.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO material do solado da bota n�o pode ser composto apenas por n�meros!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o material do solado da bota foi preenchido!",
					null, JOptionPane.ERROR_MESSAGE);
		}

		return true;
	}

	/**
	 * Valida��o do Sapato. Valida os dados requeridos para o cadastro de um Produto
	 * do tipo Sapato. Retorna True caso seja v�lido e False caso seja inv�lido.
	 * 
	 * @see Sapato
	 * 
	 * @param Nome
	 * @param Quantidade
	 * @param Pre�o
	 * @param Marca
	 * @param paisOrigem
	 * @param Garantia
	 * @param Cor
	 * @param codBarras
	 * @param Material
	 * @param MaterialDoSolado
	 * @param TipoDeBico
	 * @param MaterialInterno
	 * @param TipoDePalmilha
	 * @return boolean True ou False
	 */
	public boolean validaSapato(String nome, int quantidade, Double preco, String marca, String paisOrigem,
			String garantia, String cor, String codBarras, String material, String materialSolado, String tipoBico,
			String materialInterno, String tipoPalmilha) {

		// Validando o nome do produto
		try {
			if (nome.isBlank() || nome.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome do produto n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (nome.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o nome do produto foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (nome.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO nome do produto n�o pode ser composto apenas por n�meros!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome do produto foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando a quantidade
		try {
			if (quantidade <= 0 || quantidade >= 100000) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se a quantidade do produto � maior que 0\ne menor que 100,000!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a quantidade do produto foi preenchida!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o pre�o do produto
		try {
			if (preco <= 0 || preco >= 1000000) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o pre�o do produto � maior que 0\ne menor que 1,000,000.00!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o pre�o do produto foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando a marca do produto
		try {
			if (marca.isBlank() || marca.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a marca do produto n�o est� vazia!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (marca.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se a marca do produto foi preenchida corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a marca do produto foi preenchida!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o pais de origem
		try {
			if (paisOrigem.isBlank() || paisOrigem.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o pa�s de origem n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (paisOrigem.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o pa�s de origem foi preenchido corretamente!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (paisOrigem.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO pa�s de origem n�o pode ser composto apenas por n�meros!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o pa�s de origem foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o tempo de garantia do produto
		try {
			if (garantia.isBlank() || garantia.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o tempo de garantia n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (garantia.trim().length() < 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o tempo de garantia foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (garantia.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO tempo de garantia do produto n�o pode ser composto apenas por n�meros!\nDeve conter a medida de tempo (anos/meses...)!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (garantia.trim().matches("[a-z]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO tempo de garantia deve conter o tempo!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o tempo de garantia foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando a cor do produto
		try {
			if (cor.isBlank() || cor.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a cor do produto n�o est� vazia!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (cor.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a cor do produto foi preenchida corretamente!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (cor.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nA cor do produto n�o pode ser composta apenas por n�meros!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a cor do produto foi preenchida!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o c�digo de barras
		try {
			if (codBarras.isBlank() || codBarras.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o c�digo de barras n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (codBarras.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o c�digo de barras foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (!codBarras.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO c�digo de barras n�o pode ser composto por letras!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o c�digo de barras foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o material do produto
		try {
			if (material.isBlank() || material.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o material n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (material.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o material foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (material.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO material n�o pode ser composto apenas por n�meros!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o material foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o material do solado do sapato
		try {
			if (materialSolado.isBlank() || materialSolado.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o material do solado n�o est� vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (materialSolado.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o material do solado foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (materialSolado.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO material do solado n�o pode ser composto apenas por n�meros!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o material do solado foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o tipo de bico do sapato
		try {
			if (tipoBico.isBlank() || tipoBico.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o tipo de bico do sapato n�o est� vazio!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (tipoBico.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o tipo de bico do sapato foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (tipoBico.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO tipo de bico do sapato n�o pode ser composto apenas por n�meros!\nTente usar formatos como 'quadrado'...",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o tipo de bico do sapato foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o material interno do sapato
		try {
			if (materialInterno.isBlank() || materialInterno.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o material interno do sapato n�o est� vazio!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (materialInterno.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o material interno do sapato foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (materialInterno.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO material interno do sapato n�o pode ser composto apenas por n�meros!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o material interno do sapato foi preenchido!",
					null, JOptionPane.ERROR_MESSAGE);
		}

		// Validando o tipo de palmilha do sapato
		try {
			if (tipoPalmilha.isBlank() || tipoPalmilha.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o tipo de palmilha do sapato n�o est� vazio!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (tipoPalmilha.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o tipo de palmilha do sapato foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (tipoPalmilha.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO tipo de palmilha do sapato n�o pode ser composto apenas por n�meros!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o tipo de palmilha do sapato foi preenchido!",
					null, JOptionPane.ERROR_MESSAGE);
		}

		return true;
	}

}
