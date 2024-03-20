package com.sisa.facturacion.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sisa.facturacion.models.TDetOrdenCompra;
import com.sisa.facturacion.repositories.TDetOrdenCompraRepository;

@Service
public class TDetOrdenCompraService {

    private final TDetOrdenCompraRepository detOrdenCompraRepository;

    TDetOrdenCompraService(TDetOrdenCompraRepository detOrdenCompraRepository) {
        this.detOrdenCompraRepository = detOrdenCompraRepository;
    }

    public List<TDetOrdenCompra> getAllDetOrdenCompra() {
        return detOrdenCompraRepository.findAll();
    }

    public TDetOrdenCompra saveDetOrdenCompra(TDetOrdenCompra detOrdenCompra) {
        return detOrdenCompraRepository.save(detOrdenCompra);
    }

    public TDetOrdenCompra updateDetOrdenCompra(TDetOrdenCompra detOrdenCompra) {
        return detOrdenCompraRepository.save(detOrdenCompra);
    }

    public void deleteDetOrdenCompraById(Integer id) {
        detOrdenCompraRepository.deleteById(id);
    }
}
