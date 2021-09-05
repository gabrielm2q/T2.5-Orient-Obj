package negocio;
import java.util.*;

public class Estoque {
	private int TAMANHO_VETOR = 50;
	
	private int[] quantidade = new int[TAMANHO_VETOR];
	private String[] categoria = new String[TAMANHO_VETOR];
	private Date[] dataCadastro = new Date[TAMANHO_VETOR];
	private Salto[] nomeSalto = new Salto[TAMANHO_VETOR];
	private Tenis[] nomeTenis = new Tenis[TAMANHO_VETOR];
	private Bota[] nomeBota = new Bota[TAMANHO_VETOR];
	private Sapato[] nomeSapato = new Sapato[TAMANHO_VETOR];

	public Estoque() {
		// TODO Auto-generated constructor stub
	}
	
	public void cadastrar() {
		
	}

	public void ler() {
		
	}
	
	public void editar() {
		
	}
	
	public void deletar() {
		
	}

	public int[] getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int[] quantidade) {
		this.quantidade = quantidade;
	}

	public String[] getCategoria() {
		return categoria;
	}

	public void setCategoria(String[] categoria) {
		this.categoria = categoria;
	}

	public Date[] getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date[] dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Salto[] getNomeSalto() {
		return nomeSalto;
	}

	public void setNomeSalto(Salto[] nomeSalto) {
		this.nomeSalto = nomeSalto;
	}

	public Tenis[] getNomeTenis() {
		return nomeTenis;
	}

	public void setNomeTenis(Tenis[] nomeTenis) {
		this.nomeTenis = nomeTenis;
	}

	public Bota[] getNomeBota() {
		return nomeBota;
	}

	public void setNomeBota(Bota[] nomeBota) {
		this.nomeBota = nomeBota;
	}

	public Sapato[] getNomeSapato() {
		return nomeSapato;
	}

	public void setNomeSapato(Sapato[] nomeSapato) {
		this.nomeSapato = nomeSapato;
	}

	

}
