package com.CrudGymFenix.models.rutinas;

import com.CrudGymFenix.models.UsuarioModel;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "rutinas")
public class RutinaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_rutina;
    private Date fecha_inicio;
    private Date fecha_fin;
    @ManyToOne
    @JoinColumn(name = "fk_id_usuario")
    private UsuarioModel usuarioModel;
}
