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

    @Column
    private String nombre;

    @Column
    private String empresa;

    @Column(name="Direccion1")
    private String direccion;

    @Column(name="Direccion2")
    private String direccion2;

    @Column(name="Correo1")
    private String correo;

    @Column(name="Correo2")
    private String correo2;

    @Column
    private int nit;

    @ManyToOne
    @JoinColumn
    private Categoria categoria;

    @Column
    private String ciudad;


}
