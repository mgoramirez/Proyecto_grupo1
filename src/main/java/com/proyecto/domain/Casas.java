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
@Table(name="casas")
public class Casas implements Serializable{
    
    private static final long serialVersionUID =1L;  
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_casa")
    private Long idCasa; // Hibernate transforma en id_categoria
    private String nombreCasa;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    public Casas() {
    }

    public Casas(String nombreCasa, String descripcion, String rutaImagen, boolean activo) {
        this.nombreCasa = nombreCasa;
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }
    
    
}
