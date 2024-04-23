package com.proyecto.dao;

import com.proyecto.domain.Reservacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservacionDao extends JpaRepository<Reservacion,Long>{
    
}
