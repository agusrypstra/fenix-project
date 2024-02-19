package com.CrudGymFenix.models;

import jakarta.persistence.*;
import org.hibernate.engine.internal.Cascade;

@Entity
@Table(name = "roles")
public class RolModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuarios",referencedColumnName = "fk_id_rol")
    private int id;
    private String nombre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public RolModel(String nombre) {
        this.nombre = nombre;
    }
}
