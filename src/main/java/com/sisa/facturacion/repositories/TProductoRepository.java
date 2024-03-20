package com.sisa.facturacion.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sisa.facturacion.models.TProducto;

import jakarta.transaction.Transactional;

@Repository
public interface TProductoRepository extends JpaRepositoryImplementation<TProducto, Integer> {

    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "call actualizar_precio(:precio, :id)")
    void actualizarPrecio(@Param("precio") Double precio, @Param("id") Integer id);
}
