package com.proyecto.sioca.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="proveedor")
@Getter
@Setter
public class Proveedor implements Serializable {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String empresa;

    @Column(name="Direccion1",nullable = false)
    private String direccion;

    @Column(name="Direccion2",nullable = false)
    private String direccion2;

    @Column(name="Correo1",nullable = false)
    private String correo;

    @Column(name="Correo2", nullable = false)
    private String correo2;

    @Column(nullable = false)
    private int nit;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Categoria categoria;

    @Column(nullable = false)
    private String ciudad;


}
