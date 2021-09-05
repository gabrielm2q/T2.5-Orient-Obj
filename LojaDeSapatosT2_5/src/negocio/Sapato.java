package negocio;

public class Sapato extends Produto {
	private String materialSolado;
	private String materialInterno;
	private String tipoBico;
	private String alturaSalto;
	private String tipoPalmilha;

	public Sapato(int id, String nm, int tam, float prc, String mar, String co, String ms, String tb) {
		idProd = id;
		nome = nm;
		tamanho = tam;
		preco = prc;
		marca = mar;
		cor = co;
		materialSolado = ms;
		tipoBico = tb;
		
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
		return "Sapato [materialSolado=" + materialSolado + ", tipoBico=" + tipoBico + ", idProd=" + idProd + ", nome="
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

	public String getMaterialSolado() {
		return materialSolado;
	}

	public void setMaterialSolado(String materialSolado) {
		this.materialSolado = materialSolado;
	}

	public String getMaterialInterno() {
		return materialInterno;
	}

	public void setMaterialInterno(String materialInterno) {
		this.materialInterno = materialInterno;
	}

	public String getTipoBico() {
		return tipoBico;
	}

	public void setTipoBico(String tipoBico) {
		this.tipoBico = tipoBico;
	}

	public String getAlturaSalto() {
		return alturaSalto;
	}

	public void setAlturaSalto(String alturaSalto) {
		this.alturaSalto = alturaSalto;
	}

	public String getTipoPalmilha() {
		return tipoPalmilha;
	}

	public void setTipoPalmilha(String tipoPalmilha) {
		this.tipoPalmilha = tipoPalmilha;
	}
	
}
