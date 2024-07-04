package com.RetoTecnico.futbol_app.repository;

import com.RetoTecnico.futbol_app.model.Futbolista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FutbolistaRepository extends JpaRepository<Futbolista,Long> {
}
