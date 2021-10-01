package control;

import java.util.List;

import model.Dados;
import model.Endereco;
import model.Estoque;
import model.Funcionario;
import model.Loja;

public class ControleLoja {

	public ControleLoja() {

	}

	public void editarLoja(String nome, String cnpj, int horaAbertura, int horaFechamento, String site,
			List<Funcionario> funcionario, Estoque estoque, Endereco endereco) {
		Loja loja = new Loja();
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
