/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Entity

@Data
@Table(name="usuarios")
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;    
    @NotEmpty
    @Column(name = "username")
    private String username;    
    @NotEmpty
    @Column(name = "password")
    private String password;
    @Column(name = "nombre")
        private String nombre;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "correo")
    private String correo; 
    @Column(name = "activo")
    private boolean activo;
    
    @OneToMany
    @JoinColumn(name="id_usuario")
    private List<Rol> roles;
}
