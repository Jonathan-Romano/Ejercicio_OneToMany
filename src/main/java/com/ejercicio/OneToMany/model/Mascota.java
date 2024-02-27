
package com.ejercicio.OneToMany.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Mascota {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long idMascota;
    private String nombre;
    private String raza;
    private String color;

   /*Para una relacion Bidireccional
    @ManyToOne
    @JoinColumn(name = "idMasc")
    private Persona dueño;*/
    
    public Mascota() {
    }

    public Mascota(Long idMascota, String nombre, String raza, String color) {
        this.idMascota = idMascota;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
    }


  
}
