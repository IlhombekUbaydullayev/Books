package com.example.books.service;

import com.example.books.dto.books.BookCreate;
import com.example.books.dto.books.BookResponse;
import com.example.books.dto.books.BookUpdate;
import com.example.books.entity.Books;
import com.example.books.mapper.BookMapper;
import com.example.books.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService extends AbstractService<BookRepository> implements GenericService<
        BookResponse, BookUpdate, BookCreate,Long> {

    private final BookMapper bookMapper;
    private final AddressService addressService;

    private final AuthorService authorService;

    private final ImagesService imagesService;

    protected BookService(BookRepository repository, BookMapper bookMapper, AddressService addressService,
                          AuthorService authorService, ImagesService imagesService) {
        super(repository);
        this.bookMapper = bookMapper;
        this.addressService = addressService;
        this.authorService = authorService;
        this.imagesService = imagesService;
    }

    @Override
    public BookResponse create(BookCreate createDto) {
        addressService.createAt(createDto.address);
        authorService.creatAt(createDto.authhor);
        imagesService.createAt(createDto.images);
        Books books = bookMapper.fromCreateDto(createDto);
        Books save = repository.save(books);
        return bookMapper.toDto(save);
    }

    @Override
    public BookResponse update(BookUpdate updateDto) {
        return null;
    }

    @Override
    public Long delete(Long id) {
        return null;
    }

    @Override
    public BookResponse get(Long id) {
        return null;
    }

    @Override
    public List<BookResponse> getAll() {
        return bookMapper.toDto(repository.findAll());
    }
}
