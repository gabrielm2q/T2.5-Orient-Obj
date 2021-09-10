package model;
import java.util.Date;

public abstract class Produto {
	private int idProd;
	private String nome;
	private int tamanho;
	private Double preco;
	private String marca;
	private String paisOrigem;
	private Date tempoGarantia;
	private char genero;
	private String codBarras;
	private String cor;
	private String material;
	
	protected Produto(int idProd, String nome, int tamanho, Double preco, String marca, String paisOrigem,
			Date tempoGarantia, char genero, String codBarras, String cor, String material) {
		setIdProd(idProd);
		setNome(nome);
		setTamanho(tamanho);
		setPreco(preco);
		setMarca(marca);
		setPaisOrigem(paisOrigem);
		setTempoGarantia(tempoGarantia);
		setGenero(genero);
		setCodBarras(codBarras);
		setCor(cor);
		setMaterial(material);
	}
	
	protected Produto() {
		setIdProd(0);
		setNome("");
		setTamanho(0);
		setPreco(0.0);
		setMarca("");
		setPaisOrigem("");
		setTempoGarantia(null);
		setGenero('0');
		setCodBarras("");
		setCor("");
		setMaterial("");
	}

	public void cadastrar() {
		
	}

	public void imprimir() {
		
	}
	
	public void editar() {
		
	}
	
	public int getIdProd() {
		return idProd;
	}
	
	public void setIdProd(int idProd) {
		this.idProd = idProd;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getPaisOrigem() {
		return paisOrigem;
	}
	
	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	
	public Date getTempoGarantia() {
		return tempoGarantia;
	}
	
	public void setTempoGarantia(Date tempoGarantia) {
		this.tempoGarantia = tempoGarantia;
	}
	
	public char getGenero() {
		return genero;
	}
	
	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	public String getCodBarras() {
		return codBarras;
	}
	
	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
}
