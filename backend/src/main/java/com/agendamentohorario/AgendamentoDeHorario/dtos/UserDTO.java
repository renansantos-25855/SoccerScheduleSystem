package com.agendamentohorario.AgendamentoDeHorario.dtos;

import java.io.Serializable;

import com.agendamentohorario.AgendamentoDeHorario.entities.User;

public class UserDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long Id;
	private String nome;
	private String sobrenome;
	private String email;
	private String CPF;
	private String telefone;
	
	public UserDTO() {
		
	}
	
	public UserDTO(String nome, String sobrenome, String email, String cPF, String telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		CPF = cPF;
		this.telefone = telefone;
	}
	
	public UserDTO(User entity) {
		nome = entity.getNome();
		sobrenome = entity.getSobrenome();
		email = entity.getEmail();
		CPF = entity.getCPF();
		telefone = entity.getTelefone();
	}
	
	

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
