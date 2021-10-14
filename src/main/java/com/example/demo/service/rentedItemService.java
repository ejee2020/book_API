package com.example.demo.service;
import com.example.demo.dto.bookDTO;
import com.example.demo.dto.rentedItemDTO;
import com.example.demo.entity.book;
import com.example.demo.entity.rentedItem;
public interface rentedItemService {
    Long register(rentedItemDTO dto);
    default rentedItem dtoToEntity(rentedItemDTO dto){
        rentedItem entity = rentedItem.builder()
                .bookNumber(dto.getBookNumber())
                .title(dto.getTitle())
                .author(dto.getAuthor())
                .description(dto.getDescription())
                .rentedDate(dto.getRentedDate())
                .dueDate(dto.getDueDate())
                .build();
        return entity;
    }
    default rentedItemDTO entityToDTO(rentedItem rentedItem){
        rentedItemDTO dto = rentedItemDTO.builder()
                .bookNumber(rentedItem.getBookNumber())
                .title(rentedItem.getTitle())
                .author(rentedItem.getAuthor())
                .description(rentedItem.getDescription())
                .rentedDate(rentedItem.getRentedDate())
                .dueDate(rentedItem.getDueDate())
                .build();
        return dto;
    }
}
