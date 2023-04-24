
package com.project.BookGeekShop.dao;

import com.project.BookGeekShop.domain.VentaNovelaGrafica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaNovelaGraficaDao 
    extends JpaRepository<VentaNovelaGrafica,Long> {
    
}
