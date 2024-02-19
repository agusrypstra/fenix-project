package com.CrudGymFenix.models.rutinas;

import com.CrudGymFenix.models.rutinas.ejercicios.ModuloEjercicioModel;
import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "dias")
public class DiaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_dia;
    private String nombre;
    @OneToMany(mappedBy = "dia",cascade = CascadeType.ALL)
    private ArrayList<ModuloEjercicioModel> moduloEjercicios;
}
