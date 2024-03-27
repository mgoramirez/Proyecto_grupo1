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
@Table(name="usuarios")
public class Usuarios implements Serializable{
    
    private static final long serialVersionUID =1L;  
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario; // Hibernate transforma en id_categoria
    private String nombre;
    private String apellidos;
    private String correo;
    private String password;
    private boolean activo;

    public Usuarios() {
    }

    public Usuarios(String nombre, String apellidos, String correo, String password, boolean activo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.password = password;
        this.activo = activo;
    }
    
    
}
