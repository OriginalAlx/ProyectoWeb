package com.libreriaedex.model;

import jakarta.persistence.*;

@Entity
@Table(name = "PRODUCTOS")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_producto, stock_minimo, stock_maximo;
    
    private String nombre_producto, categoria_producto, imagen_producto_url;
    
    private double precio_unitario;
    
}
