package com.sistema.projecto.boot.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
@SuppressWarnings("serial")

@Entity
@Table(name ="Fornecimento")
public class Fornecimento extends AbstractEntity<Long> {
	
	
	@Column(name="Nome", nullable=false)	
	private String nome_fornec;
	
	@Column(name="quantidade", nullable=false)	
	private 	int  quantidade_fornec;
	
	@Column(name="Codigo",nullable = false)
	private int cod_fornec;
	
	@Column(name="Preco_em_MT", nullable=false)
	private int preco_fornec;
	
	@Column(name="data",nullable=false,columnDefinition="DATE")
	private Date data_fornec;
	
	@ManyToOne
	@JoinColumn(name="id_fornecedor_fk")
	private Fornecedor fornecedor ;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_material_fk")
	private Material material;


	public int getQuantidade_fornec() {
		return quantidade_fornec;
	}

	public void setQuantidade_fornec(int quantidade_fornec) {
		this.quantidade_fornec = quantidade_fornec;
	}

	public int getCod_fornec() {
		return cod_fornec;
	}

	public void setCod_fornec(int cod_fornec) {
		this.cod_fornec = cod_fornec;
	}

	

	public int getPreco_fornec() {
		return preco_fornec;
	}

	public void setPreco_fornec(int preco_fornec) {
		this.preco_fornec = preco_fornec;
	}

	public Date getData_fornec() {
		return data_fornec;
	}

	public void setData_fornec(Date data_fornec) {
		this.data_fornec = data_fornec;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public String getNome_fornec() {
		return nome_fornec;
	}

	public void setNome_fornec(String nome_fornec) {
		this.nome_fornec = nome_fornec;
	}

	
	
}
