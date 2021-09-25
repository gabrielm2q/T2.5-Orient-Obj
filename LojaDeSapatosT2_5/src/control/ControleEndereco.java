package control;

import model.Endereco;

public class ControleEndereco {
	private ControleDados dadosEndereco = new ControleDados();
	private Endereco ender = new Endereco();

	public ControleEndereco() {

	}

	public void cadastrarEndereco(int cep, String cidade, String uf, String nomeRua, int numero, int quadra,
			String bairro, int numApart, String complemento) {
		ender.setCep(cep);
		ender.setCidade(cidade);
		ender.setUf(uf);
		ender.setNomeRua(nomeRua);
		ender.setNumero(numero);
		ender.setQuadra(quadra);
		ender.setBairro(bairro);
		ender.setNumApart(numApart);
		ender.setComplemento(complemento);
		dadosEndereco.setEndereco(ender);
	}

	public ControleDados getDadosEndereco() {
		return dadosEndereco;
	}

	public void setDadosEndereco(ControleDados dadosEndereco) {
		this.dadosEndereco = dadosEndereco;
	}

	public Endereco getEnder() {
		return ender;
	}

	public void setEnder(Endereco ender) {
		this.ender = ender;
	}

}
