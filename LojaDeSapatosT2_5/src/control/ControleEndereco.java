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

	public void editarEndereco(ControleDados d, int index, int cep, String cidade, String uf, String nomeRua,
			int numero, int quadra, String bairro, int numApart, String complemento) {
		d.getEndereco().get(index).setCep(cep);
		d.getEndereco().get(index).setCidade(cidade);
		d.getEndereco().get(index).setUf(uf);
		d.getEndereco().get(index).setNomeRua(nomeRua);
		d.getEndereco().get(index).setNumero(numero);
		d.getEndereco().get(index).setBairro(bairro);
		d.getEndereco().get(index).setNumApart(numApart);
		d.getEndereco().get(index).setComplemento(complemento);
		d.getEndereco().set(index, d.getEndereco().get(index));
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
