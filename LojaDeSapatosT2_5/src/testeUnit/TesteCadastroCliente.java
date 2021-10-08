package testeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

import control.ControleCliente;
import model.Dados;
import model.Endereco;

/**
 * Teste do Método de Cadastrar Cliente. Verifica se, após o cadastro do
 * cliente, este foi salvo na classe Dados.
 * 
 * @see ControleCliente
 * @author Gabriel Mariano
 */
class TesteCadastroCliente {
	ControleCliente c = new ControleCliente();

	/**
	 * Teste do Método de Cadastro de Cliente.
	 * 
	 * @see ControleCliente
	 * @see Dados
	 * 
	 * @return void
	 */
	@Test
	void testCadastrarCliente() {
		Date d = Calendar.getInstance().getTime();
		Endereco end = new Endereco();

		// Verificando se não há clientes cadastrados na classe Dados
		assertEquals(0, Dados.getCliente().size());

		// Cadastrando um cliente em Dados
		c.cadastrarCliente(end, "Gabriel", 'M', d, "987.654.321-90", "65965481234", "emailnaoreal@email.com");

		// Verificando se o cliente foi cadastrado na classe Dados
		assertEquals(1, Dados.getCliente().size());
	}

}
