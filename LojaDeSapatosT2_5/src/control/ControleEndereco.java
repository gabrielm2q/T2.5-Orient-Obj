package control;

import model.Endereco;

public class ControleEndereco {
	private ControleDados dados = new ControleDados();
	private Endereco ender = new Endereco();

	public ControleEndereco(ControleDados d) {
		this.dados = d;
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
		dados.setEndereco(ender);
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
