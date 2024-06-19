package com.cibertec.cibertec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.cibertec.entity.Cliente;
import com.cibertec.cibertec.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
    
    @Autowired
    private ClienteRepository repository;
    
    @Override
    public List<Cliente> listaCliente() {
        return repository.findAll();
    }

    @Override
    public Cliente insertaActualizaCliente(Cliente obj) {
        return repository.save(obj);
    }

    @Override
    public void eliminaCliente(int id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Cliente> obtienePorId(int id) {
        return repository.findById(id);
    }

    @Override
    public List<Cliente> listaClientePorNombre(String nombre) {
        return repository.findAllByNombresLike(nombre);
    }

    @Override
    public List<Cliente> listaClientePorDni(String dni) {
        return repository.findAllByDni(dni);
    }

    @Override
    public List<Cliente> listaClientePorDniAndNombre(String dni, String nombre) {
        return repository.findAllByDniAndNombres(dni, nombre);
    }
    
}
