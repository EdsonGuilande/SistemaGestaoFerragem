package com.sistema.projecto.boot.service;

import java.util.List;

import com.sistema.projecto.boot.domain.Material;



public interface MaterialService {

void salvar(Material material);
	
	void editar(Material material);
	
	void excuir(Long id);
	
	Material buscarPorId(Long id);
	List<Material> buscarTodos();
}
