package br.edu.ifce.primeiroJPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import br.edu.ifce.primeiroJPA.service.UsuarioService;

@Controller
public class HomeController {
	@Autowired
	UsuarioService service;
	
	@GetMapping({"/"})
	public String home() {
		return "index";
	}
	
	@GetMapping({"/login"})
	public String login() {
		return "login";
	}
	
	@GetMapping({"/403"})
	public String deny() {
		return "deny";
	}
}
