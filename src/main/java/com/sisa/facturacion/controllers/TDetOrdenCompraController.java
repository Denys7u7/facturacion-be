package com.sisa.facturacion.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sisa.facturacion.models.TDetOrdenCompra;
import com.sisa.facturacion.services.TDetOrdenCompraService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("detOrdenCompra")
@CrossOrigin
public class TDetOrdenCompraController {

    private final TDetOrdenCompraService detOrdenCompraService;

    TDetOrdenCompraController(TDetOrdenCompraService detOrdenCompraService) {
        this.detOrdenCompraService = detOrdenCompraService;
    }

    @GetMapping("")
    public List<TDetOrdenCompra> getAllDetOrdenCompra() {
        return detOrdenCompraService.getAllDetOrdenCompra();
    }

    @PostMapping("")
    public TDetOrdenCompra postMethodName(@RequestBody TDetOrdenCompra entity) {
        return detOrdenCompraService.saveDetOrdenCompra(entity);
    }

    @PutMapping("")
    public TDetOrdenCompra putMethodName(@RequestBody TDetOrdenCompra entity) {

        return detOrdenCompraService.updateDetOrdenCompra(entity);
    }

    @DeleteMapping("/{id}")
    public void deleteMethodName(@PathVariable Integer id) {
        detOrdenCompraService.deleteDetOrdenCompraById(id);
    }
}
