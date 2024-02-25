package com.CrudGymFenix.models.facturacion;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "detalles_pago")
@IdClass(IDDetallesPago.class)
public class DetallesPagoModel {
    @Id
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_factura")
    private FacturaModel fk_id_factura;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_id_metodo_pago")
    private MetodoPagoModel fk_id_metodo_pago;
    private int monto_pagado;
    private Date fecha_pago;
}
