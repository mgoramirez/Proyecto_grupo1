/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author FMP
 */
public class Controller {
    
    
    @GetMapping("/templates.paginaInicio")
    public String inicio() {
        return "inicio";
    }
    
}
