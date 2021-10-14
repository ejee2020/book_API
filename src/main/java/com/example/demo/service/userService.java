package com.example.demo.service;
import com.example.demo.dto.rentedItemDTO;
import com.example.demo.dto.userDTO;
import com.example.demo.entity.rentedItem;
import com.example.demo.entity.user;
public interface userService {
    Long register(userDTO dto);
    default user dtoToEntity(userDTO dto){
        user entity = user.builder()
                .userId(dto.getUserId())
                .rentalStatus(dto.getRentalStatus())
                .lateFee(dto.getLateFee())
                .rentedItems(dto.getRentedItems())
                .returnedItems(dto.getReturnedItems())
                .build();
        return entity;
    }
    default userDTO entityToDTO(user user){
        userDTO dto = userDTO.builder()
                .userId(user.getUserId())
                .rentalStatus(user.getRentalStatus())
                .lateFee(user.getLateFee())
                .rentedItems(user.getRentedItems())
                .returnedItems(user.getReturnedItems())
                .build();
        return dto;
    }
}
