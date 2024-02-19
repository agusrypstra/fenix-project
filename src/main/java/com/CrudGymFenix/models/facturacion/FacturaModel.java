package com.CrudGymFenix.models.facturacion;

import com.CrudGymFenix.models.UsuarioModel;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "facturas")
public class FacturaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_factura;
    @ManyToOne
    @JoinColumn(name = "fk_id_usuario")
    private UsuarioModel usuarioModel;
    private Date fecha;
}
