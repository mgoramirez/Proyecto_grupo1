
package com.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/casas")
public class CasaController {
    
    @RequestMapping("/crudCasas")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "/casas/crudCasas";
    }
    
    @RequestMapping("/consulta")
    public String consulta(Model model) {
        model.addAttribute("attribute", "value");
        return "/casas/consulta";
    }
    @RequestMapping("/actualizar")
    public String actualizar(Model model) {
        model.addAttribute("attribute", "value");
        return "/casas/actualizar";
    }
    
}
