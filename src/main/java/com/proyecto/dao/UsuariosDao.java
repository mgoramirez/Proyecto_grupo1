/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.dao;

import com.proyecto.domain.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuariosDao extends JpaRepository<Usuarios,Long>{
    
}
