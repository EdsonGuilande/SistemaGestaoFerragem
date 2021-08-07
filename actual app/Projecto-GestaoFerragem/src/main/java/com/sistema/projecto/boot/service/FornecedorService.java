package com.sistema.projecto.boot.service;

import java.util.List;

import com.sistema.projecto.boot.domain.Fornecedor;



public interface FornecedorService {
	
void salvar(Fornecedor fornecedor);
	
	void editar(Fornecedor fornecedor);
	
	void excuir(Long id);
	
	Fornecedor buscarPorId(Long id);
	List<Fornecedor> buscarTodos();
}
