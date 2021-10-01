package model;

public class Bota extends Produto {
	private String modelo;
	private String alturaCano;
	private String tipoSalto;
	private String tipoPalmilha;
	private String materialSolado;

	public Bota(int idProd, String nome, int tamanho, Double preco, String marca, String paisOrigem,
			String tempoGarantia, char genero, String codBarras, String cor, String material, String modelo,
			String alturaCano, String tipoSalto, String tipoPalmilha, String materialSolado) {
		super(idProd, nome, tamanho, preco, marca, paisOrigem, tempoGarantia, genero, codBarras, cor, material);
		setModelo(modelo);
		setAlturaCano(alturaCano);
		setTipoSalto(tipoSalto);
		setTipoPalmilha(tipoPalmilha);
		setMaterialSolado(materialSolado);
	}

	public Bota() {
		super();
		setModelo("");
		setAlturaCano("");
		setTipoSalto("");
		setTipoPalmilha("");
		setMaterialSolado("");
	}

	@Override
	public String toString() {
		return this.getNome();
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
