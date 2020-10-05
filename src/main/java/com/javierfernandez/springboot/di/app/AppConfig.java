package com.javierfernandez.springboot.di.app;


import com.javierfernandez.springboot.di.app.models.service.IServicio;
import com.javierfernandez.springboot.di.app.models.service.MiServicio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfig {
    @Bean("miServicioSimple")
    public IServicio registrarMiServicio(){

        return new MiServicio();
    }
}
