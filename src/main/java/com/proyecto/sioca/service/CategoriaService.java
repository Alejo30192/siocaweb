package com.proyecto.sioca.service;

import com.proyecto.sioca.entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import com.proyecto.sioca.repository.ICategoriaRepository;

import java.util.List;

public class CategoriaService {


    @Autowired
    private ICategoriaRepository iCategoriaRepository;

    public List<Categoria>getCategoria(){
        return iCategoriaRepository.findAll();
    }

    public Categoria saveCategoria(Categoria categoria){
        return iCategoriaRepository.save(categoria);
    }

    public Categoria getCategoria(Long id){
        return iCategoriaRepository.findById(id).get();
    }

    public Categoria updateCategoria(Categoria categoria){
        return iCategoriaRepository.save(categoria);
    }

    public void deleteCategoria(Long id){
        iCategoriaRepository.deleteById(id);
    }
}

