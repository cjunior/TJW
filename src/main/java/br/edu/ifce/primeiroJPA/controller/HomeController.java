package br.edu.ifce.primeiroJPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.ifce.primeiroJPA.model.Usuarios;
import br.edu.ifce.primeiroJPA.service.UsuarioService;

@Controller
public class HomeController {
	@Autowired
	UsuarioService service;
	
	@GetMapping({"/{id}"})
	public String home(@PathVariable(value = "id") Long id) {
		Usuarios usuario = service.buscarUsuarios(id);
		System.out.println(usuario.getNome());
		return "index";
	}
}
