package com.proyecto.sioca.controller;

import com.proyecto.sioca.entity.Categoria;
import com.proyecto.sioca.entity.Producto;
import com.proyecto.sioca.service.CategoriaService;
import com.proyecto.sioca.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/productos")
    public List<Categoria> getCategoria(){
        return categoriaService.getCategoria();
    }

    @PostMapping("/productos/new")
    public Producto saveProducto(@RequestBody Producto producto){
        return productoService.saveProducto(producto);
    }

    @GetMapping("/productos/{id}")
    public Producto getProducto(@PathVariable Long id){
        try{
            return productoService.getProducto(id);
        }catch (Exception ex){
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Product Not Found", ex  );
        }
    }

    @PutMapping("/productos/update/{id}")
    public Producto updateProducto(@PathVariable Long id, @RequestBody Producto producto){
        producto.setId(id);
        return productoService.updateProducto(producto);
    }

    @DeleteMapping("/productos/delete/{id}")
    public List<Producto> deleteProducto(@PathVariable Long id){
        productoService.deleteProducto(id);
        return getProductos();
    }

    }

