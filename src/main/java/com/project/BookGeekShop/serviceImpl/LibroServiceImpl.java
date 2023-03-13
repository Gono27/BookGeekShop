package com.project.BookGeekShop.serviceImpl;

import com.project.BookGeekShop.dao.LibroDao;
import com.project.BookGeekShop.domain.Libro;
import com.project.BookGeekShop.service.LibroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LibroServiceImpl implements LibroService {

    @Autowired
    private LibroDao libroDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Libro> getLibros() {
        return libroDao.findAll();
    }

    @Override
    @Transactional(readOnly=true)
    public Libro getLibro(Libro libro) {
        return libroDao.findById(libro.getIdLibro()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Libro libro) {
        libroDao.save(libro);
    }

    @Override
    @Transactional
    public void delete(Libro libro) {
        libroDao.delete(libro);
    }
    
}
