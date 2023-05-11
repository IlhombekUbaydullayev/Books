package com.example.books.mapper;

import com.example.books.dto.address.AddressCreate;
import com.example.books.dto.address.AddressResponse;
import com.example.books.dto.address.AddressUpdate;
import com.example.books.dto.author.AuthorCreate;
import com.example.books.dto.author.AuthorResponse;
import com.example.books.dto.author.AuthorUpdate;
import com.example.books.entity.Address;
import com.example.books.entity.Authhor;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface AuthorMapper extends BaseMapper<
        Authhor,
        AuthorResponse,
        AuthorCreate,
        AuthorUpdate> {
}
