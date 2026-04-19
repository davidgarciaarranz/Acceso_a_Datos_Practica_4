package com.gregorio.practica4.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gregorio.practica4.dto.PeticionEnvioDto;
import com.gregorio.practica4.service.EnvioService;



@RestController
@RequestMapping("/api")
public class EnvioController {

    private final EnvioService service;

    public EnvioController(EnvioService service){
        this.service = service;
    }

    @GetMapping("listar")
    public ResponseEntity<List<PeticionEnvioDto>> listaEnvios() {
        return ResponseEntity.ok(service.findAll());
    }
    


}
