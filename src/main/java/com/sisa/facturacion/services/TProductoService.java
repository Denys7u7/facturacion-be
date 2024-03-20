package com.sisa.facturacion.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sisa.facturacion.models.TProducto;
import com.sisa.facturacion.repositories.TProductoRepository;

@Service
public class TProductoService {

    private final TProductoRepository productoRepository;

    TProductoService(TProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<TProducto> getAllProductos() {
        return productoRepository.findAll();
    }

    public void actualizarPrecio(Double precio, Integer id) {
        productoRepository.actualizarPrecio(precio, id);
    }

    public Optional<TProducto> getProductoById(Integer id) {
        return productoRepository.findById(id);
    }

    public TProducto saveProducto(TProducto producto) {
        return productoRepository.save(producto);
    }

    public TProducto updateProducto(TProducto producto) {
        return productoRepository.save(producto);
    }

    public void deleteProductoById(Integer id) {
        productoRepository.deleteById(id);
    }
}
