package com.CrudGymFenix.models.rutinas.ejercicios;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "ejercicios")
public class EjercicioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ejercicio;
    private String nombre;
    private String url;
    @OneToMany(mappedBy = "ejercicios",cascade = CascadeType.ALL)
    private ArrayList<ModuloEjercicioModel> moduloEjercicios;
}
