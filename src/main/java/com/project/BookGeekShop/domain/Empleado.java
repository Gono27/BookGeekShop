package com.project.BookGeekShop.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;
        
@Data
@Entity
@Table(name="empleado")
public class Empleado implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEmpleado;
    
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String correo;
    private String telefono;
    private String puesto;
    private String antiguedad;

    public Empleado() {
    }

    public Empleado(long idEmpleado, String nombre, String primerApellido, String segundoApellido, String correo, String telefono, String puesto, String antiguedad) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.correo = correo;
        this.telefono = telefono;
        this.puesto = puesto;
        this.antiguedad = antiguedad;
    }
    
    
    
    
}
