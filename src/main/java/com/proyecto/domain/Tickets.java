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
@Table(name="tickets")
public class Tickets  implements Serializable{
    
    private static final long serialVersionUID =1L;  
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ticket")
    private Long idTicket; // Hibernate transforma en id_categoria
    private String idUsuario;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    public Tickets() {
    }

    public Tickets(String idUsuario, String descripcion, String rutaImagen, boolean activo) {
        this.idUsuario = idUsuario;
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }
    
}
