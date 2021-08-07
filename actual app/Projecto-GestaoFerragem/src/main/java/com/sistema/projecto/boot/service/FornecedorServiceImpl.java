package com.sistema.projecto.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sistema.projecto.boot.dao.FornecedorDao;
import com.sistema.projecto.boot.domain.Fornecedor;


@Service  @Transactional(readOnly=false)
public class FornecedorServiceImpl implements FornecedorService {

@Autowired
	
	private FornecedorDao dao;

	@Override
	public void salvar(Fornecedor fornecedor) {
		dao.save(fornecedor);
		
	}

	@Override 
	public void editar(Fornecedor fornecedor) {
		dao.update(fornecedor);
		
	}

	@Override 
	public void excuir(Long id) {
		dao.delete(id);
		
	}

	@Override
	@Transactional(readOnly=true)
	public Fornecedor buscarPorId(Long id) {
		return dao.findById(id);
	
	}

	@Override 
	@Transactional(readOnly=true)
	public List<Fornecedor> buscarTodos() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
