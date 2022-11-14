package br.edu.ifce.primeiroJPA.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.ifce.primeiroJPA.model.Aluno;

public interface UsuarioRepository extends JpaRepository<Aluno, Long>{



	
}
