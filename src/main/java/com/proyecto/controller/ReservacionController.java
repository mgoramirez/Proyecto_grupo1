package com.proyecto.controller;

import com.proyecto.domain.Reservacion;
import com.proyecto.service.ReservacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reservacion")
public class ReservacionController {

    @Autowired
    private ReservacionService reservacionService;

    @RequestMapping("/actividad")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "/reservacion/actividad";
    }

    @RequestMapping("/agendarCasa")
    public String agregar(Model model) {
        model.addAttribute("attribute", "value");
        return "/reservacion/agendarCasa";
    }

    //Genera una lista de las reservaciones
    @GetMapping("/listado")
    public String listado(Model model) {
        List<Reservacion> lista = reservacionService.buscarPorId(); // Genera la lista
        model.addAttribute("categorias", lista);      //Lista de las reservaciones 
        model.addAttribute("totalCategorias", lista.size());  //Cantidad de reservaciones
        return "/reservacion/listado";
    }

    //crea una reservacion
    @PostMapping("/guardar")
    public String reservacionGuardar(Reservacion reservacion) {
        reservacionService.save(reservacion);
        return "redirect:/reservacion/listado";
    }

    //borra una reservacion
    @GetMapping("/eliminar")
    public String reservacionEliminar(Reservacion reservacion) {
        reservacionService.delete(reservacion);
        return "redirect:/reservacion/listado";
    }

    //falta la de modificar
    @GetMapping("/modificar{idReserva}")
    public String reservacionModificar(Reservacion reservacion, Model model) {
        reservacion = reservacionService.getReservacion(reservacion);
        model.addAttribute("reservacion", reservacion);
        return "/reservacion/modificar";
    }

}
