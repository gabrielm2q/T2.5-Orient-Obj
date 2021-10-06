package control;

import javax.swing.JOptionPane;

public class ControleValidacao {

	public ControleValidacao() {

	}

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

	public boolean validaTenis() {
		return true;
	}

	public boolean validaBota() {
		return true;
	}

	public boolean validaSapato() {
		return true;
	}

}
