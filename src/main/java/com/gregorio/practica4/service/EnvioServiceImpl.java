package com.gregorio.practica4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gregorio.practica4.dto.PeticionEnvioDto;
import com.gregorio.practica4.mapper.MapperSolicitudDto;
import com.gregorio.practica4.repository.EnvioRepository;

@Service
public class EnvioServiceImpl implements EnvioService{

    @Autowired
    private EnvioRepository repo;

    @Autowired
    private MapperSolicitudDto mapper;

    @Override
    public List<PeticionEnvioDto> findAll() {
        return repo.findAll()
        .stream()
        .map(mapper::toDto)
        .toList();
    }

}
