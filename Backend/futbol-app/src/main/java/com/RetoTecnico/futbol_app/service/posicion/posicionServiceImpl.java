package com.RetoTecnico.futbol_app.service.posicion;

import com.RetoTecnico.futbol_app.model.Posicion;
import com.RetoTecnico.futbol_app.repository.PosicionRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class posicionServiceImpl implements IposicionService {
    @Autowired
    private PosicionRepository posicionRepository;

    @Override
    public List<Posicion> getAllPosiciones() {
        return posicionRepository.findAll();
    }

    @Override
    public Posicion getPosicion(Long id) {
        Optional<Posicion> optionalPosicion = posicionRepository.findById(id);
        if (optionalPosicion.isPresent()) {
            return optionalPosicion.get();
        } else {
            throw new EntityNotFoundException("Futbolista no encontrado");
        }
    }
}
