package com.utn.demo.controllers;

import com.utn.demo.entities.Base;
<<<<<<< HEAD
import org.springframework.data.domain.Pageable;
=======
>>>>>>> 3114f472a89dfa44a1d233771a7711c7a1d49df5
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseController <E extends Base, ID extends Serializable> {

    public ResponseEntity<?> getAll();
<<<<<<< HEAD
    public ResponseEntity<?> getAll(Pageable pageable);
=======

>>>>>>> 3114f472a89dfa44a1d233771a7711c7a1d49df5
    public ResponseEntity<?> getOne(@PathVariable ID id);

    public ResponseEntity<?> save (@RequestBody E entity);

    public ResponseEntity<?> update(@PathVariable ID id, @RequestBody E entity);

    public ResponseEntity<?> delete(@PathVariable ID id);


}
