package com.cibertec.cibertec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.cibertec.entity.Producto;
import com.cibertec.cibertec.repository.IProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired 
    private IProductoRepository repository;

    @Override
    public List<Producto> listaProducto() {
        // TODO Auto-generated method stub
       return  repository.findAll();
    }

    @Override
    public Producto insertaActualizaProducto(Producto obj) {
        // TODO Auto-generated method stub
        return repository.save(obj);
    }

    @Override
    public void eliminaProducto(int id) {
        // TODO Auto-generated method stub
       repository.deleteById(id);
    }

    @Override
    public Producto obtienePorId(int id) {
        // TODO Auto-generated method stub
        return repository.findById(id).get();
    }
    
}
