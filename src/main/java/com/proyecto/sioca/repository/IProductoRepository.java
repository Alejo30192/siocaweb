package com.proyecto.sioca.repository;

import com.proyecto.sioca.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoRepository extends JpaRepository<Producto, Long> {
}
