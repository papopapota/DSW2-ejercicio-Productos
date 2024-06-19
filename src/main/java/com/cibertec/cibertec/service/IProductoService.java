package com.cibertec.cibertec.service;

import java.util.List;

import com.cibertec.cibertec.entity.Producto;

public interface IProductoService {
    
    public abstract List<Producto> listaProducto();
    public abstract Producto insertaActualizaProducto(Producto obj);
    public abstract void eliminaProducto(int id);
    public abstract Producto obtienePorId(int id);
}
