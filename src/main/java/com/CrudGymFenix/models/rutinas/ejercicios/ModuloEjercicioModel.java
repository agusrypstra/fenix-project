package com.CrudGymFenix.models.rutinas.ejercicios;

import com.CrudGymFenix.models.rutinas.DiaModel;
import jakarta.persistence.*;

@Entity
@Table(name = "modulos_ejercicio")
public class ModuloEjercicioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_modulo_ejercicio;
    @ManyToOne
    @JoinColumn(name = "fk_id_ejercicio")
    private EjercicioModel fk_id_ejercicio;
    @ManyToOne
    @JoinColumn(name = "fk_id_dia")
    private DiaModel fk_id_dia;
    private int series;
    private int repeticiones;
    private int descanso;
    private int peso;
    private String anotacion;
}