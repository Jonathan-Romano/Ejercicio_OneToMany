package com.ejercicio.OneToMany.service;

import com.ejercicio.OneToMany.model.Persona;
import java.util.List;


public interface iPersonaService {
    public List<Persona> getPersonas();
    public Persona findPersona(Long id);
    public String savePersona(Persona persona);
    public String deletePersona(Long id);
    
    public Persona editPersona(Persona persona);
}
