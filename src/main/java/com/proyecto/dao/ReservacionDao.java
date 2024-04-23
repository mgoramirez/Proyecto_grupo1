package com.proyecto.dao;

import com.proyecto.domain.Reservacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservacionDao extends JpaRepository<Reservacion, Long> {
    
    List<Reservacion> findById(long descripcion);

}