package br.edu.ifce.primeiroJPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.ifce.primeiroJPA.model.Aluno;
import br.edu.ifce.primeiroJPA.service.UsuarioService;



@Controller
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	UsuarioService aluno;
	
	// @RequestMapping(value = "/listar", method = RequestMethod.GET)
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("usuarios", aluno.buscarTodosUsuarios());
		return "/aluno/lista";
	}
	
	@GetMapping("/cadastrar")
	public String cadastrar(Aluno aluno) {
		return "/aluno/cadastro";
	}
	
	@PostMapping("/salvar")
	public String salvar(Aluno a) {
		aluno.salvar(a);
		return "redirect:/alunos/listar";
	}
}
