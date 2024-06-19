package com.cibertec.cibertec.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "tb_producto")
public class Producto {
    @Id
    private int idproducto;
    private String nombre;
    private double precio;
    private int stock;
    private Date fechaVencimiento;

    
    public int getIdproducto() {
        return idproducto;
    }
    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
}
