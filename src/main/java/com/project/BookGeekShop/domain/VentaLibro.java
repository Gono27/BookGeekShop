package com.project.BookGeekShop.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="ventaLibro")
public class VentaLibro implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_ventaL")
    private long idVentaL;
   
    
    @JoinColumn(name="id_libro", referencedColumnName="id_libro")
    @ManyToOne
    private Libro libro;
    
    @JoinColumn(name="id_cliente", referencedColumnName="id_cliente")
    @ManyToOne
    private Cliente cliente;

    private double total;
    
    public VentaLibro() {
    }

    public VentaLibro(Libro libro, Cliente cliente, double total) {
        this.libro = libro;
        this.cliente = cliente;
        this.total = total;
    }

  

   
    
}
