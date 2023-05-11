package com.example.books.mapper;

import com.example.books.dto.books.BookCreate;
import com.example.books.dto.books.BookResponse;
import com.example.books.dto.books.BookUpdate;
import com.example.books.entity.Books;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface BookMapper extends BaseMapper<
        Books,
        BookResponse,
        BookCreate,
        BookUpdate> {
}
