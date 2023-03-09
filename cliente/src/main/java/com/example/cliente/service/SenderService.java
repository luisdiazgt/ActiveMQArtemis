package com.example.cliente.service;

import org.springframework.jms.core.JmsTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import lombok.extern.java.Log;

@Log
@Service
public class SenderService {

    @Autowired
    JmsTemplate jmsTemplate;

    @Value("${jms.colaTest}")
    String jmsColaTest;

    @Value("${jms.colaTestEntidad}")
    String jmsColaTestEntidad;

    public void enviaCola(String request)
    {
        log.info("Cliente - mensaje enviado. Mensaje: " + request);
        jmsTemplate.convertAndSend(jmsColaTest, request);
    }

    public void enviaColaEntidad(String request)
    {
        log.info("Cliente - mensaje entidad enviado. Mensaje: " + request);
        jmsTemplate.convertAndSend(jmsColaTestEntidad, request);
    }
    
}
