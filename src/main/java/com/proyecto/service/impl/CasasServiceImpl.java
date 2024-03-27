/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.service.impl;

import com.proyecto.dao.CasasDao;
import com.proyecto.domain.Casas;
import com.proyecto.service.CasasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CasasServiceImpl  implements CasasService{
    
    @Autowired
    private CasasDao casasDao;
    
    @Override
    @Transactional(readOnly = true)
    public Casas getCasa(Casas casa) {
        return casasDao.findById(casa.getIdCasa()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Casas casa) {
        casasDao.save(casa);
    }

    @Override
    @Transactional
    public void delete(Casas casa) {
        casasDao.delete(casa);
    }
/*
    @Override
    @Transactional(readOnly = true)
    public List<Casas> buscarPorDescripcion(String descripcion) {
        return casasDao.findByDescripcion(descripcion); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/


}
