package com.utn.demo.services;

import com.utn.demo.entities.Base;
<<<<<<< HEAD
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
=======
>>>>>>> 3114f472a89dfa44a1d233771a7711c7a1d49df5

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends Base, ID extends Serializable>{

    public List<E> findAll() throws Exception;
<<<<<<< HEAD
    public Page<E> findAll(Pageable pageable) throws Exception;
=======
>>>>>>> 3114f472a89dfa44a1d233771a7711c7a1d49df5

    public E findById(ID id) throws Exception;

    public E save(E entity) throws Exception;

    public E update(ID id, E entity) throws Exception;

    public boolean delete(ID id) throws Exception;
}
