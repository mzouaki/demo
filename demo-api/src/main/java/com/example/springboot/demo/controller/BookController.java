package com.example.springboot.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fakeapi.api.BooksApi;
import com.example.springboot.demo.mapper.BookMapper;
import com.example.springboot.demo.model.Book;


@RestController
public class BookController {
    private final BooksApi booksApi;
    private final BookMapper bookMapper;

    public BookController(final BooksApi booksApi, BookMapper bookMapper){
        this.booksApi = booksApi;
        this.bookMapper = bookMapper;
    }
    @GetMapping("/getBooks")
    public List<Book> getBooks(){
        return this.bookMapper.toBooks(booksApi.getBooks());
    }
    @GetMapping("/getBook/{id}")
    public Book getBook(@PathVariable Integer id){
        return this.bookMapper.toBook(booksApi.getBookById(id));
    }
    @PostMapping("/createBook")
    public void createBook(Book book){
        booksApi.createBook(this.bookMapper.toClientBook(book));
    }
    @PutMapping("/updateBook/{id}")
    public void updateBook(@PathVariable Integer id,Book book){
         this.booksApi.updateBook(id,this.bookMapper.toClientBook(book));
    }
    @DeleteMapping("/deleteBook/{id}")
    public void deleteBook(@PathVariable Integer id){
         booksApi.deleteBook(id);
    }
    

}
