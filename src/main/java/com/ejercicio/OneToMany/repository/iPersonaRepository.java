
package com.ejercicio.OneToMany.repository;
import com.ejercicio.OneToMany.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iPersonaRepository extends JpaRepository<Persona, Long>{
    
}
