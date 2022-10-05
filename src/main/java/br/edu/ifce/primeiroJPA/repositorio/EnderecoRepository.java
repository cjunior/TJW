package br.edu.ifce.primeiroJPA.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifce.primeiroJPA.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
