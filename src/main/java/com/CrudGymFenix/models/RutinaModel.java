package com.CrudGymFenix.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "rutinas")
public class RutinaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date fecha_inicio;
    private Date fecha_fin;
    @ManyToOne
    @JoinColumn(name = "fk_id_usuario")
    private UsuarioModel usuarioModel;
}
