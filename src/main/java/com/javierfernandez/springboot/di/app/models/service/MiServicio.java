package com.javierfernandez.springboot.di.app.models.service;


import org.springframework.stereotype.Component;

@Component("miServicioSimple")
public class MiServicio implements IServicio{


    public String operacion(){


        return "ejecutando algun proceso importante...";
    }

}
