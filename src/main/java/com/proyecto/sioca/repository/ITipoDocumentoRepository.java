package com.proyecto.sioca.repository;

import com.proyecto.sioca.entity.TipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITipoDocumentoRepository extends JpaRepository<TipoDocumento, Long> {
}
