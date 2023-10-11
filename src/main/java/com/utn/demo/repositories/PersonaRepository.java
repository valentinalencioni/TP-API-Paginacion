package com.utn.demo.repositories;

import com.utn.demo.entities.Persona;
<<<<<<< HEAD
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
    //Anotacion Metodo Query
    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);
    Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);

    //Anotacion JPQL con parametros indexados
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    List<Persona> search(@Param("filtro") String filtro);

    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    Page<Persona> search(@Param("filtro") String filtro, Pageable pageable);
    @Query(
            value = "SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",
            nativeQuery = true
    )
    List<Persona> searchNativo(@Param("filtro") String filtro);
    @Query(
            value = "SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",
            countQuery ="SELECT count(*) FROM persona",
            nativeQuery = true
    )
    Page<Persona> searchNativo(@Param("filtro") String filtro, Pageable pageable);
}

=======
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
}
>>>>>>> 3114f472a89dfa44a1d233771a7711c7a1d49df5
