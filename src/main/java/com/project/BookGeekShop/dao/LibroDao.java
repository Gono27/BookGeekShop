package com.project.BookGeekShop.dao;

import com.project.BookGeekShop.domain.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroDao 
        extends JpaRepository<Libro,Long> {
    
}
