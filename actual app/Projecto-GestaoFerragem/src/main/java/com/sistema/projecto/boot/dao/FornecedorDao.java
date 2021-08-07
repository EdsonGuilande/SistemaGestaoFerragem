package com.sistema.projecto.boot.dao;

import java.util.List;

import com.sistema.projecto.boot.domain.Fornecedor;



public interface FornecedorDao {


	void save(Fornecedor fornecedor);
	void update(Fornecedor fornecedor);
	
	void delete(Long id);
	
	Fornecedor findById(Long id);
	
	List<Fornecedor>findAll();
	
}
