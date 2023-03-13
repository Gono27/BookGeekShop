package com.project.BookGeekShop.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="libro")
public class Libro implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idLibro;
    
    private String nombre;
    private String autor;
    private String editorial;
    private String fechaPublicacion;
    private int cantidad;
    private double precio;

    public Libro() {
    }

    public Libro(long idLibro, String nombre, String autor, String editorial, String fechaPublicacion, int cantidad, double precio) {
        this.idLibro = idLibro;
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    
}
