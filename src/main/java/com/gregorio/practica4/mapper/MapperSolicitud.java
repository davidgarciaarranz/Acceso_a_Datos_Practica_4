package com.gregorio.practica4.mapper;

import com.gregorio.practica4.dto.SolicitudDto;
import com.gregorio.practica4.entity.Solicitud;

public class MapperSolicitud {

    public SolicitudDto toDto(Solicitud solicitud){
        return SolicitudDto.builder()
        .codigoEnvio(solicitud.getCodigoEnvio())
        .solicitante(solicitud.getSolicitante())
        .direccionOrigen(solicitud.getDirOrigen())
        .direccionDestino(solicitud.getDirDestino())
        .datosMercancia(solicitud.getDatosMercancia())
        .datosEnvio(solicitud.getDatosEnvio())
        .build();
    }
}
