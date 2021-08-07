package com.sistema.projecto.boot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sistema.projecto.boot.domain.Fornecedor;
import com.sistema.projecto.boot.domain.Material;
import com.sistema.projecto.boot.service.FornecedorService;
import com.sistema.projecto.boot.service.MaterialService;

@Controller
@RequestMapping("/Material")
public class MaterialController {
	@Autowired
	private MaterialService service;
	@GetMapping("/cadastrar")
	public String cadastrar(Material material) {
		return "/Material/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("Material", service.buscarTodos());
		return "/Material/lista";
	}
	@PostMapping("/salvar")
	public String salvar(Material material) {
		service.salvar(material);
		return "redirect:/Material/cadastrar";
	}


		}
	
                                                                                         