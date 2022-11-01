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

    @Column(name="cantidadProducto")
    private int cantidad;

    @ManyToOne
    @JoinColumn(name="idOrdenCompra")
    private Orden orden;

    @Column(name="precioUnidad")
    private int unidad;

    @Column(name="precioTotal")
    private int total;

    @Column
    private String observaciones;

    @Column
    private int descuento;

    @Column(name="nombreProducto")
    private String nombre;
}
