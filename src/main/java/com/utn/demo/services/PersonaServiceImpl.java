package com.utn.demo.services;

import com.utn.demo.entities.Persona;
import com.utn.demo.repositories.BaseRepository;
import com.utn.demo.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

=======
import org.springframework.stereotype.Service;

>>>>>>> 3114f472a89dfa44a1d233771a7711c7a1d49df5
@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }

<<<<<<< HEAD
    @Override
    public List<Persona> search(String filtro) throws Exception {
        try{
            //List<Persona> personas=personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro);
            //List<Persona> personas=personaRepository.search(filtro);
            List<Persona> personas=personaRepository.searchNativo(filtro);
            return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Persona> search(String filtro, Pageable pageable) throws Exception {
        try{
            //Page<Persona> personas=personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro, pageable);
            //Page<Persona> personas=personaRepository.search(filtro, pageable);
            Page<Persona> personas=personaRepository.searchNativo(filtro, pageable);
            return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
=======
>>>>>>> 3114f472a89dfa44a1d233771a7711c7a1d49df5
}
