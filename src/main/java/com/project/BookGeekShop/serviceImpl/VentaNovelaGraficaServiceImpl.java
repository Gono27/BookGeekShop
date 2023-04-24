package com.project.BookGeekShop.serviceImpl;

import com.project.BookGeekShop.dao.VentaNovelaGraficaDao;
import com.project.BookGeekShop.domain.VentaNovelaGrafica;
import com.project.BookGeekShop.service.VentaNovelaGraficaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VentaNovelaGraficaServiceImpl implements VentaNovelaGraficaService {

    @Autowired
    private VentaNovelaGraficaDao ventaNovelaGraficaDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<VentaNovelaGrafica> getVentaNovelasGraficas() {
        return ventaNovelaGraficaDao.findAll();
    }

    @Override
    @Transactional(readOnly=true)
    public VentaNovelaGrafica getVentaNovelaGrafica(VentaNovelaGrafica ventaNovelaGrafica) {
        return ventaNovelaGraficaDao.findById(ventaNovelaGrafica.getIdVentaNG()).orElse(null);
    }

    @Override
    @Transactional
    public void save(VentaNovelaGrafica ventaNovelaGrafica) {
        ventaNovelaGraficaDao.save(ventaNovelaGrafica);
    }

    @Override
    @Transactional
    public void delete(VentaNovelaGrafica ventaNovelaGrafica) {
        ventaNovelaGraficaDao.delete(ventaNovelaGrafica);
    }
    
}
