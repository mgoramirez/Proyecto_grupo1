package com.proyecto.service;

import com.proyecto.domain.Reservacion;
import java.util.List;

public interface ReservacionService {

    public List<Reservacion> buscarPorId();

    public Reservacion getReservacion(Reservacion reservacion);

    public void save(Reservacion reservacion);

    public void delete(Reservacion reservacion);

}
