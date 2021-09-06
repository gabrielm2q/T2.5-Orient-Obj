package negocio;

public class Bota extends Produto {
	private String modelo;
	private String alturaCano;
	private String tipoSalto;
	private String tipoPalmilha;
	private String materialSolado;

	public Bota(int id, String nm, int tam, float prc, String mar, String po, String tg, char gen, 
			    String cb, String mat, String co, String mdl, String cano, String salto, String palmilha, String solado) {
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
		modelo = mdl;
		alturaCano = cano;
		tipoSalto = salto;
		tipoPalmilha = palmilha;
		materialSolado = solado;
	}
	
	public Bota() {
		
	}
	
	public void cadastrar(int idProd, String nome, int tamanho, float preco, String marca, String paisOrigem, String tempoGarantia, char genero, 
			   			  String codBarras, String material, String cor, String modelo, String alturaCano, String tipoSalto, String tipoPalmilha,
			   			  String materialSolado) {
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
		this.modelo = modelo;
		this.alturaCano = alturaCano;
		this.tipoSalto = tipoSalto;
		this.tipoPalmilha = tipoPalmilha;
		this.materialSolado = materialSolado;
	}

	public void ler() {
		String saida = "\nCaracterísticas da Bota: ";
		saida = saida + "\nID do Produto: " + this.getIdProd() + "\nNome: " + this.getNome() + "\nTamanho: " + this.getTamanho() +
				"\nPreço: R$" + this.getPreco() + "\nMarca: " + this.getMarca() + "\nPaís de Origem: " + this.getPaisOrigem() + "\nTempo de Garantia: " +
				this.getTempoGarantia() + "\nGênero: " + this.getGenero() + "\nCódigo de Barras: " + this.getCodBarras() + "\nMaterial: " + this.getMaterial() +
				"\nCor: " + this.getCor() + "\nModelo: " + this.getModelo() + "\nAltura do Cano: " + this.getAlturaCano() + "\nTipo de Salto: " +
				this.getTipoSalto() + "\nTipo de Palmilha: " + this.getTipoPalmilha() + "\nMaterial do Solado: " + this.getMaterialSolado() + ".";
		System.out.println(saida);
	}
	
	public void editar(int idProd, String nome, int tamanho, float preco, String marca, String paisOrigem, String tempoGarantia, char genero, 
 			  		   String codBarras, String material, String cor, String modelo, String alturaCano, String tipoSalto, String tipoPalmilha,
 			  		   String materialSolado) {
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
		this.modelo = modelo;
		this.alturaCano = alturaCano;
		this.tipoSalto = tipoSalto;
		this.tipoPalmilha = tipoPalmilha;
		this.materialSolado = materialSolado;
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
		this.modelo = null;
		this.alturaCano = null;
		this.tipoSalto = null;
		this.tipoPalmilha = null;
		this.materialSolado = null;
	}
	
	@Override
	public String toString() {
		return "\nID do Produto: " + this.getIdProd() + "\nNome: " + this.getNome() + "\nTamanho: " + this.getTamanho() +
				"\nPreço: R$" + this.getPreco() + "\nMarca: " + this.getMarca() + "\nGênero: " + this.getGenero() + "\nCor: " + this.getCor() +
				"\nModelo: " + this.getModelo() + "\nAltura do Cano: " + this.getAlturaCano() + "\nTipo de Salto: " +
				this.getTipoSalto() + ".";
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

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAlturaCano() {
		return alturaCano;
	}

	public void setAlturaCano(String alturaCano) {
		this.alturaCano = alturaCano;
	}

	public String getTipoSalto() {
		return tipoSalto;
	}

	public void setTipoSalto(String tipoSalto) {
		this.tipoSalto = tipoSalto;
	}

	public String getTipoPalmilha() {
		return tipoPalmilha;
	}

	public void setTipoPalmilha(String tipoPalmilha) {
		this.tipoPalmilha = tipoPalmilha;
	}

	public String getMaterialSolado() {
		return materialSolado;
	}

	public void setMaterialSolado(String materialSolado) {
		this.materialSolado = materialSolado;
	}

}
