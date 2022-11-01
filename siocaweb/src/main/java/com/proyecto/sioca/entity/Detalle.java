package com.proyecto.sioca.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="detalleordencompra")
@Getter
@Setter

public class Detalle implements Serializable {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="cantidadProducto", nullable = false)
    private int cantidad;

    @ManyToOne
    @JoinColumn(name="idOrdenCompra", nullable = false)
    private Orden orden;

    @Column(name="precioUnidad", nullable = false)
    private int unidad;

    @Column(name="precioTotal", nullable = false)
    private int total;

    @Column(nullable = false)
    private String observaciones;

    @Column(nullable = false)
    private int descuento;

    @Column(name="nombreProducto", nullable = false)
    private String nombre;
}
