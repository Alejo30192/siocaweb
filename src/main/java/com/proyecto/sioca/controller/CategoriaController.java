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

    @GetMapping("/categorias")
    public List<Categoria> getCategoria(){
        return categoriaService.getCategoria();
    }

    @PostMapping("/categorias/new")
    public Producto saveCategoria(@RequestBody Categoria categoria){
        return categoriaService.saveCategoria(categoria);
    }

    @GetMapping("/categorias/{id}")
    public Categoria getCategoria(@PathVariable Long id){
        try{
            return categoriaService.getCategoria(id);
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

