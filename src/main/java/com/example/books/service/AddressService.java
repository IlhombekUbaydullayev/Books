package com.example.books.service;

import com.example.books.dto.address.AddressCreate;
import com.example.books.dto.address.AddressResponse;
import com.example.books.dto.address.AddressUpdate;
import com.example.books.entity.Address;
import com.example.books.mapper.AddressMapper;
import com.example.books.repository.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService extends AbstractService<AddressRepository> implements GenericService<
        AddressResponse, AddressUpdate, AddressCreate,Long>{
    private final AddressMapper addressMapper;
    protected AddressService(AddressRepository repository, AddressMapper addressMapper) {
        super(repository);
        this.addressMapper = addressMapper;
    }

    @Override
    public AddressResponse create(AddressCreate createDto) {
        Address save = repository.save(addressMapper.fromCreateDto(createDto));
        return addressMapper.toDto(save);
    }

    public Address createAt(Address address) {
        return repository.save(address);
    }

    @Override
    public AddressResponse update(AddressUpdate updateDto) {
        return null;
    }

    @Override
    public Long delete(Long id) {
        return null;
    }

    @Override
    public AddressResponse get(Long id) {
        return null;
    }

    @Override
    public List<AddressResponse> getAll() {
        return null;
    }
}
