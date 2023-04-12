package com.project.BookGeekShop.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/categorias")
public class CategoriaController {
    
    @GetMapping("/libros/CategoriasLibros")
    public String CategoriasLibros(Model model) {
        return "/categorias/libros/CategoriasLibros.html";
    }
    
    @GetMapping("/novelasGraficas/CategoriasNovelasGraficas")
    public String CategoriasNovelasGraficas(Model model) {
        return "/categorias/novelasGraficas/CategoriasNovelasGraficas.html";
    }

    
 
}
