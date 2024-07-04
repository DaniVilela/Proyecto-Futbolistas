package com.RetoTecnico.futbol_app.service.futbolista;

import com.RetoTecnico.futbol_app.model.Futbolista;
import com.RetoTecnico.futbol_app.repository.FutbolistaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class futbolistaServiceImp implements IfutbolistaService{
    @Autowired
    private FutbolistaRepository futbolistaRepository;

    @Override
    public List<Futbolista> getAllFutbolistas() {
       return futbolistaRepository.findAll();
    }

    @Override
    public Futbolista getFutbolista(Long id) {
        Optional<Futbolista> optionalFutbolista = futbolistaRepository.findById(id);
        if (optionalFutbolista.isPresent()) {
            return optionalFutbolista.get();
        } else {
            throw new EntityNotFoundException("Futbolista no encontrado");
        }
    }

}
