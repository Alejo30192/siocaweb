package com.proyecto.sioca.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="detalleventa")
@Getter
@Setter
public class DetaVenta implements Serializable {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="idproducto", nullable = false)
    private Producto producto;

    @ManyToOne
    @JoinColumn(name="idventa", nullable = false)
    private Venta venta;

    @Column(nullable = false)
    private int cantidad;

    @Column(nullable = false)
    private int subtotal;

    @Column(nullable = false)
    private int descuento;

    @Column(name="preciounidad", nullable = false)
    private int unidad;
}
