package testeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

import control.ControleEstoque;
import model.Dados;
import model.Sapato;

/**
 * Teste do Método de Cadastrar Produto no Estoque. Verifica se, após o cadastro
 * do produto no estoque, este foi salvo na classe Dados.
 * 
 * @see ControleEstoque
 * @author Gabriel Mariano
 */
class TesteCadastroEstoque {
	ControleEstoque c = new ControleEstoque();

	/**
	 * Teste do Método de Cadastro de Produto no Estoque.
	 * 
	 * @see ControleEstoque
	 * @see Dados
	 * 
	 * @return void
	 */
	@Test
	void testCadastrarProduto() {
		Date d = Calendar.getInstance().getTime();
		Sapato s = new Sapato();

		// Verificando se não há produtos cadastrados na classe Dados
		assertNotEquals(1, Dados.getEstoque().getProduto().size());

		// Cadastrando um produto em dados
		c.cadastrarProduto(111, "Sapato", d, s);

		// Verificando se o produto foi cadastrado na classe Dados
		assertEquals(1, Dados.getEstoque().getProduto().size());
	}

}
