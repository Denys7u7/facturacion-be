package com.sisa.facturacion.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sisa.facturacion.models.TProducto;
import com.sisa.facturacion.services.TProductoService;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin
@RequestMapping("producto")
public class TProductoController {

    private final TProductoService productoService;

    TProductoController(TProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("")
    public List<TProducto> getAllProductos() {
        return productoService.getAllProductos();
    }

    @PostMapping("/precio")
    public Optional<TProducto> postMethodName(@RequestBody TProducto entity) {
        productoService.actualizarPrecio(entity.getPrecio(), entity.getId());
        return productoService.getProductoById(entity.getId());
    }

    @PostMapping("")
    public TProducto saveProducto(@RequestBody TProducto entity) {
        return productoService.saveProducto(entity);
    }

    @PutMapping("")
    public TProducto putMethodName(@RequestBody TProducto entity) {
        return productoService.updateProducto(entity);
    }

    @DeleteMapping("/{id}")
    public void deleteMethodName(@PathVariable Integer id) {
        productoService.deleteProductoById(id);
    }

}
