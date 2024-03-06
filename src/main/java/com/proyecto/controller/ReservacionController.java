
package com.proyecto.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/reservacion")
public class ReservacionController {
    
    @RequestMapping("/actividad")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "/reservacion/actividad";
    }
    
    @RequestMapping("/agendar")
    public String agregar(Model model) {
        model.addAttribute("attribute", "value");
        return "/reservacion/agendar";
    }
}
