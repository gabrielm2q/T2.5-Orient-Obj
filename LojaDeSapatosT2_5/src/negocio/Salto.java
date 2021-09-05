package negocio;

public class Salto extends Produto {
	private String tipoSalto;
	private String corExterna;
	private String corSolado;
	private String alturaSalto;

	public Salto(int id, String nm, int tam, float prc, String mar, String co, String tipo, String altura) {
		idProd = id;
		nome = nm;
		tamanho = tam;
		preco = prc;
		marca = mar;
		cor = co;
		tipoSalto = tipo;
		alturaSalto = altura;
	}
	
	public void cadastrar() {
		
	}

	public void ler() {
		
	}
	
	public void editar() {
		
	}
	
	public void deletar() {
		
	}
	
	@Override
	public String toString() {
		return "Salto [tipoSalto=" + tipoSalto + ", alturaSalto=" + alturaSalto + ", idProd=" + idProd + ", nome="
				+ nome + ", tamanho=" + tamanho + ", preco=" + preco + ", marca=" + marca + ", cor=" + cor + "]";
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
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
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
	
	public String getTempoGarantia() {
		return tempoGarantia;
	}
	
	public void setTempoGarantia(String tempoGarantia) {
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

	public String getTipoSalto() {
		return tipoSalto;
	}

	public void setTipoSalto(String tipoSalto) {
		this.tipoSalto = tipoSalto;
	}

	public String getCorExterna() {
		return corExterna;
	}

	public void setCorExterna(String corExterna) {
		this.corExterna = corExterna;
	}

	public String getCorSolado() {
		return corSolado;
	}

	public void setCorSolado(String corSolado) {
		this.corSolado = corSolado;
	}

	public String getAlturaSalto() {
		return alturaSalto;
	}

	public void setAlturaSalto(String alturaSalto) {
		this.alturaSalto = alturaSalto;
	}

}
