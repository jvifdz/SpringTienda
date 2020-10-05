package com.javierfernandez.springboot.di.app.models.service;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
//@Component("miServicioSimple")

public class  MiServicio implements IServicio{


    public String operacion(){


        return "ejecutando algun proceso importante simple...";
    }

}
