package com.javierfernandez.springboot.di.app.models.service;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("miServicioComplejo")

public class MiServicioComplejo implements IServicio{


    public String operacion(){


        return "ejecutando algun proceso importante complicado...";
    }

}
