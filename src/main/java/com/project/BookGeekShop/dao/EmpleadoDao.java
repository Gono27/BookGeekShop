package com.project.BookGeekShop.dao;

import com.project.BookGeekShop.domain.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoDao 
        extends JpaRepository<Empleado,Long> {
    
}
