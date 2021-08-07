package com.sistema.projecto.boot.dao;

import java.util.List;

import com.sistema.projecto.boot.domain.Material;


public interface MaterialDao {

	
	void save(Material material);
	void update(Material material);
	
	void delete(Long id);
	
	Material findById(Long id);
	
	List<Material>findAll();
}
