
package com.ejercicio.OneToMany.service;

import com.ejercicio.OneToMany.model.Mascota;
import java.util.List;


public interface iMascotaService {
    public List<Mascota> getMascotas();
    public Mascota findMascota(Long id);
    public String saveMascota(Mascota mascota);
    public String deleteMascota(Long id);
    
    public Mascota editMascota(Mascota mascota);

}
