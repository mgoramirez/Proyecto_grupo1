/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.domain;

import jakarta.persistence.*;
import java.io.Serializable;
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
    private String rutaImagen;
    private boolean activo;

    public Reservacion() {
    }

    public Reservacion(String idCasa, String descripcion, String rutaImagen, boolean activo) {
        this.idCasa = idCasa;
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }
    
    
}
