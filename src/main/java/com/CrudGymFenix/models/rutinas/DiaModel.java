package com.CrudGymFenix.models.rutinas;

import jakarta.persistence.*;

@Entity
@Table(name = "dias")
public class DiaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_dia;
    private String nombre;
}
