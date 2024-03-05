
package com.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/tickets")
public class SystemTicketsController {
    
    @RequestMapping("/crudTickets")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "/tickets/crudTickets";
    }
    
    @RequestMapping("/consulta")
    public String consulta(Model model) {
        model.addAttribute("attribute", "value");
        return "/tickets/consulta";
    }
    @RequestMapping("/actualizar")
    public String actualizar(Model model) {
        model.addAttribute("attribute", "value");
        return "/tickets/actualizar";
    }
    
}
