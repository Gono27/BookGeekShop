package com.project.BookGeekShop.serviceImpl;

import com.project.BookGeekShop.dao.EmpleadoDao;
import com.project.BookGeekShop.domain.Empleado;
import com.project.BookGeekShop.service.EmpleadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoDao empleadoDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Empleado> getEmpleados() {
        return empleadoDao.findAll();
    }

    @Override
    @Transactional(readOnly=true)
    public Empleado getEmpleado(Empleado empleado) {
        return empleadoDao.findById(empleado.getIdEmpleado()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Empleado empleado) {
        empleadoDao.save(empleado);
    }

    @Override
    @Transactional
    public void delete(Empleado empleado) {
        empleadoDao.delete(empleado);
    }
    
}
