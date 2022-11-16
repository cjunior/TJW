package br.edu.ifce.primeiroJPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id) {
		aluno.excluir(aluno.buscarAluno(id));
		return "redirect:/alunos/listar";
	}
	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id,  ModelMap model) {
		model.addAttribute("aluno", aluno.buscarAluno(id));
		return "/aluno/cadastro";
	}
	
	@PostMapping("/editar")
	public String editar(Aluno a) {
		
		aluno.editar(a);
		return "redirect:/alunos/listar";
	}
	
	
	
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
