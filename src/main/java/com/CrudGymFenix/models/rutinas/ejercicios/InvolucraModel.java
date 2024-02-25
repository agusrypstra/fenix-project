package com.CrudGymFenix.models.rutinas.ejercicios;

import jakarta.persistence.*;

@Entity
@IdClass(IDInvolucra.class)
@Table(name = "involucra")
public class InvolucraModel {
    @Id
    @ManyToOne
    @JoinColumn(name = "fk_id_ejercicio")
    private EjercicioModel fk_id_ejercicio;
    @Id
    @ManyToOne
    @JoinColumn(name = "fk_id_grupo_muscular")
    private GruposMuscularesModel fk_id_grupo_muscular;
}
