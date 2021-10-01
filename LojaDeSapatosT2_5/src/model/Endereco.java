package model;

public class Endereco {
	private int cep;
	private String cidade;
	private String uf;
	private String nomeRua;
	private int numero;
	private int quadra;
	private String bairro;
	private int numApart;
	private String complemento;

	public Endereco(int cep, String cidade, String uf, String nomeRua, int numero, int quadra, String bairro,
			int numApart, String complemento) {
		setCep(cep);
		setCidade(cidade);
		setUf(uf);
		setNomeRua(nomeRua);
		setNumero(numero);
		setQuadra(quadra);
		setBairro(bairro);
		setNumApart(numApart);
		setComplemento(complemento);
	}

	// Sobrecarga
	public Endereco(int cep, String cidade, String uf, String nomeRua, int numero, int quadra, String bairro,
			String complemento) {
		setCep(cep);
		setCidade(cidade);
		setUf(uf);
		setNomeRua(nomeRua);
		setNumero(numero);
		setQuadra(quadra);
		setBairro(bairro);
		setComplemento(complemento);
	}

	public Endereco() {
		setCep(0);
		setCidade("");
		setUf("");
		setNomeRua("");
		setNumero(0);
		setQuadra(0);
		setBairro("");
		setNumApart(0);
		setComplemento("");
	}

	@Override
	public String toString() {
		return "\n  Cidade: " + getCidade() + ".\n  CEP: " + getCep() + ".\n  UF: " + getUf() + "\n  Nome da Rua: "
				+ getNomeRua() + ".\n  Número: " + getNumero() + ".\n  Quadra: " + getQuadra() + ".\n  Bairro: "
				+ getBairro() + ".\n  Número do Apartamento: " + getNumApart() + ".\n  Complemento: " + getComplemento()
				+ ".";
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getNomeRua() {
		return nomeRua;
	}

	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getQuadra() {
		return quadra;
	}

	public void setQuadra(int quadra) {
		this.quadra = quadra;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getNumApart() {
		return numApart;
	}

	public void setNumApart(int numApart) {
		this.numApart = numApart;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}
