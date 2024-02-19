package com.CrudGymFenix.models.facturacion;

import com.CrudGymFenix.models.productos.ProductoModel;
import jakarta.persistence.*;

@Entity
@Table(name = "contenido_factura")
@IdClass(IDContenidoFactura.class)
public class ContenidoFacturaModel {
    @Id
    @ManyToOne
    @JoinColumn(name = "fk_id_factura")
    private FacturaModel factura;
    @Id
    @ManyToOne
    @JoinColumn(name = "fk_id_producto")
    private ProductoModel producto;
    private int precio;
    private int subtotal;
}
