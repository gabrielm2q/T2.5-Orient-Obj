package model;

import java.util.Date;

public class Bota extends Produto {
	private String modelo;
	private String alturaCano;
	private String tipoSalto;
	private String tipoPalmilha;
	private String materialSolado;
	
	public Bota(int idProd, String nome, int tamanho, Double preco, String marca, String paisOrigem, Date tempoGarantia,
			char genero, String codBarras, String cor, String material, String modelo, String alturaCano,
			String tipoSalto, String tipoPalmilha, String materialSolado) {
		super(idProd, nome, tamanho, preco, marca, paisOrigem, tempoGarantia, genero, codBarras, cor, material);
		setModelo(modelo);
		setAlturaCano(alturaCano);
		setTipoSalto(tipoSalto);
		setTipoPalmilha(tipoPalmilha);
		setMaterialSolado(materialSolado);
	}

	public Bota() {
		super();
		this.modelo = "";
		this.alturaCano = "";
		this.tipoSalto = "";
		this.tipoPalmilha = "";
		this.materialSolado = "";
	}
	
	public void cadastrar(int idProd, String nome, int tamanho, Double preco, String marca, String paisOrigem, Date tempoGarantia, char genero, 
			   			  String codBarras, String material, String cor, String modelo, String alturaCano, String tipoSalto, String tipoPalmilha,
			   			  String materialSolado) {
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
		this.modelo = modelo;
		this.alturaCano = alturaCano;
		this.tipoSalto = tipoSalto;
		this.tipoPalmilha = tipoPalmilha;
		this.materialSolado = materialSolado;
	}
	
	@Override
	public void imprimir() {
		System.out.print("Bota");
		System.out.println("\nID do Produto: " + this.getIdProd() + "\nNome: " + this.getNome() + "\nTamanho: " + this.getTamanho() +
				"\nPreço: R$" + this.getPreco() + "\nMarca: " + this.getMarca() + "\nPaís de Origem: " + this.getPaisOrigem() + "\nTempo de Garantia: " +
				this.getTempoGarantia() + "\nGênero: " + this.getGenero() + "\nCódigo de Barras: " + this.getCodBarras() + "\nMaterial: " + this.getMaterial() +
				"\nCor: " + this.getCor() + "\nModelo: " + this.getModelo() + "\nAltura do Cano: " + this.getAlturaCano() + "\nTipo de Salto: " +
				this.getTipoSalto() + "\nTipo de Palmilha: " + this.getTipoPalmilha() + "\nMaterial do Solado: " + this.getMaterialSolado() + ".");
	}
	
	public void editar(int idProd, String nome, int tamanho, Double preco, String marca, String paisOrigem, Date tempoGarantia, char genero, 
 			  String codBarras, String material, String cor, String modelo, String alturaCano, String tipoSalto, String tipoPalmilha,
 			  String materialSolado) {
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
		this.modelo = modelo;
		this.alturaCano = alturaCano;
		this.tipoSalto = tipoSalto;
		this.tipoPalmilha = tipoPalmilha;
		this.materialSolado = materialSolado;
	}
	
	@Override
	public String toString() {
		return "\nID do Produto: " + this.getIdProd() + "\nNome: " + this.getNome() + "\nTamanho: " + this.getTamanho() +
				"\nPreço: R$" + this.getPreco() + "\nMarca: " + this.getMarca() + "\nGênero: " + this.getGenero() + "\nCor: " + this.getCor() +
				"\nModelo: " + this.getModelo() + "\nAltura do Cano: " + this.getAlturaCano() + "\nTipo de Salto: " +
				this.getTipoSalto() + ".";
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
