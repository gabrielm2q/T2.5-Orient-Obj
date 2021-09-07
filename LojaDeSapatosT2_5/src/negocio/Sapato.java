package negocio;

import java.util.Date;

public class Sapato extends Produto {
	private String materialSolado;
	private String materialInterno;
	private String tipoBico;
	private String alturaSalto;
	private String tipoPalmilha;

	
	
	public Sapato(int idProd, String nome, int tamanho, Double preco, String marca, String paisOrigem,
			Date tempoGarantia, char genero, String codBarras, String cor, String material, String materialSolado,
			String materialInterno, String tipoBico, String alturaSalto, String tipoPalmilha) {
		super(idProd, nome, tamanho, preco, marca, paisOrigem, tempoGarantia, genero, codBarras, cor, material);
		this.materialSolado = materialSolado;
		this.materialInterno = materialInterno;
		this.tipoBico = tipoBico;
		this.alturaSalto = alturaSalto;
		this.tipoPalmilha = tipoPalmilha;
	}

	public Sapato() {
		super();
		this.materialSolado = "";
		this.materialInterno = "";
		this.tipoBico = "";
		this.alturaSalto = "";
		this.tipoPalmilha = "";
	}
	
	public void cadastrar(int idProd, String nome, int tamanho, Double preco, String marca, String paisOrigem, Date tempoGarantia, char genero, 
			 String codBarras, String material, String cor, String materialSolado, String materialInterno, String tipoBico, String alturaSalto, String tipoPalmilha) {
		this.setIdProd(idProd);
		this.setNome(nome);
		this.setTamanho(tamanho);
		this.setPreco(preco);
		this.setMarca(marca);
		this.setPaisOrigem(paisOrigem);
		this.setTempoGarantia(tempoGarantia);
		this.setGenero(genero);
		this.setCodBarras(codBarras);
		this.setCor(cor);
		this.setMaterial(material);
		this.materialSolado = materialSolado;
		this.materialInterno = materialInterno;
		this.tipoBico = tipoBico;
		this.alturaSalto = alturaSalto;
		this.tipoPalmilha = tipoPalmilha;
	}
	
	@Override
	public void ler() {
		String saida = "\nCaracterísticas do Sapato: ";
		saida = saida + "\nID do Produto: " + this.getIdProd() + "\nNome: " + this.getNome() + "\nTamanho: " + this.getTamanho() +
				"\nPreço: R$" + this.getPreco() + "\nMarca: " + this.getMarca() + "\nPaís de Origem: " + this.getPaisOrigem() + "\nTempo de Garantia: " +
				this.getTempoGarantia() + "\nGênero: " + this.getGenero() + "\nCódigo de Barras: " + this.getCodBarras() + "\nMaterial: " + this.getMaterial() +
				"\nCor: " + this.getCor() + "\nMaterial do Solado: " + this.getMaterialSolado() + "\nMaterial Interno: " + this.getMaterialInterno() +
				"\nTipo de Bico: " + this.getTipoBico() + "\nAltura do Salto: " + this.getAlturaSalto() + "\nTipo de Palmilha: " + this.getTipoPalmilha() + ".";
		System.out.println(saida);
	}
	
	public void editar(int idProd, String nome, int tamanho, Double preco, String marca, String paisOrigem, Date tempoGarantia, char genero, 
			 String codBarras, String material, String cor, String materialSolado, String materialInterno, String tipoBico, String alturaSalto, String tipoPalmilha) {
		this.setIdProd(idProd);
		this.setNome(nome);
		this.setTamanho(tamanho);
		this.setPreco(preco);
		this.setMarca(marca);
		this.setPaisOrigem(paisOrigem);
		this.setTempoGarantia(tempoGarantia);
		this.setGenero(genero);
		this.setCodBarras(codBarras);
		this.setCor(cor);
		this.setMaterial(material);
		this.materialSolado = materialSolado;
		this.materialInterno = materialInterno;
		this.tipoBico = tipoBico;
		this.alturaSalto = alturaSalto;
		this.tipoPalmilha = tipoPalmilha;
	}
	
	@Override
	public String toString() {
		return "\nID do Produto: " + this.getIdProd() + "\nNome: " + this.getNome() + "\nTamanho: " + this.getTamanho() +
				"\nPreço: R$" + this.getPreco() + "\nMarca: " + this.getMarca() + "\nGênero: " + this.getGenero() + "\nMaterial: " + this.getMaterial() +
				"\nCor: " + this.getCor() + "\nAltura do Salto: " + this.getAlturaSalto() + ".";
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
