package com.sistema.projecto.boot.domain;

import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name="Material")
public class Material extends AbstractEntity<Long> {
	
@Column(name="Descricao",nullable=false)
private String mat_descricao;	

@Column(name="Codigo", nullable=false)	
private int mat_cod;



public String getMat_descricao() {
	return mat_descricao;
}

public void setMat_descricao(String mat_descricao) {
	this.mat_descricao = mat_descricao;
}

public int getMat_cod() {
	return mat_cod;
}

public void setMat_cod(int mat_cod) {
	this.mat_cod = mat_cod;
}


}