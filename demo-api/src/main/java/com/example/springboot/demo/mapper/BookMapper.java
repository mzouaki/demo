package com.example.springboot.demo.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {
    com.example.fakeapi.model.Book toClientBook(com.example.springboot.demo.model.Book book);
    @InheritInverseConfiguration
    com.example.springboot.demo.model.Book toBook(com.example.fakeapi.model.Book book);
    List<com.example.fakeapi.model.Book> toClientBooks(List<com.example.springboot.demo.model.Book> books);
    List<com.example.springboot.demo.model.Book> toBooks(List<com.example.fakeapi.model.Book> books);
}
