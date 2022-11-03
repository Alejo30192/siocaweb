package com.proyecto.sioca.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="ordencompra")
@Getter
@Setter

public class Orden implements Serializable {

    @Column(nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String fecha;

    @ManyToOne
    @JoinColumn(name="id_proveedor", nullable = false)
    private Proveedor proveedor;

    @Column(nullable = false)
    private String estado;

    @Column(name="valortotal", nullable = false)
    private int valor;

}
