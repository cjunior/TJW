package br.edu.ifce.primeiroJPA.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.ifce.primeiroJPA.model.Usuarios;

public interface UsuarioRepository extends JpaRepository<Usuarios, Long>{

}
