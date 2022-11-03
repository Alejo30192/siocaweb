package com.proyecto.sioca.service;

import com.proyecto.sioca.entity.Producto;
import com.proyecto.sioca.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private IProductoRepository iProductoRepository;

    public List<Producto>getProductos(){
        return iProductoRepository.findAll();
    }

    public Producto saveProducto(Producto producto){
        return iProductoRepository.save(producto);
    }

    public Producto getProducto(Long id){
        return iProductoRepository.findById(id).get();
    }

    public Producto updateProducto(Producto producto){
        return iProductoRepository.save(producto);
    }

    public void deleteProducto(Long id){
        iProductoRepository.deleteById(id);
    }
}
