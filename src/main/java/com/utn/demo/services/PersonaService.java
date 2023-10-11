package com.utn.demo.services;

import com.utn.demo.entities.Persona;
<<<<<<< HEAD
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonaService extends BaseService<Persona, Long>{
    List<Persona> search(String filtro) throws Exception;

    Page<Persona> search(String filtro, Pageable pageable) throws Exception;
=======

public interface PersonaService extends BaseService<Persona, Long>{
>>>>>>> 3114f472a89dfa44a1d233771a7711c7a1d49df5
}
