package com.project.BookGeekShop.serviceImpl;

import com.project.BookGeekShop.dao.NovelaGraficaDao;
import com.project.BookGeekShop.domain.NovelaGrafica;
import com.project.BookGeekShop.service.NovelaGraficaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NovelaGraficaServiceImpl implements NovelaGraficaService {

    @Autowired
    private NovelaGraficaDao novelaGraficaDao;
    
    
    @Override
    @Transactional(readOnly=true)
    public List<NovelaGrafica> getNovelaGraficas() {
        return novelaGraficaDao.findAll();
    }

    @Override
    @Transactional(readOnly=true)
    public NovelaGrafica getNovelaGrafica(NovelaGrafica novelaGrafica) {
        return novelaGraficaDao.findById(novelaGrafica.getIdNovelaG()).orElse(null);
    }

    @Override
    @Transactional
    public void save(NovelaGrafica novelaGrafica) {
        novelaGraficaDao.save(novelaGrafica);
    }

    @Override
    public void delete(NovelaGrafica novelaGrafica) {
        novelaGraficaDao.delete(novelaGrafica);
    }
    
}
