package com.javierfernandez.springboot.di.app.models.service;


import org.springframework.stereotype.Component;

@Component
public class MiServicio {

    public String operacion(){


        return "ejecutando algun proceso importante...";
    }

}
