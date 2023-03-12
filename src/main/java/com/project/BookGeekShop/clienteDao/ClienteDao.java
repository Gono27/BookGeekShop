package com.project.BookGeekShop.clienteDao;

import com.project.BookGeekShop.clienteDomain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteDao 
        extends JpaRepository <Cliente,Long>{
  
}
