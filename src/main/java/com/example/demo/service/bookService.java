package com.example.demo.service;
import com.example.demo.dto.bookDTO;
import com.example.demo.entity.book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


public interface bookService {
    Long register(bookDTO dto);
    default book dtoToEntity(bookDTO dto){
        book entity = book.builder()
                .isbn(dto.getIsbn())
                .title(dto.getTitle())
                .author(dto.getAuthor())
                .description(dto.getDescription())
                .category(dto.getCategory())
                .price(dto.getPrice())
                .build();
        return entity;
    }

    default bookDTO entityToDTO(book book){
        bookDTO dto = bookDTO.builder()
                .isbn(book.getIsbn())
                .title(book.getTitle())
                .author(book.getAuthor())
                .description(book.getDescription())
                .category(book.getCategory())
                .price(book.getPrice())
                .build();
        return dto;
    }

}
