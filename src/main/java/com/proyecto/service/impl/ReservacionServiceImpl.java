package com.proyecto.service.impl;

import com.proyecto.dao.ReservacionDao;
import com.proyecto.domain.Reservacion;
import com.proyecto.service.ReservacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReservacionServiceImpl implements ReservacionService{
    
    @Autowired
    private ReservacionDao reservacionDao;//traemos  los metodos 
    
    @Override
    @Transactional(readOnly = true)
    public Reservacion getReservacion(Reservacion reservacion) {
        return reservacionDao.findById(reservacion.getIdReserva()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Reservacion reservacion) {
        reservacionDao.save(reservacion);
    }

    @Override
    @Transactional
    public void delete(Reservacion reservacion) {
        reservacionDao.delete(reservacion);
    }
    
    //permite ver una lista de las reservaciones que hay
    @Override
    @Transactional(readOnly = true)
    public List<Reservacion> buscarPorId() {
       var lista = reservacionDao.findAll();
        return lista;
    }

    
    
    
}
