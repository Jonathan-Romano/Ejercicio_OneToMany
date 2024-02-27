
package com.ejercicio.OneToMany.service;

import com.ejercicio.OneToMany.model.Persona;
import com.ejercicio.OneToMany.repository.iPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class personaService implements iPersonaService {

    @Autowired
    private iPersonaRepository persoRepo;
    
    @Override
    public List<Persona> getPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public Persona findPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }

    @Override
    public String savePersona(Persona persona) {
        persoRepo.save(persona);
        return "Persona creada correctamente";
    }

    @Override
    public String deletePersona(Long id) {
        persoRepo.deleteById(id);
        return "Persona borrada correctamente";
    }

    @Override
    public Persona editPersona(Persona persona) {
        this.savePersona(persona);
        return this.findPersona(persona.getIdPersona());
    }
    
}
