package com.project.BookGeekShop.service;

import com.project.BookGeekShop.domain.Libro;
import java.util.List;

public interface LibroService {
    public List<Libro> getLibros();
    
    public Libro getLibro(Libro libro);
    
    public void save(Libro libro);
    
    public void delete(Libro libro);
}
