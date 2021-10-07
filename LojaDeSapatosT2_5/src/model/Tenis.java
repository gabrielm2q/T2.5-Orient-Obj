package model;

/**
 * Subclasse Tenis. Extende a classe Produto. Pode criar um Tênis com todos os
 * atributos e métodos necessários para detalhar este.
 * 
 * @see Produto
 * @author Gabriel Mariano
 */
public class Tenis extends Produto {
	private String atvdIndicada;
	private String tecnoSolado;
	private String tipoPisada;
	private String tipoPalmilha;
	private Double peso;
	private String tipoAmarracao;
	private String corCadarco;

	/**
	 * Construtor.
	 */
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

	/**
	 * Construtor vazio.
	 */
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

	/**
	 * Método toString retorna o nome do tênis.
	 */
	@Override
	public String toString() {
		return this.getNome();
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
