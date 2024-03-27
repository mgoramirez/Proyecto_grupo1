/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyecto.service;

import com.proyecto.domain.Casas;


public interface CasasService {
   
   // Se obtiene un Categoria, a partir del id de un categoria
    public Casas getCasa(Casas casa);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Casas casa);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Casas casa);
    
   /* public List<Casas> buscarPorDescripcion(String descripcion);*/
}
