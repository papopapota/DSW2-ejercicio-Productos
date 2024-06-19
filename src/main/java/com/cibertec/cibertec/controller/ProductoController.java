package com.cibertec.cibertec.controller;

import org.springframework.web.bind.annotation.RestController;

import com.cibertec.cibertec.entity.Producto;
import com.cibertec.cibertec.service.IProductoService;
import com.cibertec.cibertec.service.ProductoServiceImpl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/url/productos")
public class ProductoController {
    @Autowired
    private ProductoServiceImpl service;

    @GetMapping("/listaTodos")
    public List<Producto> getAllProductos() {
        return service.listaProducto();
    }
    
    @GetMapping("/buscarPorId")
    public Producto getProductoByNombre(@RequestParam("id") int id) {
        return service.obtienePorId(id);
    }


    //crud
    @PostMapping("/registrar")
    public ResponseEntity<?> registraProducto(@RequestBody Producto producto){
        HashMap<String, Object> salida = new HashMap<>();

        try {
            producto.setIdproducto(0);
            Producto objSalida = service.insertaActualizaProducto(producto);
            salida.put("mensaje", "Producto Registrado con ID: " + objSalida.getIdproducto());

        } catch (Exception e) {
            salida.put("mensaje", "Error al registrar" + e.getMessage());
        }
        return ResponseEntity.ok(salida);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<?> actualizarProducto(@RequestBody Producto producto){
        HashMap<String, Object> salida = new HashMap<>();

        try {
            Producto objSalida = service.insertaActualizaProducto(producto);
            salida.put("mensaje", "Producto Registrado con ID: " + objSalida.getIdproducto());

        } catch (Exception e) {
            salida.put("mensaje", "Error al registrar" + e.getMessage());
        }
        return ResponseEntity.ok(salida);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarProducto(@PathVariable("id") int id){
        HashMap<String, Object> salida = new HashMap<>();

        try {
            service.eliminaProducto(id);
            salida.put("mensaje", "Producto eliminado");

        } catch (Exception e) {
            salida.put("mensaje", "Error al eliminar" + e.getMessage());
        }
        return ResponseEntity.ok(salida);
    }
}
