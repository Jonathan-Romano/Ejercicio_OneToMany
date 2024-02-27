
package com.ejercicio.OneToMany.repository;

import com.ejercicio.OneToMany.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iMascotaRepository extends JpaRepository<Mascota, Long> {
    
}
