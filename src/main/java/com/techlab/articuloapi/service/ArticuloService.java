package com.techlab.articuloapi.service;
import com.techlab.articuloapi.model.Articulo;
import java.util.List;
import java.util.Optional;

//Interfaz que define los métodos del servicio para la entidad Articulo
public interface ArticuloService {
    List<Articulo> listarArticulos();
    Optional<Articulo> obtenerArticuloPorId(Long id);
    Articulo guardarArticulo(Articulo articulo);
    Articulo actualizarArticulo(Long id, Articulo articulo);
    void eliminarArticulo(Long id);
}
