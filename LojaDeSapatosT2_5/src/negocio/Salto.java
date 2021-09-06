package negocio;

public class Salto extends Produto {
	private String tipoSalto;
	private String corExterna;
	private String corSolado;
	private String alturaSalto;

	public Salto(int id, String nm, int tam, float prc, String mar, String po, String tg, char gen, 
		    	 String cb, String mat, String co, String salto, String ext, String solado, String altura) {
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
		tipoSalto = salto;
		corExterna = ext;
		corSolado = solado;
		alturaSalto = altura;
	}
	
	public Salto() {
		
	}
	
	public void cadastrar(int idProd, String nome, int tamanho, float preco, String marca, String paisOrigem, String tempoGarantia, char genero, 
 			  			  String codBarras, String material, String cor, String tipoSalto, String corExterna, String corSolado, String alturaSalto) {
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
		this.tipoSalto = tipoSalto;
		this.corExterna = corExterna;
		this.corSolado = corSolado;
		this.alturaSalto = alturaSalto;
	}

	public void ler() {
		String saida = "\nCaracterísticas do Salto: ";
		saida = saida + "\nID do Produto: " + this.getIdProd() + "\nNome: " + this.getNome() + "\nTamanho: " + this.getTamanho() +
				"\nPreço: R$" + this.getPreco() + "\nMarca: " + this.getMarca() + "\nPaís de Origem: " + this.getPaisOrigem() + "\nTempo de Garantia: " +
				this.getTempoGarantia() + "\nGênero: " + this.getGenero() + "\nCódigo de Barras: " + this.getCodBarras() + "\nMaterial: " + this.getMaterial() +
				"\nCor: " + this.getCor() + "\nTipo de Salto: " + this.getTipoSalto() + "\nCor Externa: " + this.getCorExterna() + "\nCor do Solado: " + 
				this.getCorSolado() + "\nAltura do Salto: " + this.getAlturaSalto() + ".";
		System.out.println(saida);
	}
	
	public void editar(int idProd, String nome, int tamanho, float preco, String marca, String paisOrigem, String tempoGarantia, char genero, 
 			  		   String codBarras, String material, String cor, String tipoSalto, String corExterna, String corSolado, String alturaSalto) {
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
		this.tipoSalto = tipoSalto;
		this.corExterna = corExterna;
		this.corSolado = corSolado;
		this.alturaSalto = alturaSalto;
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
		this.tipoSalto = null;
		this.corExterna = null;
		this.corSolado = null;
		this.alturaSalto = null;
	}
	
	@Override
	public String toString() {
		return "\nID do Produto: " + this.getIdProd() + "\nNome: " + this.getNome() + "\nTamanho: " + this.getTamanho() +
				"\nPreço: R$" + this.getPreco() + "\nMarca: " + this.getMarca() + "\nMaterial: " + this.getMaterial() +
				"\nCor: " + this.getCor() + "\nTipo de Salto: " + this.getTipoSalto() + "\nCor do Solado: " + 
				this.getCorSolado() + "\nAltura do Salto: " + this.getAlturaSalto() + ".";
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
