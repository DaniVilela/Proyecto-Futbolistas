package com.RetoTecnico.futbol_app.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;


@Entity
@Data
@Table(name = "futbolista")
public class Futbolista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String nombres;

    @Column
    private String apellidos;

    @Column
    private LocalDate fecha_nacimiento;

    @Column
    private String caracteristicas;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "posicion_id", nullable = false)
    private Posicion posicion;
}
