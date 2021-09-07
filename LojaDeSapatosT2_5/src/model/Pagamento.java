package model;
import java.util.*;

public class Pagamento {
	private float valorPago;
	private String formaPag;
	private Date dataPag;
	private int numParcelas;

	public Pagamento(float vp, String fp, Date dp, int np) {
		valorPago = vp;
		formaPag = fp;
		dataPag = dp;
		numParcelas = np;
	}
	
	public Pagamento() {
		
	}
	
	public void cadastrar(float valorPago, String formaPag, Date dataPag, int numParcelas) {
		this.valorPago = valorPago;
		this.formaPag = formaPag;
		this.dataPag = dataPag;
		this.numParcelas = numParcelas;
	}

	public void ler() {
		String saida = "\nDados do Pagamento: ";
		saida = saida + "\nValor Pago: R$" + this.getValorPago() + ".\nForma de Pagamento: " + this.getFormaPag()
		+ ".\nData de Pagamento: " + this.getDataPag() + ".\nNúmero de Parcelas: " + this.getNumParcelas() + ".";
		System.out.println(saida);
	}
	
	public void editar(float valorPago, String formaPag, Date dataPag, int numParcelas) {
		this.valorPago = valorPago;
		this.formaPag = formaPag;
		this.dataPag = dataPag;
		this.numParcelas = numParcelas;
	}
	
	public void deletar() {
		this.valorPago = 0;
		this.formaPag = null;
		this.dataPag = null;
		this.numParcelas = 0;
	}

	@Override
	public String toString() {
		return "\nValor Pago: " + this.getValorPago() + ".\nForma de Pagamento: " + this.getFormaPag()
		+ ".\nData de Pagamento: " + this.getDataPag() + ".\nNúmero de Parcelas: " + this.getNumParcelas() + ".";
	}

	public float getValorPago() {
		return valorPago;
	}

	public void setValorPago(float valorPago) {
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
