package com.db1startciades.cidadesapi.domain.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table
public class Estado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nome;
	
	@OneToMany(mappedBy = "uf", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<Cidade> cidades;
	
	public Estado(String nome) {
		this.nome = nome;
		this.cidades = new ArrayList<>();
	}

	public String getnome() {
		return nome;
	}
	public List<Cidade> getCidades(){
		return cidades;
	}
}
