package com.cibertec.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.cibertec.entity.Producto;

public interface IProductoRepository extends JpaRepository<Producto, Integer>{
    
    
}
