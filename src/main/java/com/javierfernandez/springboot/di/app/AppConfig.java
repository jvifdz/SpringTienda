package com.javierfernandez.springboot.di.app;


import com.javierfernandez.springboot.di.app.models.domain.ItemFactura;
import com.javierfernandez.springboot.di.app.models.domain.Producto;
import com.javierfernandez.springboot.di.app.models.service.IServicio;
import com.javierfernandez.springboot.di.app.models.service.MiServicio;
import com.javierfernandez.springboot.di.app.models.service.MiServicioComplejo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.List;

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

    @Bean("itemsFactura")
    public List<ItemFactura> registrarItems(){
        Producto producto1 = new Producto("Camara Sony", 100);
        Producto producto2 = new Producto("PS5", 500);

        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 4);

        return Arrays.asList(linea1, linea2);
    }
}
