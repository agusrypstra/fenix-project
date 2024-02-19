package com.CrudGymFenix.models.rutinas.ejercicios;

import com.CrudGymFenix.models.rutinas.DiaModel;
import jakarta.persistence.*;
import org.springframework.web.service.annotation.GetExchange;

@Entity
@Table(name = "modulo_ejercicio")
public class ModuloEjercicioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private int series;
    private int repeticiones;
    private int descanso;
    private int peso;
    private String anotacion;
    @ManyToOne
    @JoinColumn(name = "fk_id_ejercicio")
    private EjercicioModel ejercicio;
    @ManyToOne
    @JoinColumn(name = "fk_id_dia")
    private DiaModel dia;

}
