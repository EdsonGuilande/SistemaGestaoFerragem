package com.sistema.projecto.boot.web.controller;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sistema.projecto.boot.domain.Fornecimento;
import com.sistema.projecto.boot.service.FornecimentoService;


@Controller
@RequestMapping("/Fornecimento")
public class FornecimentoController {

	
	@Autowired
	private FornecimentoService service;
	@GetMapping("/cadastrar")
	public String cadastrar(Fornecimento fornecimento) {
		return "/Fornecimento/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("Fornecimento", service.buscarTodos());
		return "/Fornecimento/lista";
	}
	@PostMapping("/salvar")
	public String salvar(Fornecimento fornecimento) {
		service.salvar(fornecimento);
		return "redirect:/Fornecimento/cadastrar";
	}
	
}
