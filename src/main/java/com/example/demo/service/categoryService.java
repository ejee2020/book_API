package com.example.demo.service;
import com.example.demo.dto.bookDTO;
import com.example.demo.dto.categoryDTO;
import com.example.demo.entity.book;
import com.example.demo.entity.category;
public interface categoryService {
    Long register(categoryDTO dto);
    default category dtoToEntity(categoryDTO dto){
        category entity = category.builder()
                .categoryNumber(dto.getCategoryNumber())
                .categoryName(dto.getCategoryName())
                .description(dto.getDescription())
                .build();
        return entity;
    }

    default categoryDTO entityToDTO(category category){
        categoryDTO dto = categoryDTO.builder()
                .categoryNumber(category.getCategoryNumber())
                .categoryName(category.getCategoryName())
                .description(category.getDescription())
                .build();
        return dto;
    }
}
