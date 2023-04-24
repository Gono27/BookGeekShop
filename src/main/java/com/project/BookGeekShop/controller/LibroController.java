package com.project.BookGeekShop.controller;

import com.project.BookGeekShop.domain.Libro;
import com.project.BookGeekShop.service.LibroService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Slf4j
@RequestMapping("/libro")
public class LibroController {
    
    @Autowired
    private LibroService libroService;
    
    @GetMapping("/listado_libro")
    public String inicio(Model model) {
        var libros = libroService.getLibros();
        model.addAttribute("libros", libros);
        return "/libro/listado_libro";      
    }
    
    @GetMapping("/nuevo")
    public String libroNuevo (Libro libro){
        return "/libro/modifica_libro";
    }

    @PostMapping("/guardar")
    public String libroGuardar(Libro libro) {
        libroService.save(libro);
        return "redirect:/libro/listado_libro";
    }
    
    @GetMapping("/eliminar/{idLibro}")
    public String libroEliminar(Libro libro) {
        libroService.delete(libro);
        return "redirect:/libro/listado_libro";
    }
    
    @GetMapping("/modificar/{idLibro}")
    public String libroModificar(Libro libro, Model model) {
        libro = libroService.getLibro(libro);
        model.addAttribute("libro", libro);
        return "/libro/modifica_libro";
    }
    
}
