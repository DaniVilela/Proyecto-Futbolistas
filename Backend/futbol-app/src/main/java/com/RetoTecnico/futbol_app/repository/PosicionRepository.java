package com.RetoTecnico.futbol_app.repository;

import com.RetoTecnico.futbol_app.model.Posicion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PosicionRepository extends JpaRepository<Posicion,Long> {
}
