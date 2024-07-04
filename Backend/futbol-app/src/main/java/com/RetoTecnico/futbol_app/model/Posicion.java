package com.RetoTecnico.futbol_app.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "posicion")
public class Posicion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(unique = true)
    private String nombre_posicion;
}
