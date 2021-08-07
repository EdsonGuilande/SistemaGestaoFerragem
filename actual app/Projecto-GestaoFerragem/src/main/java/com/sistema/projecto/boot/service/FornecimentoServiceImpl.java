package com.sistema.projecto.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sistema.projecto.boot.dao.FornecimentoDao;
import com.sistema.projecto.boot.domain.Fornecimento;

@Service
@Transactional(readOnly=false)
public class FornecimentoServiceImpl implements FornecimentoService{

	@Autowired
	private FornecimentoDao dao;
	

	@Override
	public void salvar(Fornecimento fornecimento) {
		dao.save(fornecimento);
		
	}
	
	@Override
	public void editar(Fornecimento fornecimento) {
		dao.update(fornecimento);
		
	}
	
	@Override
	public void excuir(Long id) {
		dao.delete(id);
		
	}

	@Override
	@Transactional(readOnly=true)
	public Fornecimento buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Fornecimento> buscarTodos() {
		return dao.findAll();
	}

}
