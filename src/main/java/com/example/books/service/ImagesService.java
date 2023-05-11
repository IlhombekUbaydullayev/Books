package com.example.books.service;

import com.example.books.dto.images.ImagesCreate;
import com.example.books.dto.images.ImagesResponse;
import com.example.books.dto.images.ImagesUpdate;
import com.example.books.entity.Images;
import com.example.books.repository.ImagesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImagesService extends AbstractService<ImagesRepository> implements GenericService<
        ImagesResponse, ImagesUpdate, ImagesCreate,Long>{
    protected ImagesService(ImagesRepository repository) {
        super(repository);
    }

    @Override
    public ImagesResponse create(ImagesCreate createDto) {
        return null;
    }

    public Images createAt(Images images) {
        return repository.save(images);
    }
    @Override
    public ImagesResponse update(ImagesUpdate updateDto) {
        return null;
    }

    @Override
    public Long delete(Long id) {
        return null;
    }

    @Override
    public ImagesResponse get(Long id) {
        return null;
    }

    @Override
    public List<ImagesResponse> getAll() {
        return null;
    }
}
