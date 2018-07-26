package com.example.model;

public class ItemSummary {

	private String	etiqueta;

	private String	descricao;

	public ItemSummary(String etiqueta, String descricao) {
		this.etiqueta = etiqueta;
		this.descricao = descricao;
	}

	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
