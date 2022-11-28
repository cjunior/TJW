package br.edu.ifce.primeiroJPA.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class MyWebSecurityConfiguration {

	@Bean
	public WebSecurityCustomizer webSecurityCustomizer() {
		return (web) -> web.ignoring().antMatchers("/resources/**", "/webjars/**", "/css/**");
	}

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((requests) -> 
		requests.antMatchers("/alunos/cadastrar").hasRole("ADMIN")
				.antMatchers("/", "/home").permitAll().anyRequest().authenticated().and()

		)
		/*
			 * .formLogin((form) -> form .loginPage("/login") .permitAll() )
			 * .logout((logout) -> logout.permitAll());
			 */ .formLogin().and().exceptionHandling().accessDeniedPage("/403");
		return http.build();
	}

	@Bean
	MyUserDetails customUserDetailsService() {
		return new MyUserDetails();
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	
}
