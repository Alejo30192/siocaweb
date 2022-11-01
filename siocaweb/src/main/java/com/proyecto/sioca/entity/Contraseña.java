package com.proyecto.sioca.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="recuperar_contraseña")
@Getter
@Setter

public class Contraseña implements Serializable {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="id_usuario", nullable = false)
    private User usuario;

    @Column(nullable = false)
    private String codigo;
}
