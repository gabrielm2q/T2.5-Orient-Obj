package negocio;
import java.util.*;

public class Venda {
	private int TAMANHO_VETOR = 50;
	
	private int idVenda;
	private float valorVenda;
	private float valorDesconto;
	private Date dataPedido;
	private Funcionario funcionario;
	private Salto[] saltoVendido = new Salto[TAMANHO_VETOR];
	private Tenis[] tenisVendido = new Tenis[TAMANHO_VETOR];
	private Bota[] botaVendida = new Bota[TAMANHO_VETOR];
	private Sapato[] sapatoVendido = new Sapato[TAMANHO_VETOR];
	private Pagamento[] pagamento = new Pagamento[TAMANHO_VETOR];

	public Venda(int id, float val, float desc, Date dp, Funcionario func) {
		idVenda = id;
		valorVenda = val;
		valorDesconto = desc;
		dataPedido = dp;
		funcionario = func;
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
		return "Venda [idVenda=" + idVenda + ", valorVenda=" + valorVenda + ", valorDesconto=" + valorDesconto
				+ ", dataPedido=" + dataPedido + ", funcionario=" + funcionario + "]";
	}

	public int getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}

	public float getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}

	public float getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(float valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Salto[] getSaltoVendido() {
		return saltoVendido;
	}

	public void setSaltoVendido(Salto[] saltoVendido) {
		this.saltoVendido = saltoVendido;
	}

	public Tenis[] getTenisVendido() {
		return tenisVendido;
	}

	public void setTenisVendido(Tenis[] tenisVendido) {
		this.tenisVendido = tenisVendido;
	}

	public Bota[] getBotaVendida() {
		return botaVendida;
	}

	public void setBotaVendida(Bota[] botaVendida) {
		this.botaVendida = botaVendida;
	}

	public Sapato[] getSapatoVendido() {
		return sapatoVendido;
	}

	public void setSapatoVendido(Sapato[] sapatoVendido) {
		this.sapatoVendido = sapatoVendido;
	}

	public Pagamento[] getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento[] pagamento) {
		this.pagamento = pagamento;
	}

}
