package com.proyecto.sioca.service;

import com.proyecto.sioca.entity.Rol;
import com.proyecto.sioca.repository.IRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolService {
    @Autowired
    private IRolRepository iRolRepository;

    public List<Rol> getRols(){
        return iRolRepository.findAll();
    }

    public Rol getRol(Long id){
        return iRolRepository.findById(id).get();
    }


}
