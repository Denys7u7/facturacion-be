package com.sisa.facturacion.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sisa.facturacion.models.TOrdenCompra;
import com.sisa.facturacion.repositories.TOrdenCompraRepository;

@Service
public class TOrdenCompraService {

    private final TOrdenCompraRepository compraRepository;

    TOrdenCompraService(TOrdenCompraRepository compraRepository) {
        this.compraRepository = compraRepository;
    }

    public List<TOrdenCompra> getAllOrdenCompra() {
        return compraRepository.findAll();
    }

    public TOrdenCompra saveOrdenCompra(TOrdenCompra ordenCompra) {
        return compraRepository.save(ordenCompra);
    }

    public TOrdenCompra updateOrdenCompra(TOrdenCompra ordenCompra) {
        Optional<TOrdenCompra> optional = compraRepository.findById(ordenCompra.getId());
        if (optional.isPresent()) {
            ordenCompra.setFecha(optional.get().getFecha());
        }
        return compraRepository.save(ordenCompra);
    }

    public void deleteOrdenCompraById(Integer id) {
        compraRepository.deleteById(id);
    }
}
