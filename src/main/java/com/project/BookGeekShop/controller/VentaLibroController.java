package com.project.BookGeekShop.controller;

import com.project.BookGeekShop.domain.VentaLibro;
import com.project.BookGeekShop.service.LibroService;
import com.project.BookGeekShop.service.VentaLibroService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Slf4j
@RequestMapping("/ventaLibro")
public class VentaLibroController {
    
    @Autowired
    private VentaLibroService ventaLibroService;
    
    @GetMapping("/listado_ventaLibro")
    public String inicio(Model model) {
        var ventaLibros = ventaLibroService.getVentaLibros();
        model.addAttribute("ventaLibros", ventaLibros);
        return "/ventaLibro/listado_ventaLibro";      
    }
    
    @GetMapping("/nuevo")
    public String ventaLibroNuevo (VentaLibro ventaLibro){
        return "/ventaLibro/modifica_ventaLibro";
    }

    @PostMapping("/guardar")
    public String ventaLibroGuardar(VentaLibro ventaLibro) {
        ventaLibroService.save(ventaLibro);
        return "redirect:/ventaLibro/listado_ventaLibro";
    }
    
    @GetMapping("/eliminar/{idVentaL}")
    public String ventaLibroEliminar(VentaLibro ventaLibro) {
        ventaLibroService.delete(ventaLibro);
        return "redirect:/ventaLibro/listado_ventaLibro";
    }
    
    @GetMapping("/modificar/{idVentaL}")
    public String ventaLibroModificar(VentaLibro ventaLibro, Model model) {
        ventaLibro = ventaLibroService.getVentaLibro(ventaLibro);
        model.addAttribute("ventaLibro", ventaLibro);
        return "/ventaLibro/modifica_ventaLibro";
    }
    
}
