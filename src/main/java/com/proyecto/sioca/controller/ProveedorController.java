package com.proyecto.sioca.controller;

import com.proyecto.sioca.entity.Proveedor;
import com.proyecto.sioca.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@RestController
@RequestMapping("api")
public class ProveedorController {

    @Autowired
    private ProveedorService proveedorService;
    @GetMapping("/proveedores")
    public List<Proveedor> getProveedor(){
        return proveedorService.getProveedor();
    }

    @PostMapping("/proveedores/new")
    public Proveedor saveProveedor(@RequestBody Proveedor proveedor){
        return proveedorService.saveProveedor(proveedor);
    }

    @GetMapping("/proveedores/{id}")
    public Proveedor getProveedor(@PathVariable Long id){
        try {
            return proveedorService.getProveedor(id);
        }catch (Exception ex){
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Proveedor Not Found", ex);
        }
    }

    @PutMapping("/proveedores/update/{id}")
    public Proveedor updateProveedor(@PathVariable Long id, @RequestBody Proveedor proveedor){
        proveedor.setId(id);
        return proveedorService.updateProveedor(proveedor);
    }

    @DeleteMapping("/proveedores/delete/{id}")
    public List<Proveedor> deleteProveedor(@PathVariable Long id){
        proveedorService.deleteProveedor(id);
        return getProveedor();
    }
}
