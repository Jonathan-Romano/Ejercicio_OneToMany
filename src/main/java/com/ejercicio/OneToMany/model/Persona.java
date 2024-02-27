
package com.ejercicio.OneToMany.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long idPersona;
    private String nombre;
    private String apellido;
    private int edad;   
    
    @OneToMany
    private List<Mascota> listaMascotas;
    

    public Persona() {
    }

    public Persona(Long idPersona, String nombre, String apellido, int edad, List<Mascota> ListaMascotas) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.listaMascotas = ListaMascotas;
    }
    
   

}
