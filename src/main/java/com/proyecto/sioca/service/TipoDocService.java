package com.proyecto.sioca.service;

import com.proyecto.sioca.entity.TipoDocumento;
import com.proyecto.sioca.repository.ITipoDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoDocService {
    @Autowired
    private ITipoDocumentoRepository iTipoDocumentoRepository;

    public List<TipoDocumento> getTipos(){
        return iTipoDocumentoRepository.findAll();
    }

    public TipoDocumento saveTipo(TipoDocumento tipoDocumento){
        return iTipoDocumentoRepository.save(tipoDocumento);
    }

    public TipoDocumento getTipo(Long id){
        return iTipoDocumentoRepository.findById(id).get();
    }

    public TipoDocumento updateUser(TipoDocumento tipoDocumento){
        return iTipoDocumentoRepository.save(tipoDocumento);
    }

    public void deleteTipo (Long id){
        iTipoDocumentoRepository.deleteById(id);
    }
}
