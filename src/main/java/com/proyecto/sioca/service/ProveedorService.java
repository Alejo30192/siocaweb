package com.proyecto.sioca.service;

import com.proyecto.sioca.entity.Proveedor;
import com.proyecto.sioca.repository.IProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProveedorService {

    @Autowired
    private IProveedorRepository iProveedorRepository;

    public List<Proveedor> getProveedor(){
        return iProveedorRepository.findAll();
    }

    public Proveedor saveProveedor(Proveedor proveedor){
        return iProveedorRepository.save(proveedor);
    }

    public Proveedor getProveedor(Long id){
        return iProveedorRepository.findById(id).get();
    }

    public Proveedor updateProveedor(Proveedor proveedor){
        return iProveedorRepository.save(proveedor);
    }

    public void deleteProveedor(Long id){
        iProveedorRepository.deleteById(id);
    }
}
