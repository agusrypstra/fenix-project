package com.CrudGymFenix.models.rutinas.ejercicios;

import jakarta.persistence.*;

@Entity
@Table(name = "grupos_musculares")
public class GruposMuscularesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
}
