package negocio;
import java.util.*;

public class Cliente {
	
	private Endereco endereco;
	private String nome;
	private char genero;
	private Date dataNasc;
	private String cpf;
	private String telefone;
	private String email;
	

	public Cliente(Endereco end, String n, char gen, Date dt, String pf, String fone, String mail) {
		endereco = end;
		nome = n;
		genero = gen;
		dataNasc = dt;
		cpf = pf;
		telefone = fone;
		email = mail;
	}
	
	
	@Override
	public String toString() {
		return "Cliente [endereco=" + endereco + ", nome=" + nome + ", genero=" + genero + ", dataNasc=" + dataNasc
				+ ", cpf=" + cpf + ", telefone=" + telefone + ", email=" + email + "]";
	}


	public void cadastrar() {
		
	}
	
	public void ler() {
		
	}
	
	public void editar() {
		
	}
	
	public void deletar() {
		
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
