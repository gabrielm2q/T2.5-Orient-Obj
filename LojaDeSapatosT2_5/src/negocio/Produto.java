package negocio;
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
		this.idProd = idProd;
		this.nome = nome;
		this.tamanho = tamanho;
		this.preco = preco;
		this.marca = marca;
		this.paisOrigem = paisOrigem;
		this.tempoGarantia = tempoGarantia;
		this.genero = genero;
		this.codBarras = codBarras;
		this.cor = cor;
		this.material = material;
	}
	
	protected Produto() {
		this.idProd = 0;
		this.nome = "";
		this.tamanho = 0;
		this.preco = 0.0;
		this.marca = "";
		this.paisOrigem = "";
		this.tempoGarantia = null;
		this.genero = '0';
		this.codBarras = "";
		this.cor = "";
		this.material = "";
	}

	public void cadastrar() {
		
	}

	public void ler() {
		
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
