package com.CrudGymFenix.models.facturacion;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "detalles_pago")
@IdClass(IDDetallesPago.class)
public class DetallesPagoModel {
    @Id
    @ManyToOne
    @JoinColumn(name = "fk_id_metodo_pago")
    private MetodoPagoModel metodo_pago;

    @Id
    @ManyToOne
    @JoinColumn(name = "fk_id_factura")
    private FacturaModel factura;
    private int monto_pagado;
    private Date fecha_pago;
}
