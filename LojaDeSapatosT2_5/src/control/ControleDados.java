package control;

import java.util.ArrayList;
import java.util.List;

import model.Bota;
import model.Cliente;
import model.Dados;
import model.Endereco;
import model.Estoque;
import model.Funcionario;
import model.Produto;
import model.Salto;
import model.Sapato;
import model.Tenis;
import model.Venda;

public class ControleDados {
	private Dados data = new Dados();

	public ControleDados() {

	}

	public Dados getData() {
		return data;
	}

	public void setData(Dados data) {
		this.data = data;
	}

	public ArrayList<Cliente> getCliente() {
		return data.getCliente();
	}

	public void setCliente(Cliente clie) {
		data.setCliente(clie);
	}

	public ArrayList<Funcionario> getFuncionario() {
		return data.getFuncionario();
	}

	public void setFuncionario(Funcionario funci) {
		data.setFuncionario(funci);
	}

	public ArrayList<Venda> getVenda() {
		return data.getVenda();
	}

	public void setVenda(Venda ven) {
		data.setVenda(ven);
	}

	public ArrayList<Endereco> getEnderecoCliente() {
		return data.getEnderecoCliente();
	}

	public void setEnderecoCliente(Endereco ende) {
		data.setEnderecoCliente(ende);
	}

	public ArrayList<Endereco> getEnderecoFuncionario() {
		return data.getEnderecoFuncionario();
	}

	public void setEnderecoFuncionario(Endereco ende) {
		data.setEnderecoFuncionario(ende);
	}

	public Endereco getEnderecoLoja() {
		return data.getEnderecoLoja();
	}

	public void setEnderecoLoja(int cep, String cidade, String uf, String rua, int num, int qd, String bairro,
			int Apart, String comp) {
		data.setEnderecoLoja(cep, cidade, uf, rua, num, qd, bairro, Apart, comp);
	}

	public ArrayList<Estoque> getProdEstoque() {
		return data.getProdEstoque();
	}

	public void setProdEstoque(Estoque est) {
		data.setProdEstoque(est);
	}

	public List<Produto> getProduto() {
		return data.getProduto();
	}

	public void setProduto(Produto prod) {
		data.setProduto(prod);
	}

	public ArrayList<Salto> getSalto() {
		return data.getSalto();
	}

	public void setSalto(Salto salto) {
		data.setSalto(salto);
	}

	public ArrayList<Tenis> getTenis() {
		return data.getTenis();
	}

	public void setTenis(Tenis tenis) {
		data.setTenis(tenis);
	}

	public ArrayList<Bota> getBota() {
		return data.getBota();
	}

	public void setBota(Bota bota) {
		data.setBota(bota);
	}

	public ArrayList<Sapato> getSapato() {
		return data.getSapato();
	}

	public void setSapato(Sapato sapato) {
		data.setSapato(sapato);
	}

	public ArrayList<Integer> getSaltoPosicaoLista() {
		return data.getSaltoPosicaoLista();
	}

	public void setSaltoPosicaoLista(int pos) {
		data.setSaltoPosicaoLista(pos);
	}

	public ArrayList<Integer> getTenisPosicaoLista() {
		return data.getTenisPosicaoLista();
	}

	public void setTenisPosicaoLista(int pos) {
		data.setTenisPosicaoLista(pos);
	}

	public ArrayList<Integer> getBotaPosicaoLista() {
		return data.getBotaPosicaoLista();
	}

	public void setBotaPosicaoLista(int pos) {
		data.setBotaPosicaoLista(pos);
	}

	public ArrayList<Integer> getSapatoPosicaoLista() {
		return data.getSapatoPosicaoLista();
	}

	public void setSapatoPosicaoLista(int pos) {
		data.setSapatoPosicaoLista(pos);
	}

}
