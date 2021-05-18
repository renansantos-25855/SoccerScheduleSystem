package com.agendamentohorario.AgendamentoDeHorario.services;

import java.util.List;

import com.agendamentohorario.AgendamentoDeHorario.dtos.UserDTO;
import com.agendamentohorario.AgendamentoDeHorario.repositories.UserRepository;


public class UserService {

	
	public UserRepository repository;
	
	public List<UserDTO> findAll(){	
		List<UserDTO> list = repository.findAll();
		return list;
	}
}
