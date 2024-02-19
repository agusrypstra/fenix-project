package com.CrudGymFenix.models;

import com.CrudGymFenix.models.facturacion.FacturaModel;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name = "usuarios")
public class UsuarioModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int dni;
    private String password;
    private String nombre;
    private String apellidp;
    private char sexo;
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
    private int registrado_por;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "roles",referencedColumnName = "id_rol")
    private RolModel rolModel;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private ArrayList<RutinaModel> rutinas;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private ArrayList<FacturaModel> facturas;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidp() {
        return apellidp;
    }

    public void setApellidp(String apellidp) {
        this.apellidp = apellidp;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNro_calle() {
        return nro_calle;
    }

    public void setNro_calle(int nro_calle) {
        this.nro_calle = nro_calle;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRegistrado_por() {
        return registrado_por;
    }

    public void setRegistrado_por(int registrado_por) {
        this.registrado_por = registrado_por;
    }


}
