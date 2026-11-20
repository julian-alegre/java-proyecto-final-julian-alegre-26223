package com.techlab.articuloapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "articulos") //Mapea con la tabla "articulos" en la base de datos
public class Articulo {
    @Id //Clave Primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Autoincremental
    private Long id;
    private String nombre;
    private Double precio;

    //Constructores
    public Articulo() {
    }

    public Articulo(Long id, String nombre, Double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
