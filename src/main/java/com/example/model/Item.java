package com.example.model;

import java.time.LocalDate;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@SqlResultSetMapping(
	name="mapItemSummary",
    classes = {
    	@ConstructorResult(
        	targetClass=ItemSummary.class, 
        	columns = { @ColumnResult(name = "etiqueta"), @ColumnResult(name = "descricao") }
        )
    }
)
@NamedNativeQuery(
    name="findExampleToDTO", 
    query="SELECT etiqueta, descricao FROM item where etiqueta = :id", 
    resultSetMapping="mapItemSummary"
)
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long		id;

	@NotEmpty
	private String		etiqueta;

	@NotEmpty
	private String		descricao;

	private LocalDate	dataAquisicao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public LocalDate getDataAquisicao() {
		return dataAquisicao;
	}

	public void setDataAquisicao(LocalDate dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}

}
