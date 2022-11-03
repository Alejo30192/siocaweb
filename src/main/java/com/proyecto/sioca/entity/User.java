package com.proyecto.sioca.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="usuario")
@Getter
@Setter

public class User implements Serializable {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="tipodocumento_idtipodocumento", nullable = false)
    private TipoDocumento tipo;

    @Column(nullable = false)
    private String numero;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = false)
    private String correo;

    @Column(nullable = false)
    private String telefono;

    @Column(nullable = false)
    private String direccion;

    @Column(nullable = false)
    private String fecha;

    @ManyToOne
    @JoinColumn(name="Id_Rol", nullable = false)
    private Rol rol;

    @Column(nullable = false)
    private String contraseña;

    @Column(nullable = false)
    private String confirmar;



}
