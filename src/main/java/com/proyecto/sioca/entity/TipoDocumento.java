package com.proyecto.sioca.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="tipodocumento")
@Getter
@Setter

public class TipoDocumento implements Serializable {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String tipo;
}
