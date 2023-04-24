package com.project.BookGeekShop.service;

import com.project.BookGeekShop.domain.VentaNovelaGrafica;
import java.util.List;

public interface VentaNovelaGraficaService {
    public List<VentaNovelaGrafica> getVentaNovelasGraficas();
    
    public VentaNovelaGrafica getVentaNovelaGrafica(VentaNovelaGrafica ventaNovelaGrafica);
    
    public void save(VentaNovelaGrafica ventaNovelaGrafica);
    
    public void delete(VentaNovelaGrafica ventaNovelaGrafica);
}
