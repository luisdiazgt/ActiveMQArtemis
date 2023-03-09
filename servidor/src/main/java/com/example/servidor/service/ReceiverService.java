package com.example.servidor.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import lombok.extern.java.Log;

@Log
@Component
public class ReceiverService {
    
    @JmsListener(destination = "${jms.colaTest}")
    public void leerMensaje(String mensaje){
        log.info("Servidor - procesando colaTest, mensaje: " + mensaje);
    }

    @JmsListener(destination = "${jms.colaTestEntidad}")
    public void leerMensajeEntidad(String mensaje){
        log.info("Servidor - procesando colaTestEntidad, mensaje: " + mensaje);
    }

}
