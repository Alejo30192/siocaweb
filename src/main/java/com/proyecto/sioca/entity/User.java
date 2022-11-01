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
    @JoinColumn(name="tipodocumento_idtipodocumento")
    private TipoDocumento tipo;

    @Column
    private String numero;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private String correo;

    @Column
    private String telefono;

    @Column
    private String direccion;

    @Column
    private String fecha;

    @ManyToOne
    @JoinColumn(name="Id_Rol")
    private Rol rol;

    @Column
    private String contraseña;

    @Column
    private String confirmar;



}
