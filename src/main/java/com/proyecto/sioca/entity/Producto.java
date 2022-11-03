package com.proyecto.sioca.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="producto")
@Getter
@Setter
public class Producto implements Serializable {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="tipo", nullable = false)
    private Categoria categoria;

    @Column(nullable = false)
    private String talla;

    @Column(name="nombreProducto", nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String referencia;

    @Column(nullable = false)
    private int cantidad;

    @Column(name="precioUnidad", nullable = false)
    private String unidad;

    @ManyToOne
    @JoinColumn(name="idProveedor", nullable = false)
    private Proveedor proveedor;

    @Column(nullable = false)
    private String fecha;

    @Column(name="precioTotal", nullable = false)
    private String total;

}
