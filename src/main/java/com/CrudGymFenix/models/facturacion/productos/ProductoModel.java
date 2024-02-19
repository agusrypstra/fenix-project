package com.CrudGymFenix.models.facturacion.productos;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class ProductoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_producto;
    private String nombre;
    private double precio;
    private int stock;
    @ManyToOne
    @JoinColumn(name = "fk_id_tipo_producto")
    private TipoProductoModel tipo;
}
