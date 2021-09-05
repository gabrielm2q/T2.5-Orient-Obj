package negocio;

public class Loja {
	private int TAMANHO_VETOR = 50;
	
	private String nome;
	private int cnpj;
	private int horaAbertura;
	private int horaFechamento;
	private String site;
	private Endereco endereco;
	private Estoque estoque;
	private Funcionario[] nomeFuncionario = new Funcionario[TAMANHO_VETOR];

	public Loja(String nm, int pj, int ha, int hf, String st, Endereco end) {
		nome = nm;
		cnpj = pj;
		horaAbertura = ha;
		horaFechamento = hf;
		site = st;
		endereco = end;
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
		return "Loja [nome=" + nome + ", cnpj=" + cnpj + ", horaAbertura=" + horaAbertura + ", horaFechamento="
				+ horaFechamento + ", site=" + site + ", endereco=" + endereco + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public int getHoraAbertura() {
		return horaAbertura;
	}

	public void setHoraAbertura(int horaAbertura) {
		this.horaAbertura = horaAbertura;
	}

	public int getHoraFechamento() {
		return horaFechamento;
	}

	public void setHoraFechamento(int horaFechamento) {
		this.horaFechamento = horaFechamento;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	public Funcionario[] getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(Funcionario[] nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}	

}
