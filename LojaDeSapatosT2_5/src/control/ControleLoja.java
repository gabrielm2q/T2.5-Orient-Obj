package control;

import java.util.List;

import model.Dados;
import model.Endereco;
import model.Estoque;
import model.Funcionario;
import model.Loja;

/**
 * Controle dos M�todos de Loja. Realiza a Edi��o dos dados da Loja.
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
	 * M�todo de Edi��o dos dados da Loja. Edita os dados da Loja na classe Dados.
	 * 
	 * @see Loja
	 * 
	 * @param Nome           Nome da Loja
	 * @param CNPJ           CNPJ da Loja
	 * @param horaAbertura   Hora de Abertura da Loja
	 * @param horaFechamento Hora de Fechamento da Loja
	 * @param Site           Link do Site da Loja
	 * @param Funcion�rio    Lista de Funcion�rios da Loja
	 * @param Estoque        Estoque da Loja com Produtos
	 * @param Endere�o       Endere�o da Loja
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
