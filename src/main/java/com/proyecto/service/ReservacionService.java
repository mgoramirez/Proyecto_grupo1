package com.proyecto.service;

import com.proyecto.dao.ReservacionDao;
import com.proyecto.domain.Reservacion;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservacionService {

    private final ReservacionDao reservacionDao;

    @Autowired
    public ReservacionService(ReservacionDao reservacionDao) {
        this.reservacionDao = reservacionDao;
    }

    // Método para obtener todas las reservaciones
    public List<Reservacion> obtenerTodasLasReservaciones() {
        return reservacionDao.findAll();
    }

    // Método para obtener una reservación por su ID
    public Optional<Reservacion> obtenerReservacionPorId(Long id) {
        return reservacionDao.findById(id);
    }

    // Método para guardar una reservación
    public Reservacion guardarReservacion(Reservacion reservacion) {
        return reservacionDao.save(reservacion);
    }

    // Método para eliminar una reservación por su ID
    public void eliminarReservacionPorId(Long id) {
        reservacionDao.deleteById(id);
    }

}
