package com.example.books.repository;

import com.example.books.entity.Auditable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T extends Auditable> extends JpaRepository<T,Long> {
}
