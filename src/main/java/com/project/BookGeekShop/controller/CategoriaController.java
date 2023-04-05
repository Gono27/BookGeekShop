package com.project.BookGeekShop.controller;

import com.project.BookGeekShop.service.LibroService;
import com.project.BookGeekShop.service.NovelaGraficaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/categorias")
public class CategoriaController {
    
    @Autowired
    LibroService libroService;
    
    @Autowired
    NovelaGraficaService novelaGraficaService;
    
    @GetMapping("/libros/CategoriasLibros")
    public String CategoriasLibros(Model model) {
        var libros = libroService.getLibros();
        model.addAttribute("libros", libros);
        
        return "/categorias/libros/CategoriasLibros.html";
    }
    @GetMapping("/libros/Accion")
    public String CategoriasAccionL(Model model) {
        return "/categorias/libros/Accion.html";
    }
    @GetMapping("/libros/Fantasia")
    public String CategoriasFantasia(Model model) {
        return "/categorias/libros/Fantasia.html";
    }
    @GetMapping("/libros/CienciaFiccion")
    public String CategoriasCienciaFiccionL(Model model) {
        return "/categorias/libros/CienciaFiccion.html";
    }
    @GetMapping("/libros/Autoayuda")
    public String CategoriasAutoayuda(Model model) {
        return "/categorias/libros/Autoayuda.html";
    }
    
    @GetMapping("/novelasGraficas/CategoriasNovelasGraficas")
    public String CategoriasNovelasGraficas(Model model) {
        var novelasGraficas = novelaGraficaService.getNovelaGraficas();
        model.addAttribute("novelasGraficas", novelasGraficas);
        
        return "/categorias/novelasGraficas/CategoriasNovelasGraficas.html";
    }
    @GetMapping("/novelasGraficas/Accion")
    public String CategoriasAccionNovelaG(Model model) {
        return "/categorias/novelasGraficas/Accion.html";
    }
    @GetMapping("/novelasGraficas/CienciaFiccion")
    public String CategoriasCienciaFiccionNovelaG(Model model) {
        return "/categorias/novelasGraficas/CienciaFiccion.html";
    }
    @GetMapping("/novelasGraficas/Politica")
    public String CategoriasPolitica(Model model) {
        return "/categorias/novelasGraficas/Politica.html";
    }
    @GetMapping("/novelasGraficas/Aventura")
    public String CategoriasAventura(Model model) {
        return "/categorias/novelasGraficas/Aventura.html";
    }

    
 
}
