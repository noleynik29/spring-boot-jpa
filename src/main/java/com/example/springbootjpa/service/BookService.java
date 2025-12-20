package com.example.springbootjpa.service;

import java.util.List;
import com.example.springbootjpa.model.Book;

public interface BookService {
    Book save(Book book);

    List findAll();
}
