package com.example.springbootjpa.service;

import com.example.springbootjpa.model.Book;
import java.util.List;

public interface BookService {
    Book save(Book book);

    List findAll();
}
