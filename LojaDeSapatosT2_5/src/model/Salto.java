package model;

public class Salto extends Produto {
	private String tipoSalto;
	private String corExterna;
	private String corSolado;
	private String alturaSalto;

	public Salto(int idProd, String nome, int tamanho, Double preco, String marca, String paisOrigem,
			String tempoGarantia, char genero, String codBarras, String cor, String material, String tipoSalto,
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

	@Override
	public String toString() {
		return this.getNome();
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
