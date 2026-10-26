package com.clinica.clinica.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name= "citas")


public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_horaa", nullable = false)
    private LocalDate fechaHora;

    @Column(nullable = false, length = 20)
    private String estado;

    @Many
}
