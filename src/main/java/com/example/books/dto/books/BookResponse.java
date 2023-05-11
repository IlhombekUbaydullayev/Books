package com.example.books.dto.books;

import com.example.books.dto.GenericDto;
import com.example.books.dto.address.AddressResponse;
import com.example.books.dto.author.AuthorResponse;
import com.example.books.dto.images.ImagesResponse;

public class BookResponse extends GenericDto {
    public String name;
    public String title;
    public String body;
    public AuthorResponse authhor;
    public ImagesResponse images;
    public AddressResponse address;
}
