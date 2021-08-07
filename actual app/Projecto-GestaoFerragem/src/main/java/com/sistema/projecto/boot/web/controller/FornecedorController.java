package com.sistema.projecto.boot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sistema.projecto.boot.domain.Fornecedor;
import com.sistema.projecto.boot.service.FornecedorService;

@Controller
@RequestMapping("/Fornecedor")
public class FornecedorController {
	@Autowired
	private FornecedorService service;
	@GetMapping("/cadastrar")
	public String cadastrar(Fornecedor fornecedor) {
		return "/Fornecedor/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("Fornecedor", service.buscarTodos());
		return "/Fornecedor/lista";
	}
	@PostMapping("/salvar")
	public String salvar(Fornecedor fornecedor) {
		service.salvar(fornecedor);
		return "redirect:/Fornecedor/cadastrar";
	}
	
	
}	

