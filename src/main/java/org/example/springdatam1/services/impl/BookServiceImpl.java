package org.example.springdatam1.services.impl;

import jakarta.persistence.EntityNotFoundException;
import org.example.springdatam1.entity.Book;
import org.example.springdatam1.repository.BookRepository;
import org.example.springdatam1.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book save(Book entity) {
        return bookRepository.save(entity);
    }

    @Override
    public Book findById(Long aLong) {
        return bookRepository
                .findById(aLong)
                .orElseThrow(
                        ()->new EntityNotFoundException("Book not found"));
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book update(Long aLong, Book entity) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }
}
