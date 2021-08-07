package com.sistema.projecto.boot.service;

import java.util.List;

import com.sistema.projecto.boot.domain.Fornecimento;


public interface FornecimentoService {

	void salvar(Fornecimento fornecimento);
	
	void editar(Fornecimento fornecimento);
	
	void excuir(Long id);
	
	Fornecimento buscarPorId(Long id);
	List<Fornecimento> buscarTodos();
}
