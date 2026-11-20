package com.techlab.articuloapi.service;

import com.techlab.articuloapi.model.Articulo;
import com.techlab.articuloapi.repository.ArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //Marcamos la clase como un servicio de Spring
public class ArticuloServiceImpl implements ArticuloService {

    private final ArticuloRepository articuloRepository;

    @Autowired
    public ArticuloServiceImpl(ArticuloRepository articuloRepository) {
        this.articuloRepository = articuloRepository;
    }

    @Override
    public List<Articulo> listarArticulos() {
        return articuloRepository.findAll();
    }

    @Override
    public Optional<Articulo> obtenerArticuloPorId(Long id) {
        return articuloRepository.findById(id);
    }

    @Override
    public Articulo guardarArticulo(Articulo articulo) {
        return articuloRepository.save(articulo);
    }

    @Override
    public Articulo actualizarArticulo(Long id, Articulo articulo) {
        if (articuloRepository.existsById(id)) {
            articulo.setId(id);
            return articuloRepository.save(articulo);
        }
        return null;
    }

    @Override
    public void eliminarArticulo(Long id) {
        articuloRepository.deleteById(id);
    }
}
