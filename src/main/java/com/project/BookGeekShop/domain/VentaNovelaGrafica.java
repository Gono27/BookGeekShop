package com.project.BookGeekShop.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="ventaNovelaGrafica")
public class VentaNovelaGrafica implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_ventaNG")
    private long idVentaNG;
    
    @JoinColumn(name="id_novelaG", referencedColumnName="id_novelaG")
    @ManyToOne
    private NovelaGrafica novelaGrafica;
    
    @JoinColumn(name="id_cliente", referencedColumnName="id_cliente")
    @ManyToOne
    private Cliente cliente;
    
    private double total;


    public VentaNovelaGrafica() {
    }

    public VentaNovelaGrafica(NovelaGrafica novelaGrafica, Cliente cliente, double total) {
        this.novelaGrafica = novelaGrafica;
        this.cliente = cliente;
        this.total = total;
    }

   
    
    
}
