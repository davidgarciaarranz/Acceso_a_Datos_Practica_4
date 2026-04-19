package com.gregorio.practica4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gregorio.practica4.entity.Solicitud;

@Repository
public interface EnviosRepository extends JpaRepository<Solicitud, Long>{

}
