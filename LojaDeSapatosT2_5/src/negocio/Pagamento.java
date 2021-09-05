package negocio;
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
	
	public void cadastrar() {
		
	}

	public void ler() {
		
	}
	
	public void editar() {
		
	}
	
	public void deletar() {
		
	}

	@Override
	public String toString() {
		return "Pagamento [valorPago=" + valorPago + ", formaPag=" + formaPag + ", dataPag=" + dataPag
				+ ", numParcelas=" + numParcelas + "]";
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
