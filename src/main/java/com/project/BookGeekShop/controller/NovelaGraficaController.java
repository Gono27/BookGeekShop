package com.project.BookGeekShop.controller;

import com.project.BookGeekShop.domain.NovelaGrafica;
import com.project.BookGeekShop.service.NovelaGraficaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/novelaGrafica")
public class NovelaGraficaController {
    
    @Autowired
    private NovelaGraficaService novelaGraficaService;
    
    @GetMapping("/listado_novelaGrafica")
    public String inicio(Model model) {
        var novelaGraficas = novelaGraficaService.getNovelaGraficas();
        model.addAttribute("novelaGraficas", novelaGraficas);
        return "/novelaGrafica/listado_novelaGrafica";      
    }
    
    @GetMapping("/nuevo")
    public String novelaGraficaNueva (NovelaGrafica novelaGrafica){
        return "/novelaGrafica/modifica_novelaGrafica";
    }

    @PostMapping("/guardar")
    public String novelaGraficaGuardar(NovelaGrafica novelaGrafica) {
        novelaGraficaService.save(novelaGrafica);
        return "redirect:/novelaGrafica/listado_novelaGrafica";
    }
    
    @GetMapping("/eliminar/{idNovelaG}")
    public String novelaGraficaEliminar(NovelaGrafica novelaGrafica) {
        novelaGraficaService.delete(novelaGrafica);
        return "redirect:/novelaGrafica/listado_novelaGrafica";
    }
    
    @GetMapping("/modificar/{idNovelaG}")
    public String novelaGraficaModificar(NovelaGrafica novelaGrafica, Model model) {
        novelaGrafica = novelaGraficaService.getNovelaGrafica(novelaGrafica);
        model.addAttribute("novelaGrafica", novelaGrafica);
        return "/novelaGrafica/modifica_novelaGrafica";
    }
    
}
