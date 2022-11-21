package br.edu.ifce.primeiroJPA.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.ifce.primeiroJPA.model.Aluno;

public interface UsuarioRepository extends JpaRepository<Aluno, Long>{
 
	@Query("select a from Aluno a where a.email like :username")
  Aluno buscarAluno(String username);

	
}
