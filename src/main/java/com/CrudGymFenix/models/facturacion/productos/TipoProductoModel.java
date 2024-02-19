package com.CrudGymFenix.models.facturacion.productos;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "tipo_producto")
public class TipoProductoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tipo;
    private String nombre;
    @OneToMany(mappedBy = "tipo_producto",cascade = CascadeType.ALL)
    private ArrayList<ProductoModel> productoModel;
}
