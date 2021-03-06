package model;

/**
 * Subclasse Sapato. Extende a classe Produto. Pode criar um Sapato com todos os
 * atributos e m?todos necess?rios para detalhar este.
 * 
 * @see Produto
 * @author Gabriel Mariano
 */
public class Sapato extends Produto {
	private String materialSolado;
	private String materialInterno;
	private String tipoBico;
	private String alturaSalto;
	private String tipoPalmilha;

	/**
	 * Construtor.
	 */
	public Sapato(int idProd, String nome, int tamanho, Double preco, String marca, String paisOrigem,
			String tempoGarantia, char genero, String codBarras, String cor, String material, String materialSolado,
			String materialInterno, String tipoBico, String alturaSalto, String tipoPalmilha) {
		super(idProd, nome, tamanho, preco, marca, paisOrigem, tempoGarantia, genero, codBarras, cor, material);
		setMaterialSolado(materialSolado);
		setMaterialInterno(materialInterno);
		setTipoBico(tipoBico);
		setAlturaSalto(alturaSalto);
		setTipoPalmilha(tipoPalmilha);
	}

	/**
	 * Construtor vazio.
	 */
	public Sapato() {
		super();
		setMaterialSolado("");
		setMaterialInterno("");
		setTipoBico("");
		setAlturaSalto("");
		setTipoPalmilha("");
	}

	/**
	 * M?todo toString retorna o nome do sapato.
	 */
	@Override
	public String toString() {
		return this.getNome();
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
