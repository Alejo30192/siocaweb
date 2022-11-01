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
    @JoinColumn(name="idproducto")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name="idventa")
    private Venta venta;

    @Column
    private int cantidad;

    @Column
    private int subtotal;

    @Column
    private int descuento;

    @Column(name="preciounidad")
    private int unidad;
}
