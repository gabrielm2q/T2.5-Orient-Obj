package model;

import java.util.Date;

public class Salto extends Produto {
	private String tipoSalto;
	private String corExterna;
	private String corSolado;
	private String alturaSalto;
	
	public Salto(int idProd, String nome, int tamanho, Double preco, String marca, String paisOrigem,
			Date tempoGarantia, char genero, String codBarras, String cor, String material, String tipoSalto,
			String corExterna, String corSolado, String alturaSalto) {
		super(idProd, nome, tamanho, preco, marca, paisOrigem, tempoGarantia, genero, codBarras, cor, material);
		setTipoSalto(tipoSalto);
		setCorExterna(corExterna);
		setCorSolado(corSolado);
		setAlturaSalto(alturaSalto);
	}
	
	public Salto() {
		super();
		setTipoSalto("");
		setCorExterna("");
		setCorSolado("");
		setAlturaSalto("");
	}
	
	public void cadastrar(int idProd, String nome, int tamanho, Double preco, String marca, String paisOrigem,
			Date tempoGarantia, char genero, String codBarras, String cor, String material, String tipoSalto,
			String corExterna, String corSolado, String alturaSalto) {
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
		setTipoSalto(tipoSalto);
		setCorExterna(corExterna);
		setCorSolado(corSolado);
		setAlturaSalto(alturaSalto);
	}
	
	@Override
	public void imprimir() {
		System.out.print("Salto");
		System.out.println("\nID do Produto: " + this.getIdProd() + "\nNome: " + this.getNome() + "\nTamanho: " + this.getTamanho() +
				"\nPreço: R$" + this.getPreco() + "\nMarca: " + this.getMarca() + "\nPaís de Origem: " + this.getPaisOrigem() + "\nTempo de Garantia: " +
				this.getTempoGarantia() + "\nGênero: " + this.getGenero() + "\nCódigo de Barras: " + this.getCodBarras() + "\nMaterial: " + this.getMaterial() +
				"\nCor: " + this.getCor() + "\nTipo de Salto: " + this.getTipoSalto() + "\nCor Externa: " + this.getCorExterna() + "\nCor do Solado: " + 
				this.getCorSolado() + "\nAltura do Salto: " + this.getAlturaSalto() + ".");
	}
	
	
	public void editar(int idProd, String nome, int tamanho, Double preco, String marca, String paisOrigem, Date tempoGarantia, char genero, 
 			  		   String codBarras, String material, String cor, String tipoSalto, String corExterna, String corSolado, String alturaSalto) {
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
		setTipoSalto(tipoSalto);
		setCorExterna(corExterna);
		setCorSolado(corSolado);
		setAlturaSalto(alturaSalto);
	}
	
	@Override
	public String toString() {
		return "\nID do Produto: " + this.getIdProd() + "\nNome: " + this.getNome() + "\nTamanho: " + this.getTamanho() +
				"\nPreço: R$" + this.getPreco() + "\nMarca: " + this.getMarca() + "\nMaterial: " + this.getMaterial() +
				"\nCor: " + this.getCor() + "\nTipo de Salto: " + this.getTipoSalto() + "\nCor do Solado: " + 
				this.getCorSolado() + "\nAltura do Salto: " + this.getAlturaSalto() + ".";
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
