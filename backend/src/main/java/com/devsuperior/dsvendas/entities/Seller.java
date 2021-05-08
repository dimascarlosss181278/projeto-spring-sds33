package com.devsuperior.dsvendas.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity //tabela JPA relacionada com o banco
@Table(name = "tb_sellers")
public class Seller {

    @Id //define que o campo id sera chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //define autoincremento
	private Long id;
	private String name;

	@OneToMany(mappedBy = "seller") //OneToMany tem atributo obrigatorio com mappedBy que 
	                                //pega o nome do atributo da tabela Sale
	private List<Sale> sales = new ArrayList<>();
	
	public Seller () {
	}

	public Seller(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Sale> getSales() {
		return sales;
	}


	
	
}
