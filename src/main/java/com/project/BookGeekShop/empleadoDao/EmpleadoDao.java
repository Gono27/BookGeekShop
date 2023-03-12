package com.project.BookGeekShop.empleadoDao;

import com.project.BookGeekShop.empleadoDomain.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoDao 
        extends JpaRepository<Empleado,Long> {
    
}
