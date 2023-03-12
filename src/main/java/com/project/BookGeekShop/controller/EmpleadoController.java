package com.project.BookGeekShop.controller;

import com.project.BookGeekShop.service.ClienteService;
import com.project.BookGeekShop.domain.Empleado;
import com.project.BookGeekShop.service.EmpleadoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/empleado")
public class EmpleadoController {
  
    @Autowired
    private EmpleadoService empleadoService;
    
    @GetMapping("/listado_empleado")
    public String inicio(Model model) {
        var empleados = empleadoService.getEmpleados();
        model.addAttribute("empleados", empleados);
        return "/empleado/listado_empleado";      
    }
    
    @GetMapping("/nuevo")
    public String empleadoNuevo (Empleado empleado){
        return "/empleado/modifica_empleado";
    }

    @PostMapping("/guardar")
    public String empleadoGuardar(Empleado empleado) {
        empleadoService.save(empleado);
        return "redirect:/empleado/listado_empleado";
    }
    
    @GetMapping("/eliminar/{idEmpleado}")
    public String empleadoEliminar(Empleado empleado) {
        empleadoService.delete(empleado);
        return "redirect:/empleado/listado_empleado";
    }
    
    @GetMapping("/modificar/{idEmpleado}")
    public String empleadoModificar(Empleado empleado, Model model) {
        empleado = empleadoService.getEmpleado(empleado);
        model.addAttribute("empleado", empleado);
        return "/empleado/modifica_empleado";
    }
    
}
