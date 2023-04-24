package com.project.BookGeekShop.service;

import com.project.BookGeekShop.domain.NovelaGrafica;
import java.util.List;

public interface NovelaGraficaService {
     public List<NovelaGrafica> getNovelaGraficas();
    
    public NovelaGrafica getNovelaGrafica(NovelaGrafica novelaGrafica);
    
    public void save(NovelaGrafica novelaGrafica);
    
    public void delete(NovelaGrafica novelaGrafica);
}
