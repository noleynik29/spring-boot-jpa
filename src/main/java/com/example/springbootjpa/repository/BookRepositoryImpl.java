package com.example.springbootjpa.repository;

import java.util.List;
import com.example.springbootjpa.model.Book;

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
