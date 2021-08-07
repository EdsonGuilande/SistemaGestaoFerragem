package com.sistema.projecto.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sistema.projecto.boot.dao.MaterialDao;
import com.sistema.projecto.boot.domain.Material;

@Service @Transactional(readOnly=false)
public class MaterialServiceImpl implements MaterialService {

	
@Autowired
	
	private MaterialDao dao;
	
	
	@Override
	public void salvar(Material material) {
		dao.save(material);
	}
	
	@Override
	public void editar(Material material) {
		dao.update(material);
		
	}

	@Override
	public void excuir(Long id) {
		dao.delete(id);
		
	}
	@Transactional(readOnly=true)
	@Override
	public Material buscarPorId(Long id) {
		return dao.findById(id);
	}
	@Transactional(readOnly=true)
	@Override
	public List<Material> buscarTodos() {
		return dao.findAll();
	}

}
