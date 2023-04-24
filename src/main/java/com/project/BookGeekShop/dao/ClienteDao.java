package com.project.BookGeekShop.dao;

import com.project.BookGeekShop.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteDao 
        extends JpaRepository <Cliente,Long>{
  
}
