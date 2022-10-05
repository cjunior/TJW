package br.edu.ifce.primeiroJPA;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifce.primeiroJPA.model.Endereco;
import br.edu.ifce.primeiroJPA.model.Sede;
import br.edu.ifce.primeiroJPA.model.Telefone;
import br.edu.ifce.primeiroJPA.model.Usuarios;
import br.edu.ifce.primeiroJPA.repositorio.EnderecoRepository;
import br.edu.ifce.primeiroJPA.repositorio.SedeRepository;
import br.edu.ifce.primeiroJPA.repositorio.TelefoneRepository;
import br.edu.ifce.primeiroJPA.repositorio.UsuarioRepository;

@SpringBootApplication
public class PrimeiroJpaApplication  implements CommandLineRunner {
	
	@Autowired
	UsuarioRepository usuarios;
	@Autowired
	EnderecoRepository enderecos;
	
	@Autowired
	TelefoneRepository telefones;

	@Autowired
	SedeRepository sedes;
	
	
	public static void main(String[] args) {
		SpringApplication.run(PrimeiroJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		  Sede s1 = sedes.findById((long) 1).get();
		 		  
		  Usuarios user = new Usuarios(); 
		  user.setNome("Beltrano de tal");
		  user.setEmail("beltrano@gmail.com");
		  user.setPassword("123456");
		  Calendar dt =  Calendar.getInstance(); 
		  dt.set(2020, 10,10);
		  user.setDt_nascimento(dt);
		  
		  Endereco e = new Endereco();
		  e.setBairro("Jereissati I");
		  e.setCep("00000-000");
		  e.setLogradouro("Rua II");
		  user.setEndereco(e);
		  user.setSede(s1);
		  
		  List<Telefone> phone = new ArrayList<Telefone>();
		  
		  Telefone t1 = new Telefone();
		  t1.setIswpp(true);
		  t1.setNumero("85999999999");
		  t1.setTipo("celular"); phone.add(t1);
		  		  
		  user.setTelefone(phone);
		  usuarios.save(user);
		 
		
	}
}
