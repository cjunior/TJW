package br.edu.ifce.primeiroJPA.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class MyWebSecurityConfiguration {
	
	@Bean
 	public WebSecurityCustomizer webSecurityCustomizer() {
 		return (web) -> web.ignoring()
 				.antMatchers("/resources/**");
 	}

 	@Bean
 	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
 		http.authorizeHttpRequests()
 		.antMatchers("/usuarios/cadastrar/**").hasAnyRole("ADMIN")
 		.anyRequest().authenticated().and().formLogin();	
 		return http.build();
 	}
 	@Bean
    MyUserDetails customUserDetailsService() {
    	return new MyUserDetails() ;
    }
    
 	@Bean
    public BCryptPasswordEncoder passwordEncoder() {
      return new BCryptPasswordEncoder();
    }


}
