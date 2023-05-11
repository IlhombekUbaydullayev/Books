package com.example.books.service;

import com.example.books.dto.BaseDto;
import com.example.books.dto.GenericDto;

import java.io.Serializable;
import java.util.List;

public interface GenericService<
        D extends GenericDto,
        UD extends BaseDto,
        CD extends BaseDto,
        I extends Serializable> {

    D create(CD createDto);
    D update(UD updateDto);

    I delete(I id) ;

    D get(I id) ;

    List<D> getAll();

}
