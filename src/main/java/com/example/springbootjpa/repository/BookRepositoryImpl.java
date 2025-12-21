package com.example.springbootjpa.repository;

import com.example.springbootjpa.model.Book;
import java.util.List;

public class BookRepositoryImpl implements BookRepository {
    @Override
    public Book save(Book book) {
        return null;
    }

    @Override
    public List findAll() {
        return List.of();
    }
}
