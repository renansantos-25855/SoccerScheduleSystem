package com.agendamentohorario.AgendamentoDeHorario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agendamentohorario.AgendamentoDeHorario.dtos.UserDTO;

@Repository
public interface UserRepository extends JpaRepository<UserDTO, Long>{

}
