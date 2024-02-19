package com.CrudGymFenix.models.facturacion;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "metodos_pago")
public class MetodoPagoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_metodo;
    private String nombre;
    private String descripcion;
    @OneToMany(mappedBy = "fk_id_metodo_pago", cascade = CascadeType.ALL)
    private ArrayList<DetallesPagoModel> detalles;


}
