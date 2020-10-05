package com.javierfernandez.springboot.di.app.controllers;


import com.javierfernandez.springboot.di.app.models.service.IServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    // con autoweird no instancio
    // private MiServicio servicio = new MiServicio();

    //Puedo poner el autowired en el set o constructor
    @Autowired
    //anotacion para identificar por nombre
    // @Qualifier("miServicioPrincipal")
    private IServicio servicio;

    //@Autowired //lo puedo omitir al ser constructor
    /*public IndexController(IServicio servicio) {
        this.servicio = servicio;
    }*/

    @GetMapping({"/index", "/", ""})
    public String index(Model model) {

        model.addAttribute("objeto", servicio.operacion());
        return "index";
    }

}
