package model;

public class Tenis extends Produto {
	private String atvdIndicada;
	private String tecnoSolado;
	private String tipoPisada;
	private String tipoPalmilha;
	private Double peso;
	private String tipoAmarracao;
	private String corCadarco;

	public Tenis(int idProd, String nome, int tamanho, Double preco, String marca, String paisOrigem,
			String tempoGarantia, char genero, String codBarras, String cor, String material, String atvdIndicada,
			String tecnoSolado, String tipoPisada, String tipoPalmilha, Double peso, String tipoAmarracao,
			String corCadarco) {
		super(idProd, nome, tamanho, preco, marca, paisOrigem, tempoGarantia, genero, codBarras, cor, material);
		setAtvdIndicada(atvdIndicada);
		setTecnoSolado(tecnoSolado);
		setTipoPisada(tipoPisada);
		setTipoPalmilha(tipoPalmilha);
		setPeso(peso);
		setTipoAmarracao(tipoAmarracao);
		setCorCadarco(corCadarco);
	}

	public Tenis() {
		super();
		setAtvdIndicada("");
		setTecnoSolado("");
		setTipoPisada("");
		setTipoPalmilha("");
		setPeso(0.0);
		setTipoAmarracao("");
		setCorCadarco("");
	}

	/*
	 * public void cadastrar(int idProd, String nome, int tamanho, Double preco,
	 * String marca, String paisOrigem, Date tempoGarantia, char genero, String
	 * codBarras, String material, String cor, String atvdIndicada, String
	 * tecnoSolado, String tipoPisada, String tipoPalmilha, Double peso, String
	 * tipoAmarracao, String corCadarco) { setIdProd(idProd); setNome(nome);
	 * setTamanho(tamanho); setPreco(preco); setMarca(marca);
	 * setPaisOrigem(paisOrigem); setTempoGarantia(tempoGarantia);
	 * setGenero(genero); setCodBarras(codBarras); setCor(cor);
	 * setMaterial(material); setAtvdIndicada(atvdIndicada);
	 * setTecnoSolado(tecnoSolado); setTipoPisada(tipoPisada);
	 * setTipoPalmilha(tipoPalmilha); setPeso(peso);
	 * setTipoAmarracao(tipoAmarracao); setCorCadarco(corCadarco); }
	 * 
	 * @Override public void imprimir() { System.out.print("Tênis");
	 * System.out.println("\nID do Produto: " + this.getIdProd() + "\nNome: " +
	 * this.getNome() + "\nTamanho: " + this.getTamanho() + "\nPreço: R$" +
	 * this.getPreco() + "\nMarca: " + this.getMarca() + "\nPaís de Origem: " +
	 * this.getPaisOrigem() + "\nTempo de Garantia: " + this.getTempoGarantia() +
	 * "\nGênero: " + this.getGenero() + "\nCódigo de Barras: " +
	 * this.getCodBarras() + "\nMaterial: " + this.getMaterial() + "\nCor: " +
	 * this.getCor() + "\nAtividade Indicada: " + this.getAtvdIndicada() +
	 * "\nTecnologia do Solado: " + this.getTecnoSolado() + "\nTipo de Pisada: " +
	 * this.getTipoPisada() + "\nTipo de Palmilha: " + this.getTipoPalmilha() +
	 * "\nPeso: " + this.getPeso() + "g\nTipo de Amarração: " +
	 * this.getTipoAmarracao() + "\nCor do Cadarço: " + this.getCorCadarco() + ".");
	 * }
	 * 
	 * public void editar(int idProd, String nome, int tamanho, Double preco, String
	 * marca, String paisOrigem, Date tempoGarantia, char genero, String codBarras,
	 * String material, String cor, String atvdIndicada, String tecnoSolado, String
	 * tipoPisada, String tipoPalmilha, Double peso, String tipoAmarracao, String
	 * corCadarco) { setIdProd(idProd); setNome(nome); setTamanho(tamanho);
	 * setPreco(preco); setMarca(marca); setPaisOrigem(paisOrigem);
	 * setTempoGarantia(tempoGarantia); setGenero(genero); setCodBarras(codBarras);
	 * setCor(cor); setMaterial(material); setAtvdIndicada(atvdIndicada);
	 * setTecnoSolado(tecnoSolado); setTipoPisada(tipoPisada);
	 * setTipoPalmilha(tipoPalmilha); setPeso(peso);
	 * setTipoAmarracao(tipoAmarracao); setCorCadarco(corCadarco); }
	 */

	@Override
	public String toString() {
		return "\nID do Produto: " + this.getIdProd() + "\nNome: " + this.getNome() + "\nTamanho: " + this.getTamanho()
				+ "\nPreço: R$" + this.getPreco() + "\nMarca: " + this.getMarca() + "\nMaterial: " + this.getMaterial()
				+ "\nCor: " + this.getCor() + "\nAtividade Indicada: " + this.getAtvdIndicada() + "\nPeso: "
				+ this.getPeso() + ".";
	}

	public String getAtvdIndicada() {
		return atvdIndicada;
	}

	public void setAtvdIndicada(String atvdIndicada) {
		this.atvdIndicada = atvdIndicada;
	}

	public String getTecnoSolado() {
		return tecnoSolado;
	}

	public void setTecnoSolado(String tecnoSolado) {
		this.tecnoSolado = tecnoSolado;
	}

	public String getTipoPisada() {
		return tipoPisada;
	}

	public void setTipoPisada(String tipoPisada) {
		this.tipoPisada = tipoPisada;
	}

	public String getTipoPalmilha() {
		return tipoPalmilha;
	}

	public void setTipoPalmilha(String tipoPalmilha) {
		this.tipoPalmilha = tipoPalmilha;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getTipoAmarracao() {
		return tipoAmarracao;
	}

	public void setTipoAmarracao(String tipoAmarracao) {
		this.tipoAmarracao = tipoAmarracao;
	}

	public String getCorCadarco() {
		return corCadarco;
	}

	public void setCorCadarco(String corCadarco) {
		this.corCadarco = corCadarco;
	}

}
