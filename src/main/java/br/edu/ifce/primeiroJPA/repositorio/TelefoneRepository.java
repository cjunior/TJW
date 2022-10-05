package br.edu.ifce.primeiroJPA.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifce.primeiroJPA.model.Telefone;

public interface TelefoneRepository extends JpaRepository<Telefone, Long> {

}
