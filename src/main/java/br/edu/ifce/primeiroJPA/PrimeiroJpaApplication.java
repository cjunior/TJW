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
import br.edu.ifce.primeiroJPA.model.Usuarios;
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

		/*
		 * Sede s1 = new Sede(); s1.setDiretor("Corneli Jr"); s1.setCidade("Maracanaú");
		 * s1.setNome("Escola ABC"); sedes.save(s1);
		 * 
		 * Disciplinas d1 = new Disciplinas(); d1.setNome("tjw");
		 * d1.setNomeProfessor("Corneli Jr"); d1.setCh("80");
		 * 
		 * Disciplinas d2 = new Disciplinas(); d2.setNome("Sistemas Distribuídos");
		 * d2.setNomeProfessor("Fulano de tal"); d2.setCh("80");
		 * 
		 * disciplinas.save(d1); disciplinas.save(d2);
		 */

//		Sede s1 = sedes.findById((long) 1).get();
//		
//
//		
//		  Usuarios user = new Usuarios();
//		  user.setNome("Beltrano de tal");
//		  user.setEmail("beltrano@gmail.com");
//		  user.setPassword("123456");
//		  Calendar dt = Calendar.getInstance();
//		  dt.set(2020, 10, 10); user.setDt_nascimento(dt);
//		  
//		  Endereco e = new Endereco(); e.setBairro("Jereissati I");
//		  e.setCep("00000-000"); 
//		  e.setLogradouro("Rua II");
//		  user.setEndereco(e);
//		  user.setSede(s1);
//		  
//		  List<Telefone> phone = new ArrayList<Telefone>();
//		  
//		  Telefone t1 = new Telefone();
//		  t1.setIswpp(true); 
//		  t1.setNumero("85999999999");
//		  t1.setTipo("celular"); 
//		  phone.add(t1);
//		  user.setTelefone(phone);
//		  
//		 
//		  Disciplinas d1 = disciplinas.findById((long) 2).get();
//		  Disciplinas d2 = disciplinas.findById((long) 3).get();
//		  
//		  List<Disciplinas> d = new ArrayList<Disciplinas>();
//		  d.add(d1);
//		  d.add(d2);
//		  
//		  user.setDisciplina(d);
//		  
//		  
//		  usuarios.save(user);
		// Usuarios user = usuarios.findByEmail("fulano@gmail.com").get();
		// System.out.println(user.getNome());

	}
}
