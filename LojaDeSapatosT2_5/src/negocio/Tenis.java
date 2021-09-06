package negocio;

public class Tenis extends Produto {
	private String atvdIndicada;
	private String tecnoSolado;
	private String tipoPisada;
	private String tipoPalmilha;
	private float peso;
	private String tipoAmarracao;
	private String corCadarco;

	public Tenis(int id, String nm, int tam, float prc, String mar, String po, String tg, char gen, 
				 String cb, String mat,String co, String atvd, String ts, String pisada, String palmilha,
				 float ps, String amarra, String cadarco) {
		idProd = id;
		nome = nm;
		tamanho = tam;
		preco = prc;
		marca = mar;
		paisOrigem = po;
		tempoGarantia = tg;
		genero = gen;
		codBarras = cb;
		cor = co;
		material = mat;
		atvdIndicada = atvd;
		tecnoSolado = ts;
		tipoPisada = pisada;
		tipoPalmilha = palmilha;
		peso = ps;
		tipoAmarracao = amarra;
		corCadarco = cadarco;
	}
	
	public Tenis() {
		
	}
	
	public void cadastrar(int idProd, String nome, int tamanho, float preco, String marca, String paisOrigem, String tempoGarantia, char genero, 
			 String codBarras, String material, String cor, String atvdIndicada, String tecnoSolado, String tipoPisada, String tipoPalmilha,
			 float peso, String tipoAmarracao, String corCadarco) {
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
		this.atvdIndicada = atvdIndicada;
		this.tecnoSolado = tecnoSolado;
		this.tipoPisada = tipoPisada;
		this.tipoPalmilha = tipoPalmilha;
		this.peso = peso;
		this.tipoAmarracao = tipoAmarracao;
		this.corCadarco = corCadarco;
	}

	public void ler() {
		String saida = "\nCaracterísticas do Tênis: ";
		saida = saida + "\nID do Produto: " + this.getIdProd() + "\nNome: " + this.getNome() + "\nTamanho: " + this.getTamanho() +
				"\nPreço: R$" + this.getPreco() + "\nMarca: " + this.getMarca() + "\nPaís de Origem: " + this.getPaisOrigem() + "\nTempo de Garantia: " +
				this.getTempoGarantia() + "\nGênero: " + this.getGenero() + "\nCódigo de Barras: " + this.getCodBarras() + "\nMaterial: " + this.getMaterial() +
				"\nCor: " + this.getCor() + "\nAtividade Indicada: " + this.getAtvdIndicada() + "\nTecnologia do Solado: " + this.getTecnoSolado() +
				"\nTipo de Pisada: " + this.getTipoPisada() + "\nTipo de Palmilha: " + this.getTipoPalmilha() + "\nPeso: " + this.getPeso() +
				"g\nTipo de Amarração: " + this.getTipoAmarracao() + "\nCor do Cadarço: " + this.getCorCadarco() + ".";
		System.out.println(saida);
	}
	
	public void editar(int idProd, String nome, int tamanho, float preco, String marca, String paisOrigem, String tempoGarantia, char genero, 
			 		   String codBarras, String material, String cor, String atvdIndicada, String tecnoSolado, String tipoPisada, String tipoPalmilha,
			 		   float peso, String tipoAmarracao, String corCadarco) {
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
		this.atvdIndicada = atvdIndicada;
		this.tecnoSolado = tecnoSolado;
		this.tipoPisada = tipoPisada;
		this.tipoPalmilha = tipoPalmilha;
		this.peso = peso;
		this.tipoAmarracao = tipoAmarracao;
		this.corCadarco = corCadarco;
	}
	
	public void deletar() {
		this.idProd = 0;
		this.nome = null;
		this.tamanho = 0;
		this.preco = 0;
		this.marca = null;
		this.paisOrigem = null;
		this.tempoGarantia = null;
		this.genero = '\0';
		this.codBarras = null;
		this.cor = null;
		this.material = null;
		this.atvdIndicada = null;
		this.tecnoSolado = null;
		this.tipoPisada = null;
		this.tipoPalmilha = null;
		this.peso = 0;
		this.tipoAmarracao = null;
		this.corCadarco = null;
	}

	@Override
	public String toString() {
		return "\nID do Produto: " + this.getIdProd() + "\nNome: " + this.getNome() + "\nTamanho: " + this.getTamanho() +
				"\nPreço: R$" + this.getPreco() + "\nMarca: " + this.getMarca() + "\nMaterial: " + this.getMaterial() +
				"\nCor: " + this.getCor() + "\nAtividade Indicada: " + this.getAtvdIndicada() + "\nPeso: " + this.getPeso() + ".";
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
