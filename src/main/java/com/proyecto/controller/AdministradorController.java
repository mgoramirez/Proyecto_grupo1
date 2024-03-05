
package com.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/administrador")
public class AdministradorController {
    
    @RequestMapping("/registroAdmin")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "/administrador/registroAdmin";
    }
    
}