package negocio;

public class Sapato extends Produto {
	private String materialSolado;
	private String materialInterno;
	private String tipoBico;
	private String alturaSalto;
	private String tipoPalmilha;

	public Sapato(int id, String nm, int tam, float prc, String mar, String po, String tg, char gen, 
			 String cb, String mat, String co, String solado, String interno, String bico, String salto, String palmilha) {
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
		materialSolado = solado;
		materialInterno = interno;
		tipoBico = bico;
		alturaSalto = salto;
		tipoPalmilha = palmilha;
	}
	
	public Sapato() {
		
	}
	
	public void cadastrar(int idProd, String nome, int tamanho, float preco, String marca, String paisOrigem, String tempoGarantia, char genero, 
			 String codBarras, String material, String cor, String materialSolado, String materialInterno, String tipoBico, String alturaSalto, String tipoPalmilha) {
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
		this.materialSolado = materialSolado;
		this.materialInterno = materialInterno;
		this.tipoBico = tipoBico;
		this.alturaSalto = alturaSalto;
		this.tipoPalmilha = tipoPalmilha;
	}

	public void ler() {
		String saida = "\nCaracterísticas do Sapato: ";
		saida = saida + "\nID do Produto: " + this.getIdProd() + "\nNome: " + this.getNome() + "\nTamanho: " + this.getTamanho() +
				"\nPreço: R$" + this.getPreco() + "\nMarca: " + this.getMarca() + "\nPaís de Origem: " + this.getPaisOrigem() + "\nTempo de Garantia: " +
				this.getTempoGarantia() + "\nGênero: " + this.getGenero() + "\nCódigo de Barras: " + this.getCodBarras() + "\nMaterial: " + this.getMaterial() +
				"\nCor: " + this.getCor() + "\nMaterial do Solado: " + this.getMaterialSolado() + "\nMaterial Interno: " + this.getMaterialInterno() +
				"\nTipo de Bico: " + this.getTipoBico() + "\nAltura do Salto: " + this.getAlturaSalto() + "\nTipo de Palmilha: " + this.getTipoPalmilha() + ".";
		System.out.println(saida);
	}
	
	public void editar(int idProd, String nome, int tamanho, float preco, String marca, String paisOrigem, String tempoGarantia, char genero, 
	 				   String codBarras, String material, String cor, String materialSolado, String materialInterno, String tipoBico, 
	 				   String alturaSalto, String tipoPalmilha) {
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
		this.materialSolado = materialSolado;
		this.materialInterno = materialInterno;
		this.tipoBico = tipoBico;
		this.alturaSalto = alturaSalto;
		this.tipoPalmilha = tipoPalmilha;
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
		this.materialSolado = null;
		this.materialInterno = null;
		this.tipoBico = null;
		this.alturaSalto = null;
		this.tipoPalmilha = null;
	}
	
	@Override
	public String toString() {
		return "\nID do Produto: " + this.getIdProd() + "\nNome: " + this.getNome() + "\nTamanho: " + this.getTamanho() +
				"\nPreço: R$" + this.getPreco() + "\nMarca: " + this.getMarca() + "\nGênero: " + this.getGenero() + "\nMaterial: " + this.getMaterial() +
				"\nCor: " + this.getCor() + "\nAltura do Salto: " + this.getAlturaSalto() + ".";
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
