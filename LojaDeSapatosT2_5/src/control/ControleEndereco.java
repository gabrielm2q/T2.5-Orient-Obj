package control;

import model.Endereco;

public class ControleEndereco {
	private ControleDados dados = new ControleDados();
	private Endereco ender = new Endereco();

	public ControleEndereco(ControleDados d) {
		this.dados = d;
	}

	public void cadastrarEndereco(int opcEnder, int cep, String cidade, String uf, String nomeRua, int numero,
			int quadra, String bairro, int numApart, String complemento) {
		ender.setCep(cep);
		ender.setCidade(cidade);
		ender.setUf(uf);
		ender.setNomeRua(nomeRua);
		ender.setNumero(numero);
		ender.setQuadra(quadra);
		ender.setBairro(bairro);
		ender.setNumApart(numApart);
		ender.setComplemento(complemento);

		if (opcEnder == 1) { // Se recebermos a opção 1, cadastraremos o endereço do cliente
			dados.setEnderecoCliente(ender);
		} else if (opcEnder == 2) { // Se recebermos a opção 2, cadastraremos o endereço do funcionario
			dados.setEnderecoFuncionario(ender);
		} else if (opcEnder == 3) { // Se recebermos a opção 3, cadastraremos o endereço da loja
			dados.setEnderecoLoja(cep, cidade, uf, nomeRua, numero, quadra, bairro, numApart, complemento);
		}

	}

	public void editarEndereco(int opcEnder, ControleDados d, int index, int cep, String cidade, String uf,
			String nomeRua, int numero, int quadra, String bairro, int numApart, String complemento) {
		if (opcEnder == 1) { // Se recebermos a opção 1, editaremos o endereço do cliente
			d.getEnderecoCliente().get(index).setCep(cep);
			d.getEnderecoCliente().get(index).setCidade(cidade);
			d.getEnderecoCliente().get(index).setUf(uf);
			d.getEnderecoCliente().get(index).setNomeRua(nomeRua);
			d.getEnderecoCliente().get(index).setNumero(numero);
			d.getEnderecoCliente().get(index).setBairro(bairro);
			d.getEnderecoCliente().get(index).setNumApart(numApart);
			d.getEnderecoCliente().get(index).setComplemento(complemento);
			d.getEnderecoCliente().set(index, d.getEnderecoCliente().get(index));
		} else if (opcEnder == 2) {
			d.getEnderecoFuncionario().get(index).setCep(cep);
			d.getEnderecoFuncionario().get(index).setCidade(cidade);
			d.getEnderecoFuncionario().get(index).setUf(uf);
			d.getEnderecoFuncionario().get(index).setNomeRua(nomeRua);
			d.getEnderecoFuncionario().get(index).setNumero(numero);
			d.getEnderecoFuncionario().get(index).setBairro(bairro);
			d.getEnderecoFuncionario().get(index).setNumApart(numApart);
			d.getEnderecoFuncionario().get(index).setComplemento(complemento);
			d.getEnderecoFuncionario().set(index, d.getEnderecoFuncionario().get(index));
		} else if (opcEnder == 3) { // Se recebermos a opção 3, editaremos o endereço da loja
			d.getEnderecoLoja().setCep(cep);
			d.getEnderecoLoja().setCidade(cidade);
			d.getEnderecoLoja().setUf(uf);
			d.getEnderecoLoja().setNomeRua(nomeRua);
			d.getEnderecoLoja().setNumero(numero);
			d.getEnderecoLoja().setBairro(bairro);
			d.getEnderecoLoja().setNumApart(numApart);
			d.getEnderecoLoja().setComplemento(complemento);
		}
	}

	public ControleDados getDados() {
		return dados;
	}

	public void setDados(ControleDados dadosEndereco) {
		this.dados = dadosEndereco;
	}

	public Endereco getEnder() {
		return ender;
	}

	public void setEnder(Endereco ender) {
		this.ender = ender;
	}

}
