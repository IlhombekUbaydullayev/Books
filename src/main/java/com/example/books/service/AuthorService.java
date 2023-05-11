package com.example.books.service;

import com.example.books.dto.author.AuthorCreate;
import com.example.books.dto.author.AuthorResponse;
import com.example.books.dto.author.AuthorUpdate;
import com.example.books.entity.Authhor;
import com.example.books.mapper.AuthorMapper;
import com.example.books.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService extends AbstractService<AuthorRepository> implements GenericService<
        AuthorResponse, AuthorUpdate, AuthorCreate,Long>{

    private final AuthorMapper authorMapper;

    protected AuthorService(AuthorRepository repository, AuthorMapper authorMapper) {
        super(repository);
        this.authorMapper = authorMapper;
    }

    @Override
    public AuthorResponse create(AuthorCreate createDto) {
        return null;
    }
    public Authhor creatAt(Authhor authhor) {
        return repository.save(authhor);
    }
    @Override
    public AuthorResponse update(AuthorUpdate updateDto) {
        return null;
    }

    @Override
    public Long delete(Long id) {
        return null;
    }

    @Override
    public AuthorResponse get(Long id) {
        return null;
    }

    @Override
    public List<AuthorResponse> getAll() {
        return null;
    }
}
