package com.gregorio.practica4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gregorio.practica4.dto.SolicitudDto;
import com.gregorio.practica4.entity.Solicitud;
import com.gregorio.practica4.mapper.MapperSolicitud;
import com.gregorio.practica4.repository.EnviosRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class ControllerEnvios {

    @Autowired
    private EnviosRepository enviosRepository;

    private final MapperSolicitud mapper = new MapperSolicitud();

    // Listar todos los envíos
    @GetMapping("/listaEnvios")
    public ResponseEntity<List<SolicitudDto>> listaEnvios() {
        List<SolicitudDto> lista = enviosRepository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
        return ResponseEntity.ok(lista);
    }

    // Crear un nuevo envío
    @PostMapping("/crearEnvio")
    public ResponseEntity<SolicitudDto> crearEnvio(@Valid @RequestBody SolicitudDto solicitudDto) {
        Solicitud solicitud = Solicitud.builder()
                .codigoEnvio(solicitudDto.getCodigoEnvio())
                .solicitante(solicitudDto.getSolicitante())
                .dirOrigen(solicitudDto.getDireccionOrigen())
                .dirDestino(solicitudDto.getDireccionDestino())
                .datosMercancia(solicitudDto.getDatosMercancia())
                .datosEnvio(solicitudDto.getDatosEnvio())
                .build();
        Solicitud guardado = enviosRepository.save(solicitud);
        return ResponseEntity.ok(mapper.toDto(guardado));
    }
}
