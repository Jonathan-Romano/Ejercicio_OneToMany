package com.ejercicio.OneToMany.service;
import com.ejercicio.OneToMany.model.Mascota;
import com.ejercicio.OneToMany.repository.iMascotaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class mascotaService implements iMascotaService {

    @Autowired
    private iMascotaRepository mascRepo;
    
    
    @Override
    public List<Mascota> getMascotas() {
        return mascRepo.findAll();
    }

    @Override
    public Mascota findMascota(Long id) {
        return mascRepo.findById(id).orElse(null);
    }

    @Override
    public String saveMascota(Mascota mascota) {
        mascRepo.save(mascota);
        return "Mascota creada correctamente";
    }

    @Override
    public String deleteMascota(Long id) {
        mascRepo.deleteById(id);
        return "Mascota borrada correctamente";
    }

    @Override
    public Mascota editMascota(Mascota mascota) {
        this.saveMascota(mascota);
        return this.findMascota(mascota.getIdMascota());
    }
    
}
