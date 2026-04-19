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

@Entity
@Table(name = "SOLICITUD")
public class Solicitud {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codigo_envio", unique=true)
    private Long codigoEnvio;

    @Column(name = "solicitante")
    private String solicitante;

    @Column(name = "dir_origen")
    private String dirOrigen;

    @Column(name = "dir_destino")
    private String dirDestino;

    @Column(name = "datos_mercancia")
    private String datosMercancia;

    @Column(name = "datos_envio")
    private String datosEnvio;

}
