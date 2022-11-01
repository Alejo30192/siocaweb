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
    @JoinColumn(name="tipo")
    private Categoria categoria;

    @Column
    private String talla;

    @Column(name="nombreProducto")
    private String nombre;

    @Column
    private String referencia;

    @Column
    private int String;

    @Column(name="precioUnidad")
    private String unidad;

    @ManyToOne
    @JoinColumn(name="idProveedor")
    private Proveedor proveedor;

    @Column
    private String fecha;

    @Column(name="precioTotal")
    private String total;

}
