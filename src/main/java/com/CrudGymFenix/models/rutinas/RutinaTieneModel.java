package com.CrudGymFenix.models.rutinas;

import jakarta.persistence.*;

@Entity
@IdClass(IDRutinaTiene.class)
@Table(name = "rutina_tiene")
public class RutinaTieneModel {
    @Id
    @ManyToOne
    @JoinColumn(name = "fk_id_dia")
    private DiaModel dia;
    @Id
    @ManyToOne
    @JoinColumn(name = "fk_id_rutina")
    private RutinaModel rutina;
}
