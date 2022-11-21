package br.edu.ifce.primeiroJPA.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import br.edu.ifce.primeiroJPA.model.Aluno;
import br.edu.ifce.primeiroJPA.service.UsuarioService;

public class MyUserDetails implements  UserDetailsService {
	@Autowired
	UsuarioService aluno;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Aluno a = aluno.buscarLogin(username);

		String[] authorities = new String[1];
			authorities[0]="ROLE_USER";
			return new org.springframework.security.core.userdetails.User (
					a.getEmail(),	
					a.getPassword(),
					AuthorityUtils.createAuthorityList(authorities));
			
	}

}
