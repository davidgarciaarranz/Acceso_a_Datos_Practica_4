package com.gregorio.practica4.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Table(name="PETICION_ENVIO")
@Entity
public class PeticionEnvio {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="codigo_envio", nullable=false, unique=true, updatable=false)
    private String codioEnvio;
    
    @Column(name="solicitante")
    private String solicitante;
    
    @Column(name="dir_origen")
    private String direccionOrigen;
    
    @Column(name="dir_destino")
    private String direccionDestino;
    
    @Column(name="datos_mercancia")
    private String datosMercancia;

    @Column(name="datos_envio")
    private String datosEnvio;
}
