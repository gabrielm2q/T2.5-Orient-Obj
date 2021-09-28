package control;

import model.Bota;
import model.Salto;
import model.Sapato;
import model.Tenis;

public class ControleProduto {
	private ControleDados dados = new ControleDados();
	private Salto salto = new Salto();
	private Tenis tenis = new Tenis();
	private Bota bota = new Bota();
	private Sapato sapato = new Sapato();

	public ControleProduto(ControleDados d) {
		this.dados = d;
	}

	public void cadastrarSalto(int idProd, String nome, int tamanho, Double preco, String marca, String paisOrigem,
			String tempoGarantia, char genero, String codBarras, String cor, String material, String tipoSalto,
			String corExterna, String corSolado, String alturaSalto) {
		salto.setIdProd(idProd);
		salto.setNome(nome);
		salto.setTamanho(tamanho);
		salto.setPreco(preco);
		salto.setMarca(marca);
		salto.setPaisOrigem(paisOrigem);
		salto.setTempoGarantia(tempoGarantia);
		salto.setGenero(genero);
		salto.setCodBarras(codBarras);
		salto.setCor(cor);
		salto.setMaterial(material);
		salto.setTipoSalto(tipoSalto);
		salto.setCorExterna(corExterna);
		salto.setCorSolado(corSolado);
		salto.setAlturaSalto(alturaSalto);
		dados.setProduto(salto);
		dados.setSaltoPosicaoLista(dados.getProduto().indexOf(salto));
		dados.setSalto(salto);

	}

	public void editarSalto(ControleDados d, int index, int idProd, String nome, int tamanho, Double preco, String marca, String paisOrigem,
			String tempoGarantia, char genero, String codBarras, String cor, String material, String tipoSalto,
			String corExterna, String corSolado, String alturaSalto) {
		dados.getProduto().get(index).setIdProd(idProd);
		dados.getProduto().get(index).setNome(nome);
		dados.getProduto().get(index).setTamanho(tamanho);
		dados.getProduto().get(index).setPreco(preco);
		dados.getProduto().get(index).setMarca(marca);
		dados.getProduto().get(index).setPaisOrigem(paisOrigem);
		dados.getProduto().get(index).setTempoGarantia(tempoGarantia);
		dados.getProduto().get(index).setGenero(genero);
		dados.getProduto().get(index).setCodBarras(codBarras);
		dados.getProduto().get(index).setCor(cor);
		dados.getProduto().get(index).setMaterial(material);
		dados.getProduto().get(index)

	}

	public void cadastrarTenis(int idProd, String nome, int tamanho, Double preco, String marca, String paisOrigem,
			String tempoGarantia, char genero, String codBarras, String cor, String material, String atvdIndicada,
			String tecnoSolado, String tipoPisada, String tipoPalmilha, Double peso, String tipoAmarracao,
			String corCadarco) {
		tenis.setIdProd(idProd);
		tenis.setNome(nome);
		tenis.setTamanho(tamanho);
		tenis.setPreco(preco);
		tenis.setMarca(marca);
		tenis.setPaisOrigem(paisOrigem);
		tenis.setTempoGarantia(tempoGarantia);
		tenis.setGenero(genero);
		tenis.setCodBarras(codBarras);
		tenis.setCor(cor);
		tenis.setMaterial(material);
		tenis.setAtvdIndicada(atvdIndicada);
		tenis.setTecnoSolado(tecnoSolado);
		tenis.setTipoPisada(tipoPisada);
		tenis.setTipoPalmilha(tipoPalmilha);
		tenis.setPeso(peso);
		tenis.setTipoAmarracao(tipoAmarracao);
		tenis.setCorCadarco(corCadarco);
		dados.setProduto(tenis);
		dados.setTenisPosicaoLista(dados.getProduto().indexOf(tenis));
		dados.setTenis(tenis);

	}

	public void editarTenis(ControleDados d, int index, int idProd, String nome, int tamanho, Double preco,
			String marca, String paisOrigem, String tempoGarantia, char genero, String codBarras, String cor,
			String material, String atvdIndicada, String tecnoSolado, String tipoPisada, String tipoPalmilha,
			Double peso, String tipoAmarracao, String corCadarco) {
		dados.getProduto().get(index).setIdProd(idProd);
		dados.getProduto().get(index).setNome(nome);
		dados.getProduto().get(index).setTamanho(tamanho);
		dados.getProduto().get(index).setPreco(preco);
		dados.getProduto().get(index).setMarca(marca);
		dados.getProduto().get(index).setPaisOrigem(paisOrigem);
		dados.getProduto().get(index).setTempoGarantia(tempoGarantia);
		dados.getProduto().get(index).setGenero(genero);
		dados.getProduto().get(index).setCodBarras(codBarras);
		dados.getProduto().get(index).setCor(cor);
		dados.getProduto().get(index).setMaterial(material);

	}

