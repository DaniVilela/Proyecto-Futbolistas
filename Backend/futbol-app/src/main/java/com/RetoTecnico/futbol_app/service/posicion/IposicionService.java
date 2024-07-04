package com.RetoTecnico.futbol_app.service.posicion;

import com.RetoTecnico.futbol_app.model.Posicion;

import java.util.List;

public interface IposicionService {
    List<Posicion> getAllPosiciones();
    Posicion getPosicion(Long id);
}
