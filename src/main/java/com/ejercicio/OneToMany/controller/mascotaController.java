
package com.ejercicio.OneToMany.controller;

import com.ejercicio.OneToMany.model.Mascota;
import com.ejercicio.OneToMany.service.iMascotaService;
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
public class mascotaController {
    @Autowired
    private iMascotaService mascServi;
    
    @GetMapping ("/mascota/lista")
    public List<Mascota> GetListaMascota(){
        return mascServi.getMascotas();
    }
    
    @PostMapping ("/mascota/{id}")
    public Mascota getMascota(@PathVariable Long id){
        return mascServi.findMascota(id);
    }
    
    @PostMapping ("/mascota/crear")
    public String saveMascota(@RequestBody Mascota mascota){
        return mascServi.saveMascota(mascota);
    }
    
    @DeleteMapping ("/mascota/borrar/{id}")
    public String deleteMascota(@PathVariable Long id){
        return mascServi.deleteMascota(id);
    }
    
    @PutMapping ("/mascota/editar")
    public Mascota editMascota(@RequestBody Mascota mascota){
        return mascServi.editMascota(mascota);
    }
    
}
