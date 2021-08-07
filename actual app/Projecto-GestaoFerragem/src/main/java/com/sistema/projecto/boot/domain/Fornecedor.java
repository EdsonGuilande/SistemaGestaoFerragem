package com.sistema.projecto.boot.domain;

import java.util.List;

import javax.persistence.*;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Table(name = "Fornecedor")
@Entity
@SuppressWarnings("serial")
public class Fornecedor extends AbstractEntity<Long> {
	
	@Column(name="Nome_Fornecedor",nullable = false, unique = true, length=60)
	private String for_nome;
	
	@Column(name="Codigo_Fornecedor",nullable = false)
	private int for_cod;
	
	@Column(name="Endereco_Fornecedor",nullable = false)
	private String for_endereco;
	
	@OneToMany(mappedBy="fornecedor")
	private List<Fornecimento> fornecimentos;

	public String getFor_nome() {
		return for_nome;
	}

	public void setFor_nome(String for_nome) {
		this.for_nome = for_nome;
	}

	public int getFor_cod() {
		return for_cod;
	}

	public void setFor_cod(int for_cod) {
		this.for_cod = for_cod;
	}

	public String getFor_endereco() {
		return for_endereco;
	}

	public void setFor_endereco(String for_endereco) {
		this.for_endereco = for_endereco;
	}

	public List<Fornecimento> getFornecimentos() {
		return fornecimentos;
	}

	public void setFornecimentos(List<Fornecimento> fornecimentos) {
		this.fornecimentos = fornecimentos;
	}


	
	

}
