package com.sisa.facturacion.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sisa.facturacion.models.TOrdenCompra;
import com.sisa.facturacion.services.TOrdenCompraService;

@RestController
@RequestMapping("ordenCompra")
@CrossOrigin
public class TOrdenCompraController {

    private final TOrdenCompraService ordenCompraService;

    TOrdenCompraController(TOrdenCompraService ordenCompraService) {
        this.ordenCompraService = ordenCompraService;
    }

    @GetMapping("")
    public List<TOrdenCompra> getAllOrdenCompra() {
        return ordenCompraService.getAllOrdenCompra();
    }

    @PostMapping("")
    public TOrdenCompra postMethodName(@RequestBody TOrdenCompra entity) {
        return ordenCompraService.saveOrdenCompra(entity);
    }

    @PutMapping("")
    public TOrdenCompra putMethodName(@RequestBody TOrdenCompra entity) {
        return ordenCompraService.updateOrdenCompra(entity);
    }

    @DeleteMapping("/{id}")
    public void deleteMethodName(@PathVariable Integer id) {
        ordenCompraService.deleteOrdenCompraById(id);
    }
}
