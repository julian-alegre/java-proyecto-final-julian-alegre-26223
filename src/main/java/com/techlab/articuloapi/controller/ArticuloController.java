package com.techlab.articuloapi.controller;

import com.techlab.articuloapi.model.Articulo;
import com.techlab.articuloapi.service.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*") //Permite solicitaciones desde cualquier origen (útil para desarrollo local)
@RestController //Marca la clase como un controlador REST
@RequestMapping("/api/articulos") //Define la ruta base para los endpoints de este controlador
public class ArticuloController {

    private final ArticuloService articuloService;

    @Autowired
    public ArticuloController(ArticuloService articuloService) {
        this.articuloService = articuloService;
    }

    @GetMapping //Endpoint para obtener todos los artículos
    public List<Articulo> listar() {
        return articuloService.listarArticulos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Articulo> obtenerPorId(@PathVariable Long id) {
        return articuloService.obtenerArticuloPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping //Endpoint para crear un nuevo artículo
    public Articulo guardarArticulo(@RequestBody Articulo articulo) {
        return articuloService.guardarArticulo(articulo);
    }

    @PutMapping("/{id}") //Endpoint para actualizar un artículo existente
    public Articulo actualizarArticulo(@PathVariable Long id, @RequestBody Articulo articulo) {
        return articuloService.actualizarArticulo(id, articulo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        if (articuloService.obtenerArticuloPorId(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        articuloService.eliminarArticulo(id);
        return ResponseEntity.noContent().build();
    }
}
