package com.project.BookGeekShop.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="cliente")
public class Cliente implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCliente;
    
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String correo;
    private String telefono;

    public Cliente() {
    }

    public Cliente(long idCliente, String nombre, String primerApellido, String segundoApellido, String correo, String telefono) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    
}
