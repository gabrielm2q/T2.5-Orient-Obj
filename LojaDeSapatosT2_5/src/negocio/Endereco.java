package negocio;

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
	
	public Endereco(int ce, String cd, String u, String nr, int num, int qd, String br, int na, String compl) {
		cep = ce;
		cidade = cd;
		uf = u;
		nomeRua = nr;
		numero = num;
		quadra = qd;
		bairro = br;
		numApart = na;
		complemento = compl;
	}
	
	public Endereco() {
		
	}

	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", cidade=" + cidade + ", uf=" + uf + ", nomeRua=" + nomeRua + ", numero="
				+ numero + ", quadra=" + quadra + ", bairro=" + bairro + ", numApart=" + numApart + ", complemento="
				+ complemento + "]";
	}

	public void cadastrar() {
		
	}
	
	public void ler() {
		
	}
	
	public void editar() {
		
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
