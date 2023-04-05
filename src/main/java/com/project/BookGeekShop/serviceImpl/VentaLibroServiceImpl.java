package com.project.BookGeekShop.serviceImpl;


import com.project.BookGeekShop.dao.VentaLibroDao;
import com.project.BookGeekShop.domain.VentaLibro;
import com.project.BookGeekShop.service.VentaLibroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VentaLibroServiceImpl implements VentaLibroService {

    @Autowired
    private VentaLibroDao ventaLibroDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<VentaLibro> getVentaLibros() {
        return ventaLibroDao.findAll();
    }

    @Override
    @Transactional(readOnly=true)
    public VentaLibro getVentaLibro(VentaLibro ventaLibro) {
        return ventaLibroDao.findById(ventaLibro.getIdVentaL()).orElse(null);
    }

    @Override
    @Transactional
    public void save(VentaLibro ventaLibro) {
        ventaLibroDao.save(ventaLibro);
    }

    @Override
    @Transactional
    public void delete(VentaLibro ventaLibro) {
        ventaLibroDao.delete(ventaLibro);
    }
    
}
