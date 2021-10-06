package control;

import javax.swing.JOptionPane;

public class ControleValidacao {

	public ControleValidacao() {

	}

	public boolean validaEndereco(int cep, String cidade, String rua, int num, int quadra, String bairro, int numApart,
			String comp) {
		try { // Validando o CEP
			if (cep < 10000000 || cep > 99999999) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o CEP possui 8 dígitos numéricos!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o CEP foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		} catch (NumberFormatException exc2) {
			JOptionPane.showMessageDialog(null, "Erro!\\nVerifique se o CEP foi preenchido com apenas números!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		try { // Validando o nome da cidade
			if (cidade.isBlank() || cidade.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome da cidade não está vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (cidade.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome da cidade foi preenchido corretamente!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (cidade.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO nome da cidade não pode ser composto apenas por números!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome da cidade foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		try { // Validando o nome da rua
			if (rua.isBlank() || rua.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome da rua não está vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (rua.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome da rua foi preenchido corretamente!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (rua.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO nome da rua não pode ser composto apenas por números!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome da rua foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		try { // Validando o número
			if (num <= 0 || num >= 999999) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o número é maior que zero\ne menor que 999.999!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o número foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		} catch (NumberFormatException exc2) {
			JOptionPane.showMessageDialog(null, "Erro!\\nVerifique se o número foi preenchido com apenas números!",
					null, JOptionPane.ERROR_MESSAGE);
		}

		try { // Validando o número da quadra
			if (quadra <= 0 || quadra >= 999999) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o número da quadra é maior que zero\ne menor que 999.999!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o número da quadra foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		} catch (NumberFormatException exc2) {
			JOptionPane.showMessageDialog(null,
					"Erro!\\nVerifique se o número da quadra foi preenchido com apenas números!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		try { // Validando o nome do bairro
			if (bairro.isBlank() || bairro.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome do bairro não está vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (bairro.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome do bairro foi preenchido corretamente!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (bairro.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO nome do bairro não pode ser composto apenas por números!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome do bairro foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		try { // Validando o número do apartamento
			if (numApart <= 0 || numApart >= 901) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o número do apartamento é maior que zero\ne menor que 901!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o número do apartamento foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		} catch (NumberFormatException exc2) {
			JOptionPane.showMessageDialog(null,
					"Erro!\\nVerifique se o número do apartamento foi preenchido com apenas números!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		try { // Validando o complemento
			if (comp.isBlank() || comp.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o complemento não está vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (comp.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o complemento foi preenchido corretamente!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (comp.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO complemento não pode ser composto apenas por números!",
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
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome da loja não está vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (nome.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome da loja foi preenchido corretamente!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (nome.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO nome da loja não pode ser composto apenas por números!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome da loja foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		try { // Validando o cnpj
			if (cnpj.isBlank() || cnpj.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o CNPJ não está vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (cnpj.trim().length() != 18) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o CNPJ foi preenchido corretamente!\nO padrão é: XX.XXX.XXX/0001-XX ou XX.XXX.XXX/0002-XX",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (cnpj.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO CNPJ não pode ser composto apenas por números!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}

			// Verificando se o CNPJ seguiu o padrao numerico requerido
			if (!cnpj.substring(0, 2).matches("[0-9]+") || !cnpj.substring(3, 6).matches("[0-9]+")
					|| !cnpj.substring(7, 10).matches("[0-9]+") || !cnpj.substring(11, 14).equals("000")
					|| !cnpj.substring(14, 15).matches("[1-2]") || !cnpj.substring(16, 18).matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se os valores do CNPJ estão certos!\nO padrão é: XX.XXX.XXX/0001-XX ou XX.XXX.XXX/0002-XX",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}

			// Verificando se o CNPJ seguiu o padrao de pontuacao requerido
			if (!cnpj.substring(2, 3).equals(".") || !cnpj.substring(6, 7).equals(".")
					|| !cnpj.substring(10, 11).equals("/") || !cnpj.substring(15, 16).equals("-")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique a pontuação do CNPJ!\nO padrão é: XX.XXX.XXX/0001-XX ou XX.XXX.XXX/0002-XX",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}

			// Verificando se o CNPJ nao e composto apenas de zeros
			if (cnpj.substring(0, 2).equals("00") || cnpj.substring(3, 6).equals("000")
					|| cnpj.substring(7, 10).equals("000") || cnpj.substring(16, 18).equals("00")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO CNPJ não pode ser composto apenas por zeros!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o CNPJ foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		try { // Validando o site da loja
			if (site.isBlank() || site.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o site da loja não está vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (site.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o site da loja foi preenchido corretamente!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (site.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO site da loja não pode ser composto apenas por números!",
						null, JOptionPane.ERROR_MESSAGE);

				return false;
			} else if (site.trim().contains(" ")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO site da loja não pode ter espaços no meio!", null,
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
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome do cliente não está vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (nome.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o nome do cliente foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (nome.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO nome do cliente não pode ser composto apenas por números!", null,
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
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o CPF não está vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (cpf.trim().length() != 14) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o CPF foi preenchido corretamente!\nO padrão é: XXX.XXX.XXX-XX", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (cpf.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO CPF não pode ser composto apenas por números!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}

			// Verificando se o CPF seguiu o padrao numerico requerido
			if (!cpf.substring(0, 3).matches("[0-9]+") || !cpf.substring(4, 7).matches("[0-9]+")
					|| !cpf.substring(8, 11).matches("[0-9]+") || !cpf.substring(12, 14).matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se os valores do CPF estão certos!\nO padrão é: XXX.XXX.XXX-XX", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}

			// Verificando se o CPF seguiu o padrao de pontuacao requerido
			if (!cpf.substring(3, 4).equals(".") || !cpf.substring(7, 8).equals(".")
					|| !cpf.substring(11, 12).equals("-")) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique a pontuação do CPF!\nO padrão é: XXX.XXX.XXX-XX",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}

			/*
			 * Verificando se o CPF nao e composto apenas de numeros repetidos ou contém
			 * algum espaço com 000
			 */
			if (cpf.contains("000") || cpf.equals("111.111.111-11") || cpf.equals("222.222.222-22")
					|| cpf.equals("333.333.333-33") || cpf.equals("444.444.444-44") || cpf.equals("555.555.555-55")
					|| cpf.equals("666.666.666-66") || cpf.equals("777.777.777-77") || cpf.equals("888.888.888-88")
					|| cpf.equals("999.999.999-99") || cpf.substring(12, 14).equals("00")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se os valores do CPF não são repetidos!\nO padrão de CPF é: XXX.XXX.XXX-XX",
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
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o telefone não está vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (fone.trim().length() != 11) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o telefone foi preenchido corretamente!\nO formato é: DDD + 9 + XXXX + XXXX\nUse apenas números! Sem espaços!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (!fone.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO telefone deve possuir apenas números! Sem espaços!\nO formato é: DDD + 9 + XXXX + XXXX",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (fone.equals("00000000000")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO telefone não pode conter apenas zeros! Sem espaços!\nO formato é: DDD + 9 + XXXX + XXXX",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (fone.substring(0, 2).equals("00") || !fone.substring(2, 3).equals("9")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO DDD deve ser válido!\nUse o dígito 9 antes do telefone!\nO formato é: DDD + 9 + XXXX + XXXX",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}

		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o telefone foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		try { // Validando o email
			if (email.isBlank() || email.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o email não está vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (email.trim().length() < 7) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o email foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (email.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO email não pode ser composto apenas por números!", null,
						JOptionPane.ERROR_MESSAGE);

				return false;
			} else if (email.trim().contains(" ")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO email não pode ter espaços no meio!", null,
						JOptionPane.ERROR_MESSAGE);

				return false;
			} else if (!email.trim().contains(".com") && !email.trim().contains(".edu")
					&& !email.trim().contains(".unb") && !email.trim().contains(".br") && !email.trim().contains(".gov")
					&& !email.trim().contains(".us") && !email.trim().contains(".fi")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO email deve ser válido!", null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (!email.trim().contains("@")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO email deve conter @!", null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (email.trim().substring(0, 1).equals("@")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO primeiro dígito do email não pode ser @!", null,
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
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome do funcionário não está vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (nome.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o nome do funcionário foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (nome.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO nome do funcionário não pode ser composto apenas por números!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome do funcionário foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o CPF do funcionário
		try {
			if (cpf.isBlank() || cpf.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o CPF não está vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (cpf.trim().length() != 14) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o CPF foi preenchido corretamente!\nO padrão é: XXX.XXX.XXX-XX", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (cpf.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO CPF não pode ser composto apenas por números!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}

			// Verificando se o CPF seguiu o padrao numerico requerido
			if (!cpf.substring(0, 3).matches("[0-9]+") || !cpf.substring(4, 7).matches("[0-9]+")
					|| !cpf.substring(8, 11).matches("[0-9]+") || !cpf.substring(12, 14).matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se os valores do CPF estão certos!\nO padrão é: XXX.XXX.XXX-XX", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}

			// Verificando se o CPF seguiu o padrao de pontuacao requerido
			if (!cpf.substring(3, 4).equals(".") || !cpf.substring(7, 8).equals(".")
					|| !cpf.substring(11, 12).equals("-")) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique a pontuação do CPF!\nO padrão é: XXX.XXX.XXX-XX",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}

			/*
			 * Verificando se o CPF nao e composto apenas de numeros repetidos ou contém
			 * algum espaço com 000
			 */
			if (cpf.contains("000") || cpf.equals("111.111.111-11") || cpf.equals("222.222.222-22")
					|| cpf.equals("333.333.333-33") || cpf.equals("444.444.444-44") || cpf.equals("555.555.555-55")
					|| cpf.equals("666.666.666-66") || cpf.equals("777.777.777-77") || cpf.equals("888.888.888-88")
					|| cpf.equals("999.999.999-99") || cpf.substring(12, 14).equals("00")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se os valores do CPF não são repetidos!\nO padrão de CPF é: XXX.XXX.XXX-XX",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}

		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o CPF foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o telefone do funcionário
		try {
			if (fone.isBlank() || fone.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o telefone não está vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (fone.trim().trim().length() != 11) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o telefone foi preenchido corretamente!\nO formato é: DDD + 9 + XXXX + XXXX\nUse apenas números! Sem espaços!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (!fone.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO telefone deve possuir apenas números! Sem espaços!\nO formato é: DDD + 9 + XXXX + XXXX",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (fone.equals("00000000000")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO telefone não pode conter apenas zeros! Sem espaços!\nO formato é: DDD + 9 + XXXX + XXXX",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (fone.substring(0, 2).equals("00") || !fone.substring(2, 3).equals("9")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO DDD deve ser válido!\nUse o dígito 9 antes do telefone!\nO formato é: DDD + 9 + XXXX + XXXX",
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
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome do salto não está vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (nome.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o nome do salto foi preenchido corretamente!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (nome.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO nome do salto não pode ser composto apenas por números!",
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
						"Erro!\nVerifique se a quantidade do produto é maior que 0\ne menor que 100,000!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a quantidade do produto foi preenchida!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o preço dos saltos
		try {
			if (preco <= 0 || preco >= 1000000) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o preço do produto é maior que 0\ne menor que 1,000,000.00!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o preço do produto foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando a marca do salto
		try {
			if (marca.isBlank() || marca.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a marca do salto não está vazia!", null,
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
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o país de origem do salto não está vazio!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (paisOrigem.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o país de origem do salto foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (paisOrigem.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO país de origem do salto não pode ser composto apenas por números!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o país de origem do salto foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o tempo de garantia do salto
		try {
			if (garantia.isBlank() || garantia.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o tempo de garantia do salto não está vazio!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (garantia.trim().length() < 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o tempo de garantia foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (garantia.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nO tempo de garantia do salto não pode ser composto apenas por números!\nDeve conter a medida de tempo (anos/meses...)!",
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
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a cor do salto não está vazia!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (cor.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a cor do salto foi preenchida corretamente!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (cor.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nA cor do salto não pode ser composta apenas por números!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a cor do salto foi preenchida!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o código de barras
		try {
			if (codBarras.isBlank() || codBarras.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o código de barras não está vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (codBarras.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se o código de barras foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (!codBarras.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO código de barras não pode ser composto por letras!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NullPointerException exc1) {
			JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o código de barras foi preenchido!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// Validando o material do produto
		try {
			if (material.isBlank() || material.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o material não está vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (material.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o material foi preenchido corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (material.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO material não pode ser composto apenas por números!", null,
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
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o tipo de salto não está vazio!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (tipoSalto.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se o tipo de salto foi preenchido corretamente!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (tipoSalto.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nO tipo de salto não pode ser composto apenas por números!",
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
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a cor externa não está vazia!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (corExterna.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a cor externa foi preenchida corretamente!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (corExterna.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nA cor externa não pode ser composta apenas por números!",
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
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a cor do solado não está vazia!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (corSolado.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a cor do solado foi preenchida corretamente!",
						null, JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (corSolado.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Erro!\nA cor do solado não pode ser composta apenas por números!",
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
				JOptionPane.showMessageDialog(null, "Erro!\nVerifique se a altura do salto não está vazia!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (alturaSalto.trim().length() <= 1) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nVerifique se a altura do salto foi preenchida corretamente!", null,
						JOptionPane.ERROR_MESSAGE);
				return false;
			} else if (alturaSalto.trim().matches("[a-z]+") || alturaSalto.trim().matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null,
						"Erro!\nA altura do salto não pode ser composta apenas por letras!\n Detalhe a altura e a unidade de medida!",
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
