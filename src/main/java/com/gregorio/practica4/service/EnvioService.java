package com.gregorio.practica4.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gregorio.practica4.dto.PeticionEnvioDto;

@Service
public interface EnvioService {

    List<PeticionEnvioDto> findAll();
}
