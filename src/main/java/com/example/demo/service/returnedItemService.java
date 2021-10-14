package com.example.demo.service;
import com.example.demo.dto.rentedItemDTO;
import com.example.demo.dto.returnedItemDTO;
import com.example.demo.entity.rentedItem;
import com.example.demo.entity.returnedItem;
public interface returnedItemService {
    Long register(returnedItemDTO dto);
    default returnedItem dtoToEntity(returnedItemDTO dto){
        returnedItem entity = returnedItem.builder()
                .bookNumber(dto.getBookNumber())
                .title(dto.getTitle())
                .author(dto.getAuthor())
                .description(dto.getDescription())
                .returnedDate(dto.getReturnedDate())
                .build();
        return entity;
    }
    default returnedItemDTO entityToDTO(returnedItem returnedItem){
        returnedItemDTO dto = returnedItemDTO.builder()
                .bookNumber(returnedItem.getBookNumber())
                .title(returnedItem.getTitle())
                .author(returnedItem.getAuthor())
                .description(returnedItem.getDescription())
                .returnedDate(returnedItem.getReturnedDate())
                .build();
        return dto;
    }
}
