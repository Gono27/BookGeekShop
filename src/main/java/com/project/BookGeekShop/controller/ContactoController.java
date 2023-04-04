package com.project.BookGeekShop.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Slf4j
@RequestMapping("/contacto")
public class ContactoController {
    
    @GetMapping("/contacto")
    public String inicio(Model model) {
        return "/contacto/contacto";      
    }
    
}
