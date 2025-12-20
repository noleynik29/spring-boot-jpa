package com.example.springbootjpa.repository;

import java.util.List;
import com.example.springbootjpa.model.Book;

public interface BookRepository {
    Book save(Book book);

    List findAll();
}
