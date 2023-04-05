package com.project.BookGeekShop.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="novelaGrafica")
public class NovelaGrafica implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_novelaG")
    private long idNovelaG;
    private String nombre;
    private String tipo;
    private String autor;
    private String editorial;
    private String fechaPublicacion;
    private int cantidad;
    private double precio;

    public NovelaGrafica() {
    }

    public NovelaGrafica(String nombre, String tipo, String autor, String editorial, String fechaPublicacion, int cantidad, double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.autor = autor;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    
    
}
