package com.proyecto.sioca.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="venta")
@Getter
@Setter
public class Venta implements Serializable {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="valortotal" , nullable = false)
    private Long total;

    @Column(nullable = false)
    private String estado;

    @Column(name="fechaventa", nullable = false)
    private String fecha;
}
