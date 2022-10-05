package br.edu.ifce.primeiroJPA.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@ Table(name = "tbl_sede")
public class Sede {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String cidade;
	private String diretor;
	
	@OneToMany(mappedBy = "sede")
	private List<Usuarios> usuarios;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public List<Usuarios> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuarios> usuarios) {
		this.usuarios = usuarios;
	}
	

}
