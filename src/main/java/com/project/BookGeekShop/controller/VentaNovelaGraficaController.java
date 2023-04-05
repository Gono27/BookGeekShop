package com.project.BookGeekShop.controller;

import com.project.BookGeekShop.domain.VentaNovelaGrafica;
import com.project.BookGeekShop.service.NovelaGraficaService;
import com.project.BookGeekShop.service.VentaNovelaGraficaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/ventaNovelaGrafica")
public class VentaNovelaGraficaController {
    
    @Autowired
    private VentaNovelaGraficaService ventaNovelaGraficaService;
    
    @GetMapping("/listado_ventaNovelaGrafica")
    public String inicio(Model model) {
        var ventaNovelaGraficas = ventaNovelaGraficaService.getVentaNovelasGraficas();
        model.addAttribute("ventaNovelaGraficas", ventaNovelaGraficas);
        return "/ventaNovelaGrafica/listado_ventaNovelaGrafica";      
    }
    
    @GetMapping("/nuevo")
    public String ventaNovelaGraficaNueva (VentaNovelaGrafica ventaNovelaGrafica){
        return "/ventaNovelaGrafica/modifica_ventaNovelaGrafica";
    }

    @PostMapping("/guardar")
    public String ventaNovelaGraficaGuardar(VentaNovelaGrafica ventaNovelaGrafica) {
        ventaNovelaGraficaService.save(ventaNovelaGrafica);
        return "redirect:/ventaNovelaGrafica/listado_ventaNovelaGrafica";
    }
    
    @GetMapping("/eliminar/{idNovelaG}")
    public String ventaNovelaGraficaEliminar(VentaNovelaGrafica ventaNovelaGrafica) {
        ventaNovelaGraficaService.delete(ventaNovelaGrafica);
        return "redirect:/ventaNovelaGrafica/listado_ventaNovelaGrafica";
    }
    
    @GetMapping("/modificar/{idNovelaG}")
    public String ventaNovelaGraficaModificar(VentaNovelaGrafica ventaNovelaGrafica, Model model) {
        ventaNovelaGrafica = ventaNovelaGraficaService.getVentaNovelaGrafica(ventaNovelaGrafica);
        model.addAttribute("ventaNovelaGrafica", ventaNovelaGrafica);
        return "/ventaNovelaGrafica/modifica_ventaNovelaGrafica";
    }
    
}
