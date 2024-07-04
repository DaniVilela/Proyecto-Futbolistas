package com.RetoTecnico.futbol_app.service.futbolista;

import com.RetoTecnico.futbol_app.model.Futbolista;

import java.util.List;

public interface IfutbolistaService {
    List<Futbolista> getAllFutbolistas();
    Futbolista getFutbolista(Long id);
}
