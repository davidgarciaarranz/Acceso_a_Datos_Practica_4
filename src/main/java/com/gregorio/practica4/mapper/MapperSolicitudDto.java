package com.gregorio.practica4.mapper;

import org.springframework.stereotype.Component;

import com.gregorio.practica4.dto.PeticionEnvioDto;
import com.gregorio.practica4.entity.PeticionEnvio;


@Component
public class MapperSolicitudDto {

    public PeticionEnvioDto toDto(PeticionEnvio peticion){
        return PeticionEnvioDto.builder()
        .codigoEnvio(peticion.getCodioEnvio())
        .solicitante(peticion.getSolicitante())
        .direccionOrigen(peticion.getDireccionOrigen())
        .direccionDestino(peticion.getDireccionDestino())
        .datosMercancia(peticion.getDatosMercancia())
        .datosEnvio(peticion.getDatosEnvio())
        .build();
    }
}
