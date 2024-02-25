package com.CrudGymFenix.models;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "usuarios")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_usuario;
    @Column(name = "dni")
    private int dni;
    private byte[] password;
    private String nombre;
    private String apellidp;
    private String sexo;
    private String calle;
    private int nro_calle;
    private int piso;
    private String dpto;
    private Date nacimiento;
    private int altura;
    private double peso;
    private Date fecha_alta_usuario;
    private int telefono;
    private String observaciones;
    private String objetivo;
    private String email;
    @OneToOne
    @JoinColumn(name = "fk_id_rol")
    private RolModel rolModel;

}
