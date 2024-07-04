package com.RetoTecnico.futbol_app.controller;

import com.RetoTecnico.futbol_app.model.Futbolista;
import com.RetoTecnico.futbol_app.service.futbolista.IfutbolistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/")
public class FutbolistaController {

    @Autowired
    private IfutbolistaService ifutbolistaService;

    //endpoint para obtener todos los futbolistas
    @GetMapping(path = "/futbolista")
    public List<Futbolista> getAllfutbolistas(){
        return ifutbolistaService.getAllFutbolistas();
    }

    //endpoint para obtener 1 solo futbolista por su Id
    @GetMapping(path = "/futbolista/{id}")
    public ResponseEntity<Futbolista> getFutbolista(@PathVariable Long id){
        Futbolista futbolista = ifutbolistaService.getFutbolista(id);
        if(futbolista != null){
            return ResponseEntity.ok().body(futbolista);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

}
