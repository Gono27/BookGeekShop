package com.project.BookGeekShop.service;

import com.project.BookGeekShop.domain.VentaLibro;
import java.util.List;

public interface VentaLibroService {
    public List<VentaLibro> getVentaLibros();
    
    public VentaLibro getVentaLibro(VentaLibro ventaLibro);
    
    public void save(VentaLibro ventaLibro);
    
    public void delete(VentaLibro ventaLibro);
}
