package com.CrudGymFenix.models.facturacion.productos;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tipo_producto")
public class TipoProductoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tipo;
    private String nombre;
    @OneToMany(mappedBy = "fk_id_tipo_producto",cascade = CascadeType.ALL)
    private List<ProductoModel> productoModel;
}
