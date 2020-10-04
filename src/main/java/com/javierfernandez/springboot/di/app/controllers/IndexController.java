package com.javierfernandez.springboot.di.app.controllers;


import com.javierfernandez.springboot.di.app.models.service.MiServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

   // con autoweird no instancio
   // private MiServicio servicio = new MiServicio();

    @Autowired
    private MiServicio servicio;
    @GetMapping({"/index","/",""})
    public String index(Model model){

        model.addAttribute("objeto",servicio.operacion());
        return "index";
    }

}
