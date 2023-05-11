package com.example.books.dto.books;

import com.example.books.dto.BaseDto;
import com.example.books.entity.Address;
import com.example.books.entity.Authhor;
import com.example.books.entity.Images;

public class BookCreate implements BaseDto {
    public String name;
    public String title;
    public String body;
    public Authhor authhor;
    public Images images;

    public Address address;
}
