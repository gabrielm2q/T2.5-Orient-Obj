package testeUnit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import control.ControleValidacao;
import model.Dados;

/**
 * Teste dos Métodos de Validação dos Atributos Inseridos pelo Usuário. Verifica
 * se, de acordo com a validade dos dados inseridos, o retorno é true quando
 * deve ser true e false quando deve ser false.
 * 
 * @see ControleValidacao
 * @author Gabriel Mariano
 */
class TesteValidacao {
	ControleValidacao v = new ControleValidacao();

	/**
	 * Teste dos Métodos de Validação dos Atributos do Salto Inseridos pelo Usuário
	 * 
	 * @see ControleValidacao
	 * @see Dados
	 * 
	 * @return void
	 */
	@Test
	void testValidaSalto() {
		assertTrue(v.validaSalto("Salto", 333, 150.2, "Random", "EUA", "6 meses", "Bege", "010100101", "Couro Vegetal",
				"Scarpin", "Preto", "Vermelho", "15 cm"));
		// Quantidade errada
		assertFalse(v.validaSalto("Salto", 0, 150.2, "Random", "EUA", "6 meses", "Bege", "010100101", "Couro Vegetal",
				"Scarpin", "Preto", "Vermelho", "15 cm"));
		// Preço errado
		assertFalse(v.validaSalto("Salto", 333, 9999999999.5, "Random", "EUA", "6 meses", "Bege", "010100101",
				"Couro Vegetal", "Scarpin", "Preto", "Vermelho", "15 cm"));
		// Código de Barras errado
		assertFalse(v.validaSalto("Salto", 333, 150.2, "Random", "EUA", "6 meses", "Bege", "0aaa1", "Couro Vegetal",
				"Scarpin", "Preto", "Vermelho", "15 cm"));
		// Tempo de Garantia errado
		assertFalse(v.validaSalto("Salto", 333, 150.2, "Random", "EUA", "6", "Bege", "010100101", "Couro Vegetal",
				"Scarpin", "Preto", "Vermelho", "15 cm"));
	}

	/**
	 * Teste dos Métodos de Validação dos Atributos do Endereço Inseridos pelo
	 * Usuário
	 * 
	 * @see ControleValidacao
	 * @see Dados
	 * 
	 * @return void
	 */
	@Test
	void testValidaEndereco() {
		assertTrue(v.validaEndereco(73850000, "Cristalina", "Rua dos Cristais", 77, 4, "Centro", 1, "Casa Amarela"));
		// CEP errado
		assertFalse(v.validaEndereco(111, "Cristalina", "Rua dos Cristais", 77, 4, "Centro", 1, "Casa Amarela"));
		// Nome da Cidade errado
		assertFalse(v.validaEndereco(10000000, "  55  ", "Rua dos Cristais", 77, 4, "Centro", 1, "Casa Amarela"));
		// Numero da Casa errado
		assertFalse(v.validaEndereco(10000000, "Cristalina", "Rua dos Cristais", 0000, 4, "Centro", 1, "Casa Amarela"));
		// Complemento errado
		assertFalse(v.validaEndereco(10000000, "Cristalina", "Rua dos Cristais", 7, 4, "Centro", 1, " "));
	}

	/**
	 * Teste dos Métodos de Validação dos Atributos do Cliente Inseridos pelo
	 * Usuário
	 * 
	 * @see ControleValidacao
	 * @see Dados
	 * 
	 * @return void
	 */
	@Test
	void testValidaCliente() {
		assertTrue(v.validaCliente("Gabriel", "095.823.168-77", "64985887777", "emailaleatorio@email.com.br"));
		// Nome errado
		assertFalse(v.validaCliente("", "095.823.168-77", "64984887777", "emailale@email.com.br"));
		// CPF errado
		assertFalse(v.validaCliente("Meu Nome", "09582316877", "64988887777", "mailaleatorio@email.com.br"));
		// Telefone errado
		assertFalse(v.validaCliente("Meu Nome", "095.823.168-77", "(64) 98888-7777", "mailale@email.com.br"));
		// Email errado
		assertFalse(v.validaCliente("Meu Nome", "095.823.168-77", "64987787667", "@aleatorio@email.edu.br"));
	}

}
