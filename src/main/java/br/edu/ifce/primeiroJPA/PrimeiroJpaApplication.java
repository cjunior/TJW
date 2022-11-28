package br.edu.ifce.primeiroJPA;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifce.primeiroJPA.model.Disciplinas;
import br.edu.ifce.primeiroJPA.model.Endereco;
import br.edu.ifce.primeiroJPA.model.Sede;
import br.edu.ifce.primeiroJPA.model.Telefone;
import br.edu.ifce.primeiroJPA.model.Aluno;
import br.edu.ifce.primeiroJPA.repositorio.DisciplinaRepository;
import br.edu.ifce.primeiroJPA.repositorio.EnderecoRepository;
import br.edu.ifce.primeiroJPA.repositorio.SedeRepository;
import br.edu.ifce.primeiroJPA.repositorio.TelefoneRepository;
import br.edu.ifce.primeiroJPA.repositorio.UsuarioRepository;

@SpringBootApplication
public class PrimeiroJpaApplication implements CommandLineRunner {

	@Autowired
	UsuarioRepository usuarios;
	@Autowired
	EnderecoRepository enderecos;

	@Autowired
	TelefoneRepository telefones;

	@Autowired
	SedeRepository sedes;

	@Autowired
	DisciplinaRepository disciplinas;

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		 
	


	}
}
