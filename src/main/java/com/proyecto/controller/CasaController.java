
package com.proyecto.controller;

import com.proyecto.domain.Casas;
import com.proyecto.service.CasasService;
import com.proyecto.service.impl.FirebaseStorageServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@Controller
@RequestMapping("/casas")
public class CasaController {
    
    @Autowired
    CasasService casasService;
    
    /*Esta parte agrega casas*/
    @Autowired
    private FirebaseStorageServiceImpl firebaseStorageService;
    
    @RequestMapping("/crudCasas")
    public String agregar(Model model) {
        model.addAttribute("attribute", "value");
        return "/casas/crudCasas";
    }
    
    @PostMapping("/crudCasas/agregar")
    public String casasGuardar(Casas casa,
        @RequestParam("imagenFile") MultipartFile imagenFile) {        
        if (!imagenFile.isEmpty()) {
            casasService.save(casa);
            casa.setRutaImagen(
                    firebaseStorageService.cargaImagen(
                            imagenFile, 
                            "casas", 
                            casa.getIdCasa()));
        }
        casasService.save(casa);
        return "redirect:/administrador/registroAdmin";
    }
    /*-----------------------------------------------------------------------------------------------------*/
   /*Esta parte realiza la consulta y elimina casas*/
   /* @RequestMapping("/consulta")*/
    
    @RequestMapping("/consulta")
    public String consulta(Model model) {
        return "/casas/consulta";
    }

    @PostMapping("/consulta/casa")
    public String consulta(Casas casa,Model model) {
        casa=casasService.getCasa(casa);
        model.addAttribute("casa", casa);
        return "/casas/consulta";
    }
   
    /*******************************************************/
    /*****   Modificar casa
     * @param model ***/
    
    @RequestMapping("/actualizar")
    public String actualizar(Model model) {
        //model.addAttribute("casa", new Casas());
        return "/casas/actualizar";
    }
    
    @PostMapping("/modificar")
    public String modificar(Casas casa, Model model) {
        casa = casasService.getCasa(casa);
        log.info(casa.getNombreCasa());
        model.addAttribute("casa", casa);
        return "/casas/actualizar";
    }
    
    @PostMapping("/modificar/{idCasa}")
    public String Modificar(Casas casa,
        @RequestParam("imagenFile") MultipartFile imagenFile) {        
        if (!imagenFile.isEmpty()) {
            casasService.save(casa);
            casa.setRutaImagen(
                    firebaseStorageService.cargaImagen(
                            imagenFile, 
                            "casas", 
                            casa.getIdCasa()));
        }
        casasService.save(casa);
        return "redirect:/casas/actualizar";
    }
    
  
    /*  *****      Eliminar   *** */
    
    @GetMapping("/eliminar/{idCasa}")
    public String casaEliminar(Casas casa) {
        casasService.delete(casa);
        return "redirect:/administrador/registroAdmin";
    }


}
