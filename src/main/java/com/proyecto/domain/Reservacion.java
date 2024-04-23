package com.proyecto.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
@Entity
@Table(name="reservacion")
public class Reservacion implements Serializable{
    
    private static final long serialVersionUID =1L;  
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reserva")
    private Long idReserva; // Hibernate transforma en id_categoria
    private String idCasa;
    private String descripcion;
    private Date fecha; 
   

    public Reservacion() {
    }

    public Reservacion(String idCasa, String descripcion,Date fecha) {
        this.idCasa = idCasa;
        this.descripcion = descripcion;
        this.fecha = fecha;        
    }
    
    
}