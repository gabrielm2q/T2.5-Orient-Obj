package negocio;

public class Tenis extends Produto {
	private String atvdIndicada;
	private String tecnoSolado;
	private String tipoPisada;
	private String tipoPalmilha;
	private float peso;
	private String tipoAmarracao;
	private String corCadarco;

	public Tenis(int id, String nm, int tam, float prc, String mar, String co, String atvd, String ts, float ps) {
		idProd = id;
		nome = nm;
		tamanho = tam;
		preco = prc;
		marca = mar;
		cor = co;
		atvdIndicada = atvd;
		tecnoSolado = ts;
		peso = ps;
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
		return "Tenis [atvdIndicada=" + atvdIndicada + ", tecnoSolado=" + tecnoSolado + ", peso=" + peso + ", idProd="
				+ idProd + ", nome=" + nome + ", tamanho=" + tamanho + ", preco=" + preco + ", marca=" + marca + "]";
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

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
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