	public void cadastrarBota(int idProd, String nome, int tamanho, Double preco, String marca, String paisOrigem,
			String tempoGarantia, char genero, String codBarras, String cor, String material, String modelo,
			String alturaCano, String tipoSalto, String tipoPalmilha, String materialSolado) {
		bota.setIdProd(idProd);
		bota.setNome(nome);
		bota.setTamanho(tamanho);
		bota.setPreco(preco);
		bota.setMarca(marca);
		bota.setPaisOrigem(paisOrigem);
		bota.setTempoGarantia(tempoGarantia);
		bota.setGenero(genero);
		bota.setCodBarras(codBarras);
		bota.setCor(cor);
		bota.setMaterial(material);
		bota.setModelo(modelo);
		bota.setAlturaCano(alturaCano);
		bota.setTipoSalto(tipoSalto);
		bota.setTipoPalmilha(tipoPalmilha);
		dados.setProduto(bota);
		dados.setBotaPosicaoLista(dados.getProduto().indexOf(bota));
		dados.setBota(bota);
	}

	public void editarBota(ControleDados d, int index, int idProd, String nome, int tamanho, Double preco, String marca,
			String paisOrigem, String tempoGarantia, char genero, String codBarras, String cor, String material,
			String modelo, String alturaCano, String tipoSalto, String tipoPalmilha, String materialSolado) {
		dados.getProduto().get(index).setIdProd(idProd);
		dados.getProduto().get(index).setNome(nome);
		dados.getProduto().get(index).setTamanho(tamanho);
		dados.getProduto().get(index).setPreco(preco);
		dados.getProduto().get(index).setMarca(marca);
		dados.getProduto().get(index).setPaisOrigem(paisOrigem);
		dados.getProduto().get(index).setTempoGarantia(tempoGarantia);
		dados.getProduto().get(index).setGenero(genero);
		dados.getProduto().get(index).setCodBarras(codBarras);
		dados.getProduto().get(index).setCor(cor);
		dados.getProduto().get(index).setMaterial(material);

	}

	public void cadastrarSapato(int idProd, String nome, int tamanho, Double preco, String marca, String paisOrigem,
			String tempoGarantia, char genero, String codBarras, String cor, String material, String materialSolado,
			String materialInterno, String tipoBico, String alturaSalto, String tipoPalmilha) {
		sapato.setIdProd(idProd);
		sapato.setNome(nome);
		sapato.setTamanho(tamanho);
		sapato.setPreco(preco);
		sapato.setMarca(marca);
		sapato.setMarca(marca);
		sapato.setPaisOrigem(paisOrigem);
		sapato.setTempoGarantia(tempoGarantia);
		sapato.setGenero(genero);
		sapato.setCodBarras(codBarras);
		sapato.setCor(cor);
		sapato.setMaterial(material);
		sapato.setMaterialSolado(materialSolado);
		sapato.setMaterialInterno(materialInterno);
		sapato.setTipoBico(tipoBico);
		sapato.setAlturaSalto(alturaSalto);
		sapato.setTipoPalmilha(tipoPalmilha);
		dados.setProduto(sapato);
		dados.setSapatoPosicaoLista(dados.getProduto().indexOf(sapato));
		dados.setSapato(sapato);

	}

	public void editarSapato(ControleDados d, int index, int idProd, String nome, int tamanho, Double preco,
			String marca, String paisOrigem, String tempoGarantia, char genero, String codBarras, String cor,
			String material, String materialSolado, String materialInterno, String tipoBico, String alturaSalto,
			String tipoPalmilha) {
		dados.getProduto().get(index).setIdProd(idProd);
		dados.getProduto().get(index).setNome(nome);
		dados.getProduto().get(index).setTamanho(tamanho);
		dados.getProduto().get(index).setPreco(preco);
		dados.getProduto().get(index).setMarca(marca);
		dados.getProduto().get(index).setPaisOrigem(paisOrigem);
		dados.getProduto().get(index).setTempoGarantia(tempoGarantia);
		dados.getProduto().get(index).setGenero(genero);
		dados.getProduto().get(index).setCodBarras(codBarras);
		dados.getProduto().get(index).setCor(cor);
		dados.getProduto().get(index).setMaterial(material);

	}

	public ControleDados getDados() {
		return dados;
	}

	public void setDados(ControleDados dados) {
		this.dados = dados;
	}

	public Salto getSalto() {
		return salto;
	}

	public void setSalto(Salto salto) {
		this.salto = salto;
	}

	public Tenis getTenis() {
		return tenis;
	}

	public void setTenis(Tenis tenis) {
		this.tenis = tenis;
	}

	public Bota getBota() {
		return bota;
	}

	public void setBota(Bota bota) {
		this.bota = bota;
	}

	public Sapato getSapato() {
		return sapato;
	}

	public void setSapato(Sapato sapato) {
		this.sapato = sapato;
	}

}
