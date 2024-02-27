
package com.ejercicio.OneToMany.controller;

import com.ejercicio.OneToMany.model.Persona;
import com.ejercicio.OneToMany.service.iPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class personaController {
    
    @Autowired
    private iPersonaService perServi;
    
    @GetMapping ("/personas/traer")
    public List<Persona> getListaPersonas(){
        return perServi.getPersonas();
    }
    
    @GetMapping ("/personas/{id}")
    public Persona getPersona(@PathVariable Long id){
        return perServi.findPersona(id);
    }
    
    @PostMapping ("/personas/crear")
    public String savePersona(@RequestBody Persona perso){
        return perServi.savePersona(perso);
    }
    
    @DeleteMapping ("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        return perServi.deletePersona(id);
    }
    
    @PutMapping ("/personas/editar")
    public Persona ediPersona(@RequestBody Persona perso){
        return perServi.editPersona(perso);
    }
    
}
