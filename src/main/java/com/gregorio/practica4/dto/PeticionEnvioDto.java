package com.gregorio.practica4.dto;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class PeticionEnvioDto {
    
    @NotNull
    private String codigoEnvio;

    @NotBlank
    private String solicitante;

    @NotNull
    private String direccionOrigen;

    @NotNull
    private String direccionDestino;

    private String datosMercancia;

    private String datosEnvio;


/*     @Override
    public String toString() {
        return "Solicitante: \n id=" + id
                + "\n envio=" + envio
                + "\n direcion de origen=" + direccionOrigen
                + "\n direcion de destino=" + direccionDestino
                + "\ncodigo=" + codigoEnvio;
    } */

}
