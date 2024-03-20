package com.sisa.facturacion.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.sisa.facturacion.models.TDetOrdenCompra;

@Repository
public interface TDetOrdenCompraRepository extends JpaRepositoryImplementation<TDetOrdenCompra, Integer> {

}
