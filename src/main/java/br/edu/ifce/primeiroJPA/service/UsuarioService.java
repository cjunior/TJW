package br.edu.ifce.primeiroJPA.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifce.primeiroJPA.model.Aluno;
import br.edu.ifce.primeiroJPA.repositorio.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository repository;
	
	@Transactional
	public Aluno buscarUsuarios(Long id) {
		// codigo para persistir usuario
		// codigo para persistir a foto do usuário
		// tabelas diferentes
		return repository.findById(id).get();
	}
	
	public List<Aluno> buscarTodosUsuarios(){
		return repository.findAll();
	}
	
	public void salvar (Aluno a) {
		repository.save(a);
	}
	
}
