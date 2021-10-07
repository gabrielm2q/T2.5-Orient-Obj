package control;

import java.util.List;

import model.Dados;
import model.Endereco;
import model.Estoque;
import model.Funcionario;
import model.Loja;

/**
 * Controle dos Métodos de Loja. Realiza a Edição dos dados da Loja.
 * 
 * @see Loja
 * @author Gabriel Mariano
 */
public class ControleLoja {

	/**
	 * Construtor.
	 */
	public ControleLoja() {

	}

	/**
	 * Método de Edição dos dados da Loja. Edita os dados da Loja na classe Dados.
	 * 
	 * @see Loja
	 * 
	 * @param Nome           Nome da Loja
	 * @param CNPJ           CNPJ da Loja
	 * @param horaAbertura   Hora de Abertura da Loja
	 * @param horaFechamento Hora de Fechamento da Loja
	 * @param Site           Link do Site da Loja
	 * @param Funcionário    Lista de Funcionários da Loja
	 * @param Estoque        Estoque da Loja com Produtos
	 * @param Endereço       Endereço da Loja
	 * @return void
	 */
	public void editarLoja(String nome, String cnpj, int horaAbertura, int horaFechamento, String site,
			List<Funcionario> funcionario, Estoque estoque, Endereco endereco) {
		Dados.getLoja().setNome(nome);
		Dados.getLoja().setCnpj(cnpj);
		Dados.getLoja().setSite(site);
		Dados.getLoja().setHoraAbertura(horaAbertura);
		Dados.getLoja().setHoraFechamento(horaFechamento);
		Dados.getLoja().setFuncionario(funcionario);
		Dados.getLoja().setEstoque(estoque);
		Dados.getLoja().setEndereco(endereco);
	}

}
