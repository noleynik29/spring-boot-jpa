package com.example.springbootjpa.repository;

import com.example.springbootjpa.model.Book;
import java.util.List;

public interface BookRepository {
    Book save(Book book);

    List findAll();
}
