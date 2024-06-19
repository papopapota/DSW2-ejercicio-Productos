package com.cibertec.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cibertec.cibertec.entity.Cliente;
import java.util.List;


public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    
    //Aplicando query methods
    public abstract Cliente  findByDni(String dni);
    public abstract List<Cliente> findAllByNombresLike (String nombre);

    //Aplicando JPQL (java persistence query language)

    @Query("SELECT c FROM Cliente c WHERE c.dni = ?1 ")
    public abstract List<Cliente> findAllByDni( String dni);
    
    @Query("SELECT c FROM Cliente c WHERE c.dni = ?1  AND c.nombres LIKE ?2")
    public abstract List<Cliente> findAllByDniAndNombres( String dni , String nombres);



    
}
