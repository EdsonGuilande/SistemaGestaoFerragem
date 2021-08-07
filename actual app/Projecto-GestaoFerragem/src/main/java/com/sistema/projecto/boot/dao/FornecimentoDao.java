package com.sistema.projecto.boot.dao;

import java.util.List;

import com.sistema.projecto.boot.domain.Fornecimento;



public interface FornecimentoDao {
	
	void save(Fornecimento fornecimento);
	void update(Fornecimento fornecimento);
	
	void delete(Long id);
	
	Fornecimento findById(Long id);
	
	List<Fornecimento>findAll();

}
