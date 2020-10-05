package com.javierfernandez.springboot.di.app;


import com.javierfernandez.springboot.di.app.models.service.IServicio;
import com.javierfernandez.springboot.di.app.models.service.MiServicio;
import com.javierfernandez.springboot.di.app.models.service.MiServicioComplejo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration

public class AppConfig {
    @Bean("miServicioSimple")
    @Primary
    public IServicio registrarMiServicio(){

        return new MiServicio();
    }
    @Bean("miServicioComplejo")

    public IServicio registrarMiServicioComplejo(){

        return new MiServicioComplejo();
    }
}
