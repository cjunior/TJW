package br.edu.ifce.primeiroJPA.model;

import java.util.Calendar;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


@Entity
@Table (name = "tbl_usuarios")
public class Aluno {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	private String email;
	
	private String password;
	
	private Boolean status;
	
	private Long ira;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;
	
	@Temporal(TemporalType.DATE)
	private Calendar dt_nascimento;
	
	@Transient
	private Integer idade;
	

	@OneToMany(cascade = CascadeType.ALL)
	private List<Telefone> telefone;
	
	@ManyToOne (cascade = CascadeType.ALL)
	private Sede sede;
	
///	@ManyToMany(cascade = CascadeType.PERSIST)
//	private List<Disciplinas> disciplina;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Calendar getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(Calendar dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public List<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	/*
	 * public List<Disciplinas> getDisciplina() { return disciplina; }
	 * 
	 * public void setDisciplina(List<Disciplinas> disciplina) { this.disciplina =
	 * disciplina; }
	 */

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Long getIra() {
		return ira;
	}

	public void setIra(Long ira) {
		this.ira = ira;
	}
}
