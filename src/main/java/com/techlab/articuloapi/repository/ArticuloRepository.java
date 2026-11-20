package com.techlab.articuloapi.repository;
import com.techlab.articuloapi.model.Articulo;
import org.springframework.data.jpa.repository.JpaRepository; //Nos da los CRUD listos
import org.springframework.stereotype.Repository; //Marca como componente de acceso a datos

//Esta interfaz se conecta con la base de datos y nos permite realizar operaciones CRUD sobre la entidad Articulo
@Repository
public interface ArticuloRepository extends JpaRepository<Articulo, Long> {
    //Metodos incluidos por JpaRepository para operaciones CRUD
    //JpaRepository proporciona métodos como findAll(), findById(), save(), deleteById(), count(),existById(), entre otros, para realizar operaciones CRUD en la entidad Articulo.
}
