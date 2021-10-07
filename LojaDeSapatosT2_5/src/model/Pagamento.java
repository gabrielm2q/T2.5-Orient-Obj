package model;

import java.util.Date;

/**
 * Pagamento. Pode criar uma Pagamento com todos os atributos e métodos
 * necessários para detalhar este. Usado nas vendas!
 * 
 * @see Venda
 * @author Gabriel Mariano
 */
public class Pagamento {
	private Double valorPago;
	private String formaPag;
	private Date dataPag;
	private int numParcelas;

	/**
	 * Construtor.
	 */
	public Pagamento(Double valorPago, String formaPag, Date dataPag, int numParcelas) {
		setValorPago(valorPago);
		setFormaPag(formaPag);
		setDataPag(dataPag);
		setNumParcelas(numParcelas);
	}

	/**
	 * Construtor vazio.
	 */
	public Pagamento() {
		setValorPago(0.0);
		setFormaPag("");
		setDataPag(null);
		setNumParcelas(0);
	}

	/**
	 * Método toString(), retorna atributos relevantes do Pagamento.
	 */
	@Override
	public String toString() {
		return "\nValor Pago: " + this.getValorPago() + ".\nForma de Pagamento: " + this.getFormaPag()
				+ ".\nData de Pagamento: " + this.getDataPag() + ".\nNúmero de Parcelas: " + this.getNumParcelas()
				+ ".";
	}

	public Double getValorPago() {
		return valorPago;
	}

	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}

	public String getFormaPag() {
		return formaPag;
	}

	public void setFormaPag(String formaPag) {
		this.formaPag = formaPag;
	}

	public Date getDataPag() {
		return dataPag;
	}

	public void setDataPag(Date dataPag) {
		this.dataPag = dataPag;
	}

	public int getNumParcelas() {
		return numParcelas;
	}

	public void setNumParcelas(int numParcelas) {
		this.numParcelas = numParcelas;
	}

}
