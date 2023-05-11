package com.example.books.mapper;

import com.example.books.dto.BaseDto;
import com.example.books.dto.GenericDto;
import com.example.books.entity.BaseEntity;
import org.mapstruct.MappingTarget;

import java.util.List;

public interface BaseMapper<
        E extends BaseEntity,
        D extends GenericDto,
        CD extends BaseDto,
        UD extends GenericDto> extends GenericMapper {

    D toDto(E e);

    List<D> toDto(List<E> e);

    E fromCreateDto(CD cd);

    void fromUpdateDto(UD ud, @MappingTarget E entity);

}
