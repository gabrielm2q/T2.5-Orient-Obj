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
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
		this.nomeRua = nomeRua;
		this.numero = numero;
		this.quadra = quadra;
		this.bairro = bairro;
		this.numApart = numApart;
		this.complemento = complemento;
	}

	public Endereco() {
		this.cep = 0;
		this.cidade = "";
		this.uf = "";
		this.nomeRua = "";
		this.numero = 0;
		this.quadra = 0;
		this.bairro = "";
		this.numApart = 0;
		this.complemento = "";
	}

	public void cadastrar(int cep, String cidade, String uf, String nomeRua, int numero, int quadra, String bairro,
			int numApart, String complemento) {
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
		this.nomeRua = nomeRua; 
		this.numero = numero; 
		this.quadra = quadra; 
		this.bairro = bairro; 
		this.numApart = numApart; 
		this.complemento = complemento; 
	}
	
	public void ler() {
		String saida = "\nEndereço do Cliente: ";
		saida = saida + "\nCidade: " + this.getCidade() + ".\nCEP: " + this.getCep() + ".\nUF: " + this.getUf() + "\nNome da Rua: " + this.getNomeRua() + ".\nNúmero: " + this.getNumero() + ".\nQuadra: " 
		+ this.getQuadra() + ".\nBairro: " + this.getBairro() + ".\nNúmero do Apartamento: " + this.getNumApart() 
		+ ".\nComplemento: " + this.getComplemento() + ".";
		System.out.println(saida);
	}
	
	public void editar(int cep, String cidade, String uf, String nomeRua, int numero, int quadra, String bairro,
			int numApart, String complemento) {
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
		this.nomeRua = nomeRua; 
		this.numero = numero; 
		this.quadra = quadra; 
		this.bairro = bairro; 
		this.numApart = numApart; 
		this.complemento = complemento; 
	}
	
	@Override
	public String toString() {
		return "\n  Cidade: " + this.getCidade() + ".\n  CEP: " + this.getCep() + ".\n  UF: " + this.getUf() + "\n  Nome da Rua: " + this.getNomeRua()
				+ ".\n  Número: " + this.getNumero() + ".\n  Quadra: " + this.getQuadra() + ".\n  Bairro: " + this.getBairro() +
				".\n  Número do Apartamento: " + this.getNumApart() + ".\n  Complemento: " + this.getComplemento() + ".";
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
