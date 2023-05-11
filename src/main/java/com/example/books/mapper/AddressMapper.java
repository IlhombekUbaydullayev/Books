package com.example.books.mapper;

import com.example.books.dto.address.AddressCreate;
import com.example.books.dto.address.AddressResponse;
import com.example.books.dto.address.AddressUpdate;
import com.example.books.dto.books.BookCreate;
import com.example.books.dto.books.BookResponse;
import com.example.books.dto.books.BookUpdate;
import com.example.books.entity.Address;
import com.example.books.entity.Books;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface AddressMapper extends BaseMapper<
        Address,
        AddressResponse,
        AddressCreate,
        AddressUpdate> {
}
