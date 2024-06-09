package com.cibertec.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.cibertec.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    

    
}
