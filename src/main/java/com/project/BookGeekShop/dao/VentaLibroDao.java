package com.project.BookGeekShop.dao;

import com.project.BookGeekShop.domain.VentaLibro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaLibroDao 
        extends JpaRepository<VentaLibro,Long> {
    
}
