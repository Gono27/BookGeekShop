package com.project.BookGeekShop.dao;

import com.project.BookGeekShop.domain.NovelaGrafica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NovelaGraficaDao 
        extends JpaRepository<NovelaGrafica,Long>{
    
}
